package com.stx;

import java.util.ArrayList;
import java.util.Collections;

/**  Collection
 * Created by admin on 2017/5/18.
 */
public class MapTest implements Comparable{

    private String name;
    private int ranking;

    public MapTest(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    /**
     *
     * @param
     */
    public String toString() {
        return this.name+""+this.ranking;
    }
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("3");
        list.add("2");
        list.add(new MapTest("zhang",2));
        //list.add(1,"a");
        Collections.sort(list);
        System.out.println(list);

    }

    @Override
    public int compareTo(Object o) {
        MapTest mapTest=(MapTest)o;

        return 0;
    }
}
