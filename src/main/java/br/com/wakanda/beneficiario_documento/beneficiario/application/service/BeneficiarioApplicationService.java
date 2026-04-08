package br.com.wakanda.beneficiario_documento.beneficiario.application.service;

import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficarioResponse;
import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class BeneficiarioApplicationService implements BeneficiarioService {
    @Override
    public BeneficarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest) {
        log.info("[inicia] BeneficiarioApplicationService - criaBeneficiario");
        log.info("[finaliza] BeneficiarioApplicationService - criaBeneficiario");
        return null;
    }
}
