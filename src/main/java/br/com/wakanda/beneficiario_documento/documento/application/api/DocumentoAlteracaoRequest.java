package br.com.wakanda.beneficiario_documento.documento.application.api;

import br.com.wakanda.beneficiario_documento.documento.domain.tipoDocumento;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import lombok.NonNull;
import lombok.Value;

@Value
public class DocumentoAlteracaoRequest {
    @NonNull
    @Enumerated(EnumType.STRING)
    private tipoDocumento tipoDocumento;
    @NotBlank
    private String descricao;

}
