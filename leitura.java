import java.util.Scanner;
public class leitura{
    public static void main(String args[]){
        System.out.print("\n");
        Scanner teclado =  new Scanner(System.in);
        int valorInteiro;
        double valorDouble;
        float valorFloat;

        System.out.println("Digite um valor inteiro: ");
        valorInteiro = teclado.nextInt();
//vai esperar apertar "enter" pra seguir para próxima linha/comando
        System.out.println("Valor digitado é igual a: "+valorInteiro);
    }
}