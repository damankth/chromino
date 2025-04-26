package chrominox.domains;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;


import org.junit.jupiter.api.Test;

class ChroGameTest {

	
	@Test
	void chroBagNotNull() {
		ChroGame chroGame=new ChroGame();
		assertNotNull(chroGame.getChroBag());
	}
	@Test
	void ChromosaicNotNull() {
		ChroGame chroGame=new ChroGame();
		assertNotNull(chroGame.getChromosaic());
	}
	
	@Test 
	void getTheCameleonChromino(){
		ChroGame chroGame=new ChroGame();
		Chromino firstCameleon= chroGame.getFirstChromino();
		assertEquals(TileType.CAMELEON, firstCameleon.getPart1());
		
	}
//	 @Test
//	    void testCreationOfPlayers() {
//	        assertEquals(2, chroGame.getPlayers().getMyHand().size());
//	    }
	
	@Test
	void testCreateHand() {
		ChroGame chroGame=new ChroGame();
		Set<Chromino>hand=chroGame.createHand();
		assertEquals(5, hand.size());
	}
	
	@Test 
	void whoStarts() {
		ChroGame chroGame=new ChroGame();
		int player= chroGame.whoStarts();
		assertTrue(player==0|| player==1);
		}
//	@Test
//    void testInitializeCamleonChromino() {
//        chroGame.intializeCamleonChromino();
//        assertFalse(chroGame.getChromosaic().isEmptyAt(new Coordinate(0, 0)));
//    }
//	  @Test
//	    void testSelectChrominoAndCoordinate() {
//	        Chromino chromino = chroGame.getFirstChromino();
//	        Coordinate coordinate = new Coordinate(2, 2);
//
//	        chroGame.selectedChromino(chromino);
//	        chroGame.selectPosition(coordinate);
//
//	        assertEquals(chromino, chroGame.getChosenChromino());
//	    }
//
//	    @Test
//	    void testNextTurnChangesPlayer() {
//	        int firstPlayer = chroGame.getCurrentPlayer().getName().equals("Joueur 1") ? 0 : 1;
//	        chroGame.nextTurn();
//	        int secondPlayer = chroGame.getCurrentPlayer().getName().equals("Joueur 1") ? 0 : 1;
//	        assertNotEquals(firstPlayer, secondPlayer);
//	    }
	
	@Test
	void testCreatePlateu() {
		ChroGame chroGame=new ChroGame();
		Chromosaic plateau=chroGame.createPlateau();
		assertNotNull(plateau);
		assertFalse(plateau.getTab().isEmpty());
	}


}
