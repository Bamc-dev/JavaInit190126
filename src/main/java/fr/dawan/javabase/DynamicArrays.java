package fr.dawan.javabase;

import java.util.ArrayList;
import java.util.List;

public class DynamicArrays {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();
        System.out.println(listInt.size());

        listInt.add(54);
        listInt.add(175);
        listInt.add(300);

        System.out.println("------ Boucle for -------------");
        for (int i = 0; i < listInt.size(); i++) {
            System.out.println(listInt.get(i)+" ");
        }

        for (Integer item : listInt){
            System.out.println(item + " ");
        }

        listInt.add(1, 12);

        ArrayList<Integer> otherList = new ArrayList<>();
        otherList.add(100);
        otherList.add(200);
        listInt.addAll(otherList);

        System.out.println(listInt);

        listInt.addAll(List.of(5,7,0,44));
        System.out.println(listInt);

        listInt.set(0, 999);
        System.out.println("Apres modif : "+listInt);
        listInt.remove(1);
        System.out.println("Apres modif : "+listInt);
        listInt.remove(Integer.valueOf(300));
        System.out.println("Apres modif : "+listInt);
        
    }
}
