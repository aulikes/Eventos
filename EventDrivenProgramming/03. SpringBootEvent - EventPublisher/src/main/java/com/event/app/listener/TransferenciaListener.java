package com.event.app.listener;

import com.event.app.event.AlertaEvent;
import com.event.app.event.TransferenciaEvent;
import lombok.RequiredArgsConstructor;
import com.event.app.modelo.Transferencia;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class TransferenciaListener {

    private final ApplicationEventPublisher eventPublisher;

    @EventListener
    public void onTransferenciaEvent(TransferenciaEvent event) throws InterruptedException {
        System.out.println("----------------------------- IN onTransferenciaEvent");

        Transferencia transferencia = event.getTransferencia();
        String mensaje = "Transferencia realizada de " + transferencia.getCuentaOrigen() +
                " a " + transferencia.getCuentaDestino() + " por el monto de " + transferencia.getMonto();

        // Publicar el evento de alerta
        eventPublisher.publishEvent(new AlertaEvent(mensaje));

        System.out.println("----------------------------- OUT onTransferenciaEvent");
    }

    @EventListener(condition = "#event.transferencia.getCuentaOrigen().startsWith('una')")
    public void onCallateEvent(TransferenciaEvent event)  {
        System.out.println("----------------------------- IN onCallateEvent");
        System.out.println("CALLATE OME!!!");
        System.out.println("----------------------------- OUT onCallateEvent");
    }
}
