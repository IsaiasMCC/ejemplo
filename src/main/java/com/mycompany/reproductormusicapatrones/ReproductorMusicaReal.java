
package com.mycompany.reproductormusicapatrones;

/**
 *
 * @author isais
 */
public class ReproductorMusicaReal implements IReproductorMusica{

    public String cancion;
    public IEstadoReproduccion estado;
    public String image;
    public String mensaje;

    public ReproductorMusicaReal(String cancion) {

        this.cancion = cancion;
        this.estado = new EstadoDetenido(this);
        this.image = "";
        this.mensaje = "";
    }

    public void cambiarEstado(IEstadoReproduccion estado) {
        this.estado = estado;
    }

    //agregar al diagrama
    public void setImage(String image) {
        this.image = image;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void reproducir() {
        this.estado.reproducir();
    }

    public void detener() {
        this.estado.detener();
    }

    public void pausar() {
        this.estado.pausar();
    }

}
