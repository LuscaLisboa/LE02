import java.util.Scanner;

public class Exercicio11 {
    public void execute(){

        Scanner read = new Scanner(System.in);

        int qnt = 5;
        int[] vectA = new int[qnt];
        int[] vectB = new int[qnt];
        int sum = 0;
        

        for(int i = 0; i < qnt; i++) {
            System.out.println("Informe o VetorA[" + (i) + "]: ");
            vectA[i] = read.nextInt();
        }
        for(int i = 0; i < qnt; i++) {
            System.out.println("Informe o VetorB[" + (i) + "]: ");
            vectB[i] = read.nextInt();
            sum += vectA[i] * vectB[i];
        }

        System.out.println("--------------------------------------------------------------------------");
        for(int i = 0; i < qnt; i++) {
            System.out.println("VetorA[" + (i) + "]: " + vectA[i]);
        }
        System.out.println("--------------------------------------------------------------------------");
        for(int i = 0; i < qnt; i++) {
            System.out.println("VetorB[" + (i) + "]: " + vectB[i]);
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Produto escalar: " + sum);

        read.close();
    }
}