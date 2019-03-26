public class Cpf {
    private String nome;
    private String cpf;

    //contruct

    public Cpf(){
        
    }

    public Cpf(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //getters & Setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //função para validar o cpf
    public void valida_Cpf(String cpf){
        if (cpf.equals("00000000000") || 
            cpf.equals("11111111111") || 
            cpf.equals("22222222222") || 
            cpf.equals("33333333333") || 
            cpf.equals("44444444444") || 
            cpf.equals("55555555555") || 
            cpf.equals("66666666666") || 
            cpf.equals("77777777777") || 
            cpf.equals("88888888888") || 
            cpf.equals("99999999999"))
            System.out.println("CPF invalido!");

        if ((cpf.length() != 11))
            System.out.println("CPF invalido!");
        
        char dig_10;
        char dig_11;
        int soma;
        int resultado;
        int num;
        int peso;
        try {
            // Digito 10
            soma = 0;
            peso = 10;
            for (int i = 0; i < 9; i++){                              
                num = (int)(cpf.charAt(i) - 48); 
                soma = soma + (num * peso);
                peso = peso - 1;
            }
            resultado = 11 - (soma % 11);

            if ((resultado == 10) || (resultado == 11)){
                dig_10 = '0'; 
            }else{
                dig_10 = (char)(resultado + 48);
            } 
            // Digito 11
            soma = 0;
            peso = 11;
            for(int i = 0; i < 10; i++) {
                num = (int)(cpf.charAt(i) - 48);
                soma = soma + (num * peso);
                peso = peso - 1;
            }
            resultado = 11 - (soma % 11);

            if ((resultado == 10) || (resultado == 11)){
                dig_11 = '0'; 
            }else{ 
                dig_11 = (char)(resultado + 48);
            }

            // testar ambos juntos
            
            if ((dig_10 == cpf.charAt(9)) && (dig_11 == cpf.charAt(10))){
                System.out.println("CPF valido!");
                this.setCpf(cpf);
            }else{
                System.out.println("CPF invalido!");
                this.setCpf("");
            }
            
        }
        catch (NumberFormatException erro){
            System.out.println("CPF invalido!");
            this.setCpf("");
        }
    }
}
