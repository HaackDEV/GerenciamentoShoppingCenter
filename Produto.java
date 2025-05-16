public class Produto {

    // Atributos da classe Produto.
    private String nome;
    private double preco;

    // Método construtor.
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
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

    // Entrega o resultado de forma mais simples pro cliente.
    @Override
    public String toString() {
        return "Produto: " + nome + "\n" + "Preço do produto: R$" + preco;
    }
}
