public class Operadores6 {
    public static void main(String[] args) throws Exception {
        //Tal dos Lógicos
        
        boolean um = true;
        boolean dois = false;

        if(um && dois) {// O && ali no meio serve de "E"
        System.out.print("Os dois valores  são verdadeiros");
    }
      
        if(um || dois) {//Serve de "Ou"
        System.out.print("Um deles é verdadeiro");
    }

        if(um && (3 > 2)) {
        System.out.print("Um é vdd igual 3 ser maior que 2");
    }

        }
}
