/*
	Programaci�n Orientada a Objetos
	AlarmaMain
	14/10/2016
*/

public class AlarmaMain {
	public static void main(String[] args) {
		AlarmaEmergencia alarmaIncendio = new AlarmaEmergencia();
		alarmaIncendio.m1();                  // emergencia 1
		alarmaIncendio.m2();                  // alarma 1 / timbre 1
		System.out.println(alarmaIncendio);   // emergencia Ring…Ring…Ring…Ring
	}
}