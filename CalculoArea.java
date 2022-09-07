package calculoArea;

import javax.swing.JOptionPane;

public class CalculoArea {
	
	private double altura;
	private double base;
	
 public void calculo () {
		 
		 altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura em metros: "));
	        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base em metros: "));
	        this.altura = altura;
	        this.base = base;
	        
	        double area =(Double) (null);
	        
	        JOptionPane.showMessageDialog(null, "A área é:  " + area + "  m²");
	        
 }


}
