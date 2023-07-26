package br.com.victor.domain;

import br.com.victor.generics.GenericCars;

public class City extends GenericCars {

    public City(String speed, String cor) {
        super(speed, cor);
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
