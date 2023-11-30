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

    public String reproducir() {
        //se subio el volumen
        return super.reproducir();
    }

    public int getVolumen() {
        return this.volumen;
    }

}
