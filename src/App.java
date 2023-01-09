import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) {

    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    String baseNumberString = JOptionPane.showInputDialog("Enter a number: ").replace(",", ".");

    Double baseNumber = Double.parseDouble(baseNumberString);

    System.out.println("Tabela de multiplicação de X");
    for (int i = 0; i <= numbers.length; i++) {
      System.out.println(baseNumber * i);
    }

  }
}
