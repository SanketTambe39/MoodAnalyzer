package moodanalyzerproblemtesting;

import org.junit.Assert;
import org.junit.Test;

import moodanalyzerproblem.MoodAnalyserImpl;
import moodanalyzerproblem.MoodAnalyserService;

public class MoodAnalysisTest {
	MoodAnalyserService moodService = new MoodAnalyserImpl();

	// check for sad mood
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		Assert.assertEquals("sad", moodService.analyseMood(" i am in sad mood"));
	}

	// check for happy mood
	@Test
	public void givenMessage_WhenNoMoodSpecified_ShouldReturnhappy() {
		Assert.assertEquals("happy", moodService.analyseMood("i am in any mood"));
	}
}
