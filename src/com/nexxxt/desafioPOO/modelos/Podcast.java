package com.nexxxt.desafioPOO.modelos;

public class Podcast extends Audio{
    private String presentador;
    private String descripcion;

    @Override
    public int getClasificacion() {
        if (getTotalDeRepruducciones() >= 2000) {
            return 10;
        } else {
            return 6;
        }
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
