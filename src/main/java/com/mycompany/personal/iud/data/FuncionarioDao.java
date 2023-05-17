package com.mycompany.personal.iud.data;

import com.mycompany.personal.iud.domain.Funcionario;
import com.mycompany.personal.iud.util.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDao {

    private static final String GET_FUNCIONARIO = "SELECT * FROM funcionario";

    private static final String CREATE_FUNCIONARIO = "INSERT INTO funcionario (id_tidentificacion, nombre, apellido, n_identificacion, id_estado, id_sexo, direccion, telefono, fecha_nacimiento) "
            + "VALUES (?,?,?,?,?,?,?,?,?)";

    private static final String GET_FUNCIONARIO_BY_ID = "SELECT * FROM funcionario WHERE id_funcionario = ?";

    private static final String UPDATE_FUNCIONARIO = "UPDATE funcionario SET id_tidentificacion=? , nombre=? , apellido=? , n_identificacion=?, id_estado=? , id_sexo=? , direccion=? , telefono=? , fecha_nacimiento=? "
            + "WHERE id_funcionario = ? ";

    private static final String DELETE_FUNCIONARIO = "DELETE FROM funcionario WHERE id_funcionario = ?";

    public List<Funcionario> obtenerFuncionario() throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Funcionario> Funcionarios = new ArrayList<>();

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_FUNCIONARIO);

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                Funcionario funcionario = new Funcionario();
                funcionario.setId_funcionario(resultSet.getInt("Id_funcionario"));
                funcionario.setId_tidentificacion(resultSet.getInt("id_tidentificacion"));
                funcionario.setNombre(resultSet.getString("nombre"));
                funcionario.setApellido(resultSet.getString("apellido"));
                funcionario.setN_identificacion(resultSet.getInt("n_identificacion"));
                funcionario.setId_estado(resultSet.getInt("id_estado"));
                funcionario.setId_sexo(resultSet.getInt("id_sexo"));
                funcionario.setDireccion(resultSet.getString("direccion"));
                funcionario.setTelefono(resultSet.getString("telefono"));
                funcionario.setFecha_nacimiento(resultSet.getString("fecha_nacimiento"));
                Funcionarios.add(funcionario);
            }

            return Funcionarios;

        } finally {

            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (resultSet != null) {
                resultSet.close();
            }
        }

    }

    public void crear(Funcionario funcionario) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareCall(CREATE_FUNCIONARIO);
            preparedStatement.setInt(1, funcionario.getId_tidentificacion());
            preparedStatement.setString(2, funcionario.getNombre());
            preparedStatement.setString(3, funcionario.getApellido());
            preparedStatement.setInt(4, funcionario.getN_identificacion());
            preparedStatement.setInt(5, funcionario.getId_estado());
            preparedStatement.setInt(6, funcionario.getId_sexo());
            preparedStatement.setString(7, funcionario.getDireccion());
            preparedStatement.setString(8, funcionario.getTelefono());
            preparedStatement.setString(9, funcionario.getFecha_nacimiento());
            preparedStatement.executeUpdate();

        } finally {
            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }

    }

    public Funcionario obtenerFuncionario(int id_funcionario) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        Funcionario funcionario = null;

        try {

            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_FUNCIONARIO_BY_ID);
            preparedStatement.setInt(1, id_funcionario);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                funcionario.setId_funcionario(resultSet.getInt("id_funcionario"));
                funcionario.setId_tidentificacion(resultSet.getInt("id_tidentificacion"));
                funcionario.setNombre(resultSet.getString("nombre"));
                funcionario.setApellido(resultSet.getString("apellido"));
                funcionario.setN_identificacion(resultSet.getInt("n_identificacion"));
                funcionario.setId_estado(resultSet.getInt("id_estado"));
                funcionario.setId_sexo(resultSet.getInt("id_sexo"));
                funcionario.setDireccion(resultSet.getString("direccion"));
                funcionario.setTelefono(resultSet.getString("telefono"));
                funcionario.setFecha_nacimiento(resultSet.getString("fecha_nacimiento"));
            }
            return funcionario;
        } finally {
            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (resultSet != null) {
                resultSet.close();
            }
        }

    }

    public void actualizarFuncionario(int id_funcionario, Funcionario funcionario) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareCall(UPDATE_FUNCIONARIO);
            preparedStatement.setInt(1, funcionario.getId_tidentificacion());
            preparedStatement.setString(2, funcionario.getNombre());
            preparedStatement.setString(3, funcionario.getApellido());
            preparedStatement.setInt(4, funcionario.getN_identificacion());
            preparedStatement.setInt(5, funcionario.getId_estado());
            preparedStatement.setInt(6, funcionario.getId_sexo());
            preparedStatement.setString(7, funcionario.getDireccion());
            preparedStatement.setString(8, funcionario.getTelefono());
            preparedStatement.setString(9, funcionario.getFecha_nacimiento());
            preparedStatement.setInt(10, funcionario.getId_funcionario());
            preparedStatement.executeUpdate();

        } finally {

            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

        }

    }

    public void eliminarFuncionario(int id_funcionario) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(DELETE_FUNCIONARIO);
            preparedStatement.setInt(1, id_funcionario);
            preparedStatement.executeUpdate();
        } finally {

            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }

}
