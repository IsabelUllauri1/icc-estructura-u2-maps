package dao;

import java.util.HashMap;
import models.Empleado;
import java.util.Map;


public class EmpleadoDAOHashMap implements EmpleadoDAO {
    private Map<Empleado,Empleado> empleados;

    public EmpleadoDAOHashMap(){
        this.empleados=new HashMap<>();

    }

    @Override
    public void add(Empleado empleado) {
        empleados.put(empleado, empleado);
        
    }

    @Override
    public void eliminar(int id) {
        Empleado temp = new Empleado(id);

        empleados.remove(temp);
    }

    @Override
    public void listar() {
        for(Empleado emp: empleados.values()){
            System.out.println(emp);
        }
    }
    
    
}
