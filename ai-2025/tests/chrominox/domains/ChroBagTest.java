package chrominox.domains;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

class ChroBagTest {

//	@Test
//	void testIsACameleonChromino() {
//		Chromino chromino1= new Chromino(TileType.CYAN, TileType.CAMELEON, TileType.GREEN);
//		Chromino chromino2= new Chromino(TileType.RED, TileType.YELLOW, TileType.MAGENTA);
//		Chromino chromino3= new Chromino(TileType.GREEN, TileType.CAMELEON, TileType.CYAN);
//		
//		ChroBag chroBag = new ChroBag();
//		
//		assertTrue(ChroBag.isACameleonChromino(chromino3));
//		assertFalse(ChroBag.isACameleonChromino(chromino2));
//	}
	
	@Test 
	void GenerateABagOf125() {
		 ChroBag chroBag = new ChroBag();
		 List<Chromino>myBag= chroBag.generateAllCombinationOfChrominos125();
		 
		 assertEquals(125, myBag.size());
		 
	}
	@Test 
	void GenerateABagOfCameleonChrominos25() {
		 ChroBag chroBag = new ChroBag();
		 List<Chromino>myBag= chroBag.generateAllCombinationOfCameleonChrominos25();
		
		 assertEquals(25, myBag.size());
	}
	
	@Test 
	void testBagWithoutCameleonDuplicates() {
		 ChroBag chroBag = new ChroBag();
		 List<Chromino>myBag= chroBag.chroBagWithoutCameleonDuplicates();
		
		 assertEquals(10,myBag.size());
	}
	
	@Test 
	void testBagChoose5RandomCameleonChromino() {
		 ChroBag chroBag = new ChroBag();
		 List<Chromino>myBag= chroBag.choose5RandomCameleonChrominos();
		
		 assertEquals(5,myBag.size());
	}	
	@Test 
	void testgetFirstCameleonChromino() {
		 ChroBag chroBag = new ChroBag();
		 Chromino chromino= chroBag.getFirstCameleonChromino();
		
		 assertEquals(TileType.CAMELEON, chromino.getPart2());
	}
	@Test 
	void testgetAChromino() {
		 ChroBag chroBag = new ChroBag();
		 Chromino chromino= chroBag.getAChromino();
		
		 assertNotNull(chromino);
	}
	void testPersonnalBag() {
		 ChroBag chroBag = new ChroBag();
		 Set<Chromino> personnalBag=chroBag.personnal0Bag();
		
		 assertEquals(10, personnalBag.size());
	}
	void testIsACameleonChromino() {
		 ChroBag chroBag = new ChroBag();
		 
		 Chromino chromino1= new Chromino(TileType.CYAN, TileType.CAMELEON, TileType.GREEN);
		 Chromino chromino2= new Chromino(TileType.RED, TileType.CYAN, TileType.MAGENTA);
		
		
		 assertTrue(chroBag.isACameleonChromino(chromino1));
		 assertFalse(chroBag.isACameleonChromino(chromino2));
	}
	
	
	
}
