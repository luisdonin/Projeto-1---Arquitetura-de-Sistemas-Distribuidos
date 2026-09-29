package br.utpfr.td.tsi.compraapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CompraController {
    private final EmailService emailService;
    private final TransacaoService transacaoService;
    private final NfeService nfeService;
    private final EntregaService entregaService;

    public CompraController(EmailService emailService, TransacaoService transacaoService, NfeService nfeService, EntregaService entregaService) {
        this.emailService = emailService;
        this.transacaoService = transacaoService;
        this.nfeService = nfeService;
        this.entregaService = entregaService;
    }

    @GetMapping("/compra")
    public ResponseEntity<String> getCompra() {
        String corpoResposta = "Compra efetuada";
        return ResponseEntity.ok(corpoResposta);
    }
    @PostMapping("/compra")
    public ResponseEntity<String> postCompra(@RequestBody String requestBody) {
        String corpoResposta = requestBody;
        emailService.sendEmail("Compra efetuada e email enviado" + corpoResposta);
        transacaoService.executaTransacao(corpoResposta);
        nfeService.geraNfe(corpoResposta);
        entregaService.notificaEntrega(corpoResposta);
        return ResponseEntity.ok("Compra efetuada e email enviado" + corpoResposta);
    }

}
