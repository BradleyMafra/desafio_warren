import java.util.Scanner;

public class Desafio01 {
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in); 

    System.out.println("Informe um numero!"); 
    int n = sc.nextInt();  
    int reverso = 0;     
    
    // While abaixo faz a inversão dos numeros.
    while (n > 0) {
      reverso *= 10;       
      reverso += (n % 10);
      n /= 10;
      } System.out.println("Seu numero reverso é: "+reverso); // Imprime na tela o numero inverso.         
      
      // Faz a validação se for IMPAR executa imprimindo os impares na tela.
      // Se for PAR cai no ELSE que faz o calculo e imprimi na tela os numeros impares.
      if (reverso != 0){
        while(reverso < 1000000){        
          reverso += +2;
          System.out.println("Numero impar do reverso: "+reverso); 
        }   
      }else{
        reverso++;
        while(reverso < 1000000){        
          System.out.println("Numero impar do reverso: "+reverso); 
          reverso += +2;
        } 
      }sc.close();
  }
}
