import java.io.IOException;
 
import java.util.Scanner;
public class Uri1019{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    int duracao, horas, minutos, segundos, resto;
    duracao = teclado.nextInt();
    horas = duracao / 3600;
    resto = duracao % 3600;
    minutos = resto / 60;
    segundos = resto % 60;
    
    System.out.println(horas+":"+minutos+":"+segundos);
    
    }
 
}