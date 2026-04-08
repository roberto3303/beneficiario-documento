package br.com.wakanda.beneficiario_documento.beneficiario.application.service;

import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficarioResponse;
import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioRequest;

public interface BeneficiarioService {
    BeneficarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);

}
