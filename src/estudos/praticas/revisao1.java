/*1. Criar Variáveis (Variáveis e Tipos Primitivos)
Desafio: Crie variáveis para armazenar as seguintes informações:

Seu nome (String)

Sua idade (int)

Sua altura em metros (double)

Se você é estudante de Java (boolean) */
import java.util.Scanner;
public class revisao1{
    public static void main(String[] args){

        String name_user = " ";
        int idade =  0;
        double alt = 0.0;
        boolean IsEstudant=true;

    }
        
}

/*2. Operações Matemáticas (Operadores Aritméticos)
Desafio: Calcule e exiba:

A soma, subtração, multiplicação e divisão entre dois números inteiros.

O resto da divisão de 15 por 4. */
class operacoes{
    public static void main(String[] args){
        int n1 = 23;
        int n2 = 9;
        
        int soma = n1 + n2;
        System.out.println(soma); 
        int subtração = n1 - n2;
        System.out.println(subtração);
        int multiplicacao = n1 * n2 ; 
        System.out.println(multiplicacao);
        int divisao = n1/n2;
        System.out.println(divisao); 
        int r_divisao = n1 % n2;
        System.out.println(r_divisao); 
    }

}
/*3. Condicionais (if-else)
Desafio:

Peça a idade do usuário (suponha que já está armazenada em uma variável).

Se a idade for maior ou igual a 18, exiba "Maior de idade".

Caso contrário, exiba "Menor de idade". */
class condicionais{
    public static void main(String[] args){
        Scanner valor = new Scanner(System.in);
        System.out.print("qual é a sua idade?");
        int idade = valor.nextInt();

        if (idade > 18) {
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    
        
    }

}
/*
 Crie um programa que verifica se uma pessoa pode entrar em um brinquedo de parque de diversões.

Condições:

Idade mínima: 12 anos.

Altura mínima: 1.40m.

Não pode estar grávida (suponha uma variável boolean).

Exiba "Acesso permitido" ou "Acesso negado" com base nas condições.
 */


class condicionais2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("digite a sua idade:");
        int idade = input.nextInt();

        
        System.out.print("digite a sua altura:");
        double altura = input.nextDouble();

        input.nextLine(); // Limpar buffer do teclado antes de ler uma string

    
        System.out.print("você é homem ou mulher(h ou m)?");
        String genero = input.next();
        

        if (idade>12 && altura>1.4) {

            if (genero.equals("h")) {
                System.out.println("Acesso permitido");
            }else {
                Scanner grav = new Scanner(System.in);
                System.out.print("você esta gravida(s ou n)?");
                String bebe = grav.next();

                if (bebe.equals("n")) {
                    System.out.println("Acesso permitido");
                }else {
                    System.out.println("Acesso negado");
                }
            }
        }else {
            System.out.println("Acesso negado");
        }
        input.close(); //Libera recursos e evita vazamentos
    }
}

