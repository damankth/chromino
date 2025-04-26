package chrominox.domains;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DefaultChroGameTest {
	 private DefaultChroGameFactory factory;
	 
	  @BeforeEach
	    void setUp() {
	        factory = new DefaultChroGameFactory();
	    }

	  @Test
	  void createGame() {
		  List<String> players = List.of("Joueur1", "Joueur2");
	        ChroGame game = factory.createGame(players);
	        
	        assertFalse(game.getChromosaic().isEmptyAt(new Coordinate(0, 0)));
	    }
	  
}
