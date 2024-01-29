package v2_4_List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ListSample {

    public void checkArrayList1(){
        ArrayList<String> list1 = new ArrayList(100);
        //list1.add(new Object());
        list1.add("ArrayListSample");
        //list1.add(new Double(1));
    }

    public void checkArrayList2(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1,"A1");
        System.out.println(Arrays.toString(list.toArray()));
    }

    public void checkArrayList3(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1,"A1");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("0 ");
        list2.addAll(list);
        System.out.println(list2);
    }

    public void checkArrayList4(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");

        ArrayList<String> list2 = list;

        list.add("B");
        System.out.print("List2 :");
        for(String s : list2){
            System.out.print(s+" ");
        }
        System.out.println();

        list2.add("C");
        System.out.print("List1 :");
        for(String s : list){
            System.out.print(s+" ");
        }
        System.out.println();

        System.out.print("list == list2 : ");
        System.out.println(list == list2);
        System.out.print("list.equals(list2) : ");
        System.out.println(list.equals(list2));

        System.out.println("S".equals(new String("S")));
    }

    public void checkArrayList5(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        int listSize = list.size();
        for(int loop = 0; loop<listSize; loop++){
            System.out.println("list.get("+loop+")="+list.get(loop));
        }
    }

    public void checkArrayList6(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        String[] strList = list.toArray(new String[0]);

        for(String s : strList){
            System.out.print(s+ " ");
        }
        System.out.println();
    }

    public void checkArrayList7(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        String[] tempArray = new String[2];

        String[] strList = list.toArray(tempArray);

        for(String temp : strList){
            System.out.print(temp+" ");
        }
        System.out.println();
    }

    public void checkArrayList8(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");

        //System.out.println("Removed "+list.remove(0));
        //System.out.println(list.remove("A"));  //젤 앞있는 해당 원소삭제
        ArrayList<String> temp = new ArrayList<>();
        temp.add("A");
        list.removeAll(temp);
        list.set(1,"V");
        for(int loop = 0; loop<list.size(); loop++){
            System.out.println("list.get("+loop+")="+list.get(loop));
        }
    }

    public static void main(String[] args) {
        ListSample sample = new ListSample();
        sample.checkArrayList1();
        sample.checkArrayList2();
        sample.checkArrayList3();
        sample.checkArrayList4();
        sample.checkArrayList5();
        sample.checkArrayList6();
        sample.checkArrayList7();
        System.out.println(Arrays.toString(new String[0])); //[]
        System.out.println(Arrays.toString(new String[1])); //[null]
        sample.checkArrayList8();
    }
}