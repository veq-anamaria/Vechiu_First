package com.company;

public class Client {
    String nume;
    String prenume;
    int idnp;

    public Client(String nume, String prenume, int idnp){
        this.nume=nume;
        this.prenume=prenume;
        this.idnp=idnp;

    }

    public void setNume(String nume){
        this.nume=nume;
    }

    public void setPrenume(String prenume){
        this.prenume=prenume;
    }

    public void setIdnp(int idnp){
        this.idnp=idnp;
    }

    public String printClient(){
        return "{ Nume: " + this.nume + "\n" +
                "Prenume: " + this.prenume + "\n" +
                "Idnp: " + this.idnp + "\n" +
                "}";

    }
}
