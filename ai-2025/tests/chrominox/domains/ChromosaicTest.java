package chrominox.domains;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChromosaicTest {

	private Chromosaic chromosaic;
    private Chromino chromino;
    private Coordinate coord;

    @BeforeEach
    void setUp() {
        chromosaic = new Chromosaic();
        chromino = new Chromino(TileType.RED, TileType.GREEN, TileType.YELLOW);
        coord = new Coordinate(0, 0);
    }
    @Test 
    void testAddChrominoAt() {
    	chromosaic.addChrominoAt(coord, chromino);
    	assertEquals(chromino, chromosaic.getTab().get(coord));
    }
    @Test
    void testCoordinateEmpty() {
    	Coordinate coordinateEmpty=  new Coordinate(5,5);
    	chromosaic.addChrominoAt(coord, chromino);
    	assertTrue(chromosaic.isEmptyAt(coordinateEmpty));
    	assertFalse(chromosaic.isEmptyAt(coord));
    }
    

}
