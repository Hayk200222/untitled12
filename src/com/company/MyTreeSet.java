package com.company;

import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class MyTreeSet<T> {
    TreeSet treeSet = new TreeSet();


    public void add(T element) {
        treeSet.add(element);
    }


    public Object getFirst() {
        Iterator itr = treeSet.iterator();
        if (itr.hasNext()) {
            return itr.next();
        }
        return null;
    }

    public Object getLast() {
        Iterator itr = treeSet.iterator();

        for (int i = 0; i < treeSet.size(); i++) {
            itr.next();
            if (i == treeSet.size() - 2) {
                return itr.next();
            }
        }
        return null;
    }

    public Object clone(MyTreeSet myTreeSet) {
        Iterator itr = treeSet.iterator();

        while (itr.hasNext()) {
            myTreeSet.add(itr.next());
        }
        return myTreeSet;
    }

    public void print() {
        Iterator itr = treeSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public int getCountofElement(T obj) {
        int count = 0;
        Iterator itr = treeSet.iterator();
        while (itr.hasNext()) {
            if (itr.next().equals(obj)) {
                count++;
            }
        }
        return count;
    }


    public boolean compare(MyTreeSet newTreeSet) {
        Iterator itr = treeSet.iterator();
        Iterator itr2 = newTreeSet.treeSet.iterator();
        while (itr.hasNext()) {
            if (!itr.next().equals(itr2.next())) {
                return false;
            }
        }
        return true;
    }
    
}
