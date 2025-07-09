package controllers;

import java.util.HashMap;
import java.util.Map;

import dao.EmpleadoDAO;
import models.Empleado;

public class EmpleadoContoller {

    private Map<Integer, Empleado> empleados = new HashMap<>();
    private EmpleadoDAO empleadoDAO;

    public EmpleadoContoller(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO;

    }

    public void crearEmpleado(Empleado empleado) {
        if (empleados.containsKey(empleado.getId())) {
            System.out.println("ya existe empleado");
        } else {
            empleados.put(empleado.getId(), empleado);
            System.out.println("empleado creado!");
        }

    }

    public void eliminarEmpleado(int id) {
        if (empleados.containsKey(id)) {
            empleados.remove(id);
            System.out.println("eliminado!");

        } else {
            System.out.println("no se encontro");
        }

    }

    public void listarEmpleado() {
        for (Empleado em : empleados.values()) {
            System.out.println(em);
        }

    }

    public void agregarEmpleado(Empleado emp) {
        empleadoDAO.add(emp);

    }

    
}