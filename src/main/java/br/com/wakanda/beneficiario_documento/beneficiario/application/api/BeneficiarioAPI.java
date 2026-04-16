package br.com.wakanda.beneficiario_documento.beneficiario.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/v1/beneficiario")
public interface BeneficiarioAPI {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    BeneficiarioResponse postBeneficiario(@Valid @RequestBody BeneficiarioRequest beneficiarioRequest);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<BeneficiarioListResponse> getTodosBeneficiarios();

    @GetMapping("/{idBeneficiario}")
    @ResponseStatus(HttpStatus.OK)
    BeneficiarioDetalhadoResponse getBeneficiarioAtravesId(@PathVariable   UUID idBeneficiario);

    @DeleteMapping("/{idBeneficiario}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deletaBeneficiarioAtravesId(@PathVariable UUID idBeneficiario);

    @PatchMapping("/{idBeneficiario}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void patchAlteraBeneficiario(@PathVariable UUID idBeneficiario,
                                  @Valid @RequestBody BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest);
}
