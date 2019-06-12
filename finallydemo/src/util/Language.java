package util;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 这个类用于修改语言
 * @author Administrator
 */
public class Language {
    public static String submit = null;
    public static String ok=null;
    public static String cancel=null;
    public static String login=null;
    public static String password=null;
    public static String newUser=null;
    public static String userName=null;
    public static String confirmPassword=null;
    public static String usertype=null;
    public static String name=null;
    public static String sex=null;
    public static String male=null;
    public static String female=null;
    public static String city=null;
    public static String file=null;
    public static String userManagement=null;
    public static String studentStatus=null;
    public static String selectLesson=null;
    public static String result=null;
    public static String course=null;
    public static String exit=null;
    public static String edit=null;
    public static String game=null;
    public static String studentnumber=null;
    public static String idcard=null;
    public static String major=null;
    public static String academy=null;
    public static String save=null;
    public static String all=null;
    public static String monday=null;
    public static String tuesday=null;
    public static String wednesday=null;
    public static String thursday=null;
    public static String friday=null;
    public static String saturday=null;
    public static String intoSelect=null;
    public static String electiveCoursesTable=null;
    public static String select=null;
    public static String withdraw=null;
    public static String refresh=null;
    public static String changePassword=null;
    public static String oldPassword=null;
    public static String newPassword=null;
    public static String done=null;
    public static String changeCourseDetail;
    public static String makeCourse;
    public static String addCourse;
    public static String removeCourse;
    public static String changeMessage;
    public static String courseName;
    public static String newCourse;
    public static String courseTime;
    public static String duration;
    public static String classes;
    public static String classRoom;
    public static String techingBuilding;
    public static String floor;
    public static String totalNumber;
    public static String teacher;
    public static String back;
    public static String welcome = "welcome";
    public static String passwordManagement;
    public static String pg;
    public static String defaultSet;
    public static String chagebg;
    public static String skin;
    
    private Language() {//Language
	
    }
    public static void chineseLanguage() {
        //资源包基名(包名+myproperties)
        String basename = "resource.myproperties_zh";
        //设置语言环境
        Locale cn = Locale.CHINA;//中文
        //根据基名和语言环境加载对应的语言资源文件
        ResourceBundle myResourcesCN = ResourceBundle.getBundle(basename, cn);
        //加载资源文件后，程序就可以调用ResourceBundle实例对象的getString方法获取指定的资源信息
        //String value = myResources.getString("key");

        passwordManagement=myResourcesCN.getString("passwordManagement");
        skin=myResourcesCN.getString("skin");
        submit = myResourcesCN.getString("submit");
        ok=myResourcesCN.getString("ok");
        cancel=myResourcesCN.getString("cancel");
        login=myResourcesCN.getString("login");
        password=myResourcesCN.getString("password");
        newUser=myResourcesCN.getString("newUser");
        userName=myResourcesCN.getString("userName");
        confirmPassword=myResourcesCN.getString("confirmPassword");
        usertype=myResourcesCN.getString("usertype");
        name=myResourcesCN.getString("name");
        sex=myResourcesCN.getString("sex");
        male=myResourcesCN.getString("male");
        female=myResourcesCN.getString("female");
        city=myResourcesCN.getString("city");
        file=myResourcesCN.getString("file");
        userManagement=myResourcesCN.getString("userManagement");
        studentStatus=myResourcesCN.getString("studentStatus");
        selectLesson=myResourcesCN.getString("selectLesson");
        result=myResourcesCN.getString("result");
        course=myResourcesCN.getString("course");
        exit=myResourcesCN.getString("exit");
        edit=myResourcesCN.getString("edit");
        game=myResourcesCN.getString("game");
        studentnumber=myResourcesCN.getString("studentnumber");
        idcard=myResourcesCN.getString("idcard");
        major=myResourcesCN.getString("major");
        academy=myResourcesCN.getString("academy");
        save=myResourcesCN.getString("save");
        all=myResourcesCN.getString("all");
        monday=myResourcesCN.getString("monday");
        tuesday=myResourcesCN.getString("tuesday");
        wednesday=myResourcesCN.getString("wednesday");
        thursday=myResourcesCN.getString("thursday");
        friday=myResourcesCN.getString("friday");
        saturday=myResourcesCN.getString("saturday");
        intoSelect=myResourcesCN.getString("intoSelect");
        electiveCoursesTable=myResourcesCN.getString("electiveCoursesTable");
        select=myResourcesCN.getString("select");
        withdraw=myResourcesCN.getString("withdraw");
        refresh=myResourcesCN.getString("refresh");
        changePassword=myResourcesCN.getString("changePassword");
        oldPassword=myResourcesCN.getString("oldPassword");
        newPassword=myResourcesCN.getString("newPassword");
        done=myResourcesCN.getString("done");
        
        changeCourseDetail=myResourcesCN.getString("changeCourseDetail");
         makeCourse=myResourcesCN.getString("makeCourse");
           addCourse=myResourcesCN.getString("addCourse");
           removeCourse=myResourcesCN.getString("removeCourse");
           changeMessage=myResourcesCN.getString("changeMessage");
           courseName=myResourcesCN.getString("courseName");
           newCourse=myResourcesCN.getString("newCourse");
           courseTime =myResourcesCN.getString("courseTime");;
         duration=myResourcesCN.getString("duration");
         classes=myResourcesCN.getString("classes");
        classRoom=myResourcesCN.getString("classRoom");
        techingBuilding=myResourcesCN.getString("techingBuilding");
        floor=myResourcesCN.getString("floor");
        totalNumber=myResourcesCN.getString("totalNumber");
        teacher=myResourcesCN.getString("teacher");
         back=myResourcesCN.getString("back");
         //welcome没有被加载
         welcome=myResourcesCN.getString("welcome");
           pg=myResourcesCN.getString("pg");
        defaultSet=myResourcesCN.getString("defaultSet");
        chagebg=myResourcesCN.getString("chagebg");
    }
    public static void englishLanguage() {
	//资源包基名(包名+myproperties)
        String basename = "resource.myproperties";
        //设置语言环境
        Locale us = Locale.US;//中文
        //根据基名和语言环境加载对应的语言资源文件
        ResourceBundle myResourcesUS = ResourceBundle.getBundle(basename, us);
        //加载资源文件后，程序就可以调用ResourceBundle实例对象的getString方法获取指定的资源信息
        //String value = myResources.getString("key");

        passwordManagement=myResourcesUS.getString("passwordManagement");
        skin=myResourcesUS.getString("skin");
        submit = myResourcesUS.getString("submit");
        ok=myResourcesUS.getString("ok");
        cancel=myResourcesUS.getString("cancel");
        login=myResourcesUS.getString("login");
        password=myResourcesUS.getString("password");
        newUser=myResourcesUS.getString("newUser");
        userName=myResourcesUS.getString("userName");
        confirmPassword=myResourcesUS.getString("confirmPassword");
        usertype=myResourcesUS.getString("usertype");
        name=myResourcesUS.getString("name");
        sex=myResourcesUS.getString("sex");
        male=myResourcesUS.getString("male");
        female=myResourcesUS.getString("female");
        city=myResourcesUS.getString("city");
        file=myResourcesUS.getString("file");
        userManagement=myResourcesUS.getString("userManagement");
        studentStatus=myResourcesUS.getString("studentStatus");
        selectLesson=myResourcesUS.getString("selectLesson");
        result=myResourcesUS.getString("result");
        course=myResourcesUS.getString("course");
        exit=myResourcesUS.getString("exit");
        edit=myResourcesUS.getString("edit");
        game=myResourcesUS.getString("game");
        studentnumber=myResourcesUS.getString("studentnumber");
        idcard=myResourcesUS.getString("idcard");
        major=myResourcesUS.getString("major");
        academy=myResourcesUS.getString("academy");
        save=myResourcesUS.getString("save");
        all=myResourcesUS.getString("all");
        monday=myResourcesUS.getString("monday");
        tuesday=myResourcesUS.getString("tuesday");
        wednesday=myResourcesUS.getString("wednesday");
        thursday=myResourcesUS.getString("thursday");
        friday=myResourcesUS.getString("friday");
        saturday=myResourcesUS.getString("saturday");
        intoSelect=myResourcesUS.getString("intoSelect");
        electiveCoursesTable=myResourcesUS.getString("electiveCoursesTable");
        select=myResourcesUS.getString("select");
        withdraw=myResourcesUS.getString("withdraw");
        refresh=myResourcesUS.getString("refresh");
        changePassword=myResourcesUS.getString("changePassword");
        oldPassword=myResourcesUS.getString("oldPassword");
        newPassword=myResourcesUS.getString("newPassword");
        done=myResourcesUS.getString("done");
        changeCourseDetail=myResourcesUS.getString("changeCourseDetail");
         makeCourse=myResourcesUS.getString("makeCourse");
           addCourse=myResourcesUS.getString("addCourse");
           removeCourse=myResourcesUS.getString("removeCourse");
           changeMessage=myResourcesUS.getString("changeMessage");
           courseName=myResourcesUS.getString("courseName");
           newCourse=myResourcesUS.getString("newCourse");
           courseTime =myResourcesUS.getString("courseTime");;
         duration=myResourcesUS.getString("duration");
         classes=myResourcesUS.getString("classes");
        classRoom=myResourcesUS.getString("classRoom");
        techingBuilding=myResourcesUS.getString("techingBuilding");
        floor=myResourcesUS.getString("floor");
        totalNumber=myResourcesUS.getString("totalNumber");
        teacher=myResourcesUS.getString("teacher");
         back=myResourcesUS.getString("back");
         //welcome没有被加载
         welcome=myResourcesUS.getString("welcome");
         
         
           pg=myResourcesUS.getString("pg");
        defaultSet=myResourcesUS.getString("defaultSet");
        
        
        chagebg=myResourcesUS.getString("chagebg");
    }
}
