import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.*;
	
	public class JavaFactoryPatternExample
	{
		
  public static void main(String[] args)
  {
	  
	  ApplicationContext ctx = new ClassPathXmlApplicationContext("sandwich.xml");
		Dog d1 = (Dog)ctx.getBean("1");
/*		Dog.setDog("small");*/
		Dog d2 = (Dog)ctx.getBean("2");
		System.out.println(d1.equals("small"));
		System.out.println(d2.equals("big"));
	  
    /*// create a small dog
    Dog dog = DogFactory.getDog("small");
    dog.speak();

    // create a big dog
    dog = DogFactory.getDog("big");
    dog.speak();

    // create a working dog
    dog = DogFactory.getDog("working");
    dog.speak();*/
  }
}