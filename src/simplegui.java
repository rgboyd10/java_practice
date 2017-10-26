import javax.swing.*;
public class simplegui
{
		public static void main(String[] args)
		{
			JOptionPane.showMessageDialog(null,"one\ntwo\nthree");
			JOptionPane.showInputDialog(null, "Enter text: ");
			String input;
			input = JOptionPane.showInputDialog(null,"Enter text: ");
			String str = JOptionPane.showInputDialog(null, "Enter age: ");
			int age = Integer.parseInt(str);
			Long.parseLong("25");
			Double.parseDouble("25");
		}
}