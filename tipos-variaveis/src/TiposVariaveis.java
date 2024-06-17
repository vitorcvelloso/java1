public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        short numeroCurto = 1; //short é um numero curto, que ocupa pouca memoria//
        int numeroNormal = numeroCurto; //int é um numero normal para os dias de hoje, é mais comum//
        short numeroCurto2 = (short) numeroNormal; 
        //essas 3 linhas mostram que um comando de short pode caber dentro de int, mas um short n pode querer puxar um numero categorizado como int, pq o numero pode ser maior que o limite do short//

        int numero = 5;
        numero = 10;
        System.out.println(numero);
        final double valorDePi = 3.14;

    }
}
