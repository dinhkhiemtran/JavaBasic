package com.example.javabasic.collections.map;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class EnumMap implements Map {


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }

    public <T> Map<Size, T> createEnumMap() {
        Map<Size, T> enumMap = new java.util.EnumMap<>(Size.class);
        return enumMap;
    }

    public Map<Size, Integer> insertElementToEnumMap() {
        Map<Size, Integer> enumMap = createEnumMap();
        enumMap.put(Size.SMALL, 1);
        enumMap.put(Size.MEDIUM, 2);
        enumMap.put(Size.LARGE, 3);
        enumMap.put(Size.EXTRALARGE, 4);
        return enumMap;
    }

    public <T> Collection<Size> getAllKeys(Map<Size, T> enumSizeMap) {
        return enumSizeMap.keySet();
    }

    public <T> Collection<T> getAllValues(Map<Size, T> enumSizeMap) {
        return enumSizeMap.values();
    }

    public <T> Collection<Entry<Size, T>> getAllEntries(Map<Size, T> enumSizeMap) {
        return enumSizeMap.entrySet();
    }

    public Integer getAnElement() {
        Map<Size, Integer> enumSizeMap = insertElementToEnumMap();
        Integer value = 0;
        try {
            if (enumSizeMap != null) {
                if (!enumSizeMap.isEmpty()) {
                    value = enumSizeMap.get(Size.SMALL);
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return value;
    }

    public Map<Size, Integer> removeAnElementFromEnumSizeMap(){
        Map<Size, Integer> enumSizeMap = insertElementToEnumMap();
        try{
            if (enumSizeMap != null && !enumSizeMap.isEmpty()){
                printEnumSizeMap(enumSizeMap);
                enumSizeMap.remove(Size.SMALL);
            }
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return enumSizeMap;
    }

    public Map<Size, Integer> replaceAnElementOfEnumSizeMap(){
        Map<Size, Integer> enumSizeMap = insertElementToEnumMap();
        try{
            if (enumSizeMap != null && !enumSizeMap.isEmpty()){
                printEnumSizeMap(enumSizeMap);
                enumSizeMap.replace(Size.SMALL,10);
            }
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return enumSizeMap;
    }

    public <T> void printEnumSizeMap(Map<Size, T> enumSizeMap){
        System.out.print("Enum Map: ");
        enumSizeMap.forEach((k , v) -> System.out.print(k + ":" + v + ", "));
        System.out.println();
    }

    public <T> Map<Size, T> removeElementFromEnumSizeMap(Map<Size, T> enumSizeMap){
        enumSizeMap.clear();
        return enumSizeMap;
    }

    public void load(){
        Map<Size , Integer> enumSizeMap = insertElementToEnumMap();
        System.out.println(enumSizeMap);
        System.out.println(getAllKeys(enumSizeMap));
        System.out.println(getAllValues(enumSizeMap));
        System.out.println(getAllEntries(enumSizeMap));
        System.out.println(getAnElement());
        System.out.println(replaceAnElementOfEnumSizeMap());
        System.out.println(removeAnElementFromEnumSizeMap());
        System.out.println(removeElementFromEnumSizeMap(enumSizeMap));
    }

    public static void main(String[] args) {
        EnumMap enumMap = new EnumMap();
        enumMap.load();
    }

}

enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}