package br.com.wakanda.beneficiario_documento.documento.application.api;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/beneficiario/{idBeneficiario}/documento")
public interface DocumentoAPI {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    DocumentoResponse postDocumento(@PathVariable UUID idBeneficiario,
                                    @Valid @RequestBody DocumentoRequest documentoRequest);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<DocumentoListResponse> getDocumentosDoBeneficiario(@PathVariable UUID idBeneficiario);

    @GetMapping("/{idDocumento}")
    @ResponseStatus(HttpStatus.OK)
    DocumentoDetalhadoResponse getDocumentoBeneficiarioComId(@PathVariable UUID idBeneficiario,
                                                             @PathVariable UUID idDocumento);
    @DeleteMapping("/{idDocumento}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteDocumentoDoBeneficiario(@PathVariable UUID idBeneficiario,
                                       @PathVariable UUID idDocumento);
}
