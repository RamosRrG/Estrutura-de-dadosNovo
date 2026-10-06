package org.example.fila.atividade;

public class Cenario2 {
    public static void main(String[] args){
        Servidor serv = new Servidor(10000, 100, 24);
        serv.executar(100);
        System.out.print(serv.Relatorio());
    }
}
