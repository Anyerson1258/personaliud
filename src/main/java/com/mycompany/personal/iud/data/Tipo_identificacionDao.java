
package com.mycompany.personal.iud.data;


public class Tipo_identificacionDao {
 
    private static final String GET_TIPO_IDENTIFICACION = "SELECT * FROM tipo_identificacion";
    
    private static final String CREATE_TIPO_IDENTIFICACION = "INSET INTO tipo_identificacion (tipo_identificacion) values (?) ";
    
    private static final String GET_TIPO_IDENTIFICACION_BY_ID = "SELECT * FROM tipo_identificacion WHERE id_tidentificacion  = ?";
    
    private static final String UPDATE_TIPO_IDENTIFICACION = "UPDATE tipo_identificacion SET tipo_identificacion = ? WHERE id_tidentificacion  = ?";
    
    private static final String DELETE_TIPO_IDENTIFICACION = "DELETE FROM tipo_identificacion WHERE id_tidentificacion = ?";
    
}
