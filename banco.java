import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        String nome = "Wesley Safadão";
        String tipoConta = "Corrente";
        double saldo = 1660.35;
        int opcao = 0;

        System.out.println("**********************");
        System.out.println("\n Nome do Cliente: " + nome);
        System.out.println("\n Tipo da Conta: " + tipoConta);
        System.out.println("\n Saldo atua: " + saldo);
        System.out.println("**********************");

        String menu = """
                    ** Digite sua opção **
                    1 - Consultar Saldo
                    2 - Transferir Valor
                    3 - Recebe Valor
                    4 - Sair
        """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao == 1){
                System.out.println("Seu saldo é: " + saldo);
            } else if (opcao == 2){
                System.out.println("Qual o valor que você quer transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não foi possivel......."); 
                } else{
                    saldo -= valor;
                    System.out.println("Transferencia realizada! Novo saldo" + saldo);
                }
            }
            
        }
    }
}
