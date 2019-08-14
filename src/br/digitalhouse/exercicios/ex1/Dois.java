package br.digitalhouse.exercicios.ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dois {

    public static void main(String[] args) {

        Set<String> Joao = new java.util.HashSet<>();
        Set<String> Miguel = new java.util.HashSet<>();
        Set<String> Maria = new java.util.HashSet<>();
        Set<String> Lucas = new java.util.HashSet<>();
        Map<String, Set<String>> nomes = new HashMap<>();

        Joao.add("Juan");
        Joao.add("Fissura");
        Joao.add("Maromba");
        Miguel.add("Night Watch");
        Miguel.add("Bruce Wayne");
        Miguel.add("Tampinha");
        Maria.add("Wonder Woman");
        Maria.add("Mary");
        Maria.add("Marilene");
        Lucas.add("Lukinha");
        Lucas.add("Jeorge");
        Lucas.add("George");

        nomes.put("Joao",Joao);
        nomes.put("Miguel",Miguel);
        nomes.put("Maria",Maria);
        nomes.put("Lucas",Lucas);

        for (String chave: nomes.keySet()){
            System.out.println("Chave: " + chave);
            System.out.println("Conteúdo: " + nomes.get(chave));

        }


    }
}
