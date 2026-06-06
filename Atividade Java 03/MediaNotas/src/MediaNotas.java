import java.util.Scanner;//Importando o Scanner

public class MediaNotas {
    public static void main(String[] args){
                
       System.out.println(""); 
       System.out.println("CALCULADOR DE MÉDIA DE NOTAS"); 
       System.out.println("============================");
       System.out.println(" Digite o primeiro número:");
       System.out.println("============================");
       
       Scanner sc = new Scanner(System.in);//Ativando o Scanner

       double primeiroNumero = sc.nextDouble();//Criando variável do primeiro número registrado
       
       System.out.println("============================");
       System.out.println(" Digite o segundo número:");
       System.out.println("============================");

       double segundoNumero = sc.nextDouble();//Criando variável do segundo número registrado

       System.out.println("============================");
       System.out.println(" Digite o terceiro número:");
       System.out.println("============================");
       
       double terceiroNumero = sc.nextDouble();//Criando variável do terceiro número registrado

       System.out.println("============================");
       System.out.println(" Digite o terceiro número:");
       System.out.println("============================");
       
       double quartoNumero = sc.nextDouble();//Criando variável do quarto número registrado
       double Media = (primeiroNumero + segundoNumero + terceiroNumero + quartoNumero) /4;//Criando variável da média dos números
       
         if (Media >= 6){    
             System.out.println("===========================");
             System.out.println(    "Sua Média é "+ Media + "!" );
             System.out.println(   "Parabéns! Você passou." );
             System.out.println("===========================");
         }else{
             System.out.println("===========================");
             System.out.println(    "Sua Média é "+ Media + "." );
             System.out.println(   "Poxa.. Você reprovou!" );
             System.out.println("===========================");
         }
         sc.close();//Fechando Scanner
       }//Fechando "public static void main(String[] args)"
    }//Fechando "import java.util.Scanner;"

