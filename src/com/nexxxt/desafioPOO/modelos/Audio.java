package com.nexxxt.desafioPOO.modelos;

public class Audio{
    private String titulo;
    private int totalDeRepruducciones;
    private int totalDeMeGusta;
    private int clasificacion;

    public void meGusta(){
        this.totalDeMeGusta++;
    }

    public void repruduce(){
        this.totalDeRepruducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeRepruducciones() {
        return totalDeRepruducciones;
    }

    public void setTotalDeRepruducciones(int totalDeRepruducciones) {
        this.totalDeRepruducciones = totalDeRepruducciones;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
