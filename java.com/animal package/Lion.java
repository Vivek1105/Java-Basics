//Create a new project in which create a package named animals.
//In that create various classes like Lion, Monkey, Elephant.
//In each class create data members like color, weight and age & Create methods like isVegetarian, canClimb, getSound.

//Lion class
package animalspack;
public class Lion
{
    private String color;
    private float weight;
    private int age;
    public Lion(String color, float weight, int age)
    {
		this.color=color;
		this.weight=weight;
		this.age=age;
		System.out.println("Lion: color, weight and age is: "+color+" "+weight+" and "+age);
    }
    public boolean isVegetarian()
    {
		return false;
	}
	public boolean canClimb()
	{
			return false;
	}
	public String getSound()
	{
			return "roaring";
	}

}
//-------------------------------------------------------------------------------------------------------------

