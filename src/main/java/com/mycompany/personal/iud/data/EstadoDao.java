package com.mycompany.personal.iud.data;

public class EstadoDao {
    
    private static final String GET_ESTADO = "SELECT * FROM estado";
    
    private static final String CREATE_ESTADO = "INSERT INTO estado (estado) "
            + "VALUES (?)";
    
    private static final String GET_ESTADO_BY_ID = "SELECT * FROM estado WHERE id_estado=?";
    

    private static final String UPDATE_ESTADO = "UPDATE estado SET estado = ? "
            + "WHERE id_estado = ? ";
    
    private static final String DELETE_ESTADO = "DELETE FROM estado WHERE id_estado = ? ";
}
