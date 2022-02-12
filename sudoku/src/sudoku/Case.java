package sudoku;

public class Case {
	int val;
	boolean isEmpty;

	Case() {
		this.val = -1;
		this.isEmpty = true;
	}
	
	Case(int val) {
		this.val = val;
		this.isEmpty = false;
	}
	
	int getVal() {
		if (this.isEmpty)
		{
			throw new IllegalArgumentException("Case Vide");
		}
		return this.val;
	}
	
}
