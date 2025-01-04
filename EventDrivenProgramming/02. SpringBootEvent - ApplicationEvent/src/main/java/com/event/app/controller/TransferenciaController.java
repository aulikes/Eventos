package com.event.app.controller;

import com.event.app.modelo.Transferencia;
import com.event.app.service.TransferenciaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/transferencias")
public class TransferenciaController {

    private final TransferenciaService transferenciaService;

    @PostMapping
    public ResponseEntity<String> realizarTransferencia(@RequestBody Transferencia transferencia) {

        System.out.println("--------------- TransferenciaService entra");
        transferenciaService.executeTransferencia(transferencia);
        System.out.println("--------------- TransferenciaService sale");

        return new ResponseEntity<>("Transferencia realizada exitosamente", HttpStatus.OK);
    }
}
