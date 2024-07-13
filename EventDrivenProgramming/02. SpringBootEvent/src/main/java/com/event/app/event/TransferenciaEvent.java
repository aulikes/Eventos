package com.event.app.event;

import com.event.app.modelo.Transferencia;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
/**
 * ApplicationEvent YA NO SE USA
 */
public class TransferenciaEvent extends ApplicationEvent {
    private final Transferencia transferencia;

    public TransferenciaEvent(Object source, Transferencia transferencia) {
        super(source);
        this.transferencia = transferencia;
    }

}
