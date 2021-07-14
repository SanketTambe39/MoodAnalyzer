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

	public String analyseMood() throws MoodAnalyseException {
		return analyseMood(message);
	}

	@Override
	public String analyseMood(String message) throws MoodAnalyseException {
		try {
			if (message.contains("sad")) {
				return "sad";
			} else {
				return "happy";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalyseException("message cannot be null");
		}
	}
}
