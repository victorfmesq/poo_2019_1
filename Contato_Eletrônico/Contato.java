import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Contato {
    public static Scanner ler = new Scanner(System.in);

    static private int contNumeros;
    private String nome;
    private ArrayList<String> telefones;
    

    // contruct

    public Contato(){
        this.telefones = new ArrayList<String>();
    }

    public Contato(String nome){
        this();
        this.nome = nome;
    }

    //getters

    public String getName(){
        return this.nome;
    }

    public ArrayList<String> getTelefone() {
        return this.telefones;
    }
    

    // Metodos

    public boolean validarNumero(String numero){ // Função para verificar a condição inicial do numero que é (xx)xxxxxxxxxx
		int aux = 0;
        if (numero.charAt(0) != '(' ||
            numero.charAt(1) != '0' && numero.charAt(1) != '1' && numero.charAt(1) != '2' &&
			numero.charAt(1) != '3' && numero.charAt(1) != '4' && numero.charAt(1) != '5' &&
			numero.charAt(1) != '6' && numero.charAt(1) != '7' && numero.charAt(1) != '8' &&
            numero.charAt(1) != '9' || 
            numero.charAt(2) != '0' && numero.charAt(2) != '1' && numero.charAt(2) != '2' &&
			numero.charAt(2) != '3' && numero.charAt(2) != '4' && numero.charAt(2) != '5' &&
			numero.charAt(2) != '6' && numero.charAt(2) != '7' && numero.charAt(2) != '8' &&
            numero.charAt(2) != '9' ||
            numero.charAt(3) != ')' ){
			aux++;
		}
		for(int i = 4; i < numero.length(); i++){
			if (numero.charAt(i) != '0' && numero.charAt(i) != '1' && numero.charAt(i) != '2' &&
				numero.charAt(i) != '3' && numero.charAt(i) != '4' && numero.charAt(i) != '5' &&
				numero.charAt(i) != '6' && numero.charAt(i) != '7' && numero.charAt(i) != '8' &&
				numero.charAt(i) != '9' ){
				aux++;
			}
		}
        if (aux > 0){
            System.out.println("Error: codigo invalido");
            return false;
        }
        System.out.println("Numero valido");        
        return true;    
	}

    // * Apaga todos os numeros do contato e o atualiza com novo numeros
    // * Ele escreve a mesma qtd de numeros que o contato tinha antes de ser apagado
    public void atualizarLote(String label, String numero){
        this.telefones.clear();
        int cont = this.contNumeros;
        this.contNumeros = 0;
        this.inserirTelefones(label, numero);
        System.out.println("Vamos continuar inserindo os numeros que falta! :D");
        for(int i = 0; i < cont - 1; i++){
            this.inserirTelefones(ler.nextLine(), ler.nextLine());
        }
    }

    // * INSERE OS TELEFONES adicionadno-os numa lista*/
    public void inserirTelefones(String label, String numero){
        if (numero.length() > 13 || numero.length() < 12){
            System.out.println("ERRO: tamanho invalido.\nO numero deve ter o segundo formato:\n (XX)xxxxxxxx[8 digitos apos o DDD] ou (YY)Yyyyyyyyy[9 digitos apos o DDD]");
            return;
        }
        if (this.validarNumero(numero)){
            this.telefones.add("\n\t(" + label + ")" + " -> " + numero);
            this.contNumeros++;
            System.out.println("Numero registrado com sucesso!");
            return;
        }else{
            System.out.println("Por favor verifique se o numero está correto e o insira novamente junto com a LABEL");
            this.inserirTelefones(ler.nextLine(), ler.nextLine());
        }
    }

    // * REMOVE OS TELEFONES * //
    public void removeTelefones(int n){
        for (int i = 0; i < this.telefones.size(); i++){
            if(i == n){
                this.telefones.remove(i);
                this.contNumeros--;
            }
        }
    }

    public String toString(){
        return "\nNome: " + this.nome + "\nTelefones: " + this.telefones;
    }


}
