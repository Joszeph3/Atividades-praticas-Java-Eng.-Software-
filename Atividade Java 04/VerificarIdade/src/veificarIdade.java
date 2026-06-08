import java.util.Scanner;//Iportando o Scanner.

public class veificarIdade {

    public static void main(String[] args) {

         boolean verifica = false;//Criando váriavel de verificação para o while

         while (!verifica) {
         System.out.println("=====================");
         System.out.println(" Digite a sua Idade:");
         System.out.println("=====================");
         
         Scanner sc = new Scanner(System.in);//Ativando o Scanner.
    
         if(sc.hasNextInt()){
         int idade = sc.nextInt();//Criando Váriavel "idade"
         verifica = true;//Aceitando a Permição do while

             if(idade >= 18){
             System.out.println("=====================");
             System.out.println("  É Maior de Idade!");
             System.out.println("=====================");
             sc.close();

             }else{
             System.out.println("====================");
             System.out.println("  É menor de Idade");
             System.out.println("====================");
              sc.close();
             }//fecha if linha 13.
         }else{ //If linha 12
             System.out.println("==================================");
             System.out.println("ERRO! Você digitou um caractere.");
             System.out.println("  DICA: Digite apenas Números");
             System.out.println("=================================");

              sc.next();
              }//Fechando Else linha 29            
             }//Fechando while linha 7
     
    }//Fecha "public static void main(String[] args)"
}//Fecha "public class veificarIdade"
