import java.util.Scanner;

public class Media_falta {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        if (nota1 > 10 || nota2 > 10) {
            System.out.println("Notas invalidas, digite notas inferiores a 10");
            return;
        }
        System.out.println("Digite seu numero de faltas: ");
        int faltas = sc.nextInt();
        if (faltas > 10) {
            System.out.println("Aluno reprovado. faltas excendem o límite");
            return;
        }
        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("Aluno aprovado com excelência");
            return;
        }
        if (media >= 7) {
            System.out.println("Aluno aprovado");
            return;
        }
        if (media >= 5) {
            System.out.println("Aluno esta de recuperação");
            return;
        }
        if (media < 5) {
            System.out.println("Aluno reprovado");
            return;
        }
        sc.close();

    }
}
