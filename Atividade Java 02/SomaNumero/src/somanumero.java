import java.util.Scanner;//Scanner importado

public class somanumero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//Iniciando o Scanner.

        System.out.println("==========================");
        System.out.println("Digite o primeiro número");
        System.out.println("==========================");

    int primeiroNumero = sc.nextInt();//Váriavel do primeiro número digitado.

        System.out.println("==========================");
        System.out.println("Digite o segundo número");
        System.out.println("==========================");

    int segundoNumero = sc.nextInt();//Variável do Segundo número digitado

        System.out.println("============================================================================");
        System.out.println("         O número "+ primeiroNumero + " + "+ segundoNumero + " é igual a:");
        System.out.println("   ---------------> "+ (primeiroNumero + segundoNumero) + " <-----------------");
        System.out.println("============================================================================");

     sc.close();//Fechando o Scanner
    }//Fecha "public static void main(String[] args) throws Exception "
}//Fecha "public class somadeDoisNumeros"

