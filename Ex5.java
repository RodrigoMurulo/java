/*
5. Calcular a quantidade de litros de combustível gastos em uma viagem, sabendo-se
que um carro faz, em média, 12 km/l. Deverão ser fornecidos o tempo gasto da viagem
e a velocidade média.
 distancia = velocidade x tempo
 litros utilizados - distancia / 12 
 */

import java.util.Scanner;
public class Ex5{
    public static void main(String args[]){
       
        System.out.println("Exercício 5: ");
        System.out.print("\n");
        Scanner teclado =  new Scanner(System.in);
        double distancia, velocidade, litros, tempo;
        
        System.out.println("Digite o valor dvelocidade: ");
        velocidade = teclado.nextDouble();
        System.out.println("Digite o tempo gasto (horas): ");
        tempo = teclado.nextDouble(); 
        distancia = velocidade*tempo;
        System.out.println("A distância em quilômetros foi de: "+distancia);
        litros = distancia / 12;
        System.out.println("A litragem gasta foi de: "+litros);


    }
}