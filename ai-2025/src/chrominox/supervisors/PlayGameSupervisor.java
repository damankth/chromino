package chrominox.supervisors;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

import chrominox.domains.*;
import chrominox.supervisors.PlayGameView.ViewMode;
import chrominox.supervisors.commons.ViewId;

public class PlayGameSupervisor extends Supervisor {

	private PlayGameView view;
	private ChroGameFactory factory;
	private ChroGame currentGame;
	private ChroBag chroBag;
	private Set<Chromino> theHand;
	private Chromino myChromino;
	private Chromosaic chromosaic;
	private Chromino chosenChromino;
	private int x;
	private int y;
	private String part1;
	private String part2; 
	private String part3;
	private Player currentPlayer;
	//private ChroGameFactory factory;
	
//	public PlayGameSupervisor(/**ChroGameFactory factory**/) {
//		//this.factory = Objects.requireNonNull(factory);
//		this.currentGame=factory.createGame();
//		//this.currentGame = factory.createGame();
//	}
	public PlayGameSupervisor() {
		// TODO Auto-generated constructor stub
	}
	public void setView(PlayGameView view) {
		this.view = Objects.requireNonNull(view);
	}
	
	@Override
	public void onEnter(ViewId fromScreen) {
		//ajout
		this.currentGame=factory.getLastGame();
		if(this.currentGame==null) {
			this.currentGame=factory.createGame();
		}
		if (fromScreen == ViewId.MAIN_MENU) {
			//TODO: connaître le joueur actif
			//this.currentGame=this.factory.getLastGame();
			
			this.currentPlayer= this.currentGame.getCurrentPlayer();
			//this.view.setPlayer(player);
			//TODO: dessiner la main du joueur actif
			this.theHand=this.currentGame.createHand();
			//this.view.setHand(theHand);
			//TODO: dessiner la mosaique
			this.chromosaic= currentGame.getChromosaic();
			//this.view.setChromosaic(chromosaic);
			
		}
		draw();
	}

	private void draw() {
		view.startDraw();

		drawBoard();
		drawHand();

		view.endDraw();
	}

	private void drawBoard() {
		//TODO: dessiner les tuiles de la mosaique
		
		//TODO: dessiner le chromino à poser
		
		Chromino chromino=this.currentGame.getFirstChromino();
		view.addToBoard(chromino.getPart1().toString(), "BLACK", 0, -1);
		view.addToBoard(chromino.getPart2().toString(), "BLACK", 0, 0);
		view.addToBoard(chromino.getPart3().toString(), "BLACK", 0, 1);
//		view.addToBoard(TileType.CYAN.toString(), "BLACK",  0, -1);
//		view.addToBoard(TileType.CAMELEON.toString(), "BLACK",  0, 0);
//		view.addToBoard(TileType.RED.toString(), "BLACK",  0, 1);
	}

	// elle va permetre de dessiner les  
	private void drawHand() {
		//TODO: dessiner les tuiles de la main du joueur actif
		//for(int i=0; i<this.theHand.size();i++) {
		Iterator<Chromino>iterator= theHand.iterator();
			//Chromino chrominoOfHand=this.theHand.get(i);
		while(iterator.hasNext()) {
			Chromino chromino=iterator.next();
			view.addToHand(chromino.getPart1().toString(), 
				//TileType.MAGENTA.toString(), 
				chromino.getPart2().toString(),//modifier par moi
				chromino.getPart3().toString(),
				"black");
		}
		
		
	}

	/**
	 * Méthode appelée par la vue pour déplacer le chromino actif sur la mosaique de {@code dr} ligne et de {@code dc} colonnes.
	 * */
	public void onMove(int dr, int dc) {
		//TODO: déplacer la position du chromino actif
		//this.myChromino;
		
		view.addToBoard(myChromino.getPart1().toString(), "PINK", dr, dc-1);
		view.addToBoard(myChromino.getPart2().toString(), "PINK", dr,dc);
		view.addToBoard(myChromino.getPart3().toString(), "PINK", dr, dc+1);

		//TODO: rafraichier la vue
		view.startDraw();
	}

	/**
	 * Méthode appelée par la vue pour effectuer une rotation de 90 du chromino actif.
	 * */
	public void onRotate() {
		//TODO: effectuer une rotation de 90° du chromino actif
		
		//TODO: rafraichier la vue
	}

	/**
	 * Méthode appelée par la vue quand le joueur souhaite ajouter son chromino à la mosaique.
	 * */
	public void onConfirm() {
		//TODO: ajouter le chromino sélectionné à la mosaique
		this.view.addToBoard(this.part1, "BLACK",this.x, this.y-1);
		this.view.addToBoard(this.part2, "BLACK",this.x, this.y);
		this.view.addToBoard(this.part3, "BLACK",this.x, this.y+1);
		
		//TODO: rafraichier la vue
		this.view.startDraw();;
		
	}

	/**
	 * Méthode appelée par la vue quand le joueur souhaite passer son tour.
	 * */
	public void onPass() {
		//TODO: gérer le passement de tour.
		this.currentPlayer=currentGame.getPlayers();
		//view.setPlayer(currentPlayer);
		
		//TODO: rafraichier la vue
		this.view.startDraw();
	}


	/**
	 * Appelée par la vue quand le joueur souhaite passer au chromino suivant.
	 * */
	public void onSelectNextPiece() {
		//TODO: passer au chromino suivant
		this.chosenChromino=currentGame.getChosenChromino();
		//TODO: rafraichier la vue
		this.view.startDraw();
	}

	/**
	 * Appelée dans le mode {@code BOARD} si le joueur souhaite changer de pièce.
	 * */
	public void onBack() {
		//TODO: basculer dans le mode HAND
		this.view.switchMode(ViewMode.HAND);
		
		
		//TODO: rafraichier la vue
		this.view.startDraw();
	}

	/**
	 * Appelée si le joueur souhaite piocher un nouveau chromino
	 * */
	public void onPick() {
		//TODO: gérer la pioche d'un chromino
		//this.currentGame.getdrawChromino();
		Chromino newChromino = this.currentGame.getdrawChromino();
		this.theHand.add(newChromino);
		
		//TODO: rafraichier la vue
		this.view.startDraw();
	}

	/**
	 * Appelée dans le mode {@code HAND} si le joueur a choisi son chromino.
	 * */
	public void onPieceSelected() {
		//TODO: basculer dans le mode BOARD
		this.view.switchMode(ViewMode.BOARD);
		
		
		//TODO: rafraichier la vue
		this.view.startDraw();
	}

}
