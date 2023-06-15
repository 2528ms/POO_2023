import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MapaMundial {
    
    private List<Continente> continentes = new ArrayList<Continente>();
    
    private List<Pais> paisesAmerica = new ArrayList<Pais>();
    private List<Pais> paisesEuropa = new ArrayList<Pais>();
    private List<Pais> paisesAsia = new ArrayList<Pais>();
    private List<Pais> paisesAfrica = new ArrayList<Pais>();
    private List<Pais> paisesOceania = new ArrayList<Pais>();
    private List<Pais> paisesAntartida = new ArrayList<Pais>();

    private List<Pais> paisesMundiales = new ArrayList<Pais>();


    
    
    
    public void inicializar() {
        
      

        /*Instanciamos e inicializamos los continentes */
        continentes.add(new Continente("America", paisesAmerica));
		continentes.add(new Continente("Europa", paisesEuropa));
		continentes.add(new Continente("Asia", paisesAsia));
		continentes.add(new Continente("Africa", paisesAfrica));
		continentes.add(new Continente("Oceania", paisesOceania));
		continentes.add(new Continente("Antartida", paisesAntartida));

        /*Instanciamos e inicializamos los Paises */
		Pais argentina = new Pais("Argentina", "Buenos Aires");
        Pais uruguay = new Pais("Uruguay", "Montevideo");
        Pais brazil = new Pais("Brazil", "Rio de Janeiro");
        Pais chile = new Pais("Chile", "Santiago");
        Pais paraguay = new Pais("Paraguay", "Asuncion");
        Pais bolivia = new Pais("Bolivia", "Santa Cruz de las sierras");
        Pais espania = new Pais("Espania", "Madrid");
        Pais francia = new Pais("Francia", "Paris");
        Pais italia = new Pais("Italia", "Roma");
        Pais portugal = new Pais("Portugal", "lisboa");

        /*Agregamos los paises al continente que pertenecen */
        /*America */
        paisesAmerica.add(argentina);
        paisesAmerica.add(uruguay);
        paisesAmerica.add(chile);
        paisesAmerica.add(paraguay);
        paisesAmerica.add(bolivia);
        paisesAmerica.add(brazil);
        /*Europa */
        paisesEuropa.add(espania);
        paisesEuropa.add(francia);
        paisesEuropa.add(italia);
        paisesEuropa.add(portugal);
    

        /* Instanciamos e Inicializamos las Provincias */
		argentina.add(new Provincia("Entre Rios", argentina));
		argentina.add(new Provincia("Buenos Aires", argentina));
        argentina.add(new Provincia("Santa Fé", argentina));
        argentina.add(new Provincia("Corrientes", argentina));
        argentina.add(new Provincia("Córdoba", argentina));

        uruguay.add(new Provincia("Salto", uruguay));
        uruguay.add(new Provincia("Paysandú", uruguay));
        uruguay.add(new Provincia("Canelones", uruguay));
        uruguay.add(new Provincia("Rocha", uruguay));
        uruguay.add(new Provincia("Maldonado", uruguay));

        espania.add(new Provincia("Barcelona", espania));
        
        /* Instanciamos e Inicializamos los paices limitrofes para cada pais */
        argentina.add(new Frontera(argentina,uruguay,"Rio"));
        argentina.add(new Frontera(argentina,chile,"Montania"));
        argentina.add(new Frontera(argentina,brazil,"Rio"));

        espania.add(new Frontera(espania,francia,"Suelo"));
        espania.add(new Frontera(espania,portugal,"Suelo"));

        
              

	}

    
	public List<Pais> getPaises(String continent) {
		Iterator<Continente> iterator = continentes.iterator();
		while (iterator.hasNext()) {
			Continente continente = iterator.next();
			if (continente.getNombre().equalsIgnoreCase(continent)) {
				return continente.getPaises();
			}
		}
		return new ArrayList<Pais>();
	}
    
    public List<Frontera> gettLimitrofes(String pais){
        paisesMundiales.addAll(paisesAmerica);
        paisesMundiales.addAll(paisesEuropa);
        paisesMundiales.addAll(paisesAsia);
        paisesMundiales.addAll(paisesAfrica);
        paisesMundiales.addAll(paisesOceania);
        paisesMundiales.addAll(paisesAntartida);

        Iterator<Pais> iterator = paisesMundiales.iterator();
		while (iterator.hasNext()) {
			Pais paises = iterator.next();
			if (paises.getNombre().equalsIgnoreCase(pais)) {
				return paises.getFronteras();
			}
		}
		return new ArrayList<Frontera>();
    }
    
    public List<Provincia> gettProvincias(String pais){
        paisesMundiales.addAll(paisesAmerica);
        paisesMundiales.addAll(paisesEuropa);
        paisesMundiales.addAll(paisesAsia);
        paisesMundiales.addAll(paisesAfrica);
        paisesMundiales.addAll(paisesOceania);
        paisesMundiales.addAll(paisesAntartida);

        Iterator<Pais> iterator = paisesMundiales.iterator();
		while (iterator.hasNext()) {
			Pais paises = iterator.next();
			if (paises.getNombre().equalsIgnoreCase(pais)) {
				return paises.getProvincias();
			}
		}
		return new ArrayList<Provincia>();
    }
    

   

       
    

    /* Falta implementar este metodo!!
    public List<Provincia> getProvincias(String paisBuscado) {
        Iterator<Continente> iterator = continentes.iterator();
		while (iterator.hasNext()) {
            Continente continente = iterator.next();
            for (Continente c: continentes) { 
                for ( Pais p: c.getPaises()){
                    if (p.getNombre().equalsIgnoreCase(paisBuscado)) {
                        return p.getProvincias();
                    }
                }
            }
        }
        return new ArrayList<Provincia>();
    }
    */
   

}