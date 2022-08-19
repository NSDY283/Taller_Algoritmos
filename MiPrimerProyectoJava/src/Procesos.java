import java.util.Scanner;
import javax.swing.JOptionPane;

public class Procesos {
	
	public void ejercicio2(){
		int a = 2;
		int b = -2;
		int c = 8;
		
		c = (a*b)+2;
		a = a-2 + b * ( b + 3 )-c ;
		b = c;
		
		System.out.println("Ejercicio 2 = La variable A es " + a + " La variable B es " + b + " La variable C es " + c);
	}
	
	public void ejercicio3() {
		double valorConstante = 70;
		
		double total = (valorConstante*15)/ 100;
		
		System.out.println("Ejercicio 3 = El 15% del valor constante es " + total);
	}
	
	public void ejercicio4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ejercicio 4 = Ingrese el valor: ");
		double valor = sc.nextDouble();
		double total = (15 * valor)/100;
		System.out.println("el 15% de " + valor + " es " + total);
	}
	
	public void ejercicio5() {
		
		double sueldoAnterior = 200000;
		double porcentajeSueldo = (sueldoAnterior*25)/100;
		double sueldoActual = sueldoAnterior + porcentajeSueldo;
		
		System.out.println("Ejercicio 5 = Su nuevo salario es: " + sueldoActual);
	}
	
	public void ejercicio6() {
		double sueldo = 1000000;
		double horasExtras = 4;
		double sueldoHoraE = 3000;
		
		double horas = horasExtras * sueldoHoraE;
		double sueldoTotal = horas + sueldo;
		
		System.out.println("Ejercicio 6 = El sueldo total en un mes fue " + sueldoTotal);
	}
	
	public void ejercicio7() {
		double costoTratamiento = 1000000;
		int diasHosp = 6;
		double medicamentos = 300000;
		
		double costoDias = diasHosp * 100000;
		
		System.out.println("Ejercicio 7 = El total a pagar al hospital es:  " + (costoTratamiento + medicamentos + costoDias));
	}
	
	public void ejercicio8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ejercicio 8 = Ingrese la base de su triángulo rectángulo: ");
		double base = sc.nextDouble();
		System.out.println("Ingrese la altura de su triángulo rectángulo: ");
		double altura = sc.nextDouble();
		double area = (base * altura)/2;
		System.out.println("La base de su triángulo rectángulo es: " + area);
	}
	
	public void ejercicio9() {
		double a = 2;
		double b = 4;
		
		double x = a +(b*2*a);
		
		System.out.println("Ejercicio 9 = La X equivale a: " + x);
	}
	
	public void ejercicio10() {
		double suma = 0;
		double decimales [] = {2.5, 2.5, 2.5};
		for(int i = 0;i < decimales.length; i++) {
			suma += decimales[(int) i];
		
		}System.out.println("Ejercicio 10 = La suma de los 3 numeros decimales es "+ suma);
	}
	
	public void ejercicio11() {
		double suma = 0;
		double decimales [] = {2.5, 2.5, 2.5};
		for(int i = 0;i < decimales.length; i++) {
			suma += decimales[(int) i] * 2;
		
		}System.out.println("Ejercicio 11 = La operacion de los 3 numeros decimales es "+ suma);
	}
	
	public void ejercicio12() {
		int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ejercicio 12 = Ingrese la cantidad de estudiantes"));
        int i=0;
        do {
            JOptionPane.showMessageDialog(null, "Estudiante "+(i+1));
            
            
            String nombre=JOptionPane.showInputDialog("Ingrese su nombre");
            double n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1"));
            double n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2"));
            double n3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 3"));
           
            double prom=(n1+n2+n3)/3;
            System.out.println(nombre+" El promedio es: "+prom);
           
            System.out.println("--------------------------------");
            System.out.println();
            i++;
        } while (i<cantidad);
	}
    
	
	public void ejercicio13() {
		String nombre = "Mauricio";
		String apellido = "Cardona";
		String profesion = "Doctora";
		
		int identificacion = 1094453555;
		int edad = 42;
		
		System.out.println("Ejercicio 13 = Datos ingresados: ");
		System.out.println("               Nombre completo: " + nombre + "" + apellido);
		System.out.println("               Documento: " + identificacion);
		System.out.println("               Edad: " + edad);
		System.out.println("               Profesión: " + profesion);
		System.out.println("                                       ");
		System.out.println("               Bienvenido!!!");
	}
	
	public void ejercicio14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ejercicio 14 = Ingrese la base de su triángulo rectángulo: ");
		double base = sc.nextDouble();
		System.out.println("Ingrese la altura de su triángulo rectángulo: ");
		double altura = sc.nextDouble();
		double area = (base * altura)/2;
		System.out.println("La base de su triángulo rectángulo es: " + area);
	}
	
	public void ejercicio15() {
		double a = 2;
		double b = 4;
		
		double x = a +(b*2*a);
		
		System.out.println("Ejercicio 15 = La X equivale a: " + x);
	}
	
	public void ejercicio16() {
		String articulo = "Camisas";
		double precio = 12000;
		int cantidad = 1;
		double valorEntregado = 20000;
		
		double cuenta = precio * cantidad;
		double devuelta = valorEntregado - cuenta;
		
		if(devuelta < 0) {
			System.out.println("Ejercicio 16 = Hace falta dinero para pagar la cuenta");
		}else{
			System.out.println("Ejercicio 16 = Su devuelta es equivalente a " + devuelta);
		};
	}
	
	public void ejercicio17() {
		String nombre = "Mauricio";
		String apellido = "Cardona";
		String profesion = "Doctora";
		
		int identificacion = 1094453555;
		int telefono = 1094453555;
		int edad = 42;
		
		System.out.println("Ejercicio 17 = Datos ingresados: ");
		System.out.println("Nombre completo: " + nombre + "" + apellido);
		System.out.println("Edad: " + edad);
		System.out.println("Documento: " + identificacion);
		System.out.println("Profesión: " + profesion);
		System.out.println("Telefono: " + telefono);
	}
	
	public void ejercicio18() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ejercicio 18 = Ingrese la base de su triángulo rectángulo: ");
		double base = sc.nextDouble();
		System.out.println("Ingrese la altura de su triángulo rectángulo: ");
		double altura = sc.nextDouble();
		double area = (base * altura)/2;
		System.out.println("La base de su triángulo rectángulo es: " + area);
	}
	
	public void ejercicio19() {
		double a = 2;
		double b = 4;
		
		double x = a +(b*2*a);
		
		System.out.println("Ejercicio 19 = La X equivale a: " + x);
	}
	
	public void ejercicio20() {
		int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ejercicio 20 = Ingrese la cantidad de empleados"));
        int i=0;
        do {
            JOptionPane.showMessageDialog(null, "Empleado "+(i+1));
            
            
            String nombre=JOptionPane.showInputDialog("Ingrese el nombre");
            double sueldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo mensual"));
            double horas=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de horas extras"));
            double precioHora=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de una hora extra"));
           
            double cantHoras= horas * precioHora;
            double total = sueldo + cantHoras;
            System.out.println(" El sueldo total de: "+nombre+" es "+total);
           
            System.out.println("--------------------------------");
            System.out.println();
            i++;
        } while (i<cantidad);
	}
	
	public void ejercicio21() {
		double horas = 40;
	    double sueldo = horas * 2000;
	      
	    double seguridad = (sueldo * 10)/100;
	      
	    double total = sueldo - seguridad;

	    System.out.println("Ejercicio 21 = El total de su sueldo es: " + total);
	}
	
	public void ejercicio22() {
		double sueldo = 1000000;
		double horasExtras = 4;
		double sueldoHoraE = 3000;
		
		double horas = horasExtras * sueldoHoraE;
		double sueldoTotal = horas + sueldo;
		
		System.out.println("Ejercicio 22 = El sueldo total en un mes fue " + sueldoTotal);
	}
	
	public void ejercicio23() {
		double horas = 50;
	    double sueldo = horas * 2000;
	      
	    double seguridad = (sueldo * 10)/100;
	      
	    double total = sueldo - seguridad;

	    System.out.println("Ejercicio 23 = El total de su sueldo es= " + total);
	}
	
	public void ejercicio24() {
		double sueldoAnterior = 100000;
		double porcentajeSueldo = (sueldoAnterior*25)/100;
		double sueldoActual = sueldoAnterior + porcentajeSueldo;
		
		System.out.println("Ejercicio 24 = Su nuevo salario es: " + sueldoActual);
	}
	
	public void ejercicio25() {
		
		int i=0;
		while(i<2) {
			JOptionPane.showMessageDialog(null, "Empleado "+(i+1));
	        double valorHora=3000;
	        double sueldoAnterior=Double.parseDouble(JOptionPane.showInputDialog("Ejercicio 25 = Ingrese el sueldo del empleado: "));
	        double porcentaje=Double.parseDouble(JOptionPane.showInputDialog("ingrese el incremento en porcentaje"));
	       
	        double porcentajeSueldo=(sueldoAnterior*porcentaje)/100;
	        double total= sueldoAnterior + porcentajeSueldo;
	        System.out.println(" su sueldo total del empleado es: "+total);
			i++;
		}
		
	}
	
	public void ejercicio26() {
		double nNatural = 5;
		
		double suma = nNatural * (nNatural + 1) / 2;
		
		System.out.println("Ejercicio 26 = La suma de los primeros n números naturales: " + suma);
	}
	
	public void ejercicio27() {
		
		int i=0;
		while(i<2) {
			JOptionPane.showMessageDialog(null, "Estudiante "+(i+1));
	        double nota1=Double.parseDouble(JOptionPane.showInputDialog("Ejercicio 25 = Ingrese la Nota 1: "));
	        double nota2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Nota 2: "));
	        double notaTrabajos=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Nota de trabajos: "));
	        double examenFinal=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Nota del examen final: "));;
	        
	        double nota1Valor = nota1 * 0.2;
			double nota2Valor = nota2 * 0.2;
			double notaTrabajosValor = notaTrabajos * 0.3;
			double notaExamen = examenFinal * 0.3;
			
			double notaDefinitiva = nota1Valor + nota2Valor + notaTrabajosValor + notaExamen;

	        System.out.println("La nota definitiva es: "+notaDefinitiva);
			i++;
		}
		
	}
	
	public void ejercicio28() {
		double monto = 2000000;
	    double interes = 0.5;
	    double plazo = 90;
	      
	    double total = (monto * interes * plazo)/360;

	    System.out.println("Ejercicio 28 =  El rendimiento de su CDT es= " + total);
	}
	
	
}
