/*
	Programación Orientada a Objetos
	Soldado
	14/10/2016
*/

public class Soldado extends Militar {
    
 
    public void recibeOrden() {
        System.out.println("Ordene mi General");
    }
    
    public int Horas() {
        int horas = super.getHoras()*2;
        System.out.println("Horas: "+horas);
        return horas;
    }
    
    public double Salario() {
        double salario = super.getSalario()-10000;
        System.out.println("Salario: "+salario);
        return salario;
    }
    
    public int Vacaciones() {
        int vacaciones = super.getDiasVacaciones()/2;
        System.out.println("Dias vacaciones: "+vacaciones);
        return vacaciones;
    }
}
