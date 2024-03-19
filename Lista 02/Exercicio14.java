import java.util.Scanner;

public class Exercicio14 {
    public void execute(){

        Scanner read = new Scanner(System.in);

        int qnt = 5;
        double[] vectA = new double[qnt];
        double temp;

        for(int i = 0; i < qnt; i++) {
            System.out.println("Informe o VetorA[" + (i+1) + "]: ");
            vectA[i] = read.nextDouble();
        }
        System.out.println("--------------------------------------------------------------------------");
        for(int i = 0; i < qnt; i++) {
            System.out.println("VetorA[" + (i+1) + "]: " + vectA[i]);
        }
        for(int i = 0; i < qnt - 1; i++) {
            if(vectA[i] > vectA[i+1]) {
                temp = vectA[i];
                vectA[i] = vectA[i+1];
                vectA[i+1] = temp;
            }
        }
        System.out.println("--------------------------------------------------------------------------");
        for(int i = 0; i < qnt; i++) {
            System.out.println("VetorA[" + (i+1) + "]: " + vectA[i]);
        }

        read.close();
    }
}