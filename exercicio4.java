import java.util.Scanner;

public class exercicioSemaforo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cor do semáforo!");
        String cor = scanner.nextLine();

        String corMaiuscula = cor.toUpperCase();

        if (cor.equals("Vermelho")) {
            System.out.println("Pare o carro!");
        } else if (cor.equals("Amarelo")) {
            System.out.println("Atenção!");
        } else if (cor.equals("Verde")){
            System.out.println("Siga em frente!");
        }
    }
}