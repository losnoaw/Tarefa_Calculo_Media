import java.util.Scanner;


public class MediaNotas {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar as notas
        double nota1, nota2, nota3, nota4;

        // Leitura das notas
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        nota4 = scanner.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Impressão da média
        System.out.println("A média das notas é: " + media);
        
        scanner.close();
    }
}
