package controlflow;

public class Person_4 {
	public Person_4 read()
	{
		System.out.println("Person can read");
		return this;
	}
	public Person_4 write()
	{
		System.out.println("Person can write");
		return this;
		}
	public Person_4 talk()
	{
		System.out.println("Person can talk");
		return this;
		}
public static void main(String[] args) 
{
		Person_4 p1=new Person_4();
		p1.read().write().talk();
}

}
