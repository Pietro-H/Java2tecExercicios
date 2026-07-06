import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra (R$): ");
        double valorTotal = scanner.nextDouble();
        
        double desconto = 0;

        if (valorTotal > 200) {
            desconto = 0.20; 
        } else if (valorTotal > 100) {
            desconto = 0.10; 
        } else {
            desconto = 0;   
        }

        double valorDesconto = valorTotal * desconto;
        double valorFinal = valorTotal - valorDesconto;

        System.out.println("\n--- Resumo da Compra ---");
        System.out.printf("Valor original: R$ %.2f\n", valorTotal);
        System.out.printf("Desconto aplicado: %.0f%%\n", (desconto * 100));
        System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
        System.out.printf("Valor final a pagar: R$ %.2f\n", valorFinal);

        scanner.close();
    }
}