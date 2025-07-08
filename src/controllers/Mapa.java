package controllers;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import models.Empleado;

public class Mapa {
    public Mapa() {
    }
    public void ejemploConHashMap(){
        Map<String, String> capitales = new HashMap<>();
        capitales.put("Ecuador",  "Quito");
        capitales.put("Colombia",  "Bogota");
        capitales.put("Peru",  "Lima");
        
        System.out.println(capitales.keySet());
        for(String pais: capitales.keySet()){
            System.out.println("Pais: "+ pais+ ", capital: "+ capitales.get(pais));
        }
        System.out.println();

        //ejemplo acceso directo
        String capital = capitales.get("Ecuador");
        System.out.println("La capital de Ecuador es: "+ capital);
        System.out.println();


        //mapa
        Map  <Integer,Empleado> empleados = new HashMap<>();
        empleados.put(3, new Empleado(3, "Pedro", "Tester"));
        empleados.put(1, new Empleado(1, "Ana", "Dev"));
        empleados.put(2, new Empleado(2, "Luis", "Disenador"));
        empleados.put(1, new Empleado(3, "Pedro", "Tester"));

        for(Map.Entry<Integer, Empleado> k: empleados.entrySet()){
            System.out.println("Clave: "+ k.getKey()+", Valor: "+ k.getValue());
        }
        System.out.println();

        Map<Empleado,Integer> empleadosDos = new HashMap<>();
        Empleado emp1 = new Empleado(1, "Ana", "Dev");
        Empleado emp2 = new Empleado(2, "Pedro", "Dev");
        Empleado emp3 = new Empleado(3, "Ana", "Dev");
        Empleado emp4 = new Empleado(3, "Ana", "Dev");


        empleadosDos.put(emp1,1000);
        empleadosDos.put(emp2,1200);
        empleadosDos.put(emp3,1500);
        empleadosDos.put(emp4, 2000);
        //el mapa me deja guardar emp3, y emp4 aunque tienen valores iguales
        // imprimen dos veces porque emp3 y emp4 tienen hashcodes diferentes

        for(Map.Entry<Empleado,Integer> entry: empleadosDos.entrySet()){
            System.out.println(entry.getKey()+" -> "+ entry.getValue());
        }
        System.out.println();




    }

    public void ejemploConLinkedHashMap(){
        LinkedHashMap<String, Integer> producto = new LinkedHashMap<>();
        
        producto.put("Leche", 12);
        producto.put("huevos",5 );
        producto.put("pan", 5);
        producto.put("queso",4);
        producto.put("Atun",3);

        for(String objeto: producto.keySet()){
            System.out.println("Producto: "+ objeto+ ", Valor: "+ producto.get(objeto));
        }

    }
    public void ejemploConTreeMap(){
        TreeMap<Integer, String> personas = new TreeMap<>();
        personas.put(122,"Carlos");
        personas.put(123,"Isa");
        personas.put(124,"Pablo");
        personas.put(125,"Juan");
        personas.put(126,"Teblo");

        System.out.println();

        for(Integer id: personas.keySet()){
            System.out.println("ID: "+id+ ", Persona: " + personas.get(id));
        }

        System.out.println();

        Map<Empleado,Integer> empleadosDos = new TreeMap<>();
        Empleado emp1 = new Empleado(1, "Ana", "Dev");
        Empleado emp2 = new Empleado(2, "Pedro", "Dev");
        Empleado emp3 = new Empleado(3, "Ana", "Dev");
        Empleado emp4 = new Empleado(3, "Ana", "Dev");


        empleadosDos.put(emp1,1000);
        empleadosDos.put(emp2,1200);
        empleadosDos.put(emp3,1500);
        empleadosDos.put(emp4, 2000);
        //el mapa me deja guardar emp3, y emp4 aunque tienen valores iguales
        // imprimen dos veces porque emp3 y emp4 tienen hashcodes diferentes

        for(Map.Entry<Empleado,Integer> entry: empleadosDos.entrySet()){
            System.out.println(entry.getKey()+" -> "+ entry.getValue());
        }
        System.out.println();

    }
}
    