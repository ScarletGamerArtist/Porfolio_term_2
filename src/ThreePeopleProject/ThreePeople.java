package ThreePeopleProject;

import ThreePeopleProject.PersonAttributes;

/*
 * Alanna Botscharow
 * 12/18
 */
public class ThreePeople {

	public static void main(String[] args) {
		//3 people, must introduce themselves, their favorite song, list of attributes (min 10), Describe itself, favorite hobby. 
		
		//person # 1
		PersonAttributes Samuel = new PersonAttributes(); 
		
		//Person # 2
		PersonAttributes Raymond = new PersonAttributes(); 
		
		//Person # 3
		PersonAttributes Ruby = new PersonAttributes(); 
		
		
		//Samuel's information
		//Attributes
	Samuel.age = 20;
	Samuel.gender = "Male";
	Samuel.bday = "October 26th";
	Samuel.height = "5' 0\"";
	Samuel.weight = "147 lbs";
	Samuel.race = "American";
	Samuel.likes = "Horror movies, forests, animals, the color red, and dark places.";
	Samuel.dislikes = "Loud noises, cities, hot temperatures, children, and bright colors.";
	Samuel.personality = "Stoic, blunt, irritable, adventurous, and solitary.";
	
	
		//Hobby and song
	Samuel.hobby = "Camping";
	Samuel.song = "Teenagers by My Chemical Romance.";
	
	//introduction
		//intro
	Samuel.intro = "Um... hi. The name's Samuel in case you were wonderin'. I'm not really THAT interesting, but I'll tell ya a "+
		"bit about myself.";
	
		//appearance
	Samuel.appearance = "Oh. You wanna know what I look like? Well, ok I guess. I have very light blonde hair that's in an undercut \n"+
		"style. My eyes are a sky blue color, and my skin has a slight tan to it. I usually wear darker clothes that have a punk look \n"+
			"to 'em. I also really like to wear chains, spikes, or claws for accessories. I'm a lil' shorter than average height. \n"+
		"I think that's about it.";
	
	
		//description
	Samuel.description = "I'm a person who prefers to be alone. I like to take long walks in the forest, and get in touch with nature.\n "+
		"I grew up in a small town with an interesting family that was known to neglect me and my needs. This however's what taught me \n"+
			"to become independant and not rely on others for anything. ";
	
	//Samuel
		Samuel.display();
	
	
		
		
		
		
		//Raymond's information
		//Attributes
		
		Raymond.age = 35;
		Raymond.gender = "Male";
		Raymond.bday = "November 25th";
		Raymond.height = "6' 5\"";
		Raymond.weight = "195 lbs";
		Raymond.race = "British";
		Raymond.likes = "Robotics, computers, roses, science, and engineering.";
		Raymond.dislikes = "Water, rejection, power outages, winter and rain.";
		Raymond.personality = "Egotistial, determined, creative, stubborn, and romantic.";
		
		//hobby and song
		
		Raymond.hobby = "Building robots";
		Raymond.song = "Africa by Toto";
		
		//introduction
			//intro
		
		Raymond.intro = "Hello there! My name is Raymond. It is a real pleasure to meet you! Let me tell you about myself.";
		
		
		//appearance
		
		Raymond.appearance = "My appearance? Well, I am a pretty tall dude. I have deep brown hair that is tied back in a short \n"+
		"ponytail. My eyes are a hazel color, and I have a bit of stuble growing on my face. I usually wear more professional \n"+
				"clothes like tuxedos. I where black and white very often, with a little bit of red once in a while.";
		
		//description
		
		Raymond.description = "As a young boy I always wanted to travel to London. It's a beautiful place from what I've seen and \n"+
		"heard. Someday I will make it there. As for now, I am just a robotics engineer. I love my job, and I have always had a \n"+
				"passion for computer sciences. "; 
		
		//Raymond
		
		Raymond.display();
		
		
		
	
		
		//Ruby's information
			//attributes
		
		Ruby.age = 16;
		Ruby.gender = "Female";
		Ruby.bday = "January 24th";
		Ruby.height = "4' 10\"";
		Ruby.weight = "135 lbs";
		Ruby.race = "Irish";
		Ruby.likes = "Art, programming, crafting, math, flowers, and wind.";
		Ruby.dislikes = "Spiders, snow, the color yellow, tomatoes, and wasps.";
		Ruby.personality = "Energetic, outgoing, kind, artsy, and unique.";
		
		
		//hobby and song
		Ruby.hobby = "painting";
		Ruby.song = "Bullet in a Gun by Imagine Dragons";
		
		
		//introduction
			//intro
		Ruby.intro = "Hey there! I'm Ruby! Nice to meetcha! I am going to share some info about me.";
		
		
		//appearance
		
		Ruby.appearance = "I should probably tell you what I look like since all that you can see right now is a console \n"
				+ "full of words. Oops! I became self aware again! Anyways, I have long fiery red hair that reaches all the \n"
				+ "way down to the floor. I like to wear comfy clothes that come in  a variety of styles and colors. \n"
				+ "That's about it for my appearance!";
		
		//description
		
		Ruby.description = "I am just an average teenage girl who goes to school like everyone else. I want to become an artist at \n"
				+ "point in my life. I am a nerd when it comes to computers and technology. I like to make a lot of friends and help \n"
				+ "others out when they need support the most.";
		
		//Ruby
		
		Ruby.display(); 
		
		
		
		
	}

}
