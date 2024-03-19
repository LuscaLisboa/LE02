import java.util.Scanner;

public class Exercicio02 {
    public void execute(){

        Scanner read = new Scanner(System.in);

        System.out.println("Informe a quantidade de n° a serem informados: ");
        int qnt = read.nextInt();
        double[] vect = new double[qnt];

        for(int i = 0; i < qnt; i++) {

            System.out.println("Informe o " + (i+1) + "° número: ");
            vect[i] = read.nextDouble();
            if(i == qnt - 1) {
                for(int j = 0; j < qnt; j++){
                    if(vect[j] < 0) System.out.println("Vetor[" + j + "]: " + vect[j] + " < 0 " );
                    if(vect[j] == 0) System.out.println("Vetor[" + j + "]: " + vect[j] + " == 0 ");
                    if(vect[j] > 0) System.out.println("Vetor[" + j + "]: " + vect[j] + " > 0 ");
                }
            }
        }

        read.close();
    }
}
