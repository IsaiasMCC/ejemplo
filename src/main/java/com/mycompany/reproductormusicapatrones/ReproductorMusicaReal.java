/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reproductormusicapatrones;

/**
 *
 * @author isais
 */
public class ReproductorMusicaReal implements IReproductorMusica, IEstadoReproduccion {
    private String cancion;
    private IEstadoReproduccion estado;
    
    public ReproductorMusicaReal(String cancion) {
        this.cancion = cancion;
        this.estado = new EstadoDetenido();
    }
    
    public void cambiarEstado(IEstadoReproduccion estado) {
        this.estado = estado;
    }
    
    @Override
    public String reproducir() {
        return this.estado.reproducir();
    }

    @Override
    public String detener() {
        return this.estado.detener();
    }

    @Override
    public String pausar() {
        return this.estado.pausar();
    }
    
}
