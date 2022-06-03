package Assignment6;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_SubList {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add("Steve");
        arrayList.add("Justin");
        arrayList.add("Ajeet");
        arrayList.add("John");
        arrayList.add("Arnold");
        arrayList.add("Chaitanya");
        System.out.println("ArrayList is: " + arrayList + "\n");

        List<String> subList = arrayList.subList(1,4);
        System.out.println("Sublist is: " + subList + "\n");
    }
}
