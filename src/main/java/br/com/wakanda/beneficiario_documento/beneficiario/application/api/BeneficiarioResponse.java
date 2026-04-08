package br.com.wakanda.beneficiario_documento.beneficiario.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class BeneficiarioResponse {
    private UUID idBeneficiario;
}
