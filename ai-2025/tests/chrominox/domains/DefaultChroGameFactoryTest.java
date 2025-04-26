package chrominox.domains;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class DefaultChroGameFactoryTest {
    @Test
    public void testFactoryCreatesValidGame() {
        ChroGameFactory factory = new DefaultChroGameFactory();
        assertNotNull(factory.getLastGame(), "LastGame should not be null");
        assertNotNull(factory.createGame(), "NewGame should not be null");
    }
}