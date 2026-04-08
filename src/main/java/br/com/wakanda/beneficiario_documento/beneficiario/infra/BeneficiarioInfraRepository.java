package br.com.wakanda.beneficiario_documento.beneficiario.infra;

import br.com.wakanda.beneficiario_documento.beneficiario.application.repository.BeneficiarioRepository;
import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
public class BeneficiarioInfraRepository implements BeneficiarioRepository {

    @Override
    public Beneficiario salva(Beneficiario beneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository - salva");
        log.info("[finaliza] BeneficiarioInfraRepository - salva");
        return beneficiario;
    }
}
