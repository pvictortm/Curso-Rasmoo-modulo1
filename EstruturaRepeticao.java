import org.w3c.dom.ls.LSOutput;

public class EstruturaRepeticao {

    public static void main(String[] args) {

        int contador = 0;
        while(contador != 0 ) {

            System.out.println(contador);
            //contador = contador + 1;
            //contador += 1;
            contador ++;
        }

        // do while sempre garante a primeira execução independente se a
        // condição for false ou true

//        do {
//            System.out.println(contador);
//            contador++;
//        } while (contador <= 5);
//

        System.out.println("--------------------------");


        for ( int count = 0; count <=5 ; count++) {

            // primeira sessão sempre executada uma vez, declarar e inicializar a variavel
            // segunda sessao executada sempre para verificar a condiçao
            // terceira sessão executada sempre no final de cada interação

            System.out.println(count);

        }



    }
}
