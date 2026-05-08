package br.com.wakanda.beneficiario_documento.documento.application.service;

import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioDetalhadoResponse;
import br.com.wakanda.beneficiario_documento.documento.application.api.*;

import java.util.List;
import java.util.UUID;

public interface DocumentoService {
    DocumentoResponse criaDocumento(UUID idBeneficiario, DocumentoRequest documentoRequest);

    List<DocumentoListResponse> buscaTodosDocumentosDoBeneficiario(UUID idBeneficiario);

    DocumentoDetalhadoResponse buscaDocumentoDoBeneficiario(UUID idBeneficiario, UUID idDocumento);

    void deletaDocumentoBeneficiarioComId(UUID idBeneficiario, UUID idDocumento);

    void alteraDocumentoDoBeneficiario(UUID idBeneficiario, UUID idDocumento, DocumentoAlteracaoRequest documentoAlteracaoRequest);
}
