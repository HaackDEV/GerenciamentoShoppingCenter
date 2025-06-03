package Etapa4;

public class Bijuteria extends Loja{

    private double metaVendas;

    public Bijuteria(String nome, int salarioBaseFuncionario, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao, int capacidadeEstoque,double metaVendas) {
        super(nome, salarioBaseFuncionario, quantidadeFuncionarios, enderecoLoja, dataFundacao, capacidadeEstoque);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas(){
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString(){
        return super.toString() + "\nMeta de vendas: " + metaVendas;
    }
}
