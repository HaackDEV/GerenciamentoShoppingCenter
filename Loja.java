public class Loja {

    // Atributos da classe Loja.
    private String nome;
    private int quantidadeFuncionarios ;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    // Métodos construtores.
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFuncacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFuncacao;
    }

    // Getters e setters, retornar e atualizar valores de atributos.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    
    // Formata o toString para uma entrega mais entendível ao cliente final.
    @Override
    public String toString() {
        return "Loja: " + nome + "\n" + "Quantidade de funcionarios: " + quantidadeFuncionarios + "\n" + "Salario base dos funcionarios: " + salarioBaseFuncionario + "\n" + "Endereco: " + endereco + "\n" + "Data de fundacao: " + dataFundacao;
    }

    // Método que calcula os gastos totais com salários.
    public double gastosComSalario(){
        if (salarioBaseFuncionario<0) {
            return -1;
        } else {
            return quantidadeFuncionarios * salarioBaseFuncionario;
        }
    }

    // Método que diz o tamnho da loja baseado no número de funcionários.
    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios <10){
            return 'P';
        } else if (quantidadeFuncionarios >=10 && quantidadeFuncionarios <=30){
            return 'M';
        } else{
            return 'G';
        }
    }

}