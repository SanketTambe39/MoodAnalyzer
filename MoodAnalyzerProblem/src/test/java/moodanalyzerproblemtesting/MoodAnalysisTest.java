package moodanalyzerproblemtesting;

import org.junit.Assert;
import org.junit.Test;

import moodanalyzerproblem.MoodAnalyseException;
import moodanalyzerproblem.MoodAnalyserImpl;
import moodanalyzerproblem.MoodAnalyserService;

public class MoodAnalysisTest {
	MoodAnalyserService moodService = new MoodAnalyserImpl();
	MoodAnalyserImpl moodAnalyse = new MoodAnalyserImpl(null);		
	//check for sad mood
		@Test
		public void givenMessage_WhenSad_ShouldReturnSad() 
		{
			try {
				Assert.assertEquals("sad",moodService.analyseMood("i am in sad mood"));
			} catch (MoodAnalyseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//check for happy mood
		@Test
		public void givenMessage_WhenNoMoodSpecified_ShouldReturnhappy() 
		{
			try {
				Assert.assertEquals("happy",moodService.analyseMood("i am in any mood"));
			} catch (MoodAnalyseException e) {
				// TODO Auto-generated catch block
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		//check for happy mood and message passed through constructor
		@Test
		public void givenMessageInConstructor_WhenHappy_ShouldReturnHappy()
		{
			try {
				Assert.assertEquals("happy",moodAnalyse.analyseMood());
			} catch (MoodAnalyseException e) {
				e.printStackTrace();
			}
		}

		//check for null message passed through constructor
		//check for null message passed through constructor
		@Test
		public void givenMessageInConstructor_WhenNull_ShouldReturnHappy()
		{
			MoodAnalyserImpl moodAnalyse = new MoodAnalyserImpl(null);		
			try {
				Assert.assertEquals("happy",moodAnalyse.analyseMood());
			} catch (MoodAnalyseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
