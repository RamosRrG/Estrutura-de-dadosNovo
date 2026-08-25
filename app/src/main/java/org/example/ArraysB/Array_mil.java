package org.example.ArraysB;

import org.example.Vetores.Vetor;

import java.util.Random;




public class Array_mil {
    static Random r = new Random();
    public static void preencher(Vetor<Integer> vetor) {
        for (int i = 0; i < vetor.getElementoslenght(); i++) {
            int numero = r.nextInt();
            vetor.inserirFinal(numero);
        }
        vetor.ordena();
    }



    public static void main(String[] args) {
        Vetor<Integer> milInteiros = new Vetor<>(1000);
        Vetor<Integer> dezMilInteiros = new Vetor<>(10000);
        Vetor<Integer> cemMilInteiros = new Vetor<>(100000);
        preencher(milInteiros);
        preencher(dezMilInteiros);
        preencher(cemMilInteiros);






        milInteiros.buscaLinearOrdenada(milInteiros.ler(0));
        milInteiros.buscaLinearOrdenada(milInteiros.ler(499));
        milInteiros.buscaLinearOrdenada(milInteiros.ler(999));





    }
}
