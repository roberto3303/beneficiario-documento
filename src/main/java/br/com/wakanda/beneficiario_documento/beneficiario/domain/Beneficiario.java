package br.com.wakanda.beneficiario_documento.beneficiario.domain;

import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Beneficiario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", updatable = false, unique = true, nullable = false)
    private UUID idBeneficiario;
    @NotBlank
    @Column(unique = true)
    private String nomeCompleto;
    @NotBlank
    private String telefone;
    @NotNull
    private LocalDate dataNascimento;


    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;


    public Beneficiario(BeneficiarioRequest beneficiarioRequest) {
        this.nomeCompleto = beneficiarioRequest.getNomeCompleto();
        this.telefone = beneficiarioRequest.getTelefone();
        this.dataNascimento = beneficiarioRequest.getDataNascimento();
        this.dataInclusao = LocalDateTime.now();
    }
}
