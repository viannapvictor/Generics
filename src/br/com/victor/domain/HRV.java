package br.com.victor.domain;

import br.com.victor.generics.GenericCars;

public class HRV extends GenericCars {

    public HRV(String speed, String cor) {
        super(speed, cor);
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
