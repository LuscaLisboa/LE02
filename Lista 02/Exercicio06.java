import java.util.Scanner;

public class Exercicio06 {
    public void execute(){

        Scanner read = new Scanner(System.in);

        int qnt = 2;
        double[] notas = new double[qnt+1]; // parte de cima da divisão
        notas[qnt] = 0;
        double[] pesos = new double[qnt+1]; // parte de baixo da divisão
        pesos[qnt] = 0;

        for(int i = 0; i < qnt; i++) {
            System.out.println("Informe a " + (i+1) + "° nota: ");
            notas[i] = read.nextDouble();
            System.out.println("Informe o " + (i+1) + "° peso: ");
            pesos[i] = read.nextDouble();

            notas[qnt] += notas[i] * pesos[i];
            pesos[qnt] += pesos[i];

        }

        for(int i = 0; i < qnt; i++) {
            System.out.println((i+1) + "° nota: " + notas[i] + " peso: " + pesos[i]);
        }
        System.out.println("Média ponderada: " + (notas[qnt] / pesos[qnt]));

        read.close();
    }
}

