package com.event.app.modelo;

import lombok.Data;

@Data
public class Transferencia {
    private String cuentaOrigen;
    private String cuentaDestino;
    private Double monto;
}
