package ex_22_OOPs_AccessModifier.Police;

public class cop {
    public int gun;
    String icard;


    public cop(int bullet){
        this.gun =bullet;
    }

    protected void CanIShoot(){
        System.out.println("Yes you can shoot !!");
    }

    void thisDefaultF1(){
        System.out.println("Hiii Cop!!");
    }
}
