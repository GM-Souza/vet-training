package VetoresBidimensionaisBasicos;

import java.util.Arrays;

public class Ex04MenorPrecoPorProduto {

    public static double[] encontrarMenorPrecoPorProduto(double[][] matriz){
        double[] vet = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            double menor = matriz[i][0];
            for(int j = 0; j< matriz[i].length; j++){
                if(matriz[i][j] < menor){
                    menor = matriz[i][j];
                }
            }
            vet[i] = menor;
        }
        return vet;
    }
    public static void main(String[] args) {

        double[][] mat = {{10,12,9},{13,24,10}};

        System.out.println(Arrays.toString(encontrarMenorPrecoPorProduto(mat)));
    }
}
