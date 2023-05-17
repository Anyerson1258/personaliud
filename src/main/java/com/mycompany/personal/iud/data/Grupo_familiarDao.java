
package com.mycompany.personal.iud.data;

public class Grupo_familiarDao {
    
    private static final String GET_GRUPO_FAMILIAR = "SELECT * FROM grupo_familiar";
    
    private static final String CREATE_GRUPO_FAMILIAR = "INSERT INTO grupo_familiar (id_funcionario, nombre, apellido, rol) "
            + "VALUES (?,?,?,?)";
    
    private static final String GET_GRUPO_FAMILIAR_BY_ID = "SELECT * FROM grupo_familiar WHERE id_gfamiliar =?";
    
    private static final String UPDATE_GRUPO_FAMILIAR = "UPDATE grupo_familiar SET id_funcionario=? , nombre=? , apellido=? , rol=? WHERE id_gfamiliar =?";
    
    private static final String DELETE_GRUPO_FAMILIAR = "DELETE FROM grupo_familiar WHERE id_gfamiliar =?" ;
   
}
