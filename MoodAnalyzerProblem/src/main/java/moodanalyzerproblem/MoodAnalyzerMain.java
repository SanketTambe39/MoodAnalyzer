package moodanalyzerproblem;

public class MoodAnalyzerMain {

	public static void main(String[] args) {
		String message = "Today i am very sad";
		MoodAnalyserService moodAnalyser = new MoodAnalyserImpl(message);
		System.out.println(moodAnalyser.analyseMood(message));
	}

}
