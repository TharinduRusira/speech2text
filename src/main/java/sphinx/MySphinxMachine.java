package sphinx;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;


public class MySphinxMachine {

	public static void main(String[] args) {
		
		Configuration c= new Configuration();
		c.setAcousticModelPath("src/main/resources/TIDIGITS_8gau_13dCep_16k_40mel_130Hz_6800Hz");
		c.setDictionaryPath("src/main/resources/WSJ_8gau_13dCep_8k_31mel_200Hz_3500Hz");
		c.setLanguageModelPath("src/main/resources/en-us.lm.dmp");
		
		try {
			StreamSpeechRecognizer rec = new StreamSpeechRecognizer(c);
			rec.startRecognition(new FileInputStream(new File("src/main/resources/man1_nb.wav")));
			rec.stopRecognition();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
