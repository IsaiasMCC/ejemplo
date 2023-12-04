package com.mycompany.reproductormusicapatrones;

/**
 *
 * @author isais
 */
class EstadoDetenido extends IEstadoReproduccion {

    public EstadoDetenido( ReproductorMusicaReal reproductor) {
        super(reproductor);
    }
    @Override
    public void reproducir() {
        this.reproductor.cambiarEstado(new EstadoReproduciendo(reproductor));
        this.reproductor.setMensaje("Iniciando la reproducción");
        this.reproductor.setImage("src/main/resources/images/reproduciendo.png");
    }

    @Override
    public void pausar() {
        this.reproductor.setMensaje("No se puede pausar, el reproductor está detenido");
    }

    @Override
    public void detener() {
        this.reproductor.setMensaje("Ya estamos detenidos");
    }
}
