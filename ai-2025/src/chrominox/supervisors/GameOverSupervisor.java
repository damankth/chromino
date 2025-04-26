package chrominox.supervisors;

import java.util.Objects;

import chrominox.domains.ChroGameFactory;
import chrominox.supervisors.commons.ViewId;

/**
 * Affiche les scores des joueurs et désigne le vainqueur.
 * */
public class GameOverSupervisor extends Supervisor {
	//private final ChroGameFactory factory;
	private GameOverView view;
	
	public GameOverSupervisor(/**ChroGameFactory factory**/) {
		//this.factory = Objects.requireNonNull(factory);
	} 
	public void setView(GameOverView view) {
		this.view=Objects.requireNonNull(view);
	}
	
	/**
	 * {@inheritDoc}
	 * */
	@Override
	public void onEnter(ViewId fromView) {
		if(fromView == ViewId.PLAY_GAME) {
			//TODO: afficher les scores des joueurs
			
			//TODO: afficher le vainqueur
			this.view.setWinner(null);
		}
	}

	/**
	 * Appelée par la vue quand l'utilisateur souhaite revenir au menu principal.
	 * */
	public void onGoToMainMenu() {
		//TODO: naviguer vers le menu principal
		this.view.goTo(ViewId.MAIN_MENU);
	}
}
