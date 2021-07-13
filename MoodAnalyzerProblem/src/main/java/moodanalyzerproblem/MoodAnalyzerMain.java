package moodanalyzerproblem;

public class MoodAnalyzerMain {

	public static void main(String[] args) {
		MoodAnalyserService moodAnalyser = new MoodAnalyserImpl();
		String message = "Today i am very sad";
		System.out.println(moodAnalyser.analyseMood(message));
	}

}
