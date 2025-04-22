public class mod4 {
    public static void main (String[] args) {
        //loops

        //while
        int number = 1;
        while (number <= 10) {
            System.out.println(number);
            number += 1;//enq a condição for True vai efetuar o loop
        }
        //concatenação
        int algo = 1;
        while (algo <= 3) {
            System.out.println("a mul de " + algo + " é " + (algo * algo));
            algo += 1;
        }
        int grito = 1;
        while (grito < 15) {
            System.out.println("vamos time!");
            grito += 1;
        }
        //for
        //inicialização | condição | incremento
        for(int i =1;i<=3;i++){
            System.out.println("numero: "+ i);
        }
        for(int qVezes=1;qVezes<51;qVezes++){
            System.out.println("eu faço bons programas!");
        }
    }
}
