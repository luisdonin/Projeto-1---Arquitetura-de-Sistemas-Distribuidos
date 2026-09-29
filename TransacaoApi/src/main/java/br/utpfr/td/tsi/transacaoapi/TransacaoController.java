package br.utpfr.td.tsi.transacaoapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/transacao")
public class TransacaoController {
    private final EmailService emailService;

    public TransacaoController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public ResponseEntity<String> executaTransacao(@RequestBody String transacaoRequest) {
        emailService.sendEmail("transação: " + transacaoRequest + " executada com sucesso, enviando Nfe");
        System.out.println("Transação: " + transacaoRequest + " executada com sucesso");
        return ResponseEntity.ok("Transação: " + transacaoRequest + " criada com sucesso");
    }
}
