package org.example.fila.atividade;

public class Cenario1 {


    public static void main(String[] args){
        Servidor serv = new Servidor(100, 100, 10);
        serv.executar(100);
        System.out.print(serv.Relatorio());
    }
}
