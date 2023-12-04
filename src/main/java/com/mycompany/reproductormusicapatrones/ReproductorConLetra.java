package com.mycompany.reproductormusicapatrones;

/**
 *
 * @author isais
 */
public class ReproductorConLetra extends ReproductorDecorador {

    public String letra;

    public ReproductorConLetra(IReproductorMusica reproductor, String letra) {
        super(reproductor);
    }

    public void reproducir() {
        //se agrego letra
        super.reproducir();
    }

    public String getLetra() {
        return this.letra;
    }
}
