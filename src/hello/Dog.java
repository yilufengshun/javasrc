package hello;

abstract class Animal {
	private String name;
	private int age;
	private String brand;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return age;
	}

	public String getBrand() {
		return brand;
	}

	public abstract void track();
}

public class Dog extends Animal {
	Dog() {
	}

	Dog(String name, int age, String brand) {
	//	super(name, age, brand);
	}

	public void track(){
		 			System.out.println( getName()+ "的攻击行为是咬");
		}

	public void main(String[] args){
	Dog dog = new Dog("旺财", 4, "二哈");
	dog.track();
		}

}
