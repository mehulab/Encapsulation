class Student
{
	private int age;
	private String name;
	private String city;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}


public class LaunchEncapsulation {

	public static void main(String[] args) {
		Student st=new Student();
		st.setAge(24);
		System.out.println(st.getAge());
		//int age=st.getAge();
		//System.out.println(age);
		
		st.setName("Mehul");
		System.out.println(st.getName());
		
		st.setCity("Nashik");
		System.out.println(st.getCity());
		

	}

}
