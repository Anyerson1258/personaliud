
package com.mycompany.personal.iud.data;


public class Informacion_academicaDao {
    
    
    private static final String GET_INFORMACION_ACADEMICA = "SELECT * FROM informacion_academica";
    
    private static final String CREATE_INFORMACION_ACADEMICA = "INSERT INTO informacion_academica (id_funcionario, id_universidad, id_destudio, id_testudio) "
            + "VALUES (?, ?, ?, ?) ";
    
    private static final String GET_INFORMACION_ACADEMICA_BY_ID = "SELECT * FROM informacion_academica WHERE id_academica = ?";
    
    private static final String UPDATE_INFORMACION_ACADEMICA = "UPDATE informacion_academica SET id_funcionario=? , id_universidad=? , id_destudio=? , id_testudio=? WHERE id_academica =?";
    
    private static final String DELETE_INFORMACION_ACADEMICA ="DELETE FROM informacion_academica WHERE id_academica = ?";
    
}
