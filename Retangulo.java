package calculoArea;

import javax.swing.JOptionPane;

public class Retangulo extends CalculoArea {

	private double altura;
	private double base;
	
 public void calculo () {
		 
		 altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do Retângulo em metros: "));
	        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do Retângulo em metros: "));
	        this.altura = altura;
	        this.base = base;
	        
	        double area = (this.altura*this.base);
	        
	        JOptionPane.showMessageDialog(null, "A área do Retângulo é:  " + area + "  m²");
	        
	 }
}
