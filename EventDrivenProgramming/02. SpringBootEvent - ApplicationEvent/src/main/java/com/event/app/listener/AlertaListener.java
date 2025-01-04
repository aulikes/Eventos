package com.event.app.listener;

import com.event.app.event.AlertaEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AlertaListener {

    @Async
    @EventListener
    public void onAlertaEvent(AlertaEvent event) throws InterruptedException {

        System.out.println("----------------------------- IN onAlertaEvent ESPERA UNOS SEGUNDOS!!!!!!!!!!");
        Thread.sleep(20000);
        System.out.println("Alerta recibida: " + event.getMensaje());
        System.out.println("----------------------------- OUT onAlertaEvent");
    }
}
