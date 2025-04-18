import java.util.Scanner;
public class atividade2 {
    public static void main(String[] args){
        /*
        criar um sistema de automação de tickets
        para que você possa obter a lista de ingredientes de cada bebida,
        dependendo do pedido.
         */
        boolean eLatte, eGelado, eMatcha;
        int portaCopos, baunilha;

        Scanner pedido=new Scanner(System.in);
        System.out.println("1- latte");
        System.out.println("2- latte gelado");
        System.out.println("3- latte matcha");
        System.out.print("bebida:");
        int bebida= pedido.nextInt();
        System.out.print("quantas:");
        portaCopos= pedido.nextInt();
        System.out.print("gotas de baunilha:");
        baunilha=pedido.nextInt();

        eLatte = bebida==1;
        eGelado = bebida==2;
        eMatcha = bebida==3;

        if (eLatte){
            System.out.println("expresso, leite vaporizado");
            if (portaCopos>1 && baunilha<1) {
                System.out.println("fornecer porta-copos.");
            }else if (portaCopos<1 && baunilha>1){
                int valor= baunilha*1;
                System.out.printf("baunilha adicional de ",valor,"dolar.");
            }else{
                int valor= baunilha*1;
                System.out.printf("fornecer porta-copos, baunilha adicional de ",valor,"dolar");
            }
        }else if(eGelado){
            System.out.println("expresso, leite, gelo, xarope");
            if (portaCopos>1 && baunilha<1) {
                System.out.println("fornecer porta-copos.");
            }else if (portaCopos<1 && baunilha>1){
                int valor= baunilha*1;
                System.out.printf("baunilha adicional de ",valor,"dolar.");
            }else{
                int valor= baunilha*1;
                System.out.printf("fornecer porta-copos, baunilha adicional de ",valor,"dolar");
            }
        } else if (eMatcha) {
            System.out.println("matcha, leite de aveia, gelo, baunilha");
            if (portaCopos>1 && baunilha<1) {
                System.out.println("fornecer porta-copos.");
            }else if (portaCopos<1 && baunilha>1){
                int valor= baunilha*1;
                System.out.printf("baunilha adicional de ",valor,"dolar.");
            }else{
                int valor= baunilha*1;
                System.out.printf("fornecer porta-copos, baunilha adicional de ",valor,"dolar");
            }
        }else {
            System.out.println("Selecione uma bebida para começar!");
        }

        System.out.println("pedido finalizado");

    }
}