/*
	Programación Orientada a Objetos
	Main para mostrar datos de Militares
	14/10/2016
*/
public class main2 {
	public static void main(String[] args) {
		Soldado soldadito = new Soldado();
		System.out.println(" * Soldado: ");
		soldadito.recibeOrden();    
		soldadito.Horas();    
		soldadito.Salario();    
		soldadito.Vacaciones();  
		System.out.println("");
		
		General generalito = new General();
		System.out.println(" * General: ");
		generalito.planificaEstrategia();
		System.out.println("");
		
		Coronel coronelito = new Coronel();
		System.out.println(" * Coronel: ");
		coronelito.ejecutaOrdenManiobra();
		
		
		
	}
}