package br.com.wakanda.beneficiario_documento.documento.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
public class DocumentoController implements DocumentoAPI {


    @Override
    public DocumentoResponse postDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        log.info("[incia] DocumentoController - postDocumento");
        log.info("[idBeneficiario] {}", idBeneficiario);
        log.info("[finaliza] DocumentoController - postDocumento");
        return null;
    }
}
