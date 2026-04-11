package br.com.wakanda.beneficiario_documento.beneficiario.application.api;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@JsonPropertyOrder({"nomeCompleto", "idBeneficiario","telefone", "dataNascimento"})
@Value
public class BeneficiarioDetalhadoResponse {

    private UUID idBeneficiario;
    private String nomeCompleto;
    private String telefone;
    private LocalDate dataNascimento;


    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;
}
