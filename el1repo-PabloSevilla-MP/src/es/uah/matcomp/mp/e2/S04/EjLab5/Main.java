package es.uah.matcomp.mp.e2.S04.EjLab5;

public class Main {
    //Primero probaremos las funciones de customer.
    public static void main(String[] args) {
        Customer c1 = new Customer(123, "Alberto", 'm');
        System.out.println(c1);
        System.out.println("El ID es: " + c1.getId());
        System.out.println("El nombre es: " + c1.getName());
        System.out.println("El genero es: " + c1.getGender());
        //Ahora probamos las funciones de account
        Account a1 = new Account(11, c1);
        a1.setBalance(200.20);
        System.out.println(a1);
        System.out.println("El ID es: "+a1.getId());
        System.out.println(a1.getCustomer());
        System.out.println("El balance es: "+a1.getBalance());
        System.out.println("El nombre del cliente es: "+a1.getCustomerName());
        System.out.println(a1.deposit(100));
        System.out.println(a1.withdraw(150));
    }
}
