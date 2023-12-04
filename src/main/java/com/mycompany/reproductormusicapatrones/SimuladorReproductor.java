
package com.mycompany.reproductormusicapatrones;

/**
 *
 * @author isais
 */
public class SimuladorReproductor  {
    public boolean isPayed;
    public ReproductorMusicaProxy reproductor;
    public String image;
    
    
    public SimuladorReproductor() {
        this.isPayed = false;
        this.reproductor = new ReproductorMusicaProxy("Quien te dijo");
        this.image = "src/main/resources/images/sin_pagar.png";
    }
    public void pagarMeembresia() {
        this.isPayed = true;
        this.image = "src/main/resources/images/reproductor_base.png";
    }
    public void cancelarMeembresia() {
        this.isPayed = false;
        this.image = "src/main/resources/images/sin_pagar.png";
    }
}
