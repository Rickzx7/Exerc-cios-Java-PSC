import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int num3 = scanner.nextInt();
        
        int maior = Math.max(num1 , Math.max(num2, num3));
        int menor = Math.min(num1, Math.min(num2, num3));
        double media = (num1 + num2 + num3) /3;


        System.out.println("Resultados");
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média aritimética: " + media);

        scanner.close();
    }
}
