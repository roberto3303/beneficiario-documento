package br.com.wakanda.beneficiario_documento.beneficiario.application.repository;

import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;

import java.util.List;

public interface BeneficiarioRepository {
    Beneficiario salva(Beneficiario beneficiario);

    List<Beneficiario> buscaTodosBeneficiarios();
}
