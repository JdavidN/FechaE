public class TestFecha 
{
    public static void main(String[] args)
    {
        Fecha f= new Fecha(2, 10, 1970);
        f.setDia(2);
        f.setMes(10);
        f.setAnio(1980);

        Fecha f2= new Fecha(2,9,1980);
        f2.setDia(2);
        f2.setMes(9);
        f2.setAnio(1980);

        System.out.println("Dia = " + f.getDia());
        System.out.println("Mes = " + f.getMes());
        System.out.println("Año = " + f.getAnio());
        System.out.println(f);
        System.out.println("Dia = " + f2.getDia());
        System.out.println("Mes = " + f2.getMes());
        System.out.println("Año = " + f2.getAnio());
        System.out.println(f2);

        if(f.equals(f2))
        {
           System.out.println("Las fechas son iguales");
        }
        else
        {
            System.out.println("Las fechas son diferentes");
        }


        
        


    }
}