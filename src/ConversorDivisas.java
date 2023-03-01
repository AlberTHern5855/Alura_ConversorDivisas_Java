import javax.swing.JOptionPane;

public class ConversorDivisas {
	public static void main(String[] args) {
		/* 
		DolarAmericano - USD
		Euro - EUR
		Libra esterlina - GBP
		Peso mexicano - MXN */
		
		double DolarAmericano = 0.055;
		double Euro =0.052;
		double LibraEsterlina = 0.045;
		double PesoMexicano = 1;
		 
		Object conversionesDisponibles [] = {("Seleccione"),"Divisas","Temperatura"}; 
		Object seleccionUnidades = JOptionPane.showInputDialog(null, "Seleccione unidad", "Conversor"
		 		+ "de unidades", JOptionPane.QUESTION_MESSAGE, null, conversionesDisponibles , conversionesDisponibles [0]);
		
	
		if (seleccionUnidades.equals(conversionesDisponibles[0] )) {
				JOptionPane.showMessageDialog(null, "Por favor elija una opción");
				
		}
			
		
		if (seleccionUnidades.equals("Divisas")) {
			Object[] monedasDisponibles = {"USD", "EUR", "GBP", "MXN"};
			JOptionPane.showInputDialog(null, "Seleccione unidad", "Conversor"
		 		+ "de unidades", JOptionPane.QUESTION_MESSAGE, null, monedasDisponibles, null);
			
		}
		
		
		 
	}
		
	
}
	
	 
	 
	
	

	
