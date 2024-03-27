import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto p = new Produto();

        System.out.print("Insira o Estoque Atual: ");
        p.setEstoqueMax(scanner.nextInt());
        System.out.print("Insira o Estoque Maximo: ");
        p.setEstoqueMax(scanner.nextInt());
        System.out.print("Insira o Estoque Minimo: ");
        p.setEstoqueMin(scanner.nextInt());

        p.calculaEstoqueAtual();
    }
}
