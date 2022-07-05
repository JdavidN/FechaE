public class Fecha
{
    //----------
    // Atributos
    //---------
    private int dia;
    private int mes;
    private int anio;
    

    //---------
    // Metodos

    
    //---------
    //  constructor
    public Fecha(int d, int m, int a)
    {
        this.dia=d;
        this.mes=m;
        this.anio=a;
    }

    //Metodos de acceso
    public int getDia() 
    {
        return dia;
    }
    public int getAnio() 
    {
        return anio;
    }
    public void setAnio(int anio) 
    {
        this.anio = anio;
    }
    public int getMes() 
    {
        return mes;
    }
    public void setMes(int mes) 
    {
        this.mes = mes;
    }
    public void setDia(int dia) 
    {
        this.dia = dia;
    }

    public String toString()
    {
        return dia + "/" + mes + "/" + anio;
        
    }

    public boolean equals(Object o)
    {
        Fecha otra= (Fecha)o;
        return (dia == otra.dia) && (mes == otra.mes) && (anio == otra.anio);
    }
    
    public void addDias(int d)
    {
        
    }


    private Integer fechaToDias()
    {

    }


    private Integer diasToFecha()
    {

    }
    
}