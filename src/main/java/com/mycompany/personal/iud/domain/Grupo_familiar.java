package com.mycompany.personal.iud.domain;

public class Grupo_familiar {

    private int id_gfamiliar;
    private int id_funcionario;
    private String apellido;
    private String rol;

    public int getId_gfamiliar() {
        return id_gfamiliar;
    }

    public void setId_gfamiliar(int id_gfamiliar) {
        this.id_gfamiliar = id_gfamiliar;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return id_funcionario + " " + apellido + " " + rol;
    }

}
