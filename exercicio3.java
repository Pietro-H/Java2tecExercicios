import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.getInstanceIn());
        
        System.out.print("Digite a velocidade do carro (em km/h): ");
        double velocidade = scanner.nextDouble();
        
        // Verifica se a velocidade é maior que 80 km/h
        if (velocidade > 80) {
            System.out.println("Você foi multado!");
        } else {
            System.out.println("Boa viagem!");
        }
        
        scanner.close();
    }
}