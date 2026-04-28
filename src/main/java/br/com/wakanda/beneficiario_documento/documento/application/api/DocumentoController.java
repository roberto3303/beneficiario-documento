package br.com.wakanda.beneficiario_documento.documento.application.api;

import br.com.wakanda.beneficiario_documento.documento.application.service.DocumentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

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
}
