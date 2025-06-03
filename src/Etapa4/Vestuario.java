package Etapa4;

public class Vestuario extends Loja {

    private boolean produtosImportados;

    public Vestuario(String nome, int salarioBaseFuncionario, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao, boolean produtosImportados, int capacidadeEstoque) {
        super(nome, salarioBaseFuncionario, quantidadeFuncionarios, enderecoLoja, dataFundacao, capacidadeEstoque);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados(){
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return super.toString() + "Produtos Importados: " + produtosImportados;
    }
}
