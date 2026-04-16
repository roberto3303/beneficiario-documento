package br.com.wakanda.beneficiario_documento.beneficiario.application.service;

import br.com.wakanda.beneficiario_documento.beneficiario.application.api.*;

import java.util.List;
import java.util.UUID;

public interface BeneficiarioService {
    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);

    List<BeneficiarioListResponse> buscaTodosBeneficiarios();

    BeneficiarioDetalhadoResponse buscaBeneficiarioAtravesId(UUID idBeneficiario);

    void deletaBeneficiarioAtravesId(UUID idBeneficiario);

    void AlteraBeneficiario(UUID idBeneficiario, BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest);
}
