package VetoresBidimensionaisBasicos;

import java.util.Arrays;

public class Ex04MenorPrecoPorProduto {

    public static double[] encontrarMenorPrecoPorProduto(double[][] matriz){
        double[] vet = new double[matriz[0].length];

        for (int j = 0; j < matriz[0].length; j++) {
            double menor = matriz[0][j];
            for(int i = 0; i< matriz.length; i++){
                if(matriz[i][j] < menor){
                    menor = matriz[i][j];
                }
            }
            vet[j] = menor;
        }
        return vet;
    }
    public static void main(String[] args) {

        double[][] mat = {
                {10,12,9},
                {13,24,10}
        };

        System.out.println(Arrays.toString(encontrarMenorPrecoPorProduto(mat)));
    }
}
