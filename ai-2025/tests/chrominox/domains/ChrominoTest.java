package chrominox.domains;

import static org.junit.jupiter.api.Assertions.*;




import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

class ChrominoTest {

	
	@Test
	void testChrominoEverythoingIsNull() {
		//Chromino chromino= new Chromino(null, null, null);
		//tagiteratortest
		assertThrows(NullPointerException.class, () -> { 
			new Chromino(null,null, null); 
		});
		assertThrows(NullPointerException.class, () -> { 
			new Chromino(null,TileType.CAMELEON, null); 
		});
		assertThrows(NullPointerException.class, () -> { 
			new Chromino(TileType.MAGENTA,TileType.CAMELEON, null); 
		});
		

	}
	@Test
	void testIsSame() {
		TileType part1 = TileType.RED;
        TileType part2 = TileType.CYAN;
        TileType part3 = TileType.GREEN;
        
        Chromino chromino1 = new Chromino(part1, part2, part3);
        Chromino chromino2 = new Chromino(part3, part2, part1);
        
        List<Chromino> bagOfChrominos=new ArrayList<>();
        
        bagOfChrominos.add(chromino1);
        
        assertTrue(chromino1.isSame(chromino2, bagOfChrominos));
    
       	
	}
	
	@Test
	void testIsSameReturnsTrue() {
		TileType part1 = TileType.RED;
        TileType part2 = TileType.CYAN;
        TileType part3 = TileType.GREEN;
        
        Chromino chromino1 = new Chromino(part1, part2, part3);
        Chromino chromino2 = new Chromino(part3, part2, part1);
        assertEquals(chromino1, chromino2);
	}
	@Test
	void testIsSameReversedReturnsTrue() {
		TileType part1 = TileType.RED;
        TileType part2 = TileType.CYAN;
        TileType part3 = TileType.GREEN;
        
        Chromino chromino1 = new Chromino(part1, part2, part3);
        Chromino chromino2 = new Chromino(part1, part2, part3);
        assertEquals(chromino1, chromino2);
	}
	
	@Test
	void testIsSameNotInBag() {
		TileType part1 = TileType.RED;
        TileType part2 = TileType.CYAN;
        TileType part3 = TileType.GREEN;
        
        List<Chromino> bag=new ArrayList<>();
        Chromino chromino1 = new Chromino(part1, part2, part3);
        Chromino chromino2 = new Chromino(part2, part2, part2);
        bag.add(chromino1);
        assertFalse(chromino2.isSame(chromino2, bag));
	}
	//runs false
	@Test
	void testHashCodeANdEqauls() {
		TileType part1 = TileType.RED;
        TileType part2 = TileType.CYAN;
        TileType part3 = TileType.GREEN;
        
        Chromino chromino1 = new Chromino(part1, part2, part3);
        Chromino chromino2 = new Chromino(part3, part2, part1);
        assertEquals(chromino1.hashCode(), chromino2.hashCode());
	}
	
	
	
//	@Test
//	void testChrominoAlreadyExists() {
//		Chromino chromino1= new Chromino(TileType.CYAN, TileType.CAMELEON, TileType.GREEN);
//		Chromino chromino2= new Chromino(TileType.RED, TileType.YELLOW, TileType.MAGENTA);
//		Chromino chromino3= new Chromino(TileType.GREEN, TileType.CAMELEON, TileType.CYAN);
//		
//		Set<Chromino>bagOfChrominos=Set.of(
//				chromino1,
//				chromino2);
//		
//		assertFalse(chromino3.isSame(chromino3,bagOfChrominos));
//	}	
//	@Test
//	void testChrominoDoesNotExists() {
//		Chromino chromino1= new Chromino(TileType.CYAN, TileType.CAMELEON, TileType.GREEN);
//		Chromino chromino2= new Chromino(TileType.RED, TileType.YELLOW, TileType.MAGENTA);
//		Chromino chromino3= new Chromino(TileType.GREEN, TileType.MAGENTA, TileType.GREEN);
//		
//		Set<Chromino>bagOfChrominos=Set.of(
//				chromino1,
//				chromino2);
//		
//		assertFalse(chromino3.isSame(chromino3,bagOfChrominos));
//	}
//	@Test
//	void testChrominoBagOgChrominosIsNull() {
//		//Chromino chromino1= new Chromino(TileType.CYAN, TileType.CAMELEON, TileType.GREEN);
//		//Chromino chromino2= new Chromino(TileType.RED, TileType.YELLOW, TileType.MAGENTA);
//		Chromino chromino3= new Chromino(TileType.GREEN, TileType.MAGENTA, TileType.GREEN);
//		
//		Set<Chromino>bagOfChrominos=null;
//		
//		assertThrows(IllegalArgumentException.class,()->{
//			chromino3.isSame(null, bagOfChrominos);
//		});
//	}
//	@Test
//	void testChrominoEvrythingIsNull() {
//		//Chromino chromino1= new Chromino(TileType.CYAN, TileType.CAMELEON, TileType.GREEN);
//		//Chromino chromino2= new Chromino(TileType.RED, TileType.YELLOW, TileType.MAGENTA);
//		Chromino chromino3= new Chromino(TileType.GREEN, TileType.MAGENTA, TileType.GREEN);
//		
//		//Set<Chromino>bagOfChrominos=null;
//		
//		assertThrows(IllegalArgumentException.class,()->{
//			chromino3.isSame(null, null);
//		});
//	}
}


