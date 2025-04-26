package chrominox.domains;

public class Coordinate {
	private int x;
	private int y;
	//private int coordinate[][];
	
	// faire la methode rotate 
	
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	/// je sais pas si il fait ajouter ou pas ?
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof Coordinate)) {
	        	return false;
	        }
	        Coordinate other = (Coordinate) o;
	        return this.x == other.x && this.y == other.y;
	    }
//	public int[][] getCoordinate() {
//		return coordinate;
//	}
//	public void setCoordinate(int coordinate[][]) {
//		this.coordinate = coordinate;
//	}

}
