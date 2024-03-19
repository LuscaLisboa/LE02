import java.util.Scanner;

public class Exercicio07 {
    public void execute(){

        Scanner read = new Scanner(System.in);

        int qnt = 5;
        double[] vectA = new double[qnt];
        double[] vectB = new double[qnt];
        boolean verificador = true;

        for(int i = 0; i < qnt; i++) {
            System.out.println("Informe o VetorA[" + (i+1) + "]: ");
            vectA[i] = read.nextDouble();
        }
        for(int i = 0; i < qnt; i++) {
            System.out.println("Informe o VetorB[" + (i+1) + "]: ");
            vectB[i] = read.nextDouble();
            if(vectA[i] != vectB[i]) verificador = false;
        }
        if(verificador == true) System.out.println("Os vetores VetorA e VetorB são IGUAIS.");
        if(verificador == false) System.out.println("Os vetores VetorA e VetorB são DIFERENTES.");

        read.close();
    }
}

