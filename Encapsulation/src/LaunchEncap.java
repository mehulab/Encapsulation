class Student1
{
	private int age;
	private String name;
	private String city;
	private boolean married;
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
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	
	
	
	
	
}
public class LaunchEncap {
	
	//here we are creating two objects st and st2.

	public static void main(String[] args) {
		
		Student1 st=new Student1();
		st.setCity("Pune");
		System.out.println(st.getCity());
		
		st.setAge(24);
		System.out.println(st.getAge());
		
		
		//int age=st.getAge();
		//System.out.println(age);
		
		st.setName("Mehul");
		System.out.println(st.getName()); 

		
		Student1 st2=new Student1();
		st2.setCity("Bengaluru");
		System.out.println(st2.getCity());
		
		
		st2.setAge(23);
		System.out.println(st2.getAge());
		
		
		//int age=st.getAge();
		//System.out.println(age);
		
		st2.setName("Rash");
		System.out.println(st2.getName()); 
	}

}
