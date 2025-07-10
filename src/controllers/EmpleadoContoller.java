package controllers;

import java.util.HashMap;
import java.util.Map;

import dao.EmpleadoDAO;
import models.Empleado;

public class EmpleadoContoller {

    private EmpleadoDAO empleadoDAO;

    public EmpleadoContoller(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO;

    }

    
    public void eliminarEmpleado(int id) {
       empleadoDAO.eliminar(id);

    }

    public void listarEmpleado() {
        empleadoDAO.listar();

    }

    public void agregarEmpleado(Empleado emp) {
        empleadoDAO.add(emp);

    }

    
}