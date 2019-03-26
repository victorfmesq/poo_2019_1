public class Voo {

    private int cadeiras[] = new int[100];
    private int numero;
    private Data data;
    // contruct

    public Voo(){

    }

    public Voo(int numero, Data data){
        this.numero = numero;
        this.data = data;
    }

    // getters & setters

    public int getVoo(){
        return this.numero;
    }

    // metodos

    public int proximoLivre(int cadeira){
        if(!ocuparCadeira(cadeira)){
            for(int i = cadeira; i < cadeiras.length; i++){
                if(verifica(i + 1))
                    return i + 1;
            }
        }
        return cadeira;
    }

    public boolean verifica(int n){
        if(this.cadeiras[n] == 1)
            return false;
        return true;
    }

    public boolean ocuparCadeira(int assento){
        if(verifica(assento) == true){
            this.cadeiras[assento] = 1;
            System.out.println("Ocupando cadeira");
            return true;
        }
        System.out.println("Cadeira ocupada");
        return false;
    }

    public int vagas(){
        int cont = 0;
        for(int i = 0; i < cadeiras.length; i++){
            if(this.cadeiras[i] == 0)
                cont++;
        }
        return cont;
    }
}