package QuizCardProject;
/*
 * Alanna Botscharow
 * 1/19
 */
public class QuizCard {
	//set up fields / attributes of a quiz card
	private String question;
	private String answer;
	
	// build constructor that builds a quiz card




	public QuizCard(String question, String answer) {

		this.question = question;
		this.answer = answer;
	}



	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
 