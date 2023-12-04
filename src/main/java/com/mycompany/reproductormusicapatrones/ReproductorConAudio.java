package com.mycompany.reproductormusicapatrones;

/**
 *
 * @author isais
 */
public class ReproductorConAudio extends ReproductorDecorador {

    public int volumen;

    public ReproductorConAudio(IReproductorMusica reproductor, int volumen) {
        super(reproductor);
        this.volumen = volumen;
    }

    public void reproducir() {
        //se subio el volumen
        super.reproducir();
    }

    public int getVolumen() {
        return this.volumen;
    }

}
