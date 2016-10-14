/*
	Programación Orientada a Objetos
	Coronel
	14/10/2016
*/

public class Coronel extends Teniente {
    public double getSalario() {
        return super.getSalario() + 5000.0;      // Q45,000.00 / anio
    }
    
    public void ejecutaOrdenManiobra() {
        System.out.println("Presenten Armas!");
    }
}
