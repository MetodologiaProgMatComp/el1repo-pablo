package es.uah.matcomp.mp.e3.S05.Herencia.EjLab5;

public class Main {
    public static void main(String[] args){
        Animal nuevo = new Animal("Lulu");
        Mammal mamifero= new Mammal("Raul");
        Dog perro = new Dog("Arana");
        Cat gato = new Cat("Mika");
        Dog perro2 = new Dog("TinTin");

        System.out.println(nuevo);
        System.out.println(mamifero);
        System.out.println(perro);
        System.out.println(gato);
        gato.greets();
        perro.greets();
        perro.greets(perro2);
        ///No podemos llamar a greets() de un animal porque no sabemos si ese animal acabara siendo un perro o gato
    }
}
