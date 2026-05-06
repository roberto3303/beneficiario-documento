package br.com.wakanda.beneficiario_documento.documento.application.api;

import br.com.wakanda.beneficiario_documento.documento.domain.Documento;

import br.com.wakanda.beneficiario_documento.documento.domain.tipoDocumento;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@JsonPropertyOrder({"idDocumento, tipoDocumento, descricao, dataInclusao"})
@Value
public class DocumentoListResponse {

    private UUID idDocumento;
    private tipoDocumento tipoDocumento;
    private String descricao;
    private LocalDateTime dataInclusao;

    public DocumentoListResponse(Documento documento) {
        this.idDocumento = documento.getIdDocumento();
        this.tipoDocumento = documento.getTipoDocumento();
        this.descricao = documento.getDescricao();
        this.dataInclusao = documento.getDataInclusao();
    }

    public static List<DocumentoListResponse> converte(List<Documento> documentosDoBeneficiario) {
        return documentosDoBeneficiario.stream()
                .map(DocumentoListResponse::new)
                .collect(Collectors.toList());
    }
}
