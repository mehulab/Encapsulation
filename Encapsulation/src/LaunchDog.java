class Dog
{
	private int cost;
	private String name;
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class LaunchDog {

	public static void main(String[] args) {
		// TO take int & string value.
     Dog d= new Dog();
     d.setCost(2000);
     d.setName("sheru");
     System.out.println(d.getCost());
     System.out.println(d.getName());
	}

}
