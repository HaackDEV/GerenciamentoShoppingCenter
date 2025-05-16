public class Data {

    // Atributos da classe Data.
    private int dia, mes, ano;


    // Método construtor.
    // public Data(int dia, int mes, int ano) {
    //     if (dia > 0 && dia <= 31 && mes > 0 && mes <= 12 && ano > 0) {
    //         this.dia = dia;
    //         this.mes = mes;
    //         this.ano = ano;  
    //     } else {
    //         this.dia = 1;
    //         this.mes = 1;
    //         this.ano = 2000;
    //     }
    // }

    //Getters e setters.
            public int getDia() {
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

    //Formatação do método toString.
    @Override
    public String toString () {
        return "Data: " + dia + "/" + mes + "/" + ano;
    }

    //Função que verifica se o ano é bissexto ou não.
    public boolean verificaAnoBissexto () {
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 !=0);
    }
}
