public class Loja {

    // Atributos da classe Loja.
    private String nome;
    private int quantidadeFuncionarios ;
    private double salarioBaseFuncionario;

    // Métodos construtores.
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
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
    
    // Formata o toString para uma entrega mais entendível ao cliente final.
    @Override
    public String toString() {
        return "Loja: " + nome + "\n" + "Quantidade de funcionarios: " + quantidadeFuncionarios + "\n" + "Salario base dos funcionarios: " + salarioBaseFuncionario;
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
        } else if (quantidadeFuncionarios >=10 && quantidadeFuncionarios >=30){
            return 'M';
        } else{
            return 'G';
        }
    }

    
}