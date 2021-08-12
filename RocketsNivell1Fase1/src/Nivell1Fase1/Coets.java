package Nivell1Fase1;

public class Coets {
    
    // Declaració de variables de clase
    private String idCodi;
    private int nombrePropulsors;
	
        // Declaració de constructor i inicialització de variables
	public Coets(String idCodi, int nombrePropulsors) throws Exception {
		this.idCodi = idCodi;
		this.nombrePropulsors = nombrePropulsors;
		
                // Excepció per a identificador de codi
		if(idCodi.length()!=8) throw new Exception("L´identificador de codi no té vuit caràcters!");
	}

        public String getIdCodi() {//Getter
		return idCodi;
	}

        public void setIdCodigo(String idCodi) {//Setter
		this.idCodi = idCodi;
	}

        public int getNombrePropulsors() {//Getter
		return nombrePropulsors;
	}

        public void setNombrePropulsors(int nombrePropulsors) {//Setter
		this.nombrePropulsors = nombrePropulsors;
	}

        @Override
	public String toString() {
		return "Rocket id=" + idCodi + ": té " + nombrePropulsors +
                        " propulsors";
	}

}

    
