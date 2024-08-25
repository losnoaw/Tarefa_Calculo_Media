import java.util.Scanner;


public class MediaNotas {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Leitura das notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();


        CalculoMedia(nota1, nota2, nota3, nota4);
        
        scanner.close();
    }

    public  static void CalculoMedia(double nota1, double nota2, double nota3, double nota4) {
          // Cálculo da média
        
        double soma = nota1 + nota2 + nota3 + nota4;
        double media = soma / 4;

          // Impressão da média
        System.out.println("A média das notas é: " + media);
    }
    
}
