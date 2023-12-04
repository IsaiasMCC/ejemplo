package com.mycompany.reproductormusicapatrones;

/**
 *
 * @author isais
 */
public class EstadoReproduciendo extends IEstadoReproduccion {

    public EstadoReproduciendo(ReproductorMusicaReal reproductor) {
        super(reproductor);
    }
    @Override
    public void detener() {
        this.reproductor.cambiarEstado(new EstadoDetenido(reproductor));
        this.reproductor.setMensaje("Deteniendo la reproducción");
        this.reproductor.setImage("src/main/resources/images/reproductor_base.png");
    }

    @Override
    public void pausar() {
        this.reproductor.cambiarEstado(new EstadoPausado(reproductor));
        this.reproductor.setMensaje("Pausando la reproducción");
        this.reproductor.setImage("src/main/resources/images/pausado.png");
    }

    @Override
    public void reproducir() {
        this.reproductor.setMensaje("Ya estamos reproduciendo");
    }

}
