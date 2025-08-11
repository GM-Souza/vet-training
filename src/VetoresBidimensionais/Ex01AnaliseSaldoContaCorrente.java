/*
Um banco monitora os saldos diários de N clientes durante M dias em uma matriz double[N][M].
 Crie um programa que permita:
Métodos a implementar:
double saldoFinal(double[][] saldos, int cliente) – retorna o saldo do cliente ao final do período.

double[] saldoFinalTodos(double[][] saldos) – retorna o saldo final de todos os clientes.

void imprimirExtratoClientes(double[][] saldos) – exibe todos os saldos por cliente em formato tabular.



 */

package VetoresBidimensionais;

public class Ex01AnaliseSaldoContaCorrente {

    public static double saldoFinal(double[][] saldos, int cliente){
        int ultimaColuna = saldos[cliente].length - 1;
        return saldos[cliente][ultimaColuna];
    }

    public static void main(String[] args) {

        double[][]mat =  {
                {1000.0, 1200.5, 1100.0}, // Cliente 0
                 {500.0, 700.0, 900.0},    // Cliente 1
                 {2000.0, 2100.0, 2150.5} // Cliente 2
        };

        for (double[] doubles : mat) {         // percorre as linhas
            for (double aDouble : doubles) {  // percorre as colunas
                System.out.print(aDouble + " ");
            }
        }

        System.out.println();
        for (int i = 0; i < mat.length; i++) {
            System.out.println("Saldo final do cliente 1: R$ " + saldoFinal(mat, i));
        }


    }
}
