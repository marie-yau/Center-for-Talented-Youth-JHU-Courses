/**
 * 
 * @author Marie Dohnalová
 * This program creates two Cat objects.
 */
public class Unit8Activity1 {

	public static void main( String [] args ){
		Cat catOne = new Cat();
		Cat catTwo = new Cat();
		
		catOne.setAge(4);
		catOne.setBreed("Abyssinian");
		catOne.setName("Snowball");
		catOne.setSex('m');
		catOne.setWeight(1.56);
		
		catTwo.setAge(7);
		catTwo.setBreed("Birman");
		catTwo.setName("Fluff");
		catTwo.setSex('f');
		catTwo.setWeight(2.90);
		
		System.out.println("Cat #1:");
		System.out.println("Age:\t"+catOne.getAge());
		System.out.println("Breed:\t"+catOne.getBreed());
		System.out.println("Name:\t"+catOne.getName());
		System.out.println("Sex:\t"+catOne.getSex());
		System.out.println("Weight:\t"+catOne.getWeight());
		System.out.println();
		
		System.out.println("Cat #2:");
		System.out.println("Age:\t"+catTwo.getAge());
		System.out.println("Breed:\t"+catTwo.getBreed());
		System.out.println("Name:\t"+catTwo.getName());
		System.out.println("Sex:\t"+catTwo.getSex());
		System.out.println("Weight:\t"+catTwo.getWeight());
		System.out.println();
		
		catOne.setName("Billy");
		catOne.setAge(6);
		
		System.out.println("Cat #1 after the changes:");
		System.out.println("Age:\t"+catOne.getAge());
		System.out.println("Breed:\t"+catOne.getBreed());
		System.out.println("Name:\t"+catOne.getName());
		System.out.println("Sex:\t"+catOne.getSex());
		System.out.println("Weight:\t"+catOne.getWeight());
		System.out.println();
		
		catTwo.setAge(9);
		catTwo.setWeight(3.14);
		
		System.out.println("Cat #2 after the changes:");
		System.out.println("Age:\t"+catTwo.getAge());
		System.out.println("Breed:\t"+catTwo.getBreed());
		System.out.println("Name:\t"+catTwo.getName());
		System.out.println("Sex:\t"+catTwo.getSex());
		System.out.println("Weight:\t"+catTwo.getWeight());
		System.out.println();
		
		System.out.println("Cat #2 says: "+catTwo.meow());
	}
}
