import java.util.Scanner;
public class uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero;
        int impares = 1;
        numero = teclado.nextInt();
        
        while (impares <= numero) {
            System.out.println(impares);
            impares = impares + 2;
                    
        }
    }
}