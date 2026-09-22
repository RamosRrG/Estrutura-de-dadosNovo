public class Posicao{
    int linha;
    int coluna;
    char valor;

    public Posicao(int linha, int coluna, char valor){
        this.linha = linha;
        this.coluna = coluna;
        this.valor = valor;
    }

    public int getLinha(){
        return linha;
    }
    public int getColuna(){
        return coluna;
    }

    public char getValor(){
        return valor;
    }

    public void setValor(char valor){
        this.valor = valor;
    }


}


