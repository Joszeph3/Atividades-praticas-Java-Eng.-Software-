import java.util.Scanner;//importando o Scanner.

public class cadastroSimples {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);//Ativando o Scanner

         System.out.println("===========================");
         System.out.println(" Digite seu nome completo:");
         System.out.println("===========================");

         String nomeCompleto = sc.nextLine();//Criando váriavel para armazenar nome.

         System.out.println("====================");
         System.out.println(" Digite sua idade:");
         System.out.println("====================");

         int idade = sc.nextInt();//Criando Váriavel para armazenar idade.

         System.out.println("====================");
         System.out.println(" Digite sua altura:");
         System.out.println("====================");

         double altura = sc.nextDouble();//Cirando váriavel para armazenar altura.

         System.out.println("----> Dados <----");
         System.out.println(" Nome: "+ nomeCompleto);
         System.out.println(" Idade: "+ idade);
         System.out.println(" Altura: "+ altura);
         System.out.println("====================");

         sc.close();//Fechando o Scanner.

    }//Fechando "public static void main(String[] args)"
}//Fechando "public class cadastroSimples"
