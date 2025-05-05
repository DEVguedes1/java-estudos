
public class atividade3 {
    public static void main(String[] args){
        int cont = 1;
        while (cont<=52){
            System.out.println("card"+cont);
            cont+=1;
            if (cont==32){
                System.out.println("Uma carta incorreta foi encontrada no item 32");
                break;
            }
        }
    }
}
