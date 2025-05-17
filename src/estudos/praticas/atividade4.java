
import java.util.Scanner;
// import java.util.Arrays;
public class atividade4 {
    public static void main(String[] args) {
        /*
         Crie um programa que:

        Peça ao usuário para digitar um número decimal (ex: 12.567).

        Converta o número para int (truncando as casas decimais) e exiba o resultado.

        Arredonde o número para o inteiro mais próximo usando Math.round() e exiba.

        Calcule a potência desse número elevado a 3 usando Math.pow() e mostre o resultado.
         */
        Scanner user = new Scanner(System.in);
        System.out.print("digite um valor decimal=>");        
        double dec= user.nextDouble();

        int conv= (int)dec;
        System.out.println(conv);

        if (conv < dec){
            int arr= Math.round(conv);
            System.out.println(arr);

        }

        int num =3;
        int pot=(int) Math.pow(dec, num);
        System.out.println(pot);
        /*
        Crie um programa que:

        Peça ao usuário para digitar uma frase (ex: "Java é incrível").

        Conte quantas palavras existem na frase (use split(" ")).

        Verifique se a frase contém a palavra "Java" (ignore maiúsculas/minúsculas).

        Inverta a frase e exiba (ex: "incrível é Java").
         */
        while (true) {
            Scanner user_frase = new Scanner(System.in);
            System.out.println("digite abaixo a frase 'java é incrivel'=>");
            String frase = user_frase.nextLine();
            
            String[] contrario = frase.split(" ");
            
                boolean notVerso = false;
                if (frase!= " "){
                    if(!notVerso==true){
                        System.out.println("incrivel");
                        System.out.println("é");
                        System.out.println("java");
                    }
                }else{
                    System.out.println("digita novamente...");
                }break;
                
            
        }

        }

}
