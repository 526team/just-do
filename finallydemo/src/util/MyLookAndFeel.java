package util;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * 这个类包装了5种皮肤
 * 
 * @author Administrator
 *
 */
// 这里面定义了常见的要使用的皮肤的字符串路径。
public class MyLookAndFeel {
    // 系统自带皮肤,5种都能用
    public static String SYS_METAL = "javax.swing.plaf.metal.MetalLookAndFeel";
    public static String SYS_NIMBUS = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
    public static String SYS_CDE_MOTIF = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
    public static String SYS_WINDOWS = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
    public static String SYS_WINDOWS_CLASSIC = "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";
    // JIattoo jar包资源
    public static String JTATTOO_ACRYL = "com.jtattoo.plaf.acryl.AcrylLookAndFeel";
    public static String JTATTOO_AERO = "com.jtattoo.plaf.aero.AeroLookAndFeel";
    // 还可以
    public static String JTATTOO_ALUMINUM = "com.jtattoo.plaf.aluminium.AluminiumLookAndFeel";
    // 很喜欢
    public static String JTATTOO_BERNSTEIN = "com.jtattoo.plaf.bernstein.BernsteinLookAndFeel";
    public static String JTATTOO_FAST = "com.jtattoo.plaf.fast.FastLookAndFeel";
    // 有个性
    public static String JTATTOO_HIFI = "com.jtattoo.plaf.hifi.HiFiLookAndFeel";
    public static String JTATTOO_LUNA = "com.jtattoo.plaf.luna.LunaLookAndFeel";
    // 很喜欢
    public static String JTATTOO_MCWIN = "com.jtattoo.plaf.mcwin.McWinLookAndFeel";
    public static String JTATTOO_MINT = "com.jtattoo.plaf.mint.MintLookAndFeel";
    // 有个性
    public static String JTATTOO_NOIRE = "com.jtattoo.plaf.noire.NoireLookAndFeel";
    public static String JTATTOO_SMART = "com.jtattoo.plaf.smart.SmartLookAndFeel";
    // liquidlnf.jar包资源
    // 很喜欢
    public static String LIQUIDINF = "com.birosoft.liquid.LiquidLookAndFeel";

    private MyLookAndFeel() {

    }

    public static void model1() {
	try {
	    UIManager.setLookAndFeel(MyLookAndFeel.SYS_METAL);
	} catch (ClassNotFoundException | InstantiationException
		| IllegalAccessException | UnsupportedLookAndFeelException e) {
	    e.printStackTrace();
	}
    }

    public static void model2() {
	try {
	    UIManager.setLookAndFeel(MyLookAndFeel.SYS_NIMBUS);
	} catch (ClassNotFoundException | InstantiationException
		| IllegalAccessException | UnsupportedLookAndFeelException e) {
	    e.printStackTrace();
	}
    }

    public static void model3() {
	try {
	    UIManager.setLookAndFeel(MyLookAndFeel.SYS_CDE_MOTIF);
	} catch (ClassNotFoundException | InstantiationException
		| IllegalAccessException | UnsupportedLookAndFeelException e) {
	    e.printStackTrace();
	}
    }

    public static void model4() {
	try {
	    UIManager.setLookAndFeel(MyLookAndFeel.SYS_WINDOWS);
	} catch (ClassNotFoundException | InstantiationException
		| IllegalAccessException | UnsupportedLookAndFeelException e) {
	    e.printStackTrace();
	}
    }

    public static void model5() {
	try {
	    UIManager.setLookAndFeel(MyLookAndFeel.SYS_WINDOWS_CLASSIC);
	} catch (ClassNotFoundException | InstantiationException
		| IllegalAccessException | UnsupportedLookAndFeelException e) {
	    e.printStackTrace();
	}
    }
    public static void model6() {
	try {
	    UIManager.setLookAndFeel(MyLookAndFeel.JTATTOO_ACRYL);
	} catch (ClassNotFoundException | InstantiationException
		| IllegalAccessException | UnsupportedLookAndFeelException e) {
	    e.printStackTrace();
	}
    }

    public static void model7() {
	try {
	    UIManager.setLookAndFeel(MyLookAndFeel.JTATTOO_AERO);
	} catch (ClassNotFoundException | InstantiationException
		| IllegalAccessException | UnsupportedLookAndFeelException e) {
	    e.printStackTrace();
	}
    }

    public static void model8() {
	try {
	    UIManager.setLookAndFeel(MyLookAndFeel.JTATTOO_ALUMINUM);
	} catch (ClassNotFoundException | InstantiationException
		| IllegalAccessException | UnsupportedLookAndFeelException e) {
	    e.printStackTrace();
	}
    }

    public static void model9() {
	try {
	    UIManager.setLookAndFeel(MyLookAndFeel.JTATTOO_BERNSTEIN);
	} catch (ClassNotFoundException | InstantiationException
		| IllegalAccessException | UnsupportedLookAndFeelException e) {
	    e.printStackTrace();
	}
    }

    public static void model10() {
	try {
	    UIManager.setLookAndFeel(MyLookAndFeel.JTATTOO_FAST);
	} catch (ClassNotFoundException | InstantiationException
		| IllegalAccessException | UnsupportedLookAndFeelException e) {
	    e.printStackTrace();
	}
    }
    public static void model11() {
	try {
	    UIManager.setLookAndFeel(MyLookAndFeel.JTATTOO_HIFI);
	} catch (ClassNotFoundException | InstantiationException
		| IllegalAccessException | UnsupportedLookAndFeelException e) {
	    e.printStackTrace();
	}
    }

    public static void model12() {
	try {
	    UIManager.setLookAndFeel(MyLookAndFeel.JTATTOO_LUNA);
	} catch (ClassNotFoundException | InstantiationException
		| IllegalAccessException | UnsupportedLookAndFeelException e) {
	    e.printStackTrace();
	}
    }
    public static void model13() {
	try {
	    UIManager.setLookAndFeel(MyLookAndFeel.JTATTOO_MINT);
	} catch (ClassNotFoundException | InstantiationException
		| IllegalAccessException | UnsupportedLookAndFeelException e) {
	    e.printStackTrace();
	}
    }

    public static void model14() {
	try {
	    UIManager.setLookAndFeel(MyLookAndFeel.JTATTOO_MCWIN);
	} catch (ClassNotFoundException | InstantiationException
		| IllegalAccessException | UnsupportedLookAndFeelException e) {
	    e.printStackTrace();
	}
    }

    public static void model15() {
	try {
	    UIManager.setLookAndFeel(MyLookAndFeel.JTATTOO_NOIRE);
	} catch (ClassNotFoundException | InstantiationException
		| IllegalAccessException | UnsupportedLookAndFeelException e) {
	    e.printStackTrace();
	}
    }
    public static void model16() {
	try {
	    UIManager.setLookAndFeel(MyLookAndFeel.JTATTOO_SMART);
	} catch (ClassNotFoundException | InstantiationException
		| IllegalAccessException | UnsupportedLookAndFeelException e) {
	    e.printStackTrace();
	}
    }

    public static void model17() {
	try {
	    UIManager.setLookAndFeel(MyLookAndFeel.LIQUIDINF);
	} catch (ClassNotFoundException | InstantiationException
		| IllegalAccessException | UnsupportedLookAndFeelException e) {
	    e.printStackTrace();
	}
    }
}
