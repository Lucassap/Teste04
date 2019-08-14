package br.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class arraylist {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();


        lista.add("Lucas");
        lista.add("Diego");
        lista.add("Gabriel");

        for (String valor: lista){
            System.out.println(valor);
        }

        lista.remove(0);
        System.out.println(" ");
        for (String valor: lista){
            System.out.println(valor);
        }

        System.out.println(lista.get(1));
        System.out.println(lista.indexOf("Diego"));

    }

}
