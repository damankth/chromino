package chrominox.domains;

import java.util.HashMap;
import java.util.Map;

public class Chromosaic {
	// ou pt etre faire un stack plus interresant?
	private Map<Coordinate, Chromino> myTab;// arrayslist ou tableau ? 
	//private  Chromino chromino;
	//a faire
	//private  boolean isEmpty;
	//BON
	public Chromosaic () {
		myTab=new HashMap<>();
		
	}
	//BON// remplacer par la method en bas
//	public void addChrominoAt(Coordinate cord, Chromino chromino) {
//		myTab.put(cord, chromino);
//		}
	//BON
	 public boolean isEmptyAt(Coordinate coord) {
		 if(myTab.containsKey(coord)) {
			 return false;
		 }
		 return true;
	 }
	 //BON
	public Map<Coordinate, Chromino> getTab() {
		return  myTab;
	}
	public void addChrominoAt(Coordinate cord, Chromino firstChromino) {
		// TODO Auto-generated method stub
		myTab.put(cord, firstChromino);

	}

}
