
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
    public String reproducir() {
        //System.out.println("Iniciando Reproducción");
        return this.reproductorReal.reproducir();
    }
}
