import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        // SC faz a leitura dos dados informados peço usuario.
        Scanner sc = new Scanner(System.in);

        // Solicita a quantidade de alunos presentes e em seguida armazena.
        System.out.println("Informe a quantidade de alunos presentes!");
        int alunos = sc.nextInt();
        
        // Solicita o tempo de chegada de cada aluno e armazena cada um.
        System.out.println("Informe o tempo de chegada de cada aluno");
        int tempoChegada1 = sc.nextInt();
        int tempoChegada2 = sc.nextInt();
        int tempoChegada3 = sc.nextInt();
        int tempoChegada4 = sc.nextInt();
        int tempoChegada5 = sc.nextInt();

        // Faz a validação para saber se terá ou não a aula.
        if(alunos >= 3 && tempoChegada1 <= 0 || tempoChegada2 <=0 || tempoChegada3 <=0 || tempoChegada4 <=0 || tempoChegada5 <=0){
            System.out.println("Aula Normal");
        }else{
            System.out.println("Aula Cancelada");
        }
        sc.close();
    }
}