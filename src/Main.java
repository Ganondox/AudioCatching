import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.TargetDataLine;

public class Main {

    public static void main(String args[]){


        /*
        try {
            AudioFormat format = new AudioFormat(8000.0f, 16, 1, true, true);
            TargetDataLine microphone = AudioSystem.getTargetDataLine(format);
    } catch (Exception e){


        */





        //launch server on thread

        ServerThread server = new ServerThread();
        server.start();

        //launch client
        Mic.main(args);
    }
}
