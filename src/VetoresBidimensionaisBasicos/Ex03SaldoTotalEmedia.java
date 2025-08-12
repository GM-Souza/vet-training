package VetoresBidimensionaisBasicos;

public class Ex03SaldoTotalEmedia {

   public static double calcularSaldoTotal(double[][] matriz){
       double somaLinha = 0;

       for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[i].length; j++){
               somaLinha = somaLinha + matriz[i][j];
           }
       }
       return somaLinha;
    }

    public static void main(String[] args) {

        double[][] mat = {
                {100, 2},
                {120, 2},
                {130, 2},
        };

        System.out.println(calcularSaldoTotal(mat));
    }
}
