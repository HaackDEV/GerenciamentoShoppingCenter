package Etapa2;

public class Produto {

    private String nome;
    private int preco;
    private Data dataValidade;

    public Produto(String nome, int preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getPreco(){
        return preco;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString(){
        return "|\tNome: " + nome + "\n" + "|\tPreco: " + preco;
    }

    public boolean estaVencido (Data dataReferencia) {
        return dataValidade.verificaDataMenor(dataReferencia);
    }

}
