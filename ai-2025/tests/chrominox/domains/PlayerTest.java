package chrominox.domains;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerTest {

	private Player player;
	private Chromino chromino1;
	private Chromino chromino2;
	private Set<Chromino> hand;
	
	@BeforeEach
	void Player() {
		chromino1=new Chromino(TileType.RED, TileType.CYAN, TileType.YELLOW);
		chromino2=new Chromino(TileType.GREEN, TileType.RED, TileType.YELLOW);
		
		hand = new HashSet<>();
		hand.add(chromino1);
		hand.add(chromino2);
		player= new Player("Joueur1", hand);
	}
	@Test
	void getTheName() {
		assertEquals("Joueur1", player.getName());
	}
	@Test 
	void testhandNotEmptty() {
		assertFalse(player.handIsEmpty());
	}
	 @Test
	    void testhandAllEmprty() {
		
		 player.removeAChromino(chromino1);
		 player.removeAChromino(chromino2);
		 
		 assertTrue(player.handIsEmpty());
		 
	        
	    }
	@Test
	void getThehand() {
		assertEquals(2, player.getMyHand().size());
	}
	@Test
	void testIsActive() {
		assertTrue(player.isActive());
		
	}
	 @Test
	    void testAddChromnioSame() {
		 Chromino chromino5=new Chromino(TileType.GREEN, TileType.RED, TileType.YELLOW);
		 player.addAChromino(chromino5);
		 
		 assertTrue(player.getMyHand().contains(chromino5));
		 assertEquals(2, player.getMyHand().size());
	        
	    }
	 @Test
	    void testAddChromnio() {
		 Chromino chromino5=new Chromino(TileType.GREEN, TileType.CYAN, TileType.YELLOW);
		 player.addAChromino(chromino5);
		 
		 assertTrue(player.getMyHand().contains(chromino5));
		 assertEquals(3, player.getMyHand().size());
	        
	    }
	 @Test
	    void testRemoveChromno() {
		 
		 player.removeAChromino(chromino1);
		 
		 assertFalse(player.getMyHand().contains(chromino1));
		 assertEquals(1, player.getMyHand().size());
	        
	    }
	 @Test
	    void testDrawAChromino() {
		ChroBag chroBag=new ChroBag();
		int handSize= player.getMyHand().size();
		 
		player.drawAChromino(chroBag);
		
		 assertEquals(handSize+1, player.getMyHand().size());
	        
	    } 
	 

	
	 


}
