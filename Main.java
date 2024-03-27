import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          Macas m = new Macas();
          System.out.print("Insira a quantidade de maças: ");
          int quantidade = scanner.nextInt();
          m.setQuantidade(quantidade);
          float valor = m.calculaPreco();
          System.out.printf("Valor total: R$ %.2f%n", valor);
     }
}