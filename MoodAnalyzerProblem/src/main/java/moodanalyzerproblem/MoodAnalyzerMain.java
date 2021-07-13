package moodanalyzerproblem;

public class MoodAnalyzerMain {

	public static void main(String[] args) throws MoodAnalyseException {
		String message = "Today i am very sad";
		MoodAnalyserService moodAnalyser = new MoodAnalyserImpl(message);
		System.out.println(moodAnalyser.analyseMood(message));
	}

}
