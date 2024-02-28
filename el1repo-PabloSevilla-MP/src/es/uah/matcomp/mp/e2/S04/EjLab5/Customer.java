package es.uah.matcomp.mp.e2.S04.EjLab5;

public class Customer {
    int id;
    String name;
    char gender;

    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
    public String toString(){
        return name+"("+id+")";
    }
}
