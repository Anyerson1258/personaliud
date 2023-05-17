
package com.mycompany.personal.iud.data;


public class Titulo_estudioDao {
    
    private static final String GET_TITULO_ESTUDIO = "SELECT FROM titulo_estudio";
    
    private static final String CREATE_TITULO_ESTUDIO = " INSERT INTO titulo_estudio (titulo_estudio) VALUES (?)";
    
    private static final String GET_TITULO_ESTUDIO_CY_ID = " SELECT FROM titulo_estudio WHERE id_testudio = ?";
    
    private static final String UPDATE_TITULO_ESTUDIO = " UPDATE titulo_estudio SET titulo_estudio = ? WHERE id_testudio = ?";
    
    private static final String DELETE_TITULO_ESTUDIO = " DELETE FROM titulo_estudio WHERE id_testudio = ?";
}
