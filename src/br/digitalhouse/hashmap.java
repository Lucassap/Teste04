package br.digitalhouse;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

    public static void main(String[] args) {

        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(7, "Fizemos 7 gol contra você");
        mapa.put(1, "Fizemos 1 gol contra você");
        mapa.put(4,"Fizemos 4 gols contra você");
        mapa.put(2, "Fizemos 2 gols contra você");





        for (Integer chave: mapa.keySet()){
            System.out.println("Chave: " + chave);
            System.out.println("Conteúdo: " + mapa.get(chave));

        }

       mapa.remove(4);

        System.out.println(" ");
        for (Integer chave: mapa.keySet()){
            System.out.println("Chave: " + chave);
            System.out.println("Conteúdo: " + mapa.get(chave));


        }




    }
}
