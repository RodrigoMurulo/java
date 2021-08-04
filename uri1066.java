import java.util.Scanner;
public class uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero;
        int quantidadepares = 0;
        int quantidadeimpares = 0;
        int quantidadenegativos = 0;
        int quantidadepositivos = 0;
        for (int cont = 1; cont<=5; cont++){
            numero = teclado.nextInt();
            if (numero %2 == 0) {
                quantidadepares = quantidadepares + 1;
            }
            else {
                quantidadeimpares = quantidadeimpares + 1;
            }
            if (numero > 0) {
                quantidadepositivos = quantidadepositivos +1;
            }
            else if (numero < 0){
                quantidadenegativos = quantidadenegativos + 1;
            }
        }
        System.out.println(quantidadepares + " valor(es) par(es)");
        System.out.println(quantidadeimpares + " valor(es) impar(es)");
        System.out.println(quantidadepositivos + " valor(es) positivo(s)");
        System.out.println(quantidadenegativos + " valor(es) negativo(s)");
    }
}