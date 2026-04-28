package br.com.wakanda.beneficiario_documento.documento.application.service;

import br.com.wakanda.beneficiario_documento.documento.application.api.DocumentoRequest;

import br.com.wakanda.beneficiario_documento.documento.application.api.DocumentoResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
public class DocumentoApplicationService implements DocumentoService {


    @Override
    public DocumentoResponse criaDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        log.info("[inicia] DocumentoApplicationService - criaDocumento ");
        log.info("[finaliza] DocumentoApplicationService - criaDocumento ");
        return null;
    }
}
