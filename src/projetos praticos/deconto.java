import java.util.Scanner;
// Criar um programa em Java que calcula o valor final de uma compra aplicando descontos progressivos com base no
// valor total, além de considerar um cupom de desconto adicional, se fornecido.
public class deconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        double camisa = 700.00;
        double chort = 1050.00;
        double tenis = 2700.00;
        double bone = 400.00;

        int produto;
        float preco;
    
        System.out.println("""
============ PRODUTOS DA LOJA ===========             
1.camisa off-white   | R$ 700,00
2.short gucci        | R$ 1050,00  
3.Air force 1 travis | R$ 2700,00
4.boné LV            | R$ 400,00
=========================================
""");
        System.out.print("digite o id do produto:");
        produto = input.nextInt();

        switch (produto) {
            case 1:
                if (camisa > 500 || camisa < 1000) {
                    double desconto = camisa * 10/100;
                    double valorModificado = camisa - desconto;
                    // Valor do desconto = Preço original * (porcentagem de desconto / 100).
                    System.out.println("a camisa teve o desconto de:"+desconto);
                    System.out.println("o valor ficou:"+valorModificado);
                }else if(camisa>1000 || camisa < 2000) {
                    double desconto = camisa * 15/100;
                    double valorModificado = camisa - desconto;
                    // Valor do desconto = Preço original * (porcentagem de desconto / 100).
                    System.out.println("a camisa teve o desconto de:"+desconto);
                    System.out.println("o valor ficou:"+valorModificado);
                }else if (camisa>2000) {
                    double desconto = camisa * 20/100;
                    double valorModificado = camisa - desconto;
                    // Valor do desconto = Preço original * (porcentagem de desconto / 100).
                    System.out.println("a camisa teve o desconto de:"+desconto);
                    System.out.println("o valor ficou:"+valorModificado);
                }else{
                    System.out.println("o valor ficou:"+camisa);
                }
                break;
            case 2:
                if (chort > 500 || camisa < 1000) {
                    double desconto = chort * 10/100;
                    double valorModificado = chort - desconto;
                    // Valor do desconto = Preço original * (porcentagem de desconto / 100).
                    System.out.println("o short teve o desconto de:"+desconto);
                    System.out.println("o valor ficou:"+valorModificado);
                }else if (chort > 1000 || camisa < 2000) {
                    double desconto = chort * 15/100;
                    double valorModificado = chort - desconto;
                    // Valor do desconto = Preço original * (porcentagem de desconto / 100).
                    System.out.println("o short teve o desconto de:"+desconto);
                    System.out.println("o valor ficou:"+valorModificado);
                }else if (chort > 2000) {
                    double desconto = chort * 20/100;
                    double valorModificado = chort - desconto;
                    // Valor do desconto = Preço original * (porcentagem de desconto / 100).
                    System.out.println("o short teve o desconto de:"+desconto);
                    System.out.println("o valor ficou:"+valorModificado);
                }else{
                    System.out.println("o valor ficou:"+chort);
                }
                break;
            case 3:
                if (tenis> 500 || camisa < 1000) {
                    double desconto = tenis * 10/100;
                    double valorModificado = tenis - desconto;
                    // Valor do desconto = Preço original * (porcentagem de desconto / 100).
                    System.out.println("o tenis teve o desconto de:"+desconto);
                    System.out.println("o valor ficou:"+valorModificado);
                }else if (tenis> 1000 || camisa < 2000) {
                    double desconto = tenis * 15/100;
                    double valorModificado = tenis - desconto;
                    // Valor do desconto = Preço original * (porcentagem de desconto / 100).
                    System.out.println("o tenis teve o desconto de:"+desconto);
                    System.out.println("o valor ficou:"+valorModificado);
                }else if (tenis> 2000) {
                    double desconto = tenis * 20/100;
                    double valorModificado = tenis - desconto;
                    // Valor do desconto = Preço original * (porcentagem de desconto / 100).
                    System.out.println("o tenis teve o desconto de:"+desconto);
                    System.out.println("o valor ficou:"+valorModificado);
                }else{
                    System.out.println("o valor ficou:"+tenis);
                }
                break;
            case 4:
                if (bone > 500 || camisa < 1000) {
                    double desconto = bone * 10/100;
                    double valorModificado = bone - desconto;
                    // Valor do desconto = Preço original * (porcentagem de desconto / 100).
                    System.out.println("o bone teve o desconto de:"+desconto);
                    System.out.println("o valor ficou:"+valorModificado);
                }else if (bone > 1000 || camisa < 2000) {
                    double desconto = bone * 15/100;
                    double valorModificado = bone - desconto;
                    // Valor do desconto = Preço original * (porcentagem de desconto / 100).
                    System.out.println("o bone teve o desconto de:"+desconto);
                    System.out.println("o valor ficou:"+valorModificado);
                }else if (bone > 2000) {
                    double desconto = bone * 20/100;
                    double valorModificado = bone - desconto;
                    // Valor do desconto = Preço original * (porcentagem de desconto / 100).
                    System.out.println("o bone teve o desconto de:"+desconto);
                    System.out.println("o valor ficou:"+valorModificado);
                }else{
                    System.out.println("o valor ficou:"+bone);
                }
                break;
            default:
                break;
        }




    }
}
