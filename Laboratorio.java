import java.util.ArrayList; 

public class Laboratorio
{
    private ArrayList<Alumno> alumnos;
    
    
    
    public Laboratorio()
    {
     
        alumnos= new ArrayList<Alumno>();
        
        
    }
    
   
    public void daDeAlta(String nombre,int clave)
    {
        Alumno alumno =new Alumno(nombre,clave);
        
        alumnos.add(alumno);
        
    }
    
    
     
    public void darDeBaja(int clavebaja)
    { boolean retiro =false ;
        
        for(int i=0;i<alumnos.size()&& retiro !=false;i++)
        {
            
            Alumno aux = alumnos.get(i);
            if(aux.dimeLaClave()==clavebaja)
            {
                alumnos.remove(i);
                retiro=true;
            }
            
        }
        
        
    }
    
    public void imprimir()
    {   System.out.printf("Alumnos incritos");
        
        for(int i=0;i<alumnos.size();i++)
        {
            Alumno imprimir= alumnos.get(i);
            System.out.println(imprimir);
            
            
            
        }
        
        
   }
    
}