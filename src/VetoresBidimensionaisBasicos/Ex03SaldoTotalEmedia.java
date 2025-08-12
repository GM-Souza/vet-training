package VetoresBidimensionaisBasicos;

import java.util.Arrays;

public class Ex03SaldoTotalEmedia {

   public static double calcularSaldoTotal(double[][] matriz){
       double somaTotal = 0;

       for (int i = 0; i < matriz.length; i++) {
           somaTotal = 0;
           for (int j = 0; j < matriz[i].length; j++){
               somaTotal += matriz[i][j];
           }
           System.out.print(somaTotal+ " ");
       }return somaTotal;
    }
    public static double[] calcularMediaPorCliente(double[][] matriz){
            double[] result = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            double media = 0;
            for (int j = 0; j < matriz[i].length; j++){
                media += matriz[i][j]/matriz[j].length;
                result[i] = media;
            }
        }return result;
    }

    public static void main(String[] args) {

        double[][] mat = {
                {1000, 1500},
                {500, 700},
                {2000, 1800},
        };

        System.out.println(Arrays.toString(calcularMediaPorCliente(mat)));
        calcularSaldoTotal(mat);

    }
}
