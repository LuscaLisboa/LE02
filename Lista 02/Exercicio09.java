import java.util.Scanner;

public class Exercicio09 {
    public void execute(){

        Scanner read = new Scanner(System.in);

        int qnt = 5;
        double[] vectA = new double[qnt];
        double[] vectB = new double[qnt];
        double[] vectC = new double[qnt];
        

        for(int i = 0; i < qnt; i++) {
            System.out.println("Informe o VetorA[" + (i) + "]: ");
            vectA[i] = read.nextDouble();
            if(i % 2 == 0) vectC[i] = vectA[i];
        }
        for(int i = 0; i < qnt; i++) {
            System.out.println("Informe o VetorB[" + (i) + "]: ");
            vectB[i] = read.nextDouble();
            if(i % 2 != 0) vectC[i] = vectB[i];
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
        for(int i = 0; i < qnt; i++) {
            System.out.println("VetorC[" + (i) + "]: " + vectC[i]);
        }

        read.close();
    }
}

