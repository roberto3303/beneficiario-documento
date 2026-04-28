package br.com.wakanda.beneficiario_documento.documento.infra;

import br.com.wakanda.beneficiario_documento.documento.domain.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DocumentoSpringDataJpaRepository extends JpaRepository<Documento, UUID> {
}
