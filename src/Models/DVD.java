package Models;

class DVD extends Materiales{
    private String director;
    private String duracion;
    private String genero;

    public DVD(Integer idMaterial, String titulo, String director, String duracion, String genero) {
        super(idMaterial, titulo);
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        
}

    public String getdirector() {
        return director;
    }

    public String getduracion() {
        return duracion;
    }

    public String getgenero() {
        return genero;
    }
    
    
}