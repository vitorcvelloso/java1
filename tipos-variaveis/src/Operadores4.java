public class Operadores4 {
    public static void main(String[] args) throws Exception {
        // Ternarios
        int a, b;

        a = 5;
        b = 6;
        String resultado1 = "";

        if (a == b)
            resultado1 = "verdadeiro";
        else
            resultado1 = "falso";
        System.out.println(resultado1);


        // Mesma condicional (sim ou não, true or false, porém usando ? e !)
        String resultado2 = (a == b) ? "verdadeiro" : "false";

        System.out.println(resultado2);
    }
}
