/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author zhangtao
 */
public class JavaApplication1 {

    public static void main(String args[]) {
System.out.println("part 1");

        List<String> list = new ArrayList<String>();
        list.add("luojiahui");
        list.add("luojiafeng");

        //方法1
        Iterator it1 = list.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        System.out.println("part 2");
        List<BpmInfo> list2 = new ArrayList<BpmInfo>();
//        list2.add("张韬");

//        list2.add("luojiafeng");
        list2.add(new BpmInfo("1", "aaa", "bbb"));
        list2.add(new BpmInfo("2", "xxx", "张韬"));

        //方法1
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        
        
        System.out.println("part 3");
        BpmInfoSet b=new BpmInfoSet();
        System.out.println(b.getArrList());
    }
}
