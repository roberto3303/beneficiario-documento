package br.com.wakanda.beneficiario_documento.beneficiario.infra;

import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeneficiarioSpringDataJpaRepository extends JpaRepository<Beneficiario, UUID> {
}
