import java.util.Scanner;
public class Exercicio1{
    public static void main(String[] args){

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite a sua idade ou seu ano de nacimento: ");
        double nascimento = scanner.nextDouble();

        System.out.printf("Você é ");

        double idade = 2025 - nascimento;

        if(idade > 18){
            System.out.println("Menor de idade ");
   
        } else {
            System.out.println("Maior de idade ");
        }
    }
}