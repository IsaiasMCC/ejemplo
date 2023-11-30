
package com.mycompany.reproductormusicapatrones;

/**
 *
 * @author isais
 */
public class ReproductorConVideo extends ReproductorDecorador{
    public String urlVideo;
    
    public ReproductorConVideo(IReproductorMusica reproductor, String urlVideo) {
        super(reproductor);
        this.urlVideo = urlVideo;
    }
    
    public String reproducir() {
        //se agrega video
        return super.reproducir();
    }
    
    public String getVideo() {
        return this.urlVideo;
    }
    
}
