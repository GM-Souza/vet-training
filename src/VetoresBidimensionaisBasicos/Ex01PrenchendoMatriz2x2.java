/*
Crie um metodo para preencher uma matriz 2x2 com receitas e despesas. Depois, crie um método que calcule a soma total de todos os elementos da matriz.
void preencherMatriz(double[][] matriz);
double calcularSomaTotal(double[][] matriz);

 */
package VetoresBidimensionaisBasicos;

import java.util.Scanner;

public class Ex01PrenchendoMatriz2x2 {

    public  static void preencherMatriz(double[][] matriz){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j< matriz[i].length; j++){
                System.out.println("Linha "+i+" Coluna "+j+": ");
                matriz[i][j]= sc.nextDouble();
            }
        }
    }
    public static double calcularSomaTotal(double[][] matriz){
        double soma = 0;

        for(int i = 0 ; i<matriz.length ; i++){
            for (int j = 0 ; j< matriz[i].length; j++){
                    soma+= matriz[i][j];
            }
        }
        return soma;
    }
    public static void main(String[] args) {

        double[][] mat = new double[2][2];

        preencherMatriz(mat);
        System.out.println(calcularSomaTotal(mat));

    }
}