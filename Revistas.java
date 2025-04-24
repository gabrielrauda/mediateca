package Modelos;

class Revistas extends Materiales{
    private String editorial;
    private String periodicidad;
    private Integer stock;

    public Revistas(Integer idMaterial, String titulo, String editorial, String periodicidad, Integer stock) {
        super(idMaterial, titulo);
        this.editorial = editorial;
        this.periodicidad = periodicidad;
        this.stock = stock;
        
    }

    public String geteditorial() {
        return editorial;
    }

    public String getperiodicidad() {
        return periodicidad;
    }


    public Integer getstock() {
        return stock;
    }
