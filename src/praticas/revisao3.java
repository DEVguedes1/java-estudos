import java.util.Scanner;
// loops
public class revisao3{
    public static void main(String[] args) {

        for (int i=1;i<11;i++){
            System.out.println(i);
        }
    }
}
class loops2{
    public static void main(String[] args) {
        int i =0;
        while (i<100) {
            i+=10;
            System.out.println(i);
        }
    }
    
}
/*
Peça para o usuário digitar um número.
Use um do-while que repita esse pedido até o número digitado ser maior que 10.
 */
class loops3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero:");
        int numero = input.nextInt();

        do {
            System.out.println("seu numero foi:"+numero);
            break;
        } while (numero>10);
            System.out.println("parabens! voce digitou "+numero);
    }
}

class loops4{
    public static void main(String[] args) {
        int soma;
        for(int i = 1; i<101;i++){
            soma = i + i;
            System.out.println("a soma de 1 a 100 foi:"+soma);
        }
    }
}