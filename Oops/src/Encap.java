class Student
{
	private int age;
	String name;
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
	String city;
	public int getAge() {
		return age;
	}
	public void setAge(int age){//receiving value(a) from outside class  
		this.age = age;//setting to its data variable
	}
}
public class Encap {

	public static void main(String[] args) {
		Student st = new Student();
		System.out.println();

	}
	
	

}
