import java.util.Scanner;

public class Exercicio01 {
    public void execute(){

        Scanner read = new Scanner(System.in);

        int qnt = 5;
        double[] vect = new double[qnt];
        double media = 0;

        for(int i = 0; i < qnt; i++) {

            System.out.println("Informe o " + (i+1) + "° número: ");
            vect[i] = read.nextDouble();
            media += vect[i];
            if(i == qnt - 1) {
                for(int j = 0; j < qnt; j++){
                    if(j == 0)  media = media / qnt;
                    if(vect[j] < media) System.out.println("Vetor[" + j + "]: " + vect[j] + " < Média: " + media);
                    if(vect[j] == media) System.out.println("Vetor[" + j + "]: " + vect[j] + " == Média: " + media);
                    if(vect[j] > media) System.out.println("Vetor[" + j + "]: " + vect[j] + " > Média: " + media);
                }
            }
        }

        read.close();
    }
}
