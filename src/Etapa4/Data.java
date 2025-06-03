package Etapa4;

public class Data {

    private int dia, mes, ano;

    public Data(int dia, int mes, int ano){
        if (verificaDataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("--- ERRO: Data alterada para o padrão 1/1/2000. ---");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public int getDia(){
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString(){
        return "Data: " + dia + "/" + mes + "/" + ano;
    }

    public boolean verificaAnoBissexto () {
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 !=0);
    }

    public boolean verificaDataValida (int dia, int mes, int ano) {
        int limiteDias;
        if (ano <= 0 || mes <1 || mes > 12) {
            return false;
        }

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            limiteDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            limiteDias = 30;
        } else {
            if (verificaAnoBissexto()) {
                limiteDias = 29;
            } else {
                limiteDias = 28;
            }
        }

        if (dia < 1 || dia > limiteDias) {
            return false;
        } else {
            return true;
        }
    }

    public boolean verificaDataMenor (Data outro) { // True == é menor.
        if (this.ano < outro.ano) return true;
        else if (this.ano == outro.ano && this.mes < outro.mes) return true;
        else if (this.ano == outro.ano && this.mes == outro.mes && this.dia < outro.dia) return true;
        else return false;
    }

}
