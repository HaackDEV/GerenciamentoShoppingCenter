package Etapa3;

public class Alimentacao extends Loja {

    private Data dataAlvara;

    public Alimentacao(String nome, int salarioBaseFuncionario, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao, Data dataAlvara) {
        super(nome, salarioBaseFuncionario, quantidadeFuncionarios, enderecoLoja, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara(){
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "|\tData de alvara: " + dataAlvara;
    }

}
