package com.mycompany.reproductormusicapatrones;

/**
 *
 * @author isais
 */
public abstract class IEstadoReproduccion {

    public ReproductorMusicaReal reproductor;

    public IEstadoReproduccion(ReproductorMusicaReal reproductor) {
        this.reproductor = reproductor;
    }

    public abstract void detener();

    public abstract void pausar();

    public abstract void reproducir();
}
