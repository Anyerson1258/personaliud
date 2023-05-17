
package com.mycompany.personal.iud.data;


public class Nivel_estudioDao {
   
    private static final String GET_NIVEL_ESTUDIO = "SELECT * FROM nivel_estudio";
    
    private static final String CREATE_NIVEL_ESTUDIO = "INSERT  INTO nivel_estudio (nivel_estudio) "
            + "VALUES (?),";
    
    private static final String GET_NIVEL_ESTUDIO_BY_ID = "SELECT * FROM nivel_estudio WHERE id_destudio =? ";
    
    private static final String UPDATE_NIVEL_ESTUDIO = "UPDATE nivel_estudio SET nivel_estudio = ? WHERE id_destudio =? ";
    
    private static final String DELETE_NIVEL_ESTUDIO = "DELETE FROM nivel_estudio WHERE id_destudio =?";
    
}
