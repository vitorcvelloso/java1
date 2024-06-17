public class Operadores5 {
    public static void main(String[] args) throws Exception {
        // Relacionarios
        // == Quando desejamos verificar se uma variável é IGUAL A outra.

        // != Quando desejamos verificar se uma variável é DIFERENTE da outra.

        // > Quando desejamos verificar se uma variável é MAIOR QUE a outra.

        // >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

        // < Quando desejamos verificar se uma variável é MENOR QUE outra.

        // <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        //System.out.println("numeroum é igula numerodois? " + simNao);

        simNao = numero1 != numero2;
        //System.out.println("numeroum é igula numerodois? " + simNao);

        simNao = numero1 > numero2;
        //System.out.println("numeroum é maior que numerodois? " + simNao);

        if(numero1 < numero2){
            //System.out.println("um é menor que dois");
        }

        String nomeUm = "Vito";
        String nomeDois = new String("Vito");

        System.out.println(nomeUm.equals(nomeDois)); //Resumindo, pode usar == pra texto/objeto, mas é pior pq pode dar erro, ent eh melhor esse método de equals (pra ve se é igual)

    }

}
