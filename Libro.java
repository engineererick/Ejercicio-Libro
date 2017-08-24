public class Libro
{
    private String Titulo = "";
    private String Autor = "";
    private int Paginas;
    
    public Libro(String titu, String aut, int pag){
        Titulo = titu;
        Autor = aut;
        Paginas = pag;
    }
    
    public String DimeAutor(){
        return Autor;
    }
    
    public String DimeTitulo(){
        return Titulo;
    }
    
    public int DimePaginas(){
        return Paginas;
    }
    
    public String DimeDetalles(){
        return "NoLoHeTerminado";
    }
}