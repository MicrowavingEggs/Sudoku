package sudoku;

public class Grille {
	Case[][] grille;
	
	
	Grille(Case[][] grille) {
		this.grille = grille;
	}
	
	Case[][] getGrile() {
		return this.grille;
	}
}
