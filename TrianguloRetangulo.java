package calculoArea;

import javax.swing.JOptionPane;

public class TrianguloRetangulo extends CalculoArea{

	private double altura;
	private double base;
	
	// metodo 
	 public void calculo () {
		 
		 altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do Triângulo Retângulo em metros: "));
	        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do  Triângulo Retângulo em metros: "));
	        this.altura = altura;
	        this.base = base;
	        
	        double area = (this.altura*this.base/2);
	        
	        JOptionPane.showMessageDialog(null, "A área do Triangulo Retângulo é:  " + area + "  m²");
	        
	 }
	
	
}
