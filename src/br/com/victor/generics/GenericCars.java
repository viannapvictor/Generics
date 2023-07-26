package br.com.victor.generics;

public abstract class GenericCars<T>{
    private String speed;
    private String cor;


    public GenericCars (String speed, String cor) {
        this.speed = speed;
        this.cor = cor;
    }

    public abstract String getName();
}
