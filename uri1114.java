import java.util.Scanner;
public class uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int senha;
        senha = teclado.nextInt();
        do {
            if (senha != 2002) {
            System.out.println("Senha invalida");
            senha = teclado.nextInt();
        }
        if (senha == 2002){
            System.out.println("Acesso permitido");
        }
    }
}