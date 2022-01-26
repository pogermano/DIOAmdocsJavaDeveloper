package com.w3g.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaDeBanco = new LinkedList<>();
        filaDeBanco.add("Patricia");
        filaDeBanco.add("Roberto");
        filaDeBanco.add("Flávio");
        filaDeBanco.add("Pamela");
        filaDeBanco.add("Anderson");
        System.out.println(filaDeBanco);

        String clienteASerAtendido = filaDeBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaDeBanco);
        String primeiroCliente = filaDeBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaDeBanco.size());
      //  filaDeBanco.clear();
        String primeiroClienteOuErro = filaDeBanco.peek();
       // String primeiroClienteOuErro = filaDeBanco.element(); //retorna erro
        System.out.println(primeiroClienteOuErro);
        System.out.println("----- FOR ----");
        for (String client: filaDeBanco){
            System.out.println(client);
        }
        System.out.println("----- WHILE ----");
        Iterator<String>  iteratorFilaDeBanco = filaDeBanco.iterator();
        while (iteratorFilaDeBanco.hasNext()){
            System.out.println("--> "+iteratorFilaDeBanco.next());
        }
        System.out.println(filaDeBanco.isEmpty());

        filaDeBanco.clear();
        System.out.println(filaDeBanco.isEmpty());
    }
}
