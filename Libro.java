public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    private String numRefs;
    private int prestamos;
    
    public Libro(String Titu, String Aut, int nPags)
    {
        titulo = Titu;
        autor = Aut;
        paginas = nPags;
        numRefs = "";
        prestamos = 0;
    }
    
    public String dimeAutor()
    {
        return autor;
    }
    
    public String dimeTitulo()
    {
        return titulo;
    }
    
    public int dimePaginas()
    {
        return paginas;
    }
    
    public String dimeDetalles()
    {
        String cadRes="";
        cadRes+="Titulo: ";
        cadRes+=titulo;
        cadRes+=", ";
        cadRes+="Autor: ";
        cadRes+=autor;
        cadRes+=", ";
        cadRes+="Paginas: ";
        cadRes+=paginas;
        
        if(numRefs.length()!=0)
        {
            cadRes+=",";
            cadRes+="Numero de Referencias: ";
            cadRes+=numRefs;
        }
        else
        {
            cadRes+=",";
            cadRes+="ZZZ";
        }
        cadRes+=", ";
        cadRes+="Numero de prestamos: ";
        cadRes+=prestamos;
        return cadRes;
    }
    
    public void cambiaNumRef(String nRef)
    {
        if(nRef.length()>2)
        {
            numRefs = nRef;
        }
        else
        {
            nRef = numRefs;
        }
    }
    
    public String dimeNumRef()
    {
        return numRefs;
    }
    
    public void prestar()
    {
        prestamos+=1;
    }
    
    public int dimePrestamos()
    {
        return prestamos;
    }
    
    
}