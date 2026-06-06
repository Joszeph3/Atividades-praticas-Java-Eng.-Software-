import java.util.Scanner;// Scanner Normal

public class saudacaoSimples {
    public static void main(String[] args) {
        System.out.println("=====================");
        System.out.println("  Digite seu nome:");
        System.out.println("=====================");

        Scanner sc = new Scanner(System.in); //Ativando o Scanner 
        String nomeUsuario = sc.nextLine();//Variável = nome que o usuário vai usar.

        System.out.println("==========================================");
        System.out.println("            Olá, " + nomeUsuario + "!");
        System.out.println("==========================================");

        sc.close();//Fechando Scanner.
    }//Fechando "public static void main(String[] args)"
}//Fechando "public class saudacaoSimples"
