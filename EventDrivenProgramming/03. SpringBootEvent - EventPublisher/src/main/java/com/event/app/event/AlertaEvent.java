package com.event.app.event;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;

@Getter
@Slf4j
/**
 * EXTENDER DE ApplicationEvent YA NO SE USA
 */
public class AlertaEvent {
    private final String mensaje;

    public AlertaEvent(String mensaje) {
        this.mensaje = mensaje;
    }

}
