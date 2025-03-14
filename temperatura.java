import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura atual em graus Celsius: ");
        double temp = sc.nextDouble();

        if (temp >= 25) {
            System.out.println("Temperatura " + temp + "°C" + " no momento está quente");
        } else {
            System.out.println("Temperatura " + temp + "°C" + " no momento está frio");
        }
        sc.close();
    }
}
