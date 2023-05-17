
package com.mycompany.personal.iud.domain;


public class Informacion_academica {
    
    
    private int id_academica;
    private int id_funcionario;
    private int id_universidad;
    private int id_destudio;
    private int id_testudio;

    public int getId_academica() {
        return id_academica;
    }

    public void setId_academica(int id_academica) {
        this.id_academica = id_academica;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public int getId_universidad() {
        return id_universidad;
    }

    public void setId_universidad(int id_universidad) {
        this.id_universidad = id_universidad;
    }

    public int getId_destudio() {
        return id_destudio;
    }

    public void setId_destudio(int id_destudio) {
        this.id_destudio = id_destudio;
    }

    public int getId_testudio() {
        return id_testudio;
    }

    public void setId_testudio(int id_testudio) {
        this.id_testudio = id_testudio;
    }

    @Override
    public String toString() {
        return id_funcionario + " " + id_universidad ;
    }
    
    
}
