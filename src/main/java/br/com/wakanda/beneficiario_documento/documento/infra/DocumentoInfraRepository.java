package br.com.wakanda.beneficiario_documento.documento.infra;

import br.com.wakanda.beneficiario_documento.documento.application.repository.DocumentoRepository;
import br.com.wakanda.beneficiario_documento.documento.domain.Documento;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
public class DocumentoInfraRepository implements DocumentoRepository {
    @Override
    public Documento salvaDoc(Documento documento) {
        log.info("[inicia] DocumentoInfraRepository - salvaDoc");
        log.info("[finaliza] DocumentoInfraRepository - salvaDoc");
        return documento;
    }
}
