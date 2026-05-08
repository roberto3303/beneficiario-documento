package br.com.wakanda.beneficiario_documento.documento.application.api;

import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioDetalhadoResponse;
import br.com.wakanda.beneficiario_documento.documento.application.service.DocumentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class DocumentoController implements DocumentoAPI {

    private final DocumentoService documentoService;

    @Override
    public DocumentoResponse postDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        log.info("[incia] DocumentoController - postDocumento");
        log.info("[idBeneficiario] {}", idBeneficiario);
        DocumentoResponse documento = documentoService.criaDocumento(idBeneficiario, documentoRequest);
        log.info("[finaliza] DocumentoController - postDocumento");
        return documento;
    }

    @Override
    public List<DocumentoListResponse> getDocumentosDoBeneficiario(UUID idBeneficiario) {
        log.info("[inicia] DocumentoController - getDocumentosDoBeneficiario");
        log.info("[idBeneficiario] {} ", idBeneficiario );
        List<DocumentoListResponse> documentosDoCliente =
                documentoService.buscaTodosDocumentosDoBeneficiario(idBeneficiario);
        log.info("[finaliza] DocumentoController - getDocumentosDoBeneficiario");
        return documentosDoCliente;
    }

    @Override
    public DocumentoDetalhadoResponse getDocumentoBeneficiarioComId(UUID idBeneficiario, UUID idDocumento) {
        log.info("[inicia] DocumentoController - getDocumentoBeneficiarioComId");
        log.info("[idBeneficiario] {} [idDocumento] {}", idBeneficiario, idDocumento);
        DocumentoDetalhadoResponse documento = documentoService.buscaDocumentoDoBeneficiario(idBeneficiario,idDocumento);
        log.info("[finaliza] DocumentoController - getDocumentoBeneficiarioComId");
        return documento;
    }

    @Override
    public void deleteDocumentoDoBeneficiario(UUID idBeneficiario, UUID idDocumento) {
        log.info("[inicia] DocumentoController - deleteDocumentoDoBeneficiario");
        documentoService.deletaDocumentoBeneficiarioComId(idBeneficiario, idDocumento);
        log.info("[finaliza] DocumentoController - deleteDocumentoDoBeneficiario");
    }

    @Override
    public void patchDocumento(UUID idBeneficiario, UUID idDocumento, DocumentoAlteracaoRequest documentoAlteracaoRequest) {
        log.info("[inicia] DocumentoController - patchDocumento");
        log.info("[idBeneficiario] {} [idDocumento] {}", idBeneficiario, idDocumento);
        documentoService.alteraDocumentoDoBeneficiario(idBeneficiario, idDocumento, documentoAlteracaoRequest);
        log.info("[finaliza] DocumentoController - patchDocumento");
    }

}
