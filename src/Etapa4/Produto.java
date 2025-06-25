package Etapa4;

public class Produto {

    private String nome;
    private int quantidadeProduto;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade,  int quantidadeProduto) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }


    @Override
    public String toString(){
        return "|\tNome: " + nome + "\n" + "|\tPreco: " + preco + "\n" + "|\tData de validade: " + dataValidade + "\n" + "|\tQuantidade: " + quantidadeProduto + "\n";
    }

    public boolean estaVencido (Data dataReferencia) {
        return dataValidade.verificaDataMenor(dataReferencia);
    }

}
