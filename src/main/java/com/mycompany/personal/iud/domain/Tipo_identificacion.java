
package com.mycompany.personal.iud.domain;

public class Tipo_identificacion {
    
    private int id_tidentificacion ;
    private String tipo_identificacion;

    public int getId_tidentificacion() {
        return id_tidentificacion;
    }

    public void setId_tidentificacion(int id_tidentificacion) {
        this.id_tidentificacion = id_tidentificacion;
    }

    public String getTipo_identificacion() {
        return tipo_identificacion;
    }

    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }

    @Override
    public String toString() {
        return tipo_identificacion;
    }
    
    
}
