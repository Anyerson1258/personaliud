package com.mycompany.personal.iud.data;

public class UniversidadDao {
    
    private static final String GET_UNIVERSIDAD = "SELECT FROM * universidad";
    
    private static final String CREATE_UNIVERSIDAD = "INSERT INTO universidad (universidad) VALUES (?)";
    
    private static final String GET_UNIVERSIDAD_BY_ID = "SELECT FROM * universidad WHERE id_universidad = ?";
    
    private static final String UPDATE_UNIVERSIDAD = "UPDATE universidad SET universidad = ? WHERE id_universidad = ?";
    
    private static final String DELETE_UNIVERSIDAD = "DELETE FROM universidad WHERE id_universidad = ?";
    
}
