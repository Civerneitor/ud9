package Model;


public class Libros {
	protected String isbn;
	protected String titulo;
	protected String autor;
	protected int numpag;
		
	
	/**
	 * @param isbn
	 * @param titulo
	 * @param autor
	 * @param numpag
	 */
	public Libros(String isbn, String titulo, String autor, int numpag) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numpag = numpag;
	}
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @return the numpag
	 */
	public int getNumpag() {
		return numpag;
	}
	/**
	 * @param numpag the numpag to set
	 */
	public void setNumpag(int numpag) {
		this.numpag = numpag;
	}
	@Override
	public String toString() {
		return "El Libro con ISBN = " + isbn + ", con titulo = " + titulo + " y autor = " + autor + ", tiene = " +numpag+ " páginas";
	}
}
