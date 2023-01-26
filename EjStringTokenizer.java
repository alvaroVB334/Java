import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class EjStringTokenizer {

	public static final String RUTA = "C:\\Users\\Usuario\\Desktop\\libros.txt";

	public static void main(String[] args) {
		
		int i=0;
		
		Libro libroLeido=new Libro();
		Libro listalibros[] = new Libro[4];
		
		// Linea con campos separados por , que lee entera
		String linea = "";
		// Definir un objeto file con la ruta del fichero
		File ficheroLibros = new File(RUTA);
		try {
			FileReader fr = new FileReader(ficheroLibros);
			BufferedReader br = new BufferedReader(fr);

			linea = br.readLine();
			while (linea != null) {
				// Con la linea leida utilizo el StringTokenizer para crear un objeto tipo libro
				StringTokenizer st = new StringTokenizer(linea, ",");

				// Como sabemos el orden en el que están los campos del libro los vamos leyendo
				// y los vamos asignando a las variables miembro del libro
				libroLeido=new Libro();
				
			   libroLeido.setNombre(st.nextToken());
			   libroLeido.setAutor(st.nextToken());
			   libroLeido.setCategoria(Integer.parseInt(st.nextToken()));
			   libroLeido.setAnioPub(Integer.parseInt(st.nextToken()));
			   libroLeido.setEsPrestado(Boolean.valueOf(st.nextToken()));
			   libroLeido.setNumVentas(Integer.parseInt(st.nextToken()));
			   libroLeido.setNumRef(Integer.parseInt(st.nextToken()));
			   libroLeido.setIsbn(st.nextToken());
				
			   listalibros[i]=libroLeido; 	
				
				linea = br.readLine();
				i++;
			}

			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
