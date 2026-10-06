package org.example.fila.atividade;
import org.example.fila.*;
import java.util.Random;
public class Servidor {

    private Fila<String> fila;
    private int totalReqGeradas = 0;
    private int totalReqAtendidas = 0;
    private int totalReqPerdidas = 0;
    private Random aleatorios;
    private int numProcessadores;
    private int N;


    public Servidor(int tamanhoFIla, int maximoRequisicoes, int numProcessadores) {
        this.fila = new Fila<>(tamanhoFIla);
        this.N = maximoRequisicoes;
        this.numProcessadores = numProcessadores;
        aleatorios = new Random();
    }


    public void executar(int ciclos) {
        for (int ciclo = 1; ciclo <= ciclos; ciclo++) {
            int novasReq = aleatorios.nextInt( N+1);

            for (int i = 0; i < novasReq; i++) {
                int nunNovaReq = aleatorios.nextInt();
                String stringNovaReq = String.valueOf(nunNovaReq);
                totalReqGeradas++;
                if (!fila.estaCheia()) {
                    fila.enfileirar(stringNovaReq);
                } else {
                    totalReqPerdidas++;
                   // throw new RuntimeException("Fila esta cheia");
                }
            }

            for (int i = 0; i < numProcessadores; i++) {
                if (!fila.isEmpty()) {
                    fila.desenfileirar();
                    totalReqAtendidas++;
                }
            }
        }
    }

    public String Relatorio(){
        double porcentagemPerda = 0;
        int requisicoesNaoAtendidas = totalReqGeradas - totalReqAtendidas - totalReqPerdidas;
        if (totalReqGeradas > 0) {
            porcentagemPerda = ((double) (totalReqPerdidas+requisicoesNaoAtendidas) / totalReqGeradas) * 100;
        }
        return "Total requisições Geradas: "+ totalReqGeradas + "\n"
                + "Total requisições Atendidas: "+ totalReqAtendidas +"\n"
                + "Total requisições Perdidas: " + (totalReqPerdidas + requisicoesNaoAtendidas) + "\n"
                + "Este servidor teve uma porcentagem de " + porcentagemPerda+ "% de perda";
    }


}


