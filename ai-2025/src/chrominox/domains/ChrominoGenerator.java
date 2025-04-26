package chrominox.domains;

import java.util.List;

/**
 * Décrit comment générer une liste de chrominos.
 * <p>
 * Nous avons choisi une liste pour préserver la position occupée par chaque chrominos.
 * </p>
 * <p>
 * Notre implémentation fournit une liste de chromino dans un ordre précis.
 * </p>
 * <p>
 * Vous devrez fournir une second implémentation pour générer les chrominos dans un ordre aléatoire.
 * </p> 
 * */
public interface ChrominoGenerator {
	/**
	 * Retourne une liste de 80 nouveaux chrominos.
	 * */
	List<Chromino> generateChrominoes();
	
	
}
