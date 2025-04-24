    public class Materiales {
    private String idMaterial;
    private String titulo;

    public Materiales(String idMaterial, String titulo) {
        this.idMaterial = idMaterial;
        this.titulo = titulo;
    }

    public String getidMaterial() {
        return idMaterial;
    }

    public String gettitulo() {
        return titulo;
        
    }
    }


class Libros extends Materiales{
    private String autor;
    private String numeroPag;
    private String editorial;
    private String isbn;
    private String año;
    private String disponible;

    public Libros(String idMaterial, String titulo, String autor, String numeroPag, String editorial, String isbn, String año, String disponible) {
        super(idMaterial, titulo);
        this.autor = autor;
        this.numeroPag = numeroPag;
        this.editorial = editorial;
        this.isbn = isbn;
        this.año = año;
        this.disponible = disponible;
        
    }

    public String getAutor() {
        return autor;
    }

    public String getNumeroPag() {
        return numeroPag;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAño() {
        return año;
    }

    public String getDisponible() {
        return disponible;
    }
   

    
}

class Revistas extends Materiales{
    private String editorial;
    private String periodicidad;
    private String publicacion;
    private String disponible;

    public Revistas(String idMaterial, String titulo, String editorial, String periodicidad, String publicacion, String disponible) {
        super(idMaterial, titulo);
        this.editorial = editorial;
        this.periodicidad = periodicidad;
        this.publicacion = publicacion;
        this.disponible = disponible;
        
    }

    public String getEditorial() {
        return editorial;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public String getDisponible() {
        return disponible;
    }
   

    
}

class CDS extends Materiales{
    private String artista;
    private String genero;
    private String duracion;
    private String numcanciones;
    private String disponible;

    public CDS(String idMaterial, String titulo, String artista, String genero, String duracion, String numcanciones,String disponible) {
        super(idMaterial, titulo);
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
        this.numcanciones = numcanciones;
        this.disponible = disponible;
        
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getNumcanciones() {
        return numcanciones;
    }

    public String getDisponible() {
        return disponible;
    }
    
    
}

class DVDS extends Materiales{
    private String director;
    private String duración;
    private String genero;
    private String disponible;

    public DVDS(String idMaterial, String titulo, String director, String duración, String genero, String disponible) {
        super(idMaterial, titulo);
        this.director = director;
        this.duración = duración;
        this.genero = genero;
        this.disponible = disponible;
        
}

    public String getDirector() {
        return director;
    }

    public String getDuración() {
        return duración;
    }

    public String getGenero() {
        return genero;
    }

    public String getDisponible() {
        return disponible;
    }
    
    
}
