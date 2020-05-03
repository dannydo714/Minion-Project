//Danny Do
//CS141
//Assignment1
//3-2-18

public class MinionDemo {
	
	public static void main(String []args) {
		
		//instantiate three minion objects
		Minion minion1 = new Minion();
		Minion minion2 = new Minion();
		Minion minion3 = new Minion();
		
		//Giving names to the minion objects
		minion1.setName("Kevin");
		minion2.setName("Bob");
		minion3.setName("Stuart");
		
		//Giving number of eyes to each of the minion objects
		minion1.setEye(2);
		minion2.setEye(2);
		minion3.setEye(1);
		
		//Giving a String to catchPhrase for each minion object
		minion1.setCatchPhrase("BANANA!");
		minion2.setCatchPhrase("BABOI!");
		minion3.setCatchPhrase("SA LA KA!");
		
		//Printing out minion objects' information
		System.out.println("The first minion is called " + minion1.getName() + ", and he has " + minion1.getEye() + " eyes.");
		System.out.println("The second minion is called " + minion2.getName() + ", and he has " + minion2.getEye() + " eyes.");
		System.out.println("The third minion is called " + minion3.getName() + ", and he has " + minion3.getEye() + " eye.\n");
		
		//calling method sayCatchPhrase to print out each minion and what their catch-phrase is
		minion1.sayCatchPhrase();
		minion2.sayCatchPhrase();
		minion3.sayCatchPhrase();
			}
	}

