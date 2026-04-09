package br.com.wakanda.beneficiario_documento.beneficiario.application.api;

import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Entity;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@JsonPropertyOrder({"nomeCompleto", "idBeneficiario","telefone", "dataNascimento"})
@Value
public class BeneficiarioListResponse {
    private UUID idBeneficiario;
    private String nomeCompleto;
    private String telefone;
    private LocalDate dataNascimento;

    private LocalDateTime dataInclusao;

    public BeneficiarioListResponse(Beneficiario beneficiario) {
        this.idBeneficiario = beneficiario.getIdBeneficiario();
        this.nomeCompleto = beneficiario.getNomeCompleto();
        this.telefone = beneficiario.getTelefone();
        this.dataNascimento = beneficiario.getDataNascimento();
        this.dataInclusao = beneficiario.getDataInclusao();
    }

    public static List<BeneficiarioListResponse> converte(List<Beneficiario> beneficiarios) {
        return beneficiarios.stream()
                .map(BeneficiarioListResponse::new)
                .collect(Collectors.toList());
    }

}
