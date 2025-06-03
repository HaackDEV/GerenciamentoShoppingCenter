package Etapa4;

public class Informatica extends Loja {

    private double seguroEletronicos;

    public Informatica(String nome, int salarioBaseFuncionario, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao, int capacidadeEstoque,double seguroEletronicos) {
        super(nome, salarioBaseFuncionario, quantidadeFuncionarios, enderecoLoja, dataFundacao, capacidadeEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSeguro Eletrônico: " + seguroEletronicos;
    }
}
