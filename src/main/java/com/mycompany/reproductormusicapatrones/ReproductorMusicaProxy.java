
package com.mycompany.reproductormusicapatrones;

/**
 *
 * @author isais
 */
public class ReproductorMusicaProxy implements IReproductorMusica{
    public ReproductorMusicaReal reproductorReal;

    public ReproductorMusicaProxy(String cancion) {
        this.reproductorReal = new ReproductorMusicaReal(cancion);
    }
    
    @Override
    public void reproducir() {
        //System.out.println("Iniciando Reproducción");
        this.reproductorReal.reproducir();
    }
}
