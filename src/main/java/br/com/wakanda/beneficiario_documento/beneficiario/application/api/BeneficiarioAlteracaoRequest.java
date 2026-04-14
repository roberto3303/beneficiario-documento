package br.com.wakanda.beneficiario_documento.beneficiario.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;

@Value
public class BeneficiarioAlteracaoRequest {
    @NotBlank
    private String telefone;
    @NotNull
    private LocalDate dataNascimento;
}
