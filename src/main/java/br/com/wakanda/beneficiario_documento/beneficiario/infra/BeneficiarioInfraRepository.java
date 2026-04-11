package br.com.wakanda.beneficiario_documento.beneficiario.infra;

import br.com.wakanda.beneficiario_documento.beneficiario.application.repository.BeneficiarioRepository;
import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;
import br.com.wakanda.beneficiario_documento.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
        List<Beneficiario> todosBeneficiarios = beneficiarioSpringDataJpaRepository.findAll();
        log.info("[finaliza] BeneficiarioInfraRepository - buscaTodosBeneficiarios");
        return todosBeneficiarios;
    }

    @Override
    public Beneficiario buscaBeneficiarioAtravesId(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository - buscaBeneficiarioAtravesId");
        Beneficiario beneficiario = beneficiarioSpringDataJpaRepository.findById(idBeneficiario)
                .orElseThrow(   ()-> APIException.build(HttpStatus.BAD_REQUEST,"Id Beneficiario incorreto"));
        log.info("[finaliza] BeneficiarioInfraRepository - buscaBeneficiarioAtravesId");
        return beneficiario;
    }
}
