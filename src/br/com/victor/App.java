package br.com.victor;

import br.com.victor.domain.City;
import br.com.victor.domain.Civic;
import br.com.victor.domain.HRV;
import br.com.victor.generics.GenericCars;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<GenericCars> lista = new ArrayList();
        Civic civic = new Civic( "80", "Branco");
        City city = new City("60", "Preto");
        HRV hrv = new HRV( "125", "Prata");
        lista.add(civic);
        lista.add(city);
        lista.add(hrv);

        imprimir(lista);
    }

    public static <T> void imprimir(List<GenericCars> lista) {
        lista.forEach( objeto -> {
                System.out.println( objeto.getName());
        });
    }

}
