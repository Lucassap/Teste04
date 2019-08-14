package br.digitalhouse.exercicios.ex4;

import java.util.*;

public class GuardaVolumes {
    Map<Integer, List<Peca>> dicionario = new HashMap<>();
    List<Peca> lista = new ArrayList<>();
    int i = 0;


    public Integer guardarPecas(List<Peca>listaDePeca){
        dicionario.put(i ,listaDePeca);
        i++;
        return i;
    }

    public void mostrarPecas(){
        for (Integer chave: dicionario.keySet()){
            System.out.println("Chave: " + chave);
            System.out.println("Conteúdo: " + dicionario.get(chave));

        }


    }





}
