
package com.mycompany.personal.iud.domain;


public class Universidad {
    
    private int id_universidad ;
    private String universidad;

    public int getId_universidad() {
        return id_universidad;
    }

    public void setId_universidad(int id_universidad) {
        this.id_universidad = id_universidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return universidad;
    }
    
    
}
