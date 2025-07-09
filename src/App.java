import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;
import dao.EmpleadoDAO;
import dao.EmpleadoDAOHashMap;
import dao.EmpleadoDAOTreeMap;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoDAOHash= new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoContoller = new EmpleadoContoller(empleadoDAOHash);

        EmpleadoDAO empladoDAOTree = new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoContoller2 = new EmpleadoContoller(empladoDAOTree);


        Empleado emp1 = new Empleado(5, "Luis", "Dev");
        Empleado emp2 = new Empleado(3, "Pedro", "Dev");
        Empleado emp3 = new Empleado(4, "Ana", "Dev");
        Empleado emp4 = new Empleado(8, "Pedro", "Dev");
        Empleado emp5 = new Empleado(1, "Juan", "Dev");

        empleadoContoller.agregarEmpleado(emp1);
        empleadoContoller.agregarEmpleado(emp2);
        empleadoContoller.agregarEmpleado(emp3);
        empleadoContoller.agregarEmpleado(emp4);
        empleadoContoller.agregarEmpleado(emp5);


        Empleado emp11 = new Empleado(5, "Luis", "Dev");
        Empleado emp22 = new Empleado(3, "Pedro", "Dev");
        Empleado emp33 = new Empleado(4, "Ana", "Dev");
        Empleado emp44 = new Empleado(8, "Pedro", "Dev");
        Empleado emp55 = new Empleado(1, "Juan", "Dev");

        empleadoContoller2.agregarEmpleado(emp11);
        empleadoContoller2.agregarEmpleado(emp22);
        empleadoContoller2.agregarEmpleado(emp33);
        empleadoContoller2.agregarEmpleado(emp44);
        empleadoContoller2.agregarEmpleado(emp55);

        empleadoDAOHash.listar();
        System.out.println("\n---TREE--");
        empladoDAOTree.listar();



        System.out.println("controller");
        empleadoContoller.listarEmpleado();




    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemploConTreeMap();
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
