import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int valorPrimitivo = scanner.nextInt();
        Integer valorWrapper = valorPrimitivo;  // Autoboxing

        System.out.printf("Valor Primitivo: %d%nValor Wrapper: %d%n", valorPrimitivo, valorWrapper);

        scanner.close();
    }
}
