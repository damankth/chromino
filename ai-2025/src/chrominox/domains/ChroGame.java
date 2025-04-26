package chrominox.domains;

import java.util.ArrayList;

import java.util.List;
//import java.util.Map;
import java.util.Random;
//import java.util.Set;
import java.util.Set;

public class ChroGame {
	// a idealement laisser comme ca je pense 
	
	private ChroBag chroBag;
	private List<Player>players;
	private Chromino firstChromino;
	private Chromino chosenChromino;
	private Coordinate chosenCoordinate;//importznt?
	private Chromosaic chromosaic;
	private int currentPlayer;//importznt?
//	private Set<Chromino> personnalHand;
	
	//BON
	public ChroGame(List<String> players) {
		this.chroBag=new ChroBag();
		this.chromosaic=new Chromosaic();
		this.firstChromino=this.chroBag.getFirstCameleonChromino();
		this.players= new ArrayList<>();
		creationOfPlayers();
		this.currentPlayer=whoStarts();
	}
	//BON
	public int whoStarts() {
		Random random= new Random();
		 
		return random.nextInt(players.size());
	}
	public void intializeCamleonChromino() {
		 this.chromosaic.addChrominoAt(new Coordinate(0, 0), firstChromino);
		 
	}
	public ChroBag getChroBag() {
		return chroBag;
	}
	
	public Chromosaic getChromosaic() {
		return chromosaic;
	}
	//BON
	public void creationOfPlayers() {
		//List<Player> playersList=new ArrayList<>();
		
		//for(String nbPlayer: players) {
			//eachone gets a set where he can stock the chrominos gotta add
	
			this.players.add(new Player("Joueur 1", createHand()));
			this.players.add(new Player("Joueur 2", createHand()));
		
	}
	
	public Set<Chromino> createHand() {
		// TODO Auto-generated method stub
		return getChroBag().personnal0Bag();
	}
	//BON
	public ChroGame(){
		this(List.of("Joueur 1", "Joueur 2"));
		}
	//BON
	public Chromino getFirstChromino() {
		return firstChromino;
		
	}
	//BON
	//connait les jouvoideurs
	 public Player getPlayers() {
	       return players.get(nextTurn());
	    }
		
	 //BON
	 //gerer le tour des joueurs
	 public Player getCurrentPlayer() {
		 return players.get(currentPlayer);
	 }
	 //BON
// gerer le tour des joueuers
	 public int nextTurn() {
		 int turn= (currentPlayer+1)%players.size();
		 currentPlayer=turn;
		
		 return currentPlayer;
	 }
	 //BON
// alredy exists in chromosaic
	 //connait le chromino actuelle
	 public void selectedChromino(Chromino chromino) {
		 //removed the if 
		 //if (getCurrentPlayer().getChrominosInHand().contains(chromino)) {
		 this.chosenChromino=chromino;
		 
	 }
	 //BON
	 //connait la position du chromino
	 public void selectPosition(Coordinate position) {
		 this.chosenCoordinate= position;
	 }
	 public void getTheHand() {
		 for(Player player:players) {
			 player.setHand(chroBag.personnal0Bag());
		 }
		 
	 }
	 
	 //BON
	 public Chromosaic createPlateau() {
		 //Chromino chrominoCameleon= firstChromino;
		 intializeCamleonChromino();
		 getTheHand();
		 currentPlayer=whoStarts();
		 //chromosaic.addChrominoAt(new Coordinate(0,0), chrominoCameleon);
		 //players.get(currentPlayer).addAChromino(chosenChromino);
		 return chromosaic;
		 
	 }
	public Chromino getChosenChromino() {
		return chosenChromino;
	}
	public Chromino getdrawChromino() {
		return this.chroBag.getAChromino();
	}
		
	/*
	 * Methode pour demander la main
	 */
	//public void setHand(Set<Chromino> theHand);
	/*
	 * Methode pour creer la chromosaic
	 */
	
	/*
	 * Methode pour appelée le joueur 
	 */
	//public void setPlayer(Player player);
	//public void setChromosaic(Chromosaic chromosaic) {
		
	
	
}
