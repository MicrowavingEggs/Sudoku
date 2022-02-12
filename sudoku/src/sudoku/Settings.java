package sudoku;

public class Settings {
	int w;
	int h;
	boolean isFullscreen;
	
	Settings(int w,int h ,boolean isFullscreen){
		this.w = w;
		this.h = h;
		this.isFullscreen = isFullscreen;
	}
	Settings(){
		this.w = 800;
		this.h = 600;
		this.isFullscreen = false;
	}

	int getWidth() {
		return this.w;
	}
	
	int getHeight() {
		return this.h;
	}
	
	boolean isFullscreen() {
		return this.isFullscreen;
	}
	
	void setWidth(int w) {
		this.w = w;
	}
	
	void setHeight(int h) {
		this.h = h;
	}
	
	void enableFullscreen() {
		this.isFullscreen = true;
	}
	
	void disableFullscreen() {
		this.isFullscreen = false;
	}
}
