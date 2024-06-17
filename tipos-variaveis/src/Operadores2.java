public class Operadores2 {
    public static void main(String[] args) throws Exception {
       
        //Que porra é concatenação
        
        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1"; //quando pedir para imprimir, o resultado será 31, ja que ele soma os 3 primeiros 1 como numeros, e, chega no ultimo 1 que está dito como "letra", dai ele não soma
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1; // vai ser 1111, pq o primeiro 1 não soma com o segundo, e a partir do segundo, todos os proximos numero vao ser interpretados como letra igual o segundo 1
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1"; //mesma coisa, vai ser 1111
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1; //aqui tbm 1111 ja q o primeiro 1 define o resto
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1); //aqui vai ser 13, pq estar em () faz aqueles 1 serem lidos como numeros denovo, ai voltam a se somar
        System.out.println(concatenacao);
    }
}
