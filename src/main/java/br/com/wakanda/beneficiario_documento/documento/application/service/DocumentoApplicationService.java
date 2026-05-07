package br.com.wakanda.beneficiario_documento.documento.application.service;

import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioDetalhadoResponse;
import br.com.wakanda.beneficiario_documento.beneficiario.application.service.BeneficiarioService;
import br.com.wakanda.beneficiario_documento.documento.application.api.*;

import br.com.wakanda.beneficiario_documento.documento.application.repository.DocumentoRepository;
import br.com.wakanda.beneficiario_documento.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class DocumentoApplicationService implements DocumentoService {

    private final BeneficiarioService beneficiarioService;
    private final DocumentoRepository documentoRepository;

    @Override
    public DocumentoResponse criaDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        log.info("[inicia] DocumentoApplicationService - criaDocumento ");
        beneficiarioService.buscaBeneficiarioAtravesId(idBeneficiario);
        Documento documento = documentoRepository.salvaDoc(new Documento(idBeneficiario, documentoRequest));
        log.info("[finaliza] DocumentoApplicationService - criaDocumento ");
        return new DocumentoResponse(documento.getIdDocumento());
    }

    @Override
    public List<DocumentoListResponse> buscaTodosDocumentosDoBeneficiario(UUID idBeneficiario) {
        log.info("[inicia] DocumentoApplicationService - buscaTodosDocumentosDoBeneficiario");
        beneficiarioService.buscaBeneficiarioAtravesId(idBeneficiario);
        List<Documento> documentosDoBeneficiario = documentoRepository.buscaDocumentosDoBeneficiario(idBeneficiario);
        log.info("[finaliza] DocumentoApplicationService - buscaTodosDocumentosDoBeneficiario");
        return DocumentoListResponse.converte(documentosDoBeneficiario);
    }

    @Override
    public DocumentoDetalhadoResponse buscaDocumentoDoBeneficiario(UUID idBeneficiario, UUID idDocumento) {
        log.info("[inicia] DocumentoApplicationService - buscaDocumentoDoBeneficiario");
        beneficiarioService.buscaBeneficiarioAtravesId(idBeneficiario);
        Documento documento = documentoRepository.buscaDocumentoAtravesId(idDocumento);
        log.info("[finaliza] DocumentoApplicationService - buscaDocumentoDoBeneficiario");
        return new DocumentoDetalhadoResponse(documento);
    }

    @Override
    public void deletaDocumentoBeneficiarioComId(UUID idBeneficiario, UUID idDocumento) {
        log.info("[inicia] DocumentoApplicationService - deletaDocumentoBeneficiarioComId");
        beneficiarioService.buscaBeneficiarioAtravesId(idBeneficiario);
        Documento documento = documentoRepository.buscaDocumentoAtravesId(idDocumento);
        documentoRepository.deletaDocumento(documento);
        log.info("[finaliza] DocumentoApplicationService - deletaDocumentoBeneficiarioComId");

    }

    @Override
    public void alteraDocumentoDoBeneficiario(UUID idBeneficiario, UUID idDocumento, DocumentoAlteracaoRequest documentoAlteracaoRequest) {
        log.info("[inicia] DocumentoApplicationService - alteraDocumentoDoBeneficiario");
        log.info("[finaliza] DocumentoApplicationService - alteraDocumentoDoBeneficiario");
    }

}
