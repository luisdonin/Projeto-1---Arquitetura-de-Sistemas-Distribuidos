package br.utpfr.td.tsi.nfeapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/nfe")
public class NfeController {
    private final EmailService emailService;

    public NfeController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public ResponseEntity<String> gerarNfe(@RequestBody String nfeRequest){
        emailService.sendEmail("NFe: "+nfeRequest);
        System.out.println("NFe: "+nfeRequest);
        return ResponseEntity.ok("NFe: "+nfeRequest);
    }
}
