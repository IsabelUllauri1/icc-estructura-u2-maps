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
        System.out.println("\nEJERCICIOS:");
        Ejercicios ejercicios = new Ejercicios();

        System.out.println("\nEjer1 -> son Anagramas");
        System.out.println("Ejemplo1: listen y silent -> " + Ejercicios.areAnagrams("listen", "silent"));
        System.out.println("Ejemplo2:  hello y bello -> " + Ejercicios.areAnagrams("hello", "bello"));
        System.out.println("Ejemplo3: triangle e integral -> " + Ejercicios.areAnagrams("triangle", "integral"));

        System.out.println("\nEjer2 -> sumatoria de dos");
        System.out.println("Ejemplo A:");
        System.out.println("Input: nums = [9,2,3,6], objetivo = 5: ");
        int[] nums = ejercicios.sumatoriaDeDos(new int[] { 9, 2, 3, 6 }, 5);
        for (int c : nums) {
            System.out.print(c + ",");
        }

        System.out.println("\nEjemplo B:");
        System.out.println("Input: nums = [9,2,3,6], objetivo = 5: " );
        System.out.println(ejercicios.sumatoriaDeDos(new int[] { 9, 2, 3, 6 }, 10));


        System.out.println("\nEjer 3 -> Contar Caracteres");
        System.out.println("Input: hola");
        ejercicios.contarCaracteres("hola");

        System.out.println("Ejer 4 -> anagramas");
        System.out.println("Input: palabra1 = roma, palabra2 = amor " );
        System.out.println(ejercicios.sonAnagramas("amor", "roma"));
    }
}
