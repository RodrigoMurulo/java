import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int codigo, quantidade;
        double valorconta;
        codigo = teclado.nextInt();
        quantidade = teclado.nextInt();


        if (codigo == 1){
            valorconta = 4 * quantidade;
            System.out.printf("Total: R$ %.2f\n"+valorconta);
        }
        else if (codigo == 2){
            valorconta = 4.5 * quantidade;
            System.out.printf("Total: R$ %.2f\n"+valorconta);
        }
        else if (codigo == 3){
            valorconta = 5 * quantidade;
            System.out.printf("Total: R$ %.2f\n"+valorconta);
        }
        else if (codigo == 4){
            valorconta = 2 * quantidade;
            System.out.printf("Total: R$ %.2f\n"+valorconta);
        }
        else (codigo == 5){
            valorconta = 1.5 * quantidade;
            System.out.printf("Total: R$ %.2f\n"+valorconta);
        } 
    }
}
