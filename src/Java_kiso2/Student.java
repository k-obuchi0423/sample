package Java_kiso2;

public class Student extends Human{
	
	String birthday;
	String school;

Student(String name,int height,int weight,int age,String birthday,String school){
	
	super(name,height,weight,age);
	this.birthday = birthday;
	this.school = school;
	
}

@Override
public void introduce() {
	super.introduce();
	System.out.println("私の誕生日は"+birthday);
	System.out.println("学校は"+school);
}
}