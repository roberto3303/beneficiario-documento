package br.com.wakanda.beneficiario_documento.documento.application.repository;

import br.com.wakanda.beneficiario_documento.documento.domain.Documento;

public interface DocumentoRepository {
    Documento salvaDoc(Documento documento);
}
