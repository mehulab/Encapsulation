class Student2 {
	private String name;
	private int age;
	private String city;
	
	//here we are creating parametrised constructor instead of setter method.
	
	public Student2(String name,int age, String city)
	{
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCity() {
		return city;
	}
	
	
	
}

public class LaunchStd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2 std2=new Student2("Mehul",24,"Nashik");
		
		System.out.println(std2.getName());
		System.out.println(std2.getAge());
		System.out.println(std2.getCity());

	}

}
