package com.example.javabasic.collections.collection.set;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class EnumSet implements Set {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    //allof() method creates an enum set that contains all the values of the specified enum type Size
    public java.util.EnumSet<Size> createEnumSetSize(){
        java.util.EnumSet<Size> size = java.util.EnumSet.allOf(Size.class);
        return size;
    }

    //The noneOf() method creates an empty enum set
    public java.util.EnumSet<Size> createEnumSetEmpty(){
        java.util.EnumSet<Size> size = java.util.EnumSet.noneOf(Size.class);
        return size;
    }

    //The range() method creates an enum set containing all the values of an enum between e1 and e2
    public java.util.EnumSet<Size> rangeOfEnumSet(){
        java.util.EnumSet<Size> size = java.util.EnumSet.range(Size.MEDIUM,Size.LARGE);
        return size;
    }

    //The of() method creates an enum set containing the specified elements
    public java.util.EnumSet<Size> ofEnumSet(){
        java.util.EnumSet<Size> sizes = java.util.EnumSet.of(Size.EXTRALARGE);
        return sizes;
    }

    public java.util.EnumSet<Size> insertElementsToEnumSet(){
        java.util.EnumSet<Size> sizes = createEnumSetSize();
        java.util.EnumSet<Size> emptySize = createEnumSetEmpty();
        try{
            if (!sizes.isEmpty()) {
                emptySize.addAll(sizes);
            }
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return emptySize;
    }

    public void accessEnumSetElements(){
        java.util.EnumSet<Size> sizes = createEnumSetSize();
        Iterator<Size> iterator = sizes.iterator();
        try {
            System.out.print("Enum Set: ");
            while (iterator.hasNext()){
                System.out.print(iterator.next());
                System.out.print(",");
            }
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        System.out.println();
    }

    public java.util.EnumSet<Size> removeEnumSetElements(){
        java.util.EnumSet<Size> sizes = createEnumSetSize();
        try{
            if(sizes != null){
                if(!sizes.isEmpty()){
                    sizes.remove(Size.EXTRALARGE);
                }
            }
        }catch (Exception ex){
            System.out.print("Exception: " + ex.getMessage());
        }
        return sizes;
    }

    public void load(){
        System.out.println(rangeOfEnumSet());
        System.out.println(ofEnumSet());
        System.out.println(insertElementsToEnumSet());
        accessEnumSetElements();
        System.out.println(removeEnumSetElements());
    }

    public static void main(String[] args) {
        EnumSet enumSet = new EnumSet();
        enumSet.load();
    }

}

enum Size{
    SMALL, MEDIUM, LARGE, EXTRALARGE;
}
