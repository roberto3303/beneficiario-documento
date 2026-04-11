package br.com.wakanda.beneficiario_documento.beneficiario.application.repository;

import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;

import java.util.List;
import java.util.UUID;

public interface BeneficiarioRepository {
    Beneficiario salva(Beneficiario beneficiario);

    List<Beneficiario> buscaTodosBeneficiarios();

    Beneficiario buscaBeneficiarioAtravesId(UUID idBeneficiario);
}
