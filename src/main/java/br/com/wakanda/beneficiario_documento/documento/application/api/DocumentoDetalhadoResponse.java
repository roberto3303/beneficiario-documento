package br.com.wakanda.beneficiario_documento.documento.application.api;

import br.com.wakanda.beneficiario_documento.documento.domain.Documento;
import br.com.wakanda.beneficiario_documento.documento.domain.tipoDocumento;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class DocumentoDetalhadoResponse {
    private UUID idDocumento;
    private UUID idBeneficiarioTitular;
    private tipoDocumento tipoDocumento;
    private String descricao;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;

    public DocumentoDetalhadoResponse(Documento documento) {
        this.idDocumento = documento.getIdDocumento();
        this.idBeneficiarioTitular = documento.getIdBeneficiarioTitular();
        this.tipoDocumento = documento.getTipoDocumento();
        this.descricao = documento.getDescricao();
        this.dataInclusao = documento.getDataInclusao();
        this.dataAtualizacao = documento.getDataAtualizacao();
    }

}
