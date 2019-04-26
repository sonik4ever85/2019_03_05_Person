package telran.person.controller;

//import telran.person.data.ArrayTools;
import telran.person.data.Person;

public class PersonApp {

	public static void main(String[] args) {
	
		Person p1 = new Person();
		p1.setAge(14);
		p1.setFirstName("Vova");
		p1.setLastName("Pukalo");
		p1.setId(12345);
		p1.setSex(true);
		
		p1.display();
		System.out.println("*1****1****1****1****1******");
		
		Person p2 = new Person();
		p2.setAge(11);
		p2.setFirstName("Masha");
		p2.setLastName("Medvedeva");
		p2.setId(4321);
		p2.setSex(false);
		
		p2.display();
		System.out.println("***2****2****2****2****2****");
		
		Person p3 = new Person();
		p3.setAge(34);
		p3.setFirstName("Petya");
		p3.setLastName("Vatrushca");
		p3.setId(8765);
		p3.setSex(true);
		
		p3.display();
		System.out.println("***3****3****3****3*****3***");
		
		p1.greetings("Dear");
		p2.greetings("Mrs");
		p3.greetings("Bla bla bla");
		p2.display();
		
		System.out.println("****4*****4*****4*****4****");
		p1.greetings("Mr", 2);
		p2.greetings("Mrs", 3);
		p3.greetings("Hello", 14);
		
		Person arr1[]=new Person[3];
		arr1[0]=p1;
		arr1[1]=p2;
		arr1[2]=p3;
		
		System.out.println();
		System.out.println(arr1[1]);
		
//		ArrayTools.printArray(arr1);
		System.out.println("\\\\\\5\\\\\\5\\\\\\\\\\\5\\\\\\\\\\5\\\\\\\\\\\5\\\\\\\\\\\\");
		
		Person p4 = new Person(1239, "petya", "Chort", 35, true);
		System.out.println(p4);

	}

}