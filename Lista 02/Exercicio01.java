import java.util.Scanner;

public class Exercicio01 {
    public void execute(){

        Scanner read = new Scanner(System.in);

        int qnt = 5;
        double[] vect = new double[qnt];
        double media[] = new double[1];
        media[0] = 0;

        for(int i = 0; i < qnt; i++) {

            System.out.println("Informe o " + (i+1) + "° número: ");
            vect[i] = read.nextDouble();
            media[0] += vect[i];
            if(i == qnt - 1) {
                for(int j = 0; j < qnt; j++){
                    if(j == 0)  media[0] = media[0] / qnt;
                    if(vect[j] < media[0]) System.out.println("Vetor[" + j + "]: " + vect[j] + " < Média: " + media[0]);
                    if(vect[j] == media[0]) System.out.println("Vetor[" + j + "]: " + vect[j] + " == Média: " + media[0]);
                    if(vect[j] > media[0]) System.out.println("Vetor[" + j + "]: " + vect[j] + " > Média: " + media[0]);
                }
            }
        }

        read.close();
    }
}
