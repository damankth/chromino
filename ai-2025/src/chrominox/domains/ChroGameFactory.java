package chrominox.domains;

import java.util.List;

public interface ChroGameFactory {
	
	 void newGame(int playersCount);
	
	ChroGame  getLastGame();// creer la calsse chrogame
	
	ChroGame createGame();

	ChroGame createGame(List<String> nbPlayer);
}
