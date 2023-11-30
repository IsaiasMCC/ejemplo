package com.mycompany.reproductormusicapatrones;

/**
 *
 * @author isais
 */
public class ReproductorDecorador implements IReproductorMusica {

    public IReproductorMusica reproductor;

    public ReproductorDecorador(IReproductorMusica reproductor) {
        this.reproductor = reproductor;
    }

    @Override
    public String reproducir() {
        return this.reproductor.reproducir();
    }
}
