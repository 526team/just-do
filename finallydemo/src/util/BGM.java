package util;

import java.net.URL;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.SourceDataLine;

/**
 * 这个类用于添加背景音乐
 * @author Administrator
 */
public class BGM {
    AudioInputStream ais;
    SourceDataLine sdl;

    public void MUSIC(int i) {
	try {
	    if (sdl != null) {
		sdl.stop();
		sdl = null;
	    }
	    String s = "file:\\"+System.getProperty("user.dir")+"\\src\\resource\\" + i +".wav";
	    String s1 =s.replace("\\", "/");
	    System.out.println(s1);
	    URL u = new URL(s);
	    ais = AudioSystem.getAudioInputStream(u);
	    AudioFormat aif = ais.getFormat();
	    System.out.println(aif);
	    DataLine.Info info = new DataLine.Info(SourceDataLine.class, aif);
	    sdl = (SourceDataLine) AudioSystem.getLine(info);
	    sdl.open(aif);
	    sdl.start();
	    FloatControl fc = (FloatControl) sdl
		    .getControl(FloatControl.Type.MASTER_GAIN);
	    // value可以用来设置音量，从0-2.0
	    double value = 2;
	    float dB = (float) (Math.log(value == 0.0 ? 0.0001 : value)
		    / Math.log(10.0) * 20.0);
	    fc.setValue(dB);
	    int nByte = 0;
	    final int SIZE = 1024 * 64;
	    byte[] buffer = new byte[SIZE];
	    while (nByte != -1) {
		nByte = ais.read(buffer, 0, SIZE);
		sdl.write(buffer, 0, nByte);
	    }
	    sdl.stop();

	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
