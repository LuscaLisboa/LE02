import java.util.Scanner;

public class Exercicio03 {
    public void execute(){

        Scanner read = new Scanner(System.in);

        System.out.println("Informe a quantidade de n° a serem informados: ");
        int qnt = read.nextInt();
        double[] vect = new double[qnt];
        double[] dobro = new double[qnt];

        for(int i = 0; i < qnt; i++) {
            System.out.println("Informe o " + (i+1) + "° número: ");
            vect[i] = read.nextDouble();
            dobro[i] = vect[i] * 2;
            if(i == qnt - 1) {
                for(int j = 0; j < qnt; j++){
                    System.out.println("Vetor[" + j + "]: " + vect[j] + " -> Dobro[" + j + "]: " + dobro[j]);
                }
            }
        }

        read.close();
    }
}
