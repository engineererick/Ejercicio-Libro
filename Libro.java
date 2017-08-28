public class Libro{
    private String titulo = "";
    private String autor = "";
    private String numRefs = "";
    
    private int paginas;
    private int prestamos;
    
    public Libro(String Titu, String Aut, int nPags){
        titulo = Titu;
        autor = Aut;
        paginas = nPags;
        numRefs = "";
        prestamos = 0;
    }
    
    public String DimeTitulo(){
        return titulo;
    }   
    
    public String DimeAutor(){
        return autor;
    }

    public int DimePaginas(){
        return paginas;
    }
    
    public String DimeDetalles(){
        String cadRes="";
        cadRes+="Titulo: ";
        cadRes+=titulo;
        cadRes+=", ";
        cadRes+="Autor: ";
        cadRes+=autor;
        cadRes+=", ";
        cadRes+="Paginas: ";
        cadRes+=paginas;
        
        if(numRefs.length() != 0){
            cadRes+=",";
            cadRes+="Numero de Referencias: ";
            cadRes+=numRefs;
        }
        
        else{
            cadRes+=",";
            cadRes+="ZZZ";
        }
        
        cadRes+=", ";
        cadRes+="Numero de prestamos: ";
        cadRes+=prestamos;
        return cadRes;
    }
    
    public void CambiaNumRef(String nRef){
        if(nRef.length()>2)
            numRefs = nRef;
        else
            nRef = numRefs;
    }
    
    public String DimeNumRef(){
        return numRefs;
    }
    
    public void Prestar(){
        prestamos+=1;
    }
    
    public int DimePrestamos(){
        return prestamos;
    }
}