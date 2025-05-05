package estudos;
import java.util.Scanner;
public class mod6 {
    public static void main(String[] args) {
        //operadores ternarios

        //variavel = condição + "?" valor_true + ":" valor_false

        Scanner valor = new Scanner(System.in);
        System.out.println("qual é a sua idade?");
        var idade = valor.nextInt();//var é usado so em tipo de dado
        String status = (idade>=20)? "adulto" : "menor";
        if (status == "adulto"){
            status = "a";
        }
        else{
            status="m";
        }
        //switch case

        switch (status) {
            case "a":
                System.out.println("clt morto ");
                break;
        
            default:
                System.out.println("menor quente");
                break;
        }
    }
}
