package com.event.app.event;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;

@Getter
@Slf4j
/**
 * ApplicationEvent YA NO SE USA
 */
public class AlertaEvent extends ApplicationEvent {
    private final String mensaje;

    public AlertaEvent(Object source, String mensaje) {
        super(source);
        this.mensaje = mensaje;
    }

}
