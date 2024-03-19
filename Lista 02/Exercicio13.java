import java.util.Scanner;

public class Exercicio13 {
    public void execute(){

        Scanner read = new Scanner(System.in);

        System.out.println("Informe o n° n: ");
        int n = read.nextInt();

        double[] vectA = new double[n]; 

        if(n >= 1) vectA[0] = 1;
        if(n >= 2) vectA[1] = 1;

        for(int i = 2; i < n; i++) {
            vectA[i] = vectA[i-2] + vectA[i-1];
        }
        System.out.println("Sequência de Fibonacci(" + n + "): ");
        for(int i = 0; i < n; i++) {
            System.out.println(vectA[i]);
        }

        read.close();
    }
}