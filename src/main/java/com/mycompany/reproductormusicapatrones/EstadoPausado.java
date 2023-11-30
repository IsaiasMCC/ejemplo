package com.mycompany.reproductormusicapatrones;

/**
 *
 * @author isais
 */
public class EstadoPausado implements IEstadoReproduccion {

    @Override
    public String reproducir() {
        return ("Reanudando la reproducción");
    }

    @Override
    public String pausar() {
        return ("Ya estamos pausados");
    }

    @Override
    public String detener() {
        return ("Deteniendo la reproducción");
    }
}
