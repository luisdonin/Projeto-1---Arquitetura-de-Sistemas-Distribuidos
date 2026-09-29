package br.utpfr.td.tsi.emailapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/email")
public class EmailController {
    @PostMapping
    public ResponseEntity<String> enviarEmail(@RequestBody String email) {
        System.out.println( "\n" + email + "\n");
        return ResponseEntity.ok(email);
    }
}
