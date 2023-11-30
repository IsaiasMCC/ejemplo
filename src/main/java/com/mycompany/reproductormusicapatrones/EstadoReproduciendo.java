package com.mycompany.reproductormusicapatrones;

/**
 *
 * @author isais
 */
public class EstadoReproduciendo implements IEstadoReproduccion {

    @Override
    public String detener() {
        return ("Deteniendo la reproducción");
    }

    @Override
    public String pausar() {
        return ("Pausando la reproducción");
    }

    @Override
    public String reproducir() {
        return ("Ya estamos reproduciendo");
    }

}
