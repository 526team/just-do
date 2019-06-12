package util;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 * 专门做界面效果的类
 *
 * @author Administrator
 */
public class UiUtil {

    private UiUtil() {
    }

    //修改窗口图标
    public static void setFrameImage(JFrame jf,int a) {
	//获取工具对象
        Toolkit tk = Toolkit.getDefaultToolkit();

        //根据路径获取图片
        Image i = tk.getImage("src/resource/tb"+ a +".png");

        //给窗体设置图标
        jf.setIconImage(i);
    }
}