// Desafio:

// Crie uma variável diaDaSemana (int) representando um dia (1 a 7).

// Use switch-case para exibir o nome do dia (ex: 1 → "Domingo", 2 → "Segunda", etc.).

import java.util.Scanner;
public class revisão2 {
    public static void main(String[] args) {
    
        int diaDaSemana;
        Scanner input = new Scanner(System.in);

        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda");
        System.out.println("3 - Terça");
        System.out.println("4 - Quarta");
        System.out.println("5 - Quinta");
        System.out.println("6 - Sexta");
        System.out.println("7 - Sabado");
        System.out.print("que dia você quer?");
        diaDaSemana = input.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println(" hoje é Domingo!!");
                break;
            case 2:
                System.out.println(" hoje é Segunda!!");
                break;
            case 3:
                System.out.println(" hoje é Terça!!");
                break;
            case 4:
                System.out.println(" hoje é Quarta!!");
                break;
            case 5:
                System.out.println(" hoje é Quinta!!");
                break;
            case 6:
                System.out.println(" hoje é Sexta!!");
                break;
            case 7:
                System.out.println(" hoje é Sabado!!");
                break;
            default:
                break;
        }
        input.close();
    }
    
}
/*Desafio 1: Classificação de Triângulos
Implemente um programa que recebe três lados de um triângulo e determina se é equilátero, isósceles ou escaleno, 
considerando também a verificação se os lados formam um triângulo válido.
 */
class condicionais6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
considerando que você tem um triangulo
iremos determinar se ele é:
-equilátero
-isósceles
-escaleno""");
        System.out.print("digite o primeiro lado:");
        float ladoUm = input.nextFloat();
        System.out.print("digite o segundo lado:");
        float ladoDois = input.nextFloat();
        System.out.print("digite o terceiro lado:");
        float ladoTres = input.nextFloat();

        input.close();

// Equilátero: Um triângulo equilátero tem três lados com medidas iguais. 
// Isósceles: Um triângulo isósceles tem dois lados com medidas iguais. 
// Escaleno: Um triângulo escaleno tem três lados com medidas diferentes.

        boolean equilatero = ladoDois == ladoTres && ladoUm == ladoDois && ladoUm == ladoTres ;
        boolean isosceles = ladoDois == ladoTres || ladoUm == ladoDois || ladoUm == ladoTres ;

        if (equilatero){
            System.out.println("seu triangulo é equilátero!!");
        }else if(isosceles){
            System.out.println("seu triangulo é isósceles!!");
        }else{
            System.out.println("seu triangulo é escaleno!!");
        }

    }

}

