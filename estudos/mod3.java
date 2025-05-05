package estudos;
import java.util.Scanner;

public class mod3 {
    public static void main(String[] args){
        //fluxo de controle
        int aveia = 2;
        if (aveia > 0) {
            System.out.println("vamos fazer a aveia!");
            //so sera executado se a condição for verdade
        }
        int pimenta=1;
        boolean tempeiros=pimenta>3;

        if (tempeiros){
            System.out.println("perfeito! vamos temperar.");
        } else {
            System.out.println("vamos ter q comprar");
            //else so é executado quando a condição for falsa
        }
        //primeiro exercicio
        System.out.println("======================================================================================");
        Scanner scanner=new Scanner(System.in);
        System.out.print("quantos gatos voce tem?");
        int gato=scanner.nextInt();
        System.out.print("quantos cachorros voce tem?");
        int cao= scanner.nextInt();
        boolean temCao=cao>=1;
        boolean temGato= gato>=1;
        boolean animais= (cao>=1 && gato>=1);
        if (temGato && cao==0){
            System.out.println("20% de desconto em itens selecionados para gatos com o código MEOW2025");
        } else if (temCao && gato==0) {
            System.out.println("20% de desconto em itens selecionados para cães com o código WOOF2025");
        } else if(animais){
            System.out.print("20% de desconto em itens para gatos ou cães com o código WOOF2025 e MEOW2025");

        }
        else{
            System.out.println("Bem-vindo à loja Pets Pets Pets!");
        }
        // && significa "e" ela exibe quando todas as condições forem verdadeiras ou forem todas falsas
        // || significa "ou" exibe quando uma das condições for verdadeira se ambas forem falsas não exibe
        System.out.println("======================================================================================");

        System.out.println("bem vindo ao parque!");
        Scanner cond=new Scanner(System.in);
        System.out.print("qual é o seu peso?");
        int peso= scanner.nextInt();
        System.out.print("qual é sua altura(em cm)?");
        int alt= scanner.nextInt();

        if (peso>=40 && alt>=120){
            System.out.println("Parabéns! Você pode ir na montanha-russa!");
        } else if (peso>=40 || alt>=120) {
            System.out.println("Desculpe, você não pode ir hoje.");
        }
    }
}
