package chrominox.supervisors;

import java.util.*;

import chrominox.domains.ChroGameFactory;
import chrominox.supervisors.commons.ViewId;

public final class MainMenuSupervisor extends Supervisor {
	public static final String NEW_CLASSIC_GAME = "Partie classique";
	public static final String NEW_FAST_GAME= "Partie rapide";
	public static final String QUIT = "Quitter";
	//private final ChroGameFactory factory;// pas sur que ca doit etre comme ca 
	
	private final List<String> items = List.of(NEW_CLASSIC_GAME,NEW_FAST_GAME,QUIT);
	private MainMenuView view;
	private final ChroGameFactory factory;
	
	public MainMenuSupervisor(ChroGameFactory factory) {
		this.factory=Objects.requireNonNull(factory);
		
	}

	public void setView(MainMenuView screen) {
		this.view = screen;
		this.view.setItems(items);
	}

	/**
	 * Méthode appelée par la vue quand l'utilisateur a choisi un item.
	 * 
	 * @param selected la position de l'item dans la liste reçue par la vue.
	 * */
	public void onItemSelected(int selected) {
		Objects.checkIndex(selected, items.size());
		var item = items.get(selected);
		
		if(QUIT.equals(item)) {
			this.view.onQuitConfirmed(ViewId.MAIN_MENU);
		} 
		else if(NEW_CLASSIC_GAME.equals(item))  {
			//TODO: créer une nouvelle partie
			this.factory.createGame();
			//TODO: naviguer vers la vue "Nouvelle partie"
			this.view.goTo(ViewId.PLAY_GAME);// pas sur que c'est sur PLAY_GAME QUE JE DOIS ATTERIR 
		}
		else if(NEW_FAST_GAME.equals(item)) {
			//TODO(surement le mm que au dessus)
			this.factory.createGame();
			//TODO( jai mis le meme que celui de au dessus pour le moment)
			// jai aussi enlever le if elspour que faire des if 
			this.view.goTo(ViewId.PLAY_GAME);
		}
	
		
		
	}


}
