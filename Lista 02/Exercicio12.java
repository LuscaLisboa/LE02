import java.util.Scanner;

public class Exercicio12 {
    public void execute(){

        Scanner read = new Scanner(System.in);

        int qnt = 12;
        double[] vectA = new double[qnt]; 
        double sum = 1;   

        for(int i = 0; i < qnt; i++) {
            System.out.println("Informe o VetorA[" + (i) + "]: ");
            vectA[i] = read.nextDouble();
            if(vectA[i] != 0 && vectA[i] % 2 == 0 && vectA[i] > 0) sum *= vectA[i];
        }

        for(int i = 0; i < qnt; i++) {
            System.out.println("VetorA[" + (i) + "]: " + vectA[i]);
        }
        System.out.println("Produto: " + sum);

        read.close();
    }
}