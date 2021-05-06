package Java_kiso2;

public class Human {
	
	String name;
	int height;
	int weight;
	int age;
	
	Human(String name,int height,int weight,int age){
		
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}

	public void introduce() {
		System.out.println("私の名前は"+ name);
		System.out.println("身長は"+ height);
		System.out.println("体重は"+ weight);
		System.out.println("年齢は"+ age);
	}
}
