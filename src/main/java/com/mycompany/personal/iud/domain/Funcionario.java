package com.mycompany.personal.iud.domain;

public class Funcionario {

    private int id_funcionario;
    private int id_tidentificacion;
    private String tipo_identificacion;
    private String nombre;
    private String apellido;
    private int n_identificacion;
    private int id_estado;
    private String estado;
    private int id_sexo;
    private String sexo;
    private String direccion;
    private String telefono;
    private String fecha_nacimiento;
    

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public int getId_tidentificacion() {
        return id_tidentificacion;
    }

    public void setId_tidentificacion(int id_tidentificacion) {
        this.id_tidentificacion = id_tidentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo_identificacion() {
        return tipo_identificacion;
    }

    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }
    
    

    public int getN_identificacion() {
        return n_identificacion;
    }

    public void setN_identificacion(int n_identificacion) {
        this.n_identificacion = n_identificacion;
    }

    public int getId_estado() {
        return id_estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public int getId_sexo() {
        return id_sexo;
    }

    public void setId_sexo(int id_sexo) {
        this.id_sexo = id_sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return tipo_identificacion + " " + nombre + " " + apellido + " " + n_identificacion;
    }

}
