package Etapa4;

public class Loja {

    private String nome;
    private int salarioBaseFuncionario, quantidadeFuncionarios;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int salarioBaseFuncionario, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao, int capacidadeEstoque) {
        this.nome = nome;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = enderecoLoja;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[capacidadeEstoque];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao, int capacidadeEstoque){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = enderecoLoja;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[capacidadeEstoque];
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(int salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco enderecoLoja) {
        this.endereco = enderecoLoja;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

        @Override
        public String toString() {
    return  "|\tNome da Loja: " + this.nome + "\n" +
            "|\tQuantidade de funcionários: " + this.quantidadeFuncionarios + "\n" +
            "|\tSalário base dos funcionários: " + (this.salarioBaseFuncionario == -1 ? "Não informado" : this.salarioBaseFuncionario) + "\n" +
            "|\tEndereço da loja: " + (this.endereco == null ? "Não informado" : this.endereco) + "\n" +
            "|\tData de fundação: " + (this.dataFundacao == null ? "Não informada" : this.dataFundacao) + "\n" +
            "|\tCapacidade do estoque: " + (this.estoqueProdutos == null ? "Não inicializado" : this.estoqueProdutos.length + " produto(s)");

}

    public int gastosComSalario() {
        if (salarioBaseFuncionario < 0) {
            return -1;
        } else {
            return quantidadeFuncionarios * salarioBaseFuncionario;
        }
    }

    public char tamanhoDaLoja(){
        if (quantidadeFuncionarios <10){
            return 'P';
        } else if (quantidadeFuncionarios >=10 && quantidadeFuncionarios <=30){
            return 'M';
        } else{
            return 'G';
        }
    }

    public void imprimeProdutos(){
        for(int i = 0; i < estoqueProdutos.length; i++){
            if(estoqueProdutos[i] != null){
                System.out.println(estoqueProdutos[i]);
            } else {
                System.out.println("Estoque vazio");
            }
        }
    }

    public boolean insereProduto(Produto produto){
        for(int i = 0; i < estoqueProdutos.length; i++){
            if(estoqueProdutos[i] == null){
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        System.out.println("Estoque cheio");
        return false;
    }

    public boolean removeProduto(String nomeProduto){
        for(int i = 0; i <estoqueProdutos.length; i++){
            if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)){
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }
}