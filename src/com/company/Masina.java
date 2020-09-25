package com.company;

public class Masina {
    String marca;
    String culoare;
    float greutate;

    public Masina(String marca, String culoare, float greutate ){
        this.marca=marca;
        this.culoare=culoare;
        this.greutate=greutate;

    }
    public String print(){
        return "{ Marca: " + this.marca + "\n" +
                "Culoarea: " + this.culoare + "\n" +
                "Greutate: " + this.greutate + "\n" +
                "}";

    }
}
