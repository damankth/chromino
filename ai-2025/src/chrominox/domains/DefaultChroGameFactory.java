package chrominox.domains;

import java.util.List;

public class DefaultChroGameFactory  implements ChroGameFactory{
	List<String>nbPlayer;
	private ChroGame lastGame;
	
	
	//BON
	public DefaultChroGameFactory() {
	    this.lastGame = createGame();
	    this.nbPlayer = List.of("Joueur 1", "Joueur 2");
	}
	//BON
	@Override
   public void newGame(int playersCount) {  
   }
	//BON
	public ChroGame createNewGame() {
	    return createGame(); 
	}
	//BON
	@Override
	public ChroGame  getLastGame(){
		return lastGame;
	}
	//BON
	@Override
	public ChroGame createGame() {
		this.lastGame= new ChroGame(nbPlayer);
		this.lastGame.intializeCamleonChromino();
		return this.lastGame;
	}
	 
	public ChroGame createGame(List<String>nbPlayer) {
	this.nbPlayer=nbPlayer;
		return createGame();
	}
	
	
}
