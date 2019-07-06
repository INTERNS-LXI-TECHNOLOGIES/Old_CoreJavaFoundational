package com.lxisoft.SnakeNLadder;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.*;
/**
*This class is used to implement Audioplayable method
*
*@author AJAY .E.S
*
*@version 1.0

*/

class AudioPlay{
	public void playSound(String fileName) {
        try {
               AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./com/lxisoft/SnakeNLadder/sound/"+fileName).getAbsoluteFile());
               Clip clip = AudioSystem.getClip();
               clip.open(audioInputStream);
               clip.start();
               Thread.sleep(1000);
               clip.stop();
        } 
    catch(Exception ex) {
        System.out.println("Error with playing sound.");       
    }
    }
}