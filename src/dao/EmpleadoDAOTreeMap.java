package dao;

import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {
    private Map<Empleado,Empleado> empl;
    
    public EmpleadoDAOTreeMap(){
        this.empl = new TreeMap<>();

    }

    @Override
    public void add(Empleado empleado) {
        empl.put(empleado, empleado);
        
    }

    @Override
    public void eliminar(int id) {
        Empleado temp = new Empleado(id);
        empl.remove(temp);
        
    }

    @Override
    public void listar() {
        for (Empleado em: empl.values()){
            System.out.println(em);

        }
    }
    

    
}
