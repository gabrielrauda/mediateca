package Modelos;

    class LIBROS extends Materiales{
    private String autor;
    private Integer num_paginas;
    private String editorial;
    private String ISBN;
    private Integer year_libro;
    private Integer stock;

    public LIBROS(Integer idMaterial, String titulo, String autor, Integer num_paginas, String editorial, String ISBN, Integer year_libro, Integer stock) {
        super(idMaterial, titulo);
        this.autor = autor;
        this.num_paginas = num_paginas;
        this.editorial = editorial;
        this.ISBN = ISBN;
        this.year_libro = year_libro;
        this.stock = stock;
        
    }

    public String getautor() {
        return autor;
    }

    public Integer getnum_paginas() {
        return num_paginas;
    }

    public String geteditorial() {
        return editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public Integer getyear_libro() {
        return year_libro;
    }

    public Integer getstock() {
        return stock;
    }
   

    
}
