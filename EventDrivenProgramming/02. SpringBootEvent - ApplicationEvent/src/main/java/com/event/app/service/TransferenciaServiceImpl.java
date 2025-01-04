package com.event.app.service;

import com.event.app.event.TransferenciaEvent;
import lombok.RequiredArgsConstructor;
import com.event.app.modelo.Transferencia;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class TransferenciaServiceImpl implements TransferenciaService {

    private final ApplicationEventPublisher eventPublisher;

    @Override
    public void executeTransferencia(Transferencia transferencia) {

        // Lógica para ejecutar la transferencia
        System.out.println("Transferencia ejecutada de " + transferencia.getCuentaOrigen() +" a " +
                        transferencia.getCuentaDestino() + " por el monto de " +transferencia.getMonto());

        // Publicar el evento
        eventPublisher.publishEvent(new TransferenciaEvent(this, transferencia));
    }
}
