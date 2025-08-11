/*
Crie um programa que:
Receba os preços de fechamento de uma ação durante 10 dias.

Use os métodos:

maiorPreco(double[] precos) → retorna o maior preço.


menorPreco(double[] precos) → retorna o menor preço.
*/
package vetoresUnidimensionais;

public class Ex01MaiorMenorValor {

    public static double maiorPreco(double[] precos){
        double maiorPreco = precos[0];
        for(double p : precos){
            if(p>maiorPreco){
                maiorPreco = p;
            }
        }
        return maiorPreco;
    }
    public static double menorPreco(double[] precos){
        double menorPreco = precos[0];
        for(double p : precos){
            if(p<menorPreco){
                menorPreco = p;
            }
        }
        return menorPreco;
    }

    public static void main(String[] args) {
        double[] vet = {100,200,300,400};
        System.out.println(maiorPreco(vet));
        System.out.println(menorPreco(vet));
    }
}
