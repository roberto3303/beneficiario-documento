package br.com.wakanda.beneficiario_documento.documento.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid",name = "idDocumento", updatable = false, unique = true, nullable = false)
    private UUID idDocumento;
    @Enumerated(EnumType.STRING)
    private tipoDocumento tipoDocumento;
    @NotBlank
    private String descricao;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;

    public Documento(UUID idDocumento, tipoDocumento tipoDocumento, String descricao, LocalDateTime dataInclusao,
                     LocalDateTime dataAtualizacao) {
        this.idDocumento = idDocumento;
        this.tipoDocumento = tipoDocumento;
        this.descricao = descricao;
        this.dataInclusao = dataInclusao;
        this.dataAtualizacao = dataAtualizacao;
    }
}
