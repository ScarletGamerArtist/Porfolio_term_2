package ThreePeopleProject;
/*
 * Alanna botscharow
 * 12/18
 */
public class PersonAttributes {

	
	//10 attributes
	String name;
	int age;
	String gender;
	String weight;
	String height;
	String race;
	String bday;
	String likes;
	String dislikes;
	String personality;
	
	
	//Favorite song, hobby, introduction, description, appearance.
			String song;
			String hobby;
			String intro;
			String description;
			String appearance;
			
		//Display method
			
			public void display() {
				System.out.println(intro);
				System.out.println();
				System.out.println("I am " + age + " years old.");
				System.out.println("I am a " + gender);
				System.out.println("My height is " + height);
				System.out.println("I weigh " + weight);
				System.out.println("My birthday is on " + bday);
				System.out.println("My race is " + race);
				System.out.println("I like " + likes);
				System.out.println("I don't like " + dislikes);
				System.out.println("I am described as being " + personality);
				System.out.println("My favorite hobby is " + hobby);
				System.out.println("My favorite song is " + song);
				System.out.println();
				System.out.println(description);
				System.out.println();
				System.out.println(appearance);
				System.out.println();
				System.out.println();
				System.out.println();
	
	
			}
}
