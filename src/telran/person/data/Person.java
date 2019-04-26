package telran.person.data;

public class Person {
	private int id;						//	поля
	private String firstName;			// 	поля
	private String lastName;			//	поля
	private int age;					//	поля
	private boolean sex;				//	поля
	
/*	public Person(int id, String firstName, String lastName, int age, boolean sex) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.sex = sex;
	}
	public Person(String firstName, String lastName, int age, boolean sex) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.sex = sex;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
*/	
	
	public Person(){
		System.out.println("Shalom Constructor");
	}
	public Person(int id, String firstName, String lastName, int age, boolean sex){			//  метод конструктор
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.sex=sex;
	}
	
	public int getId(){											//	метод геттер
		return id;
	}
	public String getFirstName(){								//	методы
		return firstName;
	}
	public String getLastName(){								//	методы
		return lastName;	
	}
	public int getAge(){										//	мктоды
		return age;
	}
	public String getSex(){
		if(sex){
			return "Man";
		}
		else{
			return "Women";
		}
	}
	public void setId(int id){									// метод сеттер
		this.id=id;
	}
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setSex(boolean sex){
		this.sex=sex;
	}
	public void display(){
		System.out.println("ID: "+id);
		System.out.println("Fn: "+firstName);
		System.out.println("Ln: "+lastName);
		System.out.println("Age: "+age);
		System.out.println("Sex: "+getSex());
	}
	public void greetings(String greetings){
		System.out.println(greetings+" "+lastName);
	}
	public void greetings(String greetings, int num){
		System.out.println(greetings+" "+lastName+" "+num);
	}
	@Override
	public String toString() {													// метод To string позволяет превратить объект в стору
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", age=" + age + ", sex=" + sex + "]";
	}
	

}
