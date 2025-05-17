
import java.util.Scanner;

public class atividade {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        /*
        1 moeda no Club Penguin equivale a US$ 0,0045.
        Crie um programa que sirva como uma calculadora de conversão
        onde um pinguim pode inserir o número de moedas que ele tem
        retornará quanto dinheiro ele tem em dólares americanos!
         */
        double moeda = 0.0045;
        System.out.print("quantas moedas voçe tem?");
        float userMoeda = scanner.nextFloat();
        double calc= userMoeda*moeda;
        System.out.println("vc tem em dolar=>");
        System.out.print(calc);
        System.out.print(" moedas");
    }
}
