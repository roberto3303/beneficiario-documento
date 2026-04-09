package br.com.wakanda.beneficiario_documento.beneficiario.infra;

import br.com.wakanda.beneficiario_documento.beneficiario.application.repository.BeneficiarioRepository;
import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioInfraRepository implements BeneficiarioRepository {

    private final BeneficiarioSpringDataJpaRepository beneficiarioSpringDataJpaRepository;

    @Override
    public Beneficiario salva(Beneficiario beneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository - salva");
        beneficiarioSpringDataJpaRepository.save(beneficiario);
        log.info("[finaliza] BeneficiarioInfraRepository - salva");
        return beneficiario;
    }

    @Override
    public List<Beneficiario> buscaTodosBeneficiarios() {
        log.info("[inicia] BeneficiarioInfraRepository - buscaTodosBeneficiarios");
        log.info("[finaliza] BeneficiarioInfraRepository - buscaTodosBeneficiarios");
        return List.of();
    }
}
