/*1. Criar Variáveis (Variáveis e Tipos Primitivos)
Desafio: Crie variáveis para armazenar as seguintes informações:

Seu nome (String)

Sua idade (int)

Sua altura em metros (double)

Se você é estudante de Java (boolean) */
import java.util.Scanner;
public class revisao1{
    public static void main(String[] args){

        String name_user = "fulano";
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
        double r_divisao = n1 % n2;
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
        Scanner input = new Scanner(System.in);

        System.out.print("qual é a sua idade?");
        int idade = input.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }    
        input.close();
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
                System.out.print("você esta gravida(s ou n)?");
                String bebe = input.next();

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

/*Desafio:

Dada uma nota (0 a 10), classifique o desempenho do aluno:

9 a 10: "Excelente"

7 a 8.9: "Bom"

5 a 6.9: "Regular"

Abaixo de 5: "Insuficiente"

Exiba a classificação correspondente. */

class condicionais3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("de 0 ate 10");
        System.out.print("digite a nota do aluno:");
        Double nota = input.nextDouble();

        if (nota<11 && nota>=9) {
            System.out.println("Excelente");
        } else if (nota>=7 && nota<8.9) {
            System.out.println("Bom");
        }else if (nota>=5 && nota<6.9) {
            System.out.println("Regular");
        }else if (nota<5){
            System.out.println("Insuficiente");
        }else{
            System.out.println("inválido");
        }
        input.close();
    }
}
/*Peça ao usuário para digitar uma senha (suponha que já está armazenada em uma variável String).

Verifique se:

A senha tem pelo menos 8 caracteres.

Contém pelo menos um número (dica: use Character.isDigit()).

Contém pelo menos uma letra maiúscula.

Exiba "Senha válida" ou "Senha inválida" com base nas regras.
 */
class condicionais4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite sua senha:");
        String senha = input.nextLine();

       // boolean validaçao = senha.matches("[a-zA-Z0-9]{8}") ;

    // REGEX Regex é uma forma curta e poderosa de dizer o que você quer encontrar/validar e mudar dentro de um texto.
       // System.out.println(validaçao?"senha correta":"senha incorreta");

        boolean tamanho= senha.length()>=8;
        boolean TemNumero=true;
        boolean TemLetraGrande=true;

        for(int n=0; n<senha.length();n++){
/*int n = 0: começa com n igual a 0, que é o índice do primeiro caractere da string.

n < senha.length(): o laço continua enquanto n for menor que o tamanho da string. Ou seja, ele percorre do início ao fim da senha.

n++: incrementa n em 1 a cada volta (vai para o próximo caractere). */
            char a = senha.charAt(n);
/*A função charAt(n) retorna o caractere na posição n da string.

Esse caractere é armazenado na variável a para ser analisado depois (por exemplo, se é um número ou uma letra maiúscula). */
            if (Character.isDigit(a)) {
                TemNumero=true;
                //  verifica se tem pelo menos um número.
            }
            if (Character.isUpperCase(a)) {
                TemLetraGrande=true;
                //  verifica se tem pelo menos um número.
            }
        }
        if (tamanho&&TemLetraGrande&&TemNumero){
            System.out.println("senha válida");
        }else{
            System.out.println("senha inválida");
        }
        input.close();
    }
}
// Crie um programa que simule uma calculadora com as operações: +, -, *, /.

// O usuário deve fornecer:

// Dois números (double).

// Um operador (char).

// Use switch-case para realizar a operação e exibir o resultado.

// Trate o caso de divisão por zero.

// O que será usado:

// switch-case com char, default para operador inválido e if para divisão por zero.
class condicionais5 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("digite um valor aq:");
    double valor1 = input.nextDouble();

    input.nextLine();

    System.out.print("digite o sinal da operação:");
    String sinal = input.next();
    
    input.nextLine();

    System.out.print("digite um valor aq:");
    double valor2 = input.nextDouble();

    switch (sinal) {
        case "+":
            double soma = valor1 +valor2;
            System.out.println(soma);
            break;
        case "-":
            double sub = valor1 - valor2;
            System.out.println(sub);
            break;
        case "x":
            double mult = valor1 * valor2;
            System.out.println(mult);
            break;
        case "*":
            double multp = valor1 * valor2;
            System.out.println(multp);
            break;
        case "/":
            if (valor2 == 0){
                System.out.println("não se divide por zero!!");
            }else{
                double div= valor1/valor2;
                System.out.println(div);
            }
            break;
        default:
            System.out.println("Operador inválido");
            break;
    }
    input.close();
    }
}