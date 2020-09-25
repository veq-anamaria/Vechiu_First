package com.company;

public class Main {

    public static void main(String[] args) {

        Masina masina_1=new Masina( "Toyota", "Gri", 2000);
        System.out.println(masina_1.print());

        Client client_1=new Client("Cezarion", "Tomato", 2003);
        System.out.println(client_1.printClient());
        client_1.setIdnp(1999);
        System.out.println(client_1.printClient());
}
}
