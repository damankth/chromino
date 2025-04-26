package chrominox.domains;


import java.util.List;




/**
 * Représente un chromino
 * */
public class Chromino {
	
	
	private final TileType part1;
	private final TileType part2;
	private final TileType part3;
//	private final Chromino chromino;
//	private final Chromino ReverseChromino;
	
	
	public TileType getPart1() {
		return this.part1;
	}
	public TileType getPart2() {
		return this.part2;
	}
	public TileType getPart3() {
		return this.part3;
	}
	// pas sur je dois faire ca //20/04 jenleve le champs name
//	public Chromino(final String name, Set<TileType>tiles) {
//		this.name=requireNonBlank(name);
//		this.tiles=Set.copyOf(tiles);
//		
//		
//	}
	// vrmt pas sur si je dois faire ca 
//	private String requireNonBlank(String value) {
//		if(value == null || value.isBlank()) {
//			throw new IllegalArgumentException("non blank string expected");
//		}
//		
//		return value;
//	}
	// permet de recuperer le name //20/04 jenleve le champs name
//	public String getName() {
//		return name;
//	}
	/**
	 * <strong>À compléter !</strong> Construit le chromino {@code (part1, part2, part3)}.
	 * 
	 * @param part1 le type du premier bloc, non-null
	 * @param part2 le type du second bloc, non-null
	 * @param part3 le type du troisième bloc, non-null
	 * @throws NullPointerException si un des arguments vaut {@code null}.
	 * */
	public Chromino(TileType part1, TileType part2, TileType part3) { // ceci est un constructeur 
		if(part1==null||part2==null||part3==null) {
		throw new NullPointerException(); 
		}
			
		this.part1=part1;
		this.part2=part2;
		this.part3=part3;
	}
	
	/**
	 * cette methode permets de savoir si le chromino existe deja(pt etre enlever le static 
	 * @return
	 */
	
	//refaire regarde pas lobjet 
	public boolean isSame(Chromino chromino, List<Chromino> bagOfChrominos) {
		if(chromino==null|| bagOfChrominos==null) {
			throw new IllegalArgumentException();
			
		}
		Chromino chrominoReverse=chromino.chrominoReverse();
		if(!bagOfChrominos.contains(chromino)&& !bagOfChrominos.contains(chrominoReverse) ) {
			return false;
		}
		return true;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o instanceof Chromino that) {
				return 
				(this.getPart1().equals(that.getPart3())&&
				this.getPart2().equals(that.getPart2()) &&
				this.getPart3().equals(that.getPart1()))||
				(this.getPart1().equals(that.getPart1())&&
				this.getPart2().equals(that.getPart2()) &&
				this.getPart3().equals(that.getPart3()));
				
		}
		return false;
	}
	@Override
	public int hashCode() {
		var result1= 17;
		
		int result2=31*result1+part1.hashCode();
		result2=31*result2+part2.hashCode();
		result2=31*result2+part3.hashCode();

		int result3=31*result1+part3.hashCode();
		result3=31*result3+part2.hashCode();
		result3=31*result3+part1.hashCode();

		return Math.min(result2, result3);
		
	}




	/**
	 * this method is going to return the same chromino in reverse in order to be used in the method the same 
	 * @return
	 */
	public Chromino chrominoReverse() {
		// TODO Auto-generated method stub
		return new Chromino (part3, part2, part1);
	}

	
	
	// une autre methode pour le reverse 
	
}
