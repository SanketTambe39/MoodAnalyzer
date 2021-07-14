package moodanalyzerproblemtesting;

import org.junit.Assert;
import org.junit.Test;

import moodanalyzerproblem.MoodAnalyseException;
import moodanalyzerproblem.MoodAnalyserImpl;
import moodanalyzerproblem.MoodAnalyserService;

public class MoodAnalysisTest {
	
			
	//check for sad mood
		@Test
		public void givenMessage_WhenSad_ShouldReturnSad() 
		{
			MoodAnalyserService moodService = new MoodAnalyserImpl();
			try {
				Assert.assertEquals("sad",moodService.analyseMood("i am in sad mood"));
			} catch (MoodAnalyseException e) {
				e.printStackTrace();
			}
		}
		
		//check for happy mood
		@Test
		public void givenMessage_WhenNoMoodSpecified_ShouldReturnhappy() 
		{
			MoodAnalyserService moodService = new MoodAnalyserImpl();
			try {
				Assert.assertEquals("happy",moodService.analyseMood("i am in any mood"));
			} catch (MoodAnalyseException e) {
				e.printStackTrace();
			}
		}
		
		//check for sad mood and message passed through constructor
		@Test
		public void givenMessageInConstructor_WhenSad_ShouldReturnSad()
		{
			MoodAnalyserImpl moodAnalyse = new MoodAnalyserImpl("i am in sad mood");
			try {
				Assert.assertEquals("sad",moodAnalyse.analyseMood());
			} catch (MoodAnalyseException e) {
				e.printStackTrace();
			}
		}

		//check for happy mood and message passed through constructor
		@Test
		public void givenMessageInConstructor_WhenHappy_ShouldReturnHappy()
		{
			MoodAnalyserImpl moodAnalyse = new MoodAnalyserImpl(null);
			try {
				Assert.assertEquals("happy",moodAnalyse.analyseMood());
			} catch (MoodAnalyseException e) {
				e.printStackTrace();
			}
		}

		//check for null message passed through constructor
		@Test
		public void givenMessageInConstructor_WhenNull_ShouldReturnHappy()
		{
			try 
			{
				MoodAnalyserImpl moodAnalyse = new MoodAnalyserImpl(null);		
				Assert.assertEquals("happy",moodAnalyse.analyseMood());			
			} 
			catch (MoodAnalyseException e) 
			{
				Assert.assertEquals("message cannot be null", e.getMessage());
			}
		}
}
