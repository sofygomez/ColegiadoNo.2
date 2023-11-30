
package colegiadono.pkg2;

import javax.swing.JOptionPane;



public class ColegiadoNo2 {

    
    public static void main(String[] args) { 
        
       canciones [] top10canciones = new canciones [10];
       
       top10canciones[0] = new cancion ("0","CODE MISTAJE","CORPSE&BMTH","2:45","2023");
       top10canciones[1] = new cancion ("1","Shivering","ILLENIUM&SpiritBox","4:59","2023");
       top10canciones[2] = new cancion ("2","DOA","I Prevail","3:15","2019");
       top10canciones[3] = new cancion ("3","Another Life","Motionless In White","3:24","2019");
       top10canciones[4] = new cancion ("4","Gasoline","I Prevail","2:32","2019");
       top10canciones[5] = new cancion ("5","Almost Easy","Avenged Sevenfold","3:52","2007");
       top10canciones[6] = new cancion ("6","Just Pretend","Bad Omens","3:22","2022");
       top10canciones[7] = new cancion ("7","Take Me Firts","Bad Omens","3:17","2022");
       top10canciones[8] = new cancion ("8","Popular Monster","Falling In Reverse","3:39","2019");
       top10canciones[9] = new cancion ("9","Purity","Slipknot","4:03","1999");
       top10canciones[10] = new cancion ("10","You Asked for It","Emmure","1:31","2017");
       
       int anioactual= 2023;
       for (canciones canciones : canciones) { 
           if  (canciones.getAnioDeCreacion () == anioActual) 
         System.out.println(canciones.getTitulo);   
         
     }//Fin del For
       
       for (canciones canciones : canciones) 
           if  (canciones.getAnioDeCreacion () > anioActual){ 
         System.out.println(canciones.getTitulo); }  
         
     }//Fin del For
       
       for (cancion cancion : canciones) { 
           if  (cancion.getAnioDeCreacion () == anioActual) 
         System.out.println(canciones.getTitulo);   
         
     }//Fin del For
       cacniones cancionesDeMayorDuracion = canciones [0]{ 
       for (cancion cancion : canciones) 
           if  (cancion.getAnioDeCreacion () == anioActual) 
         System.out.println(canciones.getTitulo);   
         
     }//Fin del For
       
       
       
       
       
    }
    
}
