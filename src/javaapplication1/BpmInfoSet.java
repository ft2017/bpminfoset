/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author zhangtao
 */
public class BpmInfoSet {

    private ArrayList<BpmInfo> arrList;

    public BpmInfoSet(ArrayList<BpmInfo> arrList) {

        this.arrList = arrList;
    }

    public BpmInfoSet() {
        System.out.println("public BpmInfoSet()...开始");
        arrList = new ArrayList<BpmInfo>();
        arrList.add(new BpmInfo("1", "aaa", "bbb"));
        arrList.add(new BpmInfo("2", "xxx", "张韬"));
        System.out.println("public BpmInfoSet()结束");
    }

    @Override
    public String toString() {
        return "BpmInfoSet{" + "arrList=" + arrList + '}';
    }

    public ArrayList<BpmInfo> getArrList() {
        return arrList;
    }

    public void setArrList(ArrayList<BpmInfo> arrList) {
        this.arrList = arrList;
    }
}
