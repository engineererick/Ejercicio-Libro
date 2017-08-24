public class Libro
{
    private String Titulo = "";
    private String Autor = "";
    
    public Libro(String titu, String aut)
    {
        Titulo = titu;
        Autor = aut;
    }
    
    public String DimeAutor()
    {
        return Autor;
    }
    
    public String DimeTitulo()
    {
        return Titulo;
    }
}