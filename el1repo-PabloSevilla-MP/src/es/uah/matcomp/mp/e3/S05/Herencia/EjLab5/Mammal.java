package es.uah.matcomp.mp.e3.S05.Herencia.EjLab5;

public class Mammal extends Animal{
    public Mammal() {
    }

    public Mammal(String name) {
        super(name);
    }
    public String toString(){
        return "Mammal ["+super.toString()+"]";
    }
}
