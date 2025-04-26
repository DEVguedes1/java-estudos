import java.util.Scanner;

public class mod2 {
    public static void main(String[] args){
        //variaveis
        String nome="nicolas";
        System.out.println(nome);

        //valores de numeros inteiros:
        int idade= 13;
        System.out.println(idade);
        byte number= 45;
        System.out.println(number);
        short numero=783;
        System.out.println(numero);
        long valor=39;
        System.out.println(valor);

        //numeros decimais
        float peso=35;//nao se atribui o valor decimal
        System.out.println(peso);
        double km=57.7;//tanto faz se atribuir o valor decimal
        System.out.println(km);

        //booleano
        boolean chifre=true;
        System.out.println(chifre);

        //caracter ou letra
        char alfabet='t';//uma letra e aspas simples
        System.out.println(alfabet);
        System.out.println("-------------------------------------------------------------------------------------");
        //criar uma carteira de identidade
        String name="Eduardo";
        String state="PE";
        char gender='m';
        int age=45;
        boolean organDonor=false;
        System.out.println(name);
        System.out.println(state);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(organDonor);
        System.out.println("-------------------------------------------------------------------------------------");

        /*
        operadores
        + adição
        - subtração
        * multiplicação
        / divisão
        % retorna resto de divisão ou modulo
         */

        double resultado = 0;

        /*
        resultado = 6+2;
        resultado = 6-2;
        resultado = 6*2;
        resultado = 6/2;
        resultado = 6%2;
        */

        System.out.println(resultado);
        System.out.println("-------------------------------------------------------------------------------------");

        // entrada de usuario
        //usa o scanner la em cima
        Scanner entreada = new Scanner(System.in); //objeto
        System.out.print("coloque seu nome:");
        String nome2= entreada.nextLine();// metodo pra ler strings
        /*
        scanner.nextDouble()
        scanner.nextBoolean()
        scanner.nextInt()
         */
        System.out.println(nome2);

        System.out.print("Falo sem boca e ouço sem ouvidos. Não tenho corpo, mas vivo com o vento. O que sou eu?");
        String pista= entreada.nextLine();
        System.out.println(pista);
        System.out.println("------------------------------------------------------------------------------------");

        Scanner nome1 = new Scanner(System.in);

        System.out.println("qual é o seu nome?");
        String nomes = nome1.nextLine();
        System.out.println("qual seu endereço?");
        String end = nome1.nextLine();
        System.out.println("qual é o seu salario?");
        double salario = nome1.nextDouble();
        
        System.out.println("dia do pagamento:");
        var dia = nome1.nextInt();
        System.out.println("mes do pagamento:");
        var mes = nome1.nextInt();
        System.out.println("digite o ano do pagamento: ");
        var ano = nome1.nextInt();

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("meu nome é "+nomes+",moro no endereço "+end+",recebi o salario de R$"+salario+" no dia "+dia+"/"+mes+"/"+ano);
    }
}
