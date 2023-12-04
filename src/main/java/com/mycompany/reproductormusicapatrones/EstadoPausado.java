package com.mycompany.reproductormusicapatrones;

/**
 *
 * @author isais
 */
public class EstadoPausado extends IEstadoReproduccion {

    public EstadoPausado(ReproductorMusicaReal reproductor) {
        super(reproductor);
    }
    @Override
    public void reproducir() {
        this.reproductor.cambiarEstado(new EstadoReproduciendo(reproductor));
        this.reproductor.setMensaje("Reanudando la reproducción");
        this.reproductor.setImage("src/main/resources/images/reproduciendo.png");
    }

    @Override
    public void pausar() {
        this.reproductor.setMensaje("Ya estamos pausados");
    }

    @Override
    public void detener() {
        this.reproductor.cambiarEstado(new EstadoDetenido(reproductor));
         this.reproductor.setMensaje("Deteniendo la reproducción");
         this.reproductor.setImage("src/main/resources/images/reproductor_base.png");
    }
}
