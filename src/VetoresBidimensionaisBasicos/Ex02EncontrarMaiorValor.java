package VetoresBidimensionaisBasicos;

public class Ex02EncontrarMaiorValor {
    public static double encontrarMaiorValor(double[][] matriz){
        double maior = matriz[0][0];

        for(int i = 0 ; i<matriz.length ; i++){
            for (int j = 0 ; j< matriz[i].length; j++){
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }
    public static void main(String[] args) {

        double[][] mat = {
            {100,200,300},
            {120,700,300},
            {100,400,500},
            {100,700,780},
        };

        System.out.println(encontrarMaiorValor(mat));

    }
}
