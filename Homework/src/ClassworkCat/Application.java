package ClassworkCat;

public class Application {
	public static void main(String[] args) { 
	
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		cat1.nickname = "Clown";
			
		cat2.eat();
		cat2.sleep();
		cat2.walk();

		cat1.grow();
		cat1.grow();
		cat1.grow();
		
		System.out.println(cat1.nickname+" age is "+cat1.getAge());
		
	}
}
