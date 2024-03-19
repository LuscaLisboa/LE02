import java.util.Scanner;

public class Exercicio05 {
    public void execute(){

        Scanner read = new Scanner(System.in);

        int qnt = 5;
        double[] vect = new double[qnt];
        int n[] = new int[2];
        n[1] = 0;

        for(int i = 0; i < qnt; i++) {

            System.out.println("Informe o " + (i+1) + "° número: ");
            vect[i] = read.nextDouble();

            if(i == qnt - 1) {
                System.out.println("Informe um número(n): ");
                n[0] = read.nextInt();
                for(int j = 0; j < qnt; j++){
                    if(vect[i] != n[0]) System.out.println("Vetor[" + j + "]: " + vect[j]);
                    if(vect[i] == n[0]) {
                        System.out.println("Vetor[" + j + "]: " + vect[j] + " == n: " + n[0]);
                        n[1]++;
                    }
                    if (j == qnt - 1) System.out.println("n apareceu " + n[1] + " vezes");
                }
            }
        }

        read.close();
    }
}

