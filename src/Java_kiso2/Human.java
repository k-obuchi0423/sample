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
		System.out.println("���̖��O��"+ name);
		System.out.println("�g����"+ height);
		System.out.println("�̏d��"+ weight);
		System.out.println("�N���"+ age);
	}
}
