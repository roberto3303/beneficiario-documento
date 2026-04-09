package br.com.wakanda.beneficiario_documento.beneficiario.application.api;

import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@JsonPropertyOrder({"nomeCompleto", "idBeneficiario","telefone", "dataNascimento"})
public class BeneficiarioListResponse {
    private UUID idBeneficiario;
    private String nomeCompleto;
    private String telefone;
    private LocalDate dataNascimento;

    private LocalDateTime dataInclusao;

    public static List<BeneficiarioListResponse> converte(List<Beneficiario> beneficiarios) {
        return null;
    }
}
