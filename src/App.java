import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) {

    String baseNumberString = JOptionPane.showInputDialog("Enter a number: ").replace(",", ".");

    Double baseNumber = Double.parseDouble(baseNumberString);

    System.out.println("Tabela de multiplicação de X");
    for (int i = 0; i <= 10; i++) {
      System.out.println(baseNumber * i);
    }

  }
}
