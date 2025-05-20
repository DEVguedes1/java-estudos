import java.util.Scanner;
// Criar um programa em Java que calcula o valor final de uma compra aplicando descontos progressivos com base no
// valor total, além de considerar um cupom de desconto adicional, se fornecido.
public class deconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        double camisa = 700.00;
        double chort = 1050.00;
        double tenis = 2700.00;
        double boné = 400.00;

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
        System.out.println("digite o id do produto:");
        produto = input.nextInt();

        System.out.println("vai querer outro(s/n)?");
        String opcao = input.next();
        if (opcao == "s"){
            System.out.println("digite o id do produto:");
            int produto2 = input.nextInt();
        }

        switch (produto) {
            case 1:
                if (camisa > 500) {
                    int desconto;
                }
                break;
        
            default:
                break;
        }




    }
}
