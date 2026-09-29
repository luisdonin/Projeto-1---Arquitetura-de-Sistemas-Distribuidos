package br.utpfr.td.tsi.entregaapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/entrega")
public class EntregaController {
    private final EmailService emailService;

    public EntregaController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public ResponseEntity<String> enviarEntrega(@RequestBody String entrega) {
        emailService.sendEmail("Entrega: " + entrega +" enviada com sucesso");
        System.out.println("Entrega enviada: " + entrega);
        return ResponseEntity.ok("Entrega: " + entrega +" enviada com sucesso!");
    }
}

