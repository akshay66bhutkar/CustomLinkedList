package cusomarraylist;

import customhashmap.CustomHashMap;

import java.util.ArrayList;

public class MainClass {

    public static void main(String args[]) {
        ArrayList<Integer> a=new ArrayList();
        CustomArrayList<Integer> cl=new CustomArrayList<Integer>();
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.add(4);
        cl.add(5);
        cl.add(6);
        cl.add(7);

        System.out.println(cl.remove(4));

        cl.add(8);
        System.out.println(cl);

        System.out.println(cl.get(4));

        CustomHashMap<String,Integer> map=new CustomHashMap();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        System.out.println(map.get( "a"));
        ArrayList<String> keys=map.keySet();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
    }
}
