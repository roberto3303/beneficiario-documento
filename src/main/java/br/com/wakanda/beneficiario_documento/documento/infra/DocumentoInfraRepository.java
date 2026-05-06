package br.com.wakanda.beneficiario_documento.documento.infra;

import br.com.wakanda.beneficiario_documento.documento.application.repository.DocumentoRepository;
import br.com.wakanda.beneficiario_documento.documento.domain.Documento;
import br.com.wakanda.beneficiario_documento.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
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
        var documentos = documentoSpringDataJpaRepository.findByIdBeneficiarioTitular(idBeneficiario);
        log.info("[finaliza] DocumentoInfraRepository - buscaDocumentosDoBeneficiario");
        return documentos;
    }

    @Override
    public Documento buscaDocumentoAtravesId(UUID idDocumento) {
        log.info("[inicia] DocumentoInfraRepository - buscaDocumentoAtravesId");
        var documento = documentoSpringDataJpaRepository.findById(idDocumento)
                .orElseThrow(() -> APIException.
                        build(HttpStatus.NOT_FOUND, "Id Documento não encontrado para o id = "+idDocumento));
        log.info("[finaliza] DocumentoInfraRepository - buscaDocumentoAtravesId");
        return documento;
    }
}
