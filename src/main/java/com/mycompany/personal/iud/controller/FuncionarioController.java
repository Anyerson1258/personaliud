package com.mycompany.personal.iud.controller;

import com.mycompany.personal.iud.data.FuncionarioDao;
import com.mycompany.personal.iud.domain.Funcionario;
import java.sql.SQLException;
import java.util.List;

public class FuncionarioController {
    
    private FuncionarioDao funcionarioDao;
    
    public FuncionarioController(){
        funcionarioDao = new FuncionarioDao();
    }
    
    public List<Funcionario> obtenerFuncionario() throws SQLException {
        return funcionarioDao.obtenerFuncionario();
    }
    
    public void crear (Funcionario funcionario) throws SQLException {
        funcionarioDao.crear(funcionario);
    }
    
    public Funcionario obtenerFuncionario (int id_funcionario) throws SQLException {
        return funcionarioDao.obtenerFuncionario(id_funcionario);
    }
    
    public void actualizarFuncionario (int id_funcionario, Funcionario funcionario) throws SQLException {
        funcionarioDao.actualizarFuncionario(id_funcionario, funcionario);
    }
            
    public void eliminarFuncionario (int id_funcionario) throws SQLException {
        funcionarioDao.eliminarFuncionario(id_funcionario);
    }
    
}
