import java.util.Scanner;
public class Ex2a{
    public static void main(String args[]){
       
        System.out.println("Exercício 2 (a): ");
        System.out.print("\n");
        Scanner teclado =  new Scanner(System.in);
        double lado, area;
        
        System.out.println("Digite o valor do lado do quadrado: ");
        lado = teclado.nextDouble(); 
        area = lado * lado;
        System.out.println("A area é de: "+area);
    }
}