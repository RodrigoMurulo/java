import java.util.Scanner;
public class Ex2e{
    public static void main(String args[]){
       
        System.out.println("Exercício 2 (e): ");
        System.out.print("\n");
        Scanner teclado =  new Scanner(System.in);
        double baseMaior, baseMenor, altura, area;
        
        System.out.println("Digite o valor da base maior do trapézio: ");
        baseMaior = teclado.nextDouble();
        System.out.println("Digite o valor da base menor do trapézio: ");
        baseMenor = teclado.nextDouble(); 
        System.out.println("Digite o valor da altura do trapézio: ");
        altura = teclado.nextDouble();
        area = ((baseMaior*baseMenor)*altura)/2;
        System.out.println("A area é de: "+area);
    }
}