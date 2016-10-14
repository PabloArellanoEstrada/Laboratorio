// CC2006, Lab 4
// Una clase para representar a los Tenientes.

public class Soldado extends Militar {
    
    public void recibeOrden() {
        System.out.println("Ordene mi General");
    }
    
    public int Horas() {
        int horas = super.getHoras()*2;
        System.out.println(horas);
        return horas;
    }
    
    public double Salario() {
        double salario = super.getSalario()-10000;
        System.out.println(salario);
        return salario;
    }
    
    public int Vacaciones() {
        int vacaciones = super.getDiasVacaciones()/2;
        System.out.println(vacaciones);
        return vacaciones;
    }
}
