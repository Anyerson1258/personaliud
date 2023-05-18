package com.mycompany.personal.iud.app;

import com.mycompany.personal.iud.controller.FuncionarioController;
import com.mycompany.personal.iud.domain.Funcionario;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void obtenerFuncionario(FuncionarioController funcionarioController) {
        try {
            List<Funcionario> funcionarios = funcionarioController.obtenerFuncionario();
            if (funcionarios.isEmpty()) {
                System.out.println("No hay datos");
            } else {
                funcionarios.forEach(funcionario -> {
                    System.out.println("ID Funcionario: " + funcionario.getId_funcionario());
                    System.out.println("Tipo identificacion: " + funcionario.getTipo_identificacion());
                    System.out.println("Nombre: " + funcionario.getNombre());
                    System.out.println("Apellido: " + funcionario.getApellido());
                    System.out.println("Numero identificacion: " + funcionario.getN_identificacion());
                    System.out.println("Estado Civil: " + funcionario.getEstado());
                    System.out.println("Sexo: " + funcionario.getSexo());
                    System.out.println("Direccion: " + funcionario.getDireccion());
                    System.out.println("Telefono: " + funcionario.getTelefono());
                    System.out.println("Fecha nacimiento: " + funcionario.getFecha_nacimiento());
                    System.out.println("*****************************");
                    System.out.println("*****************************");
                });
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void crear(FuncionarioController funcionarioController) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite el Tipo de Identificacion:");
            int id_tidentificacion = sc.nextInt();
            System.out.println("El tipo de identificacion es: " + id_tidentificacion);
            System.out.println("*****************************");
            System.out.println("*****************************");
            
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Ingrese el nombre o nombres:");
            String nombre = sc2.nextLine();
            System.out.println("El nombre completo del funcionario es: " + nombre);
            System.out.println("*****************************");
            System.out.println("*****************************");

            Scanner sc3 = new Scanner(System.in);
            System.out.println("Ingrese el apellido o apellidos");
            String apellido = sc3.nextLine();
            System.out.println("El apellido del funcionario es: " + apellido);
            System.out.println("*****************************");
            System.out.println("*****************************");

            System.out.println("Ingrese el Numero de identificacion");
            int n_identificacion = sc.nextInt();
            System.out.println("El numero de identificacion es: " + n_identificacion);
            System.out.println("*****************************");
            System.out.println("*****************************");

            System.out.println("Ingrese el Estado civil");
            int id_estado = sc.nextInt();
            System.out.println("El estado civil del funcionario es: " + id_estado);
            System.out.println("*****************************");
            System.out.println("*****************************");

            System.out.println("Ingrese el sexo");
            int id_sexo = sc.nextInt();
            System.out.println("El sexo del funcionario es: " + id_sexo);
            System.out.println("*****************************");
            System.out.println("*****************************");

            System.out.println("Ingrese la direccion");
            String direccion = sc.nextLine();
            System.out.println("La direccion del funcionario es: " + direccion);
            System.out.println("*****************************");
            System.out.println("*****************************");

            System.out.println("Ingrese el telefono");
            String telefono = sc.nextLine();
            System.out.println("El telefono del funcionario es: " + telefono);
            System.out.println("*****************************");
            System.out.println("*****************************");

            System.out.println("Ingrese la fecha de nacimiento en el formato AAAA-MM-DD");
            String fecha_nacimiento = sc.nextLine();
            System.out.println("La fecha de nacimiento es: " + fecha_nacimiento);
            System.out.println("*****************************");
            System.out.println("*****************************");

            Funcionario funcionario = new Funcionario();
            funcionario.setId_tidentificacion(id_tidentificacion);
            funcionario.setNombre(nombre);
            funcionario.setApellido(apellido);
            funcionario.setN_identificacion(n_identificacion);
            funcionario.setId_estado(id_estado);
            funcionario.setId_sexo(id_sexo);
            funcionario.setDireccion(direccion);
            funcionario.setTelefono(telefono);
            funcionario.setFecha_nacimiento(fecha_nacimiento);
            funcionarioController.crear(funcionario);
            System.out.println("Funcionario creado con exito");
            System.out.println("*****************************");
            System.out.println("*****************************");

            obtenerFuncionario(funcionarioController);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public static void eliminarFuncionario(FuncionarioController funcionarioController) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite el ID del funcionario a eliminar: ");

            int id_funcionario = sc.nextInt();
            System.out.println("El ID del funcionario es: " + id_funcionario);

            Funcionario funcionarioExist = funcionarioController.obtenerFuncionario(id_funcionario);
            
            if(funcionarioExist == null ){
                System.out.println("No existe el funcionario");
                return;
            }
            
            funcionarioController.eliminarFuncionario(id_funcionario);
            System.out.println("Funcionario elimimado con exito");
            obtenerFuncionario(funcionarioController);
            System.out.println("*****************************");
            System.out.println("*****************************");
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        
       int opcion = -1;
        Scanner scanner = new Scanner(System.in);
        FuncionarioController funcionarioController = new FuncionarioController();
        
        while (opcion !=0){
            System.out.println("*****************************");
            System.out.println("ELIGUE UNA OPCION");
            System.out.println("*****************************");
            System.out.println("1. LISTAR FUNCIONARIOS");
            System.out.println("2. CREAR FUNCIONARIOS");
            System.out.println("3. ELIMINAR FUNCIONARIO");
            /*System.out.println("4. LISTAR FUNCIONARIO POR ID");
            System.out.println("5. ACTUALIZAR FUNCIONARIO");*/
            
            System.out.println("*****************************");

            opcion = Integer.parseInt(scanner.nextLine());
            
            switch(opcion){
                case 0:
                    System.out.println("Ha salido de la aplicacion");
                    break;
                  
                case 1: 
                    obtenerFuncionario(funcionarioController);
                    break;
                case 2:
                    crear(funcionarioController);
                    break;
                case 3:
                    eliminarFuncionario(funcionarioController);
                    break;
                    
                default:
                    System.out.println("Opcion invalida");
               
            }
            
            
        }
        
    }
}
