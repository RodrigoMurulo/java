public class continhas{
    public static void main(String args[]){
        System.out.println();
        int a, b, c;
        a = 30;
        b = 60;
        c = a + b;

        System.out.println("O valor da soma é igual a : " + c);

        c = a - b;
      
        System.out.println("O valor da subtração é igual a : " + c);

        c = b / a;

        System.out.println("O valor da divisão é igual a : " + c);

        c = a * b;

        System.out.println("O valor da multiplicação é igual a : " + c);

        c = a % b;

        System.out.println("O valor do módulo é igual a : " + c);
        
        System.out.println();
        System.out.println("Agora contas com decimais");

        float x, y, z;

        x = 12.0f;
        y = 5.0f;
        z = x / y;

        System.out.println("O valor da divisão é igual a : " + z);
        System.out.printf("Valor com 2 casas decimais %2.2f", z);
    //%"inteiro"."decimal"   -  2 decimais
        System.out.printf("Valor com 3 casas decimais %.3f\n", z);
    }
}