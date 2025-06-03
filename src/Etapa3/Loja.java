package Etapa3;

public class Loja {

    private String nome;
    private int salarioBaseFuncionario, quantidadeFuncionarios;
    private Endereco endereco;
    private Data dataFundacao;

    public Loja(String nome, int salarioBaseFuncionario, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao) {
        this.nome = nome;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = enderecoLoja;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = enderecoLoja;
        this.dataFundacao = dataFundacao;
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

    @Override
    public String toString(){
        return "|\tLoja: " + nome + "\n" + "|\tQuantidade de funcionários: " + quantidadeFuncionarios + "\n" + "|\tSalário base dos funcionários " + salarioBaseFuncionario + "\n" + "|\tEndereço da loja: " + endereco + "\n" + "|\tData de fundação: " + dataFundacao;
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
}
