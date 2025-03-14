import java.util.Scanner;

public class media {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        if (nota1 > 10 || nota2 > 10) {
            System.out.print("Notas invalidas");
            return;
        } else {
            double media = (nota1 + nota2) / 2;

            if (media > 7) {
                System.out.print("Parabéns, aluno aprovado " + "Sua media final foi: " + media);
            } else {
                System.out.print("Aluno reprovado " + "Sua media final foi: " + media);
            }
        }
        scanner.close();
    }
}