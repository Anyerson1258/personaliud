
package com.mycompany.personal.iud.data;


public class SexoDao {
    
    private static final String GET_SEXO ="SELECT FROM * sexo ";
    
    private static final String CREATE_SEXO ="INSERT INTO sexo  (sexo) VALUES (?),";
    
    private static final String GET_SEXO_BY_ID ="SELECT FROM * sexo WHERE id_sexo = ? ";
    
    private static final String UPDATE_SEXO =" UPDATE sexo SET sexo = ? WHERE id_sexo = ?";
    
    private static final String DELETE_SEXO =" DELETE FROM sexo WHERE id_sexo = ?";
    
}
