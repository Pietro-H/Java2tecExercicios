public class filme {

    public static void main(String[] args) {
        System.out.println("Bem vindos ao TecFlix ");
        System.out.println("Filme: Homen Aranha sem volta para casa");

        int anaDeLancamento = 2021;
        System.out.println("Ano de lançamento " + anaDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // Média calculada pelas notas do Luiz, Cauan e Bruno
        double media = (8.5 + 9.5 + 10) / 3;
        System.out.println("A média que o segundo Tec deu " + media);

        String sinopse;

        sinopse = """
                Filme o Homem aranha sem volta para casa
                Estrelando por Tom Holond
                O filme tem uma nota alta
                e foi lançado em 
                """ + anaDeLancamento;
        System.out.println(sinopse);            

    }
}