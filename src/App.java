import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) {

    Double baseNumber = Double.parseDouble(JOptionPane.showInputDialog("Enter a number: ").replace(",", "."));

    System.out.println("Tabela de multiplicação de X");
    for (int i = 0; i <= 10; i++) {
      System.out.println(baseNumber * i);
    }

  }
}
