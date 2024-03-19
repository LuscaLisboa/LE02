import java.util.Scanner;

public class Exercicio10 {
    public void execute(){

        Scanner read = new Scanner(System.in);

        int qnt = 5;
        double[] vectA = new double[qnt];
        double[] vectB = new double[qnt];
        

        for(int i = 0, j = qnt-1; i < qnt; i++, j--) {
            System.out.println("Informe o VetorA[" + (i) + "]: ");
            vectA[i] = read.nextDouble();
            vectB[j] = vectA[i];
        }

        System.out.println("--------------------------------------------------------------------------");
        for(int i = 0; i < qnt; i++) {
            System.out.println("VetorA[" + (i) + "]: " + vectA[i]);
        }
        System.out.println("--------------------------------------------------------------------------");
        for(int i = 0; i < qnt; i++) {
            System.out.println("VetorB[" + (i) + "]: " + vectB[i]);
        }

        read.close();
    }
}