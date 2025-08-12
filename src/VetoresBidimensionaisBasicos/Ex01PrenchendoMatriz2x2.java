/*
Crie um metodo para preencher uma matriz 2x2 com receitas e despesas. Depois, crie um método que calcule a soma total de todos os elementos da matriz.
void preencherMatriz(double[][] matriz);
double calcularSomaTotal(double[][] matriz);

 */
package VetoresBidimensionaisBasicos;

import java.util.Scanner;

public class Ex01PrenchendoMatriz2x2 {
    public static double[] calcularSomaPorLinha(double[][] matriz) {
        // Cria um array para armazenar a soma de cada linha.
        double[] somaLinhas = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            // Inicializa a soma da linha atual com 0.
            double somaLinha = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                // Adiciona o elemento à soma da linha atual.
                somaLinha = somaLinha + matriz[i][j];
            }
            // Armazena a soma da linha atual no array de somas.
            somaLinhas[i] = somaLinha;
        }
        // Retorna o array contendo a soma de cada linha.
        return somaLinhas;
    }

    public static void main(String[] args) {
        double[][] mat = {
                {100, 2},
                {120, 2},
                {130, 2},
        };

        // Chama o metodo para calcular as somas por linha.
        double[] saldosPorLinha = calcularSomaPorLinha(mat);

        // Imprime a soma de cada linha.
        for (int i = 0; i < saldosPorLinha.length; i++) {
            System.out.println("Saldo da linha " + i + ": " + saldosPorLinha[i]);
        }
    }
}