
package g4s21p8vmm;

import java.util.StringTokenizer;

public class JRespuestas {

    String[] respuestas = {
      "Barcelona","Rusia","China","Nueva York","Napoles"
    };
    
    String[] radioR = {
        "Barcelona,Paris,Napoles,Moscow",
        "Japon,México,Rusia,China",
        "Japon,México,Rusia,China",
        "Nueva York,CDMX,Buenos Aires,Londres",
        "Barcelona,Paris,Napoles,Moscow"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
