package com.company;

import java.util.*;

public class MyHashSet<T> {
    HashSet<T> hashSet = new HashSet<>();
    TreeSet treeSet = new TreeSet();

    public void add(T element) {
        hashSet.add(element);

    }

    public int countOfElements() {
        return hashSet.size();
    }

    public boolean IsEmpty() {
        return hashSet.isEmpty();
    }

    public Object clone(HashSet newHashSet) {
        newHashSet = (HashSet) hashSet.clone();
        return newHashSet;
    }

    public Object convertToTreeSet(HashSet newHashSet) {
        TreeSet treeSet = new TreeSet();

        return null;
    }

    @Override
    public String toString() {
        return "MyHashSet{" +
                "hashSet=" + hashSet +
                '}';
    }

    public boolean compare(MyHashSet newHashSet) {
        Iterator itr = hashSet.iterator();
        Iterator itr2 = newHashSet.hashSet.iterator();
        while (itr.hasNext()) {
            if (!itr.next().equals(itr2.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean removeAll(T element) {
        return hashSet.remove(element);

    }

    public TreeSet converToTreeSet() {
        Iterator itr = hashSet.iterator();

        while (itr.hasNext()) {
            treeSet.add(itr.next());
        }
        return treeSet;
    }

}
