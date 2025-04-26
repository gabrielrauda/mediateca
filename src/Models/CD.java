package Models;

class CD extends Materiales{
    private String artista;
    private String genero;
    private Integer duracion;
    private Integer num_canciones;
    private Integer stock;

    public CD(Integer idMaterial, String titulo, String artista, String genero, Integer duracion, Integer num_canciones,Integer stock) {
        super(idMaterial, titulo);
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
        this.num_canciones = num_canciones;
        this.stock = stock;
        
    }

    public String getartista() {
        return artista;
    }

    public String getgenero() {
        return genero;
    }

    public Integer getduracion() {
        return duracion;
    }

    public Integer getnum_canciones() {
        return num_canciones;
    }

    public Integer getstock() {
        return stock;
    }
    
    
}