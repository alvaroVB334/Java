package Tema2.Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, edad, diasBaja, mayorEdad = 0;// Declaramos las variables
		Scanner teclado = new Scanner(System.in);

		float sueldo, sueldoMayor = 0, sueldoMenor = Integer.MAX_VALUE, solteros = 0, casados = 0, divorciados = 0,
				cumuloEdad = 0; // Las inicializamos
		String nombre, estadoCivil, nombreSueldoMayor = "", nombreSueldoMenor = "", mayorEdadNombre = "";
		ArrayList<String> jubilacion; // Creamos una ArrayList para la lista de empleados, util ya que no hay que
										// predefinir su tamaño

		System.out.print("¿Cuantos empleados deseas leer?: ");
		n = teclado.nextInt();

		jubilacion = new ArrayList<>();

		for (int i = 0; i < n; i++) { // Creamos el bucle como limite el número de empleados que se desea leer y
										// recogemos los datos
			System.out.print("\nIntroduce el nombre del empleado número " + (i + 1) + ": ");
			nombre = teclado.next();

			System.out.print("Introduce la edad del empleado número " + (i + 1) + ": ");
			edad = teclado.nextInt();

			System.out.print("Introduce el sueldo del empleado número " + (i + 1) + ": ");
			sueldo = teclado.nextFloat();

			System.out.print("Introduce el estado civil del empleado número " + (i + 1)
					+ " (S- Soltero, C-Casado, D-Divorciado): ");
			estadoCivil = teclado.next();

			System.out.print("Introduce los dias de baja del empleado número " + (i + 1) + ": ");
			diasBaja = teclado.nextInt();

			System.out.print("-------------------------------------------------------------------");

			if (edad > mayorEdad) { // condición de Mayor edad
				mayorEdad = edad;
				mayorEdadNombre = nombre;
			}

			cumuloEdad = cumuloEdad + edad; // para calcular la media (falta dividir /n fuera del bucle)

			if (sueldo > sueldoMayor) { // Empleado con mayor sueldo
				sueldoMayor = sueldo;
				nombreSueldoMayor = nombre;
			}

			if (sueldo < sueldoMenor) { // Empleado con menor sueldo
				sueldoMenor = sueldo;
				nombreSueldoMenor = nombre;
			}

			if (edad > 55 && sueldo > 35000 || diasBaja > 100) { // Si la condición se cumple lo añadimos al array
				jubilacion.add(nombre);
			}

			if (estadoCivil.equals("S")) { // Contadores de cada, cada uno de ellos se divide entre /n y multiplica *100
											// para ver el porcentaje
				solteros++;
			} else if (estadoCivil.equals("C")) {
				casados++;
			} else {
				divorciados++;
			}

		}

		System.out.println("-----------------------------------\nEl empleado de mayor edad es: " + mayorEdadNombre);
		System.out.println("La media de edad es: " + (cumuloEdad / n));
		System.out.println(
				"El empleado con mayor sueldo es: " + nombreSueldoMayor + " y el de menor: " + nombreSueldoMenor);

		System.out.println("Lista de gente con Jubilación anticipada-> " + jubilacion);

		System.out.println("Porcentaje de solteros: " + ((solteros / n) * 100) + "%");
		System.out.println("Porcentaje de casados: " + ((casados / n) * 100) + "%");
		System.out.println("Porcentaje de divorciados: " + ((divorciados / n) * 100) + "%");

		teclado.close();
	}

}