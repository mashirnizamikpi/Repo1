package oops;

public abstract class Transport {
	
	 String regno;
	 int model;
	 abstract int registry();
	
	public String regno() {
		return regno;
	}
	public void  setregno(String regno) {
		this.regno =  regno;
	}
	public int getmodel() {
		return model;
}
	public void  setmodel(int model) {
		this.model =  model;
	}
}