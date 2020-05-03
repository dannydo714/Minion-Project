//Danny Do
//CS141
//Assignment1
//3-2-18

public class Minion {
	
	//instance variables for name, number of eyes, and catch-phrase
	private String name;
	private int eye;
	private String catchPhrase;
	
	//method for saying catch phrase
	public void sayCatchPhrase()
	{
		System.out.println(this.getName() + "'s catchphrase is: "  + this.getCatchPhrase());
		
	}
	
	//getters and setters for name, number of eyes, and catch-phrase
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEye() {
		return eye;
	}

	public void setEye(int eye) {
		this.eye = eye;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

}
