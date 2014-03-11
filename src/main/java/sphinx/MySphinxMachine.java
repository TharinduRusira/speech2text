package sphinx;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;


public class MySphinxMachine {

	public static void main(String[] args) {
		
		Configuration c= new Configuration();
		c.setAcousticModelPath("resource:/WSJ_8gau_13dCep_16k_40mel_130Hz_6800Hz");
		c.setDictionaryPath("resource:/WSJ_8gau_13dCep_16k_40mel_130Hz_6800Hz/dict/cmudict.0.6d");
		c.setLanguageModelPath("models/language/en-us.lm.dmp");
		
		try {
			StreamSpeechRecognizer rec = new StreamSpeechRecognizer(c);
			rec.startRecognition(new FileInputStream(new File("")));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
