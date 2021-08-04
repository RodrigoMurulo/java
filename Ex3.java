/*
3. Sabendo que o valor de 100 kw corresponde a 1/7 do valor do salário mínimo, faça
um programa Java que receba o valor do salário mínimo e a quantidade de kw gasta
por uma residência e calcule:
 a. o valor em reais de cada kw.
 b. o valor em reais a ser pago
 c. o novo valor a ser pago por essa residência com um desconto de 10% 
 */

import java.util.Scanner;
public class Ex3{
    public static void main(String args[]){
       
        System.out.println("Exercício 3: ");
        System.out.print("\n");
        Scanner teclado =  new Scanner(System.in);
        double kw, salariomin, preco, conta, comdesconto;
        
        System.out.println("Digite o valor do salário mínimo: ");
        salariomin = teclado.nextDouble();
        System.out.println("Digite a quantidade de kw consumida: ");
        kw = teclado.nextDouble(); 
        preco = (salariomin/7)/100;
        System.out.println("O preço do kw é de R$ "+preco);
        System.out.print("\n");
        conta = preco*kw;
        System.out.println("O valor da conta será de R$ "+conta);
        System.out.print("\n");
        comdesconto = conta*0.9;
        System.out.println("O valor da conta com 10% de desconto será de R$ "+comdesconto);
    }
}