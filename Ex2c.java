import java.util.Scanner;
public class Ex2c{
    public static void main(String args[]){
       
        System.out.println("Exercício 2 (c): ");
        System.out.print("\n");
        Scanner teclado =  new Scanner(System.in);
        double base, altura, area;
        
        System.out.println("Digite o valor da base do triângulo: ");
        base = teclado.nextDouble(); 
        System.out.println("Digite o valor da altura do triângulo: ");
        altura = teclado.nextDouble();
        area = (base*altura)/2;
        System.out.println("A area é de: "+area);
    }
}