package ClassworkCat;

public class Cat {

	public int age;
	public double money;
	public String nickname;
	public char Initials;
	public boolean IsHomeAnimal;

	public Cat() {

	}

	public Cat(String nickname) {
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void grow() {
		age++;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public void setInitials(char initials) {
		this.Initials = Initials;
	}

	public char getInitials() {
		return Initials;
	}

	public void setIsHomeAnimal(boolean isHomeAnimal) {
		this.IsHomeAnimal = isHomeAnimal;
	}

	public boolean getIsHomeAnimal() {
		return IsHomeAnimal;
	}
	
	public void sleep() {
		System.out.println("Кот спит");
	}

	public void eat() {
		System.out.println("Кот ест");
	}

	public void walk() {
		System.out.println("Кот гуляет");
	}
}
