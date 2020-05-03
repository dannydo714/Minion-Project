
public class Driver {

	public static void main(String[] args) {
		Student s1 =  new Student();
		
		s1.setName("Sam");
		s1.setAddres("West temple Pomona");
		
		System.out.println("hi " + s1.getName());
		
		Student student2 = new Student();
		student2.setName("Nancy");
		student2.setAddres("LA");
		
		System.out.println("hi "+ student2.getName());
	}

}
