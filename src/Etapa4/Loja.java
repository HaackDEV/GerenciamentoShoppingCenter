package Etapa4;

public class Loja {

    private String nome;
    private int salarioBaseFuncionario, quantidadeFuncionarios, produtosAdicionados;
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
        this.produtosAdicionados = 0;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao, int capacidadeEstoque){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = enderecoLoja;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[capacidadeEstoque];
        this.produtosAdicionados = 0;
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

    public int getProdutosAdicionados() {
        return produtosAdicionados;
    }

    @Override
        public String toString() {
    return  "|\tNome da Loja: " + this.nome + "\n" +
            "|\tQuantidade de funcionários: " + this.quantidadeFuncionarios + "\n" +
            "|\tSalário base dos funcionários: " + (this.salarioBaseFuncionario == -1 ? "Não informado" : this.salarioBaseFuncionario) + "\n" +
            "|\tEndereço da loja: " + (this.endereco == null ? "Não informado" : this.endereco) + "\n" +
            "|\tData de fundação: " + (this.dataFundacao == null ? "Não informada" : this.dataFundacao) + "\n" +
            "|\tCapacidade do estoque (tipos de produto): " + this.estoqueProdutos.length + " tipo(s)" + "\n" +
            "|\tTipos de produtos adicionados atualmente: " + this.produtosAdicionados + " tipo(s)\n";
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
        if (this.produtosAdicionados == 0) {
            System.out.println("A loja " + this.nome + " não possui produtos em estoque\n");
            return;
        }
        System.out.println("\n--- Produtos em estoque da loja '" + this.nome + " ---");
        for (int i = 0; i < this.produtosAdicionados; i++) {
            if (this.estoqueProdutos[i] != null) {
                System.out.println(this.estoqueProdutos[i].toString());
            }
        }
        System.out.println("----------------------------------------\n");
    }

    public boolean insereProduto(Produto produto){
        for(int i = 0; i < this.produtosAdicionados; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(produto.getNome())) {
                this.estoqueProdutos[i].setQuantidadeProduto(produto.getQuantidadeProduto() + estoqueProdutos[i].getQuantidadeProduto());
                System.out.println("Quantidade do produto '" + produto.getNome() + "' atualizada para: " + this.estoqueProdutos[i].getQuantidadeProduto() + " na loja '" + this.nome + "'.");
                return true;
            }
        }

        if (this.produtosAdicionados < this.estoqueProdutos.length){
                this.estoqueProdutos[this.produtosAdicionados] = produto;
                this.produtosAdicionados++;
                System.out.println("Novo tipo de produto '" + produto.getNome() + "' (quantidade: " + produto.getQuantidadeProduto() + ") adicionado à loja '" + this.nome + "'.");
                return true;
            }

        System.out.println("Estoque da loja " + this.nome + " está cheio");
        return false;
    }

    public boolean removeProduto(String nomeProduto, int quantidadeRemover){
        for(int i = 0; i < this.produtosAdicionados; i++){
            if(this.estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)){
                if(estoqueProdutos[i].getQuantidadeProduto() >= quantidadeRemover){
                    this.estoqueProdutos[i].setQuantidadeProduto(this.estoqueProdutos[i].getQuantidadeProduto() - quantidadeRemover);
                    System.out.println("Quantidade de " + nomeProduto + "(s)" + " da loja " + this.nome + " para " + this.estoqueProdutos[i].getQuantidadeProduto());

                    if (this.estoqueProdutos[i].getQuantidadeProduto() == 0) {
                        System.out.println("Produto '" + nomeProduto + "' esgotado e removido do catálogo da loja.\n");
                        for (int j = i; j < this.produtosAdicionados -1; j++) {
                            this.estoqueProdutos[j] = this.estoqueProdutos[j+1];
                        }
                        this.estoqueProdutos[this.produtosAdicionados - 1] = null;
                        this.produtosAdicionados--;
                    }
                    return true;
                } else {
                    System.out.println("Não há quantidade suficiente de '" + nomeProduto + "' para remover " + quantidadeRemover + " unidades na loja '" + this.nome + "'. Disponível: " + this.estoqueProdutos[i].getQuantidadeProduto() + "\n");
                    return false;
                }
            }
        }
        System.out.println("Produto " + nomeProduto + " não encontrado no estoque da loja " + this.nome);
        return false;
    }
}