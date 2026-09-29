package org.example.fila.atividade;

public class Cenario2 {
    public static void main(String[] args){
        Servidor serv = new Servidor(100, 1000, 5);
        serv.executar(100);
        System.out.print(serv.Relatorio());
    }
}
