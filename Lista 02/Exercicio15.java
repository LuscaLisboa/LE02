import java.util.Scanner;

public class Exercicio15 {
    public void execute(){

        Scanner read = new Scanner(System.in);

        int qnt = 5;
        double[] vectA = new double[qnt];

        System.out.println("Informe o VetorA[0]");
        vectA[0] = read.nextDouble();

        for(int i = 1; i < qnt; i++) {
            while(true){
                System.out.println("Informe VetorA[" + (i+1) + "]: ");
                if((vectA[i] = read.nextDouble()) > vectA[i-1]) break;
                else{
                    System.out.println("Número informado não é maior que o anterior: " + vectA[i-1]);   
                } 
            }
        }

        for(int i = 0; i < qnt; i++) {
            System.out.println("VetorA[" + i + "]: " + vectA[i]);
        }

        read.close();
    }
}
