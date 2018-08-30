
public class Alumno
{ private String nombre;
  private int clave;
    
  
  
  public  Alumno(String nombre,int clave)
  {
      
     this.nombre=nombre;
     this.clave=clave;
      
      
      
  }
    
    
   public String dimeElNombre()
   
   {
       return nombre;
       
       
    }
    public int dimeLaClave()
   
   {
      return clave;
       
       
    }
   
    public String toString()//duda
    {
        String aux="\nnombre: "+nombre+"\nclave: "+clave;
        return aux;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}