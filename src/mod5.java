import java.util.ArrayList;
public class mod5 {
    //revisão
    //psvm
    public static void main(String[] args) {
        System.out.println("caceta");

        String babaca= "buceta";
        System.out.println(babaca);

        var caceta = 128;
        System.out.println(caceta);

        if (caceta == 128){
            System.out.println("verdadeiro");
        } else {
            System.out.println("falso");
        }
        if(babaca.isBlank()) {
            System.out.println("n tem");
        } else if (babaca=="buceta") {
            System.out.println("sabe muito");
        } else{
            System.out.println("sabe de nada");
        }

        //vetores
        int[] numeros = {1,2,3,4,5,6};
        System.out.println(numeros[0]);
        System.out.println(numeros.length);

        float[] contagem = new float[10];
        contagem[0]=30;//atribuindo valor 

        //arraylists
        ArrayList<String> nome= new ArrayList<>();
        nome.add("kakuso");
        nome.add(babaca);
        System.out.println(nome.get(0));
        nome.remove(0);
        System.out.println(nome.get(0));

        //Métodos úteis como add(), remove(), size()
        
    }
}
