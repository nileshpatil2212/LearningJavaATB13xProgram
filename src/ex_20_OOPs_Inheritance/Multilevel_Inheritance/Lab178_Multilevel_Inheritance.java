package ex_20_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab178_Multilevel_Inheritance {

    public static void main(String[] args) {

        Son amit = new Son();
//        Son s1 = new Father();
//        Son s2 = new GrandFather();

        GrandFather g1 = new Son();
        g1.gf();
        g1.home();

        GrandFather g2 = new Father();
        g2.home();

        Father f2 = new Son();
        f2.home();

//        WebDriver driver = new ChromeDriver();
    }
}
