package vetoresUnidimensionais;

import java.util.Arrays;

public class Ex02PercentualPrecos {

    public static double[] variacaoDiaria(double[] precos){
        double[]vet = new double[precos.length-1];
        for (int i = 1; i < precos.length-1; i++) {
            vet[i - 1] = ((precos[i] - precos[i - 1]) / precos[i - 1]) * 100;
        }
        return vet;
    }

    public static void main(String[] args) {
        double[] vet = {100, 101.5, 99.0, 102.0, 105.0};
        double[] variacaoDiaria = (variacaoDiaria(vet));

        for(double val : variacaoDiaria){
            System.out.printf("%.2f%% ", val);
        }
        System.out.println();
        System.out.println(Arrays.toString(variacaoDiaria));
    }
}
