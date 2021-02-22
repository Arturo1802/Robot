package proyectorobot;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import de.dfki.lt.freetts.en.us.MbrolaVoiceDirectory;


public class Voz {  
    public static void hablar(String parametro){
        
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();  
        voice=vm.getVoice("kevin16");
        voice.allocate(); 
        
        try{
        voice.speak(parametro);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
