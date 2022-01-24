package com.w3g.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);
        nomes.set(2 , "Larissa");

        System.out.println(nomes);
        Collections.sort(nomes);
        nomes.set(2 , "Wesley");
        System.out.println(nomes);
        nomes.remove(4);
        System.out.println(nomes);
        nomes.remove("Wesley");
        System.out.println(nomes);
        int pos = nomes.indexOf("Wesley");
        System.out.println(pos);
        pos = nomes.indexOf("Carlos");
        System.out.println(pos);
        List<String> outraLista = new ArrayList<>();
        outraLista.add("Ismael");
        outraLista.add("Rodrigo");
        nomes.addAll(outraLista);
        System.out.println("---- Lista dentro da Lista------");
        System.out.println(nomes);
        System.out.println("----------");


        String nome = nomes.get(1);
        System.out.println(nome);
        int tam = nomes.size();
        System.out.println(tam);
        boolean temAnderson = nomes.contains("Anderson");
        System.out.println(temAnderson);
        boolean vazia = nomes.isEmpty();
        System.out.println(vazia);
        System.out.println("------- FOR ----------");
        for (String nomeDoItem : nomes){
            System.out.println(nomeDoItem);
        }
        System.out.println("------------------------");
        System.out.println("-------- WHILE ---------");
        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()){
            System.out.println("--> "+iterator.next());
        }



        nomes.clear();
        vazia = nomes.isEmpty();
        System.out.println(vazia);


    }
}
