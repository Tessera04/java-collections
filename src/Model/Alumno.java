package Model;

public class Alumno {
		private String nombre;
		
		private String codigo;
		
		public Alumno(String nombre, String codigo) {
			this.nombre = nombre;
			this.codigo = codigo;
		}
		
		public String getNombre() {
			return nombre;
		}

		@Override
		public String toString() {
			return this.nombre;
		}
		
		//CON ESTOS DOS PODEMOS USAR HASHSET Y ARRYALIST PARA VALIDAR. (VER CLASE 14)
		@Override
		public boolean equals(Object obj) {
			Alumno alumno = (Alumno) obj;
			return this.nombre.equals(alumno.getNombre());
		}
		
		@Override
		public int hashCode() {
			return this.nombre.hashCode();
		}
}
