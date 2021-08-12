package Nivell1Fase1;

public class NewMain {

    public static void main(String[] args) {
        
        //Excepció
        try {
            
            //Instanció de clase Coets
            Coets coets = new Coets("32WESSDS", 3);
            
            //Sortida de dades per consola
            System.out.println(coets.toString());
            
        } catch (Exception e) {
               
            e.printStackTrace();
        
        }

	try {
            
            Coets coets2 = new Coets("LDSFJA32", 6);
            
            System.out.println(coets2.toString());
            
        } catch (Exception e) {
                e.printStackTrace();
        
        }

    }

}

    
