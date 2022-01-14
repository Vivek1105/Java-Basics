
/*Create a package called zoo and create a class called VandalurZoo and
create objects for the animals that are existing in zoo and print the characteristic of each animal*/

package zoopack;
import animalspack.*;	//import all classes and sub-classess from animialspack <but not from subpackages>
class VandalurZoo
{
	public static void main(String args[])
	{
		Lion l=new Lion("Brown",200.2f,12);
		System.out.println(l.isVegetarian()?"Yes Vegetarian":"Non-Vegetarian");
		System.out.println(l.canClimb()?"Yes, Can Climb":"Can't Climb");
		System.out.println("Lion Sound: "+l.getSound());

		Elephant e=new Elephant("Dark-Brown",800.25f,19);
		System.out.println(e.isVegetarian()?"Yes-Vegetarian":"Non-Vegetarian");
		System.out.println(e.canClimb()?"Yes, can Climb":"Can't Climb");
		System.out.println("Elephant sound: "+e.getSound());

	}
}
//=======================================================================================================