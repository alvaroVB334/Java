
public class Libro {

   static String nombre; 
   static String autor;
   static int categoria;
   static int anioPub;
   static boolean esPrestado;
   static int numVentas;
   static int numRef;
   static String isbn;
	 
   Libro(){
	   nombre="";
	   autor="";
	   categoria=0;
	   anioPub=0;
	   esPrestado=false;
	   numVentas=0;
	   numRef=0;
	   isbn="";
   }
   
   public Libro(String nombre,String autor,int categoria, int anioPub, boolean esPrestado, int numVentas, int numRef, String isbn){
	   super();
	   nombre="";
	   autor="";
	   categoria=0;
	   anioPub=0;
	   esPrestado=false;
	   numVentas=0;
	   numRef=0;
	   isbn="";
   }

public static String getNombre() {
	return nombre;
}

public static void setNombre(String nombre) {
	Libro.nombre = nombre;
}

public static String getAutor() {
	return autor;
}

public static void setAutor(String autor) {
	Libro.autor = autor;
}

public static int getCategoria() {
	return categoria;
}

public static void setCategoria(int categoria) {
	Libro.categoria = categoria;
}

public static int getAnioPub() {
	return anioPub;
}

public static void setAnioPub(int anioPub) {
	Libro.anioPub = anioPub;
}

public static boolean isEsPrestado() {
	return esPrestado;
}

public static void setEsPrestado(boolean esPrestado) {
	Libro.esPrestado = esPrestado;
}

public static int getNumVentas() {
	return numVentas;
}

public static void setNumVentas(int numVentas) {
	Libro.numVentas = numVentas;
}

public static int getNumRef() {
	return numRef;
}

public static void setNumRef(int numRef) {
	Libro.numRef = numRef;
}

public static String getIsbn() {
	return isbn;
}

public static void setIsbn(String isbn) {
	Libro.isbn = isbn;
}
   
}
