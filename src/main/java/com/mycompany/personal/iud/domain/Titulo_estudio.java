
package com.mycompany.personal.iud.domain;


public class Titulo_estudio {
    
    private int id_testudio ;
    private String titulo_estudio; 

    public int getId_testudio() {
        return id_testudio;
    }

    public void setId_testudio(int id_testudio) {
        this.id_testudio = id_testudio;
    }

    public String getTitulo_estudio() {
        return titulo_estudio;
    }

    public void setTitulo_estudio(String titulo_estudio) {
        this.titulo_estudio = titulo_estudio;
    }

    @Override
    public String toString() {
        return titulo_estudio;
    }
    
    
}
