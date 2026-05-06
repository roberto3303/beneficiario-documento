package br.com.wakanda.beneficiario_documento.documento.application.api;

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
}
