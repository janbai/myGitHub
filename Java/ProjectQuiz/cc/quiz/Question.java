package cc.quiz;

import java.util.ArrayList;
import java.util.List;

public class Question {
	
	private final List<Answer> answers = new ArrayList<>();
	private final List<String> topics = new ArrayList<>();
	
	private String text;
	private String comment = "";
	
	private Question() {}
	
	public List<String> getTopics() {
		return new ArrayList<>(topics);
	}

	public String getText() {
		return text;
	}

	public List<Answer> getAnswers() {
		return new ArrayList<>(answers); 
	}

	public String getComment() {
		return comment;
	}
	
	
	class Builder {
		
		private Question q = new Question();
		
		public Builder text (String text) {
			q.text = text;
			return null;
		}
		
		
	}
}
