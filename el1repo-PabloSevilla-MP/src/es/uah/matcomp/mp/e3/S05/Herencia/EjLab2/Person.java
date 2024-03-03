package es.uah.matcomp.mp.e3.S05.Herencia.EjLab2;

public class Person {
    String name;
    String address;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toString(){
        return "Person [ name= "+name+", adress= "+address+"]";
    }
}
