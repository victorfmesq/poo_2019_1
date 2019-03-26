public class Data { 

    private static final String DEZEMBRO = "Dezembro";
    private static final String NOVEMBRO = "Novembro";
    private static final String OUTUBRO = "Outubro";
    private static final String SETEMBRO = "Setembro";
    private static final String AGOSTO = "Agosto";
    private static final String JULHO = "Julho";
    private static final String JUNHO = "Junho";
    private static final String MAIO = "Maio";
    private static final String ABRIL = "Abril";
    private static final String MARCO = "Março";
    private static final String FREVEREIRO = "Frevereiro";
    private static final String JANEIRO = "Janeiro";
    int dia;
    int mes;
    int ano;

    // contruct

    public Data(){
        
    }

    public Data(int dia, int mes, int ano) {
        if ((dia < 1 && dia > 31) || (mes < 1 && mes > 12) || (ano < 1)) {
            System.out.println("Data inválida");
            this.dia = 01;
            this.mes = 01;
            this.ano = 0001;
        }
        else if ((dia > 28) && (mes == 2) && ((ano % 400 != 0) || ((ano % 4 != 0) && (ano % 100 == 0)))){
            System.out.println("Data inválida");
            this.dia = 01;
            this.mes = 01;
            this.ano = 0001;
        }
        else if(mes == 2 && dia > 28){
            System.out.println("Data inválida");
            this.dia = 01;
            this.mes = 01;
            this.ano = 0001;
        }else{
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        }
    }
    
    // metodos

    public int compara(Data data2) {
        if ((this.ano == data2.getAno()) && (this.mes == data2.getMes()) && (this.dia == data2.getDia()))
            return 0;
        else if ((this.ano > data2.getAno()) || (((this.ano == data2.getAno()) && (this.mes > data2.getMes()))
                || ((this.ano == data2.getAno()) && (this.mes == data2.getMes()) && (this.dia > data2.getDia()))))
            return 1;
        else
            return -1;
    }
    
    public Data clone(Data data){
        Data dataClone = new Data();
        dataClone.dia = data.getDia();
        dataClone.mes = data.getMes();
        dataClone.ano = data.getAno();
        return dataClone;
    }

    public boolean isBissexto(){
        if((this.ano % 400 == 0) || (this.ano % 4 == 0) && (this.ano % 100 != 0))
            return true;
        return false;
    }

    public String toString(){
        if((this.dia < 10) && (this.mes < 10) && (this.ano < 10))
            return "Data: 0" + this.dia + "/0" + this.mes + "/000" + this.ano;
        else if((this.dia < 10) && (this.mes < 10) && (this.ano < 100))
            return "Data: 0" + this.dia + "/0" + this.mes + "/00" + this.ano;
        else if((this.dia < 10) && (this.mes < 10) && (this.ano < 1000))
            return "Data: 0" + this.dia + "/0" + this.mes + "/0" + this.ano;
        else{
            return "Data: " + this.dia + "/" + this.mes + "/" + this.ano;
        }
    }

    // getters and setters

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno(){
        return this.ano;
    }

    public String getExtenso() {
        if (this.mes == 1)
            return JANEIRO;
        else if (this.mes == 2)
            return FREVEREIRO;
        else if (this.mes == 3)
            return MARCO;
        else if (this.mes == 4)
            return ABRIL;
        else if (this.mes == 5)
            return MAIO;
        else if (this.mes == 6)
            return JUNHO;
        else if (this.mes == 7)
            return JULHO;
        else if (this.mes == 8)
            return AGOSTO;
        else if (this.mes == 9)
            return SETEMBRO;
        else if (this.mes == 10)
            return OUTUBRO;
        else if (this.mes == 11)
            return NOVEMBRO;
        else if (this.mes == 12)
            return DEZEMBRO;
        else
            return ("Mes inexistente");
    }
}