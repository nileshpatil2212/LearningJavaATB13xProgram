package ex_22_OOPs_AccessModifier;

public class Lab186_AccessModifier {
}

class father{
    private int gold = 10;
    int car = 1;
    public int bhk3 = 1;
}

class son extends father{
    void WecanUse(){
//        System.out.println(gold);  // not able to access bcz its private in father class
        System.out.println(car);
        System.out.println(bhk3);

    }
}
