import java.util.Scanner;

public class Exercicio04 {
    public void execute(){

        Scanner read = new Scanner(System.in);

        int qnt = 5;
        double[] vect = new double[qnt];
        int n;

        for(int i = 0; i < qnt; i++) {

            System.out.println("Informe o " + (i+1) + "° número: ");
            vect[i] = read.nextDouble();

            if(i == qnt - 1) {
                System.out.println("Informe um índice(n): "); // INDICE começa em [0]
                n = read.nextInt();
                for(int j = 0; j < n; j++){
                    System.out.println("Vetor[" + j + "]: " + vect[j]);
                }
            }
        }

        read.close();
    }
}

