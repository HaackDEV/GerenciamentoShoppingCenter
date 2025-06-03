package Etapa1;

public class Loja {

    private String nome;
    private int salarioBaseFuncionario, quantidadeFuncionarios;

    public Loja(String nome, int salarioBaseFuncionario, int quantidadeFuncionarios) {
        this.nome = nome;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
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

    @Override
    public String toString(){
        return "Loja: " + nome + "\n" + "Quantidade de funcionários: " + quantidadeFuncionarios + "\n" + "Salário base dos funcionários " + salarioBaseFuncionario;
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
