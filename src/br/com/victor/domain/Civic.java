package br.com.victor.domain;

import br.com.victor.generics.GenericCars;

public class Civic extends GenericCars {


    public Civic(String speed, String cor) {
        super(speed, cor);
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
