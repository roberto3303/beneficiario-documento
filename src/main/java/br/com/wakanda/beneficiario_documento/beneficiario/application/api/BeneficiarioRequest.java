package br.com.wakanda.beneficiario_documento.beneficiario.application.api;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;

@JsonPropertyOrder({"nomeCompleto", "telefone", "dataNascimento"})
@Value
public class BeneficiarioRequest {
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    private String telefone;
    @NotNull
    private LocalDate dataNascimento;

}
