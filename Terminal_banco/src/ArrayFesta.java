import  java.util.*;

public class ArrayFesta {

    public static void main(String[] args) {
        // Inicializa um array de strings com um tamanho fixo
        String[] nomes = new String[5];
        Scanner scanner = new Scanner(System.in);

        // Adiciona nomes ao array
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = scanner.nextLine();
        }

        // Exibe os nomes armazenados no array
        System.out.println("\nNomes adicionados ao array:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}