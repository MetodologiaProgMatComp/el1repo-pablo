package es.uah.matcomp.mp.e3.S05.Herencia.EjLab5;

public class Cat extends Mammal{
    public Cat(String name) {
        super(name);
    }
    public void greets(){ System.out.println("Meow");}
    public String toString(){
        return "Cat ["+super.toString()+"]";
    }
}
