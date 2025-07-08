package models;

public class Empleado implements Comparable<Empleado> {
    private int id;
    private String name;
    private String position;



    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    

    @Override
    public int compareTo(Empleado o) {
        // TODO Auto-generated method stub
        int comp = Integer.compare(this.id, o.id);
        if(comp!=0){
            return comp;
        }
        //nombre
        comp = this.name.compareTo(o.name);
        if(comp != 0){
            return comp;
        }

        //rol
        return this.position.compareTo(o.position);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position;
    }
}