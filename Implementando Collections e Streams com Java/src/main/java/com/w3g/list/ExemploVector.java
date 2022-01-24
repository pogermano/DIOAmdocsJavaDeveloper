package com.w3g.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();
        esportes.add("Futebol");
        esportes.add("Handebol");
        esportes.add("Tênis de mesa");
        esportes.add("Basquetebol");

        esportes.set(2,"Ping Pong");
        System.out.println(esportes);
        esportes.remove(2);
        esportes.remove("Handebol");
        System.out.println(esportes.get(0));
        for (String esporte : esportes){
            System.out.println(esporte);
        }

    }
}
