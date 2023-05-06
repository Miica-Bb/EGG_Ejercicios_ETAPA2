package g07ej01.Entidad;

public class Libro {
    public String isbn;
    public String titulo;
    public String autor;
    public String numeroPaginas;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, String numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + '}';
    }
}
