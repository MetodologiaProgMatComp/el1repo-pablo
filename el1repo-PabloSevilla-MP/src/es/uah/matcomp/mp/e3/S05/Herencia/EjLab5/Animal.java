package es.uah.matcomp.mp.e3.S05.Herencia.EjLab5;

public class Animal {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String toString(){
        return "Animal: ["+name+"]";
    }
}
