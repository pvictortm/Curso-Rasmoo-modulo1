public class VariaveisBooleanas {

    public static void main(String[] args) {

        boolean usuarioAtivo = true;
        int idadePedro = 28;

        // Operadores de igualdade
        // == diz se é igual a alguma coisa
        // != verifica se é diferente
        //  idadePedro == 25 false
        // idadePedro != 25 true


        //Operadores relacionais
        //  > maior
        // >= maior ou igual
        // < menor
        // <= menor ou igual
        // idadePedro > 25 true
        //idadePedro >= 28 true
        // idadedPedro <= 30 true
        // idadePedro <= 25 false



        // Operadores lógicos
        // && e  - True && true = true // True && e false = false - se as duas forem verdadeiras = true / se uma for falsa sempre false
        // || ou - false || true = true
        // idadePedro == 25 || idadePedro == 28


        System.out.println(usuarioAtivo);
        System.out.println(idadePedro > 20);
        System.out.println(idadePedro == 30);

        System.out.println(usuarioAtivo == true && idadePedro < 30);
        System.out.println(usuarioAtivo == false && idadePedro == 28);

        System.out.println(usuarioAtivo == false || idadePedro == 28);


        boolean usuarioAtivoMenorQue30 = usuarioAtivo == true && idadePedro < 30;
        System.out.println("Usuário está ativo e tem menos que 30 anos? " + usuarioAtivoMenorQue30);


    }
}
