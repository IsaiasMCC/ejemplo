package com.mycompany.reproductormusicapatrones;

/**
 *
 * @author isais
 */
class EstadoDetenido implements IEstadoReproduccion {

    @Override
    public String reproducir() {
        return ("Iniciando la reproducción");
    }

    @Override
    public String pausar() {
        return ("No se puede pausar, el reproductor está detenido");
    }

    @Override
    public String detener() {
        return ("Ya estamos detenidos");
    }
}
