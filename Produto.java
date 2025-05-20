public class Produto {

    // Atributos da classe Produto.
    private String nome;
    private double preco;
    private Data dataValidade;


    // Método construtor.
    public Produto(String nome, double preco, Data dataValiade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValiade;
    }

    // Métodos de acesso.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }

        public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Entrega o resultado de forma mais simples pro cliente.
    @Override
    public String toString() {
        return "Produto: " + nome + "\n" + "Preço do produto: R$" + preco + "\n" + "Data de validade: " + dataValidade;
    }
}
