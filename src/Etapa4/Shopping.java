package Etapa4;

public class Shopping{

    private String nome;
    private  Endereco endereco;
    private  Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja loja){
        for(int i = 0; i<lojas.length; i++){
            if(lojas[i] == null){
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja){
        for(int i = 0; i<lojas.length; i++){
            if(lojas[i] != null && lojas[i].getNome().equals(nomeLoja)){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja){
        if (!tipoLoja.equalsIgnoreCase("Cosmético") && !tipoLoja.equalsIgnoreCase("Informática") && !tipoLoja.equalsIgnoreCase("Bijuteria") && !tipoLoja.equalsIgnoreCase("Vestuário") && !tipoLoja.equalsIgnoreCase("Alimentação")) {
            return -1;
        }

        int contador = 0;

        for(int i = 0; i<lojas.length; i++){
            if(lojas[i] == null){
                continue;
            }

            if (tipoLoja.equalsIgnoreCase("Cosmético") && lojas[i] instanceof Cosmetico) {
                contador++;
            } else if (tipoLoja.equalsIgnoreCase("Informática") && lojas[i] instanceof Informatica) {
                contador++;
            } else if (tipoLoja.equalsIgnoreCase("Bijuteria") && lojas[i] instanceof Bijuteria) {
                contador++;
            } else if (tipoLoja.equalsIgnoreCase("Vestuário") && lojas[i] instanceof Vestuario) {
                contador++;
            } else if (tipoLoja.equalsIgnoreCase("Alimentação") && lojas[i] instanceof Alimentacao) {
                contador++;
            }
        }
        return contador;
    }

    public Informatica lojaSeguroMaisCaro(){

        double maiorSeguro = -1;
        Informatica lojaMaisCara = null;

        for(int i = 0; i<lojas.length; i++){
            if (lojas[i] != null && lojas[i] instanceof Informatica){
                Informatica lojaInformatica = (Informatica) lojas[i];
                if (lojaInformatica.getSeguroEletronicos() > maiorSeguro){
                    maiorSeguro = lojaInformatica.getSeguroEletronicos();
                    lojaMaisCara = lojaInformatica;
                }

            }
        }
        return lojaMaisCara;
    }

    @Override
    public String toString(){
        return "|\tNome: " + nome + "\n" + "|\tEndereco: " + endereco + "\n" + "|\tLojas:";
    }

}