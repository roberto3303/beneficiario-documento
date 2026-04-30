package br.com.wakanda.beneficiario_documento.documento.infra;

import br.com.wakanda.beneficiario_documento.documento.application.repository.DocumentoRepository;
import br.com.wakanda.beneficiario_documento.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class DocumentoInfraRepository implements DocumentoRepository {

    private final DocumentoSpringDataJpaRepository documentoSpringDataJpaRepository;

    @Override
    public Documento salvaDoc(Documento documento) {
        log.info("[inicia] DocumentoInfraRepository - salvaDoc");
        documentoSpringDataJpaRepository.save(documento);
        log.info("[finaliza] DocumentoInfraRepository - salvaDoc");
        return documento;
    }

    @Override
    public List<Documento> buscaDocumentosDoBeneficiario(UUID idBeneficiario) {
        log.info("[inicia] DocumentoInfraRepository - buscaDocumentosDoBeneficiario");
        log.info("[finaliza] DocumentoInfraRepository - buscaDocumentosDoBeneficiario");
        return List.of();
    }
}
