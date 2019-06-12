package util;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * 这个是自定义的一个Panel类
 * 完善了原有的JPanel
 * @author Administrator
 *
 */
public class Mypanel extends JPanel {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    Dimension d;
    static Image image;
    static int ii;
    Dimension frameSize = new Dimension(700, 600);
    ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(
	    "/resource/bg0.jpg"));

    public static void setp(int i) {
	ii = i;
	new Mypanel();
    }

    public Mypanel() {
	super();
	String s = "file:\\"+System.getProperty("user.dir")+"\\src\\resource\\bg" + ii +".jpg";
	try {
	    imageIcon = new ImageIcon(new URL(s));
	} catch (MalformedURLException e) {
	    e.printStackTrace();
	}
	this.d = frameSize;
	this.image = imageIcon.getImage();
    }

    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.drawImage(image, 0, 0, d.width, d.height, this);
    }
}
