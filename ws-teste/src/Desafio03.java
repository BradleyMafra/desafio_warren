import java.util.Scanner;

public class Desafio03 {

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Informe um número!");
      //Variavél n
      int n =sc.nextInt();
      int[] numero1 = {4};
      int[] numero2 = {3};
      int[] numero3 = {2};
      int[] numero4 = {1};

    // Soma
    int soma = 0;
    
    // Laço de repetição
    for(int i=0; i<3; i++){ 
        // Obter o número na posição do vetor
        int numeroSelecionado1 = numero1[i];
        int numeroSelecionado2 = numero2[i];
        int numeroSelecionado3 = numero3[i];
        int numeroSelecionado4 = numero4[i];
        
        // Sair do laço de repetição abaixo
        boolean continuar = true;
        
        // Criar vetor contendo os valores que somados irão retornar o valor de n
        int[] numerosParaSoma = new int[n];

        // Índice números para soma
        int indiceNumerosParaSoma = 0;
        
        // Laço de repetição
        do{
            soma += numeroSelecionado1;
            if(soma > n){
                soma -= numeroSelecionado1;
                continuar = false;
            }else{
                numerosParaSoma[indiceNumerosParaSoma] = numeroSelecionado1;
                indiceNumerosParaSoma++;
            }if(soma == n){
              continuar = false;
            }
          }while(continuar);
          do{
            soma += numeroSelecionado2;
            if(soma > n){
                soma -= numeroSelecionado2;
                continuar = false;
            }else{
                numerosParaSoma[indiceNumerosParaSoma] = numeroSelecionado2;
                indiceNumerosParaSoma++;
            }if(soma == n){
              continuar = false;
            }
          }while(continuar);
          do{
            soma += numeroSelecionado3;
            if(soma > n){
                soma -= numeroSelecionado3;
                continuar = false;
            }else{
                numerosParaSoma[indiceNumerosParaSoma] = numeroSelecionado3;
                indiceNumerosParaSoma++;
            }if(soma == n){
              continuar = false;
            }
          }while(continuar);
          do{
            soma += numeroSelecionado4;
            if(soma > n){
                soma -= numeroSelecionado4;
                continuar = false;
            }else{
                numerosParaSoma[indiceNumerosParaSoma] = numeroSelecionado4;
                indiceNumerosParaSoma++;
            }if(soma == n){
              continuar = false;
            }
          }while(continuar);

        // Exibir estrutura do vetor com os valores até que a soma deles chegue ao valor de n
        for(int i2 = 0; i2<numerosParaSoma.length; i2++){
           if(numerosParaSoma[i2] != 0){
              System.out.print(" ["+numerosParaSoma[i2]+"]");
           }
      }System.out.println(" \nResultado soma: "+soma); sc.close();
    }
  }
}