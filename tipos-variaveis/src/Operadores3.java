public class Operadores3 {
    public static void main(String[] args) throws Exception {
        // Unários
        // basicamente é tu usar sinais como + e - para inverter valores, tipo se falar
        // pra dar print em -x, quando imprimir esse x o valor vai tar negativo
        int numero = 5;
        numero = -numero;
        // Print = -5
        numero = +numero; // não ficou positivo pq esse + é de soma, pra converter tem que fazer igual na
                          // matematica
        numero = numero * -1;
        // Print = 5

        numero = 5;
        numero++; // numero = numero + 1;
        //System.out.println(numero);

        //System.out.println(numero ++); //esse não vai tar somado pq o ++ ta depois da impressão, ele vai ler da esquerda pra direita
        //System.out.println(numero);
        //System.out.println(++numero);
        //System.out.println(--numero);

        boolean variavel = true;
        System.out.println(variavel); //sequencia normal

        variavel = true;
        System.out.println(!variavel); //sequencia com o print negado
        
        variavel = !true;
        System.out.println(variavel); //seuquencia com o valor da variavel trocado

        variavel = true;
        System.out.println(variavel);
    
    }
}
