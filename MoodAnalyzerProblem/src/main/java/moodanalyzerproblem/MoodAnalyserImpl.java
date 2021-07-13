package moodanalyzerproblem;

public class MoodAnalyserImpl implements MoodAnalyserService {

	@Override
	public String analyseMood(String message) {
		if(message.contains("sad"))
		{
			return "sad";
		}
		else
		{
			return "happy";
		}
	}
}
