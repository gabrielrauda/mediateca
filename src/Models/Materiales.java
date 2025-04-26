    package Models;

    public class Materiales {
    private Integer idMaterial;
    private String titulo;

    public Materiales(Integer idMaterial, String titulo) {
        this.idMaterial = idMaterial;
        this.titulo = titulo;
    }

    public Integer getidMaterial() {
        return idMaterial;
    }

    public String gettitulo() {
        return titulo;
        
    }
    }