
package com.mycompany.personal.iud.domain;

public class Nivel_estudio {
    
    private int id_destudio ;
    private String nivel_estudio;

    public int getId_destudio() {
        return id_destudio;
    }

    public void setId_destudio(int id_destudio) {
        this.id_destudio = id_destudio;
    }

    public String getNivel_estudio() {
        return nivel_estudio;
    }

    public void setNivel_estudio(String nivel_estudio) {
        this.nivel_estudio = nivel_estudio;
    }

    @Override
    public String toString() {
        return nivel_estudio + " ";
    }
    
    
}
