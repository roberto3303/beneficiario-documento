package br.com.wakanda.beneficiario_documento.documento.domain;

import br.com.wakanda.beneficiario_documento.documento.application.api.DocumentoRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NonNull;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid",name = "idDocumento", updatable = false, unique = true, nullable = false)
    private UUID idDocumento;
    @NonNull
    private UUID idBeneficiarioTitular;
    @Enumerated(EnumType.STRING)
    @NonNull
    private tipoDocumento tipoDocumento;
    @NotBlank
    private String descricao;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;


    public Documento(UUID idBeneficiario, DocumentoRequest documentoRequest) {
        this.idBeneficiarioTitular = idBeneficiario;
        this.tipoDocumento = documentoRequest.getTipoDocumento();
        this.descricao = documentoRequest.getDescricao();
        this.dataInclusao = LocalDateTime.now();
    }

}
