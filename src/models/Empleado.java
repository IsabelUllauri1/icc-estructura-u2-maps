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
    

    public Empleado(int id) {
        this.id = id;
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


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((position == null) ? 0 : position.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empleado other = (Empleado) obj;
        if (id != other.id)
            return false;
        if (position == null) {
            if (other.position != null)
                return false;
        } else if (!position.equals(other.position))
            return false;
        return true;
    }

    

    
}