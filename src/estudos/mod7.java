package estudos;

import java.util.Scanner;

public class mod7 {
    public static void main(String[] args) {
        //manipulação de strings
        /*
1. Inverter String
Desenvolva um método que receba uma string e retorne a mesma string invertida.

Exemplo:
Entrada: "casa"
Saída: "asac"
         */

        String nomePadrao = "casa";
        StringBuilder nomeInvertido = new StringBuilder(nomePadrao);
        System.out.println(nomeInvertido.reverse().toString());

        // Usamos StringBuilder porque ele possui o método reverse() que inverte a sequência de caracteres facilmente. 
        // Por fim, convertemos de volta para String.

    }
}
class ContarVogal{
    /*  2. Contar Vogais
    // Crie um método que conte quantas vogais existem em uma string.
    
    // Exemplo:
    // Entrada: "programacao"
    Saída: 5 
            */
   public static int contarVogais(String str) {
    int contador = 0;
    str = str.toLowerCase();
    for (char c : str.toCharArray()) {
        if ("aeiou".indexOf(c) != -1) {
            contador++;
        }
    }
    return contador;
}
    public static void main(String[] args) {
        String slaoq="alfajor";
        System.out.println(contarVogais(slaoq));

    /*Convertendo a string para minúsculas, facilitamos a comparação. 
    Depois, percorremos cada caractere e verificamos se ele está entre as vogais.*/
    }
        
}

class removerEspaços {
    /*3. Remover Espaços
Escreva um método que remova todos os espaços de uma string.

Exemplo:
Entrada: "Olá Mundo"
Saída: "OláMundo"*/
    public static void main(String[] args) {
        String sladnv="abo brinha ";
        System.out.println(sladnv);
        String sladnvMudado=sladnv.replace(" ","");
        System.out.println(sladnvMudado);
    // O método replace() troca todos os espaços por uma string vazia, eliminando-os.

    }
}

class polidromo{
    /*4. Verificar Palíndromo
Desenvolva um método que verifique se uma string é um palíndromo (lê-se igual de frente para trás e de trás para frente).

Exemplo:
Entrada: "arara"
Saída: true */
    public static boolean ehPalindromo(String str) {
    String invertida = new StringBuilder(str).reverse().toString();
    return str.equalsIgnoreCase(invertida);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite uma palavra:");
        String palavra = input.next();
        System.out.println(ehPalindromo(palavra));
    /*Invertendo a string e comparando com a original (ignorando maiúsculas/minúsculas) verificamos se são iguais, 
    caracterizando um palíndromo. */
    }
}
