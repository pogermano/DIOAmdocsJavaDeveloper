package com.w3g.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println("Stream count"+nomes.stream().count());
        System.out.println("Stream max"+nomes.stream().max(Comparator.comparingInt(String::length)));
        System.out.println("Stream min"+nomes.stream().min(Comparator.comparingInt(String::length)));
        System.out.println("Stream nomes que contem a letra r"+nomes.stream().filter((nome)-> nome.toLowerCase().contains("r")).collect(Collectors.toList()));
        System.out.println("Stream nomes concat com tamanho"+ getCollect(nomes));
        System.out.println("___ Stream nomes forEach---");
        nomes.stream().forEach(System.out::println);
    }

    private static List<String> getCollect(List<String> nomes) {
        return nomes.stream().map((nome) -> nome.concat(" - ").concat(String.valueOf(nome.length()))).collect(Collectors.toList());
    }
}
