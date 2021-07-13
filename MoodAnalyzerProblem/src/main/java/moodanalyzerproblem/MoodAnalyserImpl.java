package moodanalyzerproblem;

public class MoodAnalyserImpl implements MoodAnalyserService {

	public String message;
	public MoodAnalyserImpl() {
		super();
	}
	public MoodAnalyserImpl(String message) {
		super();
		this.message = message;
	}
	public Object analyseMood()
	{
		return analyseMood(message);
	}
	@Override
	public String analyseMood(String message)
	{
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
