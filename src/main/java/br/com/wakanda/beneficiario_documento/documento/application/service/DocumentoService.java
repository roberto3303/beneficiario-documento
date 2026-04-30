package br.com.wakanda.beneficiario_documento.documento.application.service;

import br.com.wakanda.beneficiario_documento.documento.application.api.DocumentoListResponse;
import br.com.wakanda.beneficiario_documento.documento.application.api.DocumentoRequest;
import br.com.wakanda.beneficiario_documento.documento.application.api.DocumentoResponse;

import java.util.List;
import java.util.UUID;

public interface DocumentoService {
    DocumentoResponse criaDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest);

    List<DocumentoListResponse> buscaTodosDocumentosDoBeneficiario(UUID idBeneficiario);
}
