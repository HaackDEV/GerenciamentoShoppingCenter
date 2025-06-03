package Etapa4;

public class Cosmetico extends Loja {

    private double taxaComercializacao;

    public Cosmetico(String nome, int salarioBaseFuncionario, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao, int capacidadeEstoque, double taxaComercializacao) {
        super(nome, salarioBaseFuncionario, quantidadeFuncionarios, enderecoLoja, dataFundacao, capacidadeEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "|\tTaxa de Comercialização: " + taxaComercializacao;
    }
}