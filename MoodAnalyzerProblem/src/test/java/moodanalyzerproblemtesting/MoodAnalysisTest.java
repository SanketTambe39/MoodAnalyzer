package moodanalyzerproblemtesting;

import org.junit.Assert;
import org.junit.Test;

import moodanalyzerproblem.MoodAnalyserImpl;
import moodanalyzerproblem.MoodAnalyserService;

public class MoodAnalysisTest {

	MoodAnalyserService moodService = new MoodAnalyserImpl();

	//check for sad mood
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() 
	{
		Assert.assertEquals("sad",moodService.analyseMood("i am in sad mood"));
	}
	
	//check for happy mood
	@Test
	public void givenMessage_WhenNoMoodSpecified_ShouldReturnhappy() 
	{
		Assert.assertEquals("happy",moodService.analyseMood("i am in any mood"));
	}
	
	//check for sad mood and message passed through constructor
	@Test
	public void givenMessageInConstructor_WhenSad_ShouldReturnSad()
	{
		MoodAnalyserImpl moodAnalyse = new MoodAnalyserImpl("i am in sad mood");
		Assert.assertEquals("sad",moodAnalyse.analyseMood());
	}
	
}
