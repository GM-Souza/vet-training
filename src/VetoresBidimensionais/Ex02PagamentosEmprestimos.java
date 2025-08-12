package VetoresBidimensionais;

import java.util.Scanner;

public class Ex02PagamentosEmprestimos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas: ");
        int limitLine = sc.nextInt();

        System.out.println("Digite a quantidade de colunas: ");
        int limitColumn = sc.nextInt();
        double[][] vet = new double[limitLine][limitColumn];

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite os valores da "+(i+1)+" linha: ");
            for (int j = 0; j < vet[i].length; j++) {
                System.out.println("Coluna "+(j+1));
                vet[i][j] = sc.nextDouble();
            }
        }
        
        for (double[] linha : vet) {
                for (double valor : linha){
                    System.out.print(valor+ " ");
                }
            System.out.println();
        }
    }
}
