package com.event.app.event;

import com.event.app.modelo.Transferencia;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
/**
 * EXTENDER DE ApplicationEvent YA NO SE USA
 */
public class TransferenciaEvent {
    private final Transferencia transferencia;

    public TransferenciaEvent(Transferencia transferencia) {
        this.transferencia = transferencia;
    }

}
