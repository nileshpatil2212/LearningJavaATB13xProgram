package ex_20_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab179_Multilevel_Inheritance {

    public static void main(String[] args) {
        Son amit = new Son();
        System.out.println(amit.gold_gf);
        amit.gf();

        GrandFather grandFather = new Son();
        grandFather.home();
    }
}
