import javax.swing.JOptionPane;

public class quiz3{
  public static void main (String[] args){
    double side = Double.parseDouble(JOptionPane.showInputDialog("input side (s) :"));
    double area = 3*side*side*1.736/2;
    JOptionPane.showMessageDialog(null,area);
  }
}