import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o tamanho do lado : ");
        double lado1 = scanner.nextDouble();
        System.out.print("Insira o tamanho do lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Insira o tamanho do lado 3: ");
        double lado3 = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        checaTriangulo(triangulo);
    }
}