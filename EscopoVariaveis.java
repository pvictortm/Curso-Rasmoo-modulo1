public class EscopoVariaveis {

    public static void main(String[] args) {

    //não podem existir duas variaveis com o mesmo nome no mesmo escopo
    // uma variavel so existe num escopo, um bloco de código

    if(true){
        double salario;
    } else {
        int salario;
    }

        System.out.println("Testando execução");

    }
}
