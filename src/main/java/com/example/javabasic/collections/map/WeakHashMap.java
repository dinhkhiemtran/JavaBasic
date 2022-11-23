package com.example.javabasic.collections.map;

import java.util.*;

public class WeakHashMap implements Map {

    private static final int CAPACITY = 2;

    private static final float loadFactor = 0.6f;

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

    public <T> Map<T,T> createWeakHashMap(){
        Map<T,T> weakHashMap = new java.util.WeakHashMap<>(CAPACITY, loadFactor);
        return weakHashMap;
    }

    public <T> boolean isFull(Map<T,T> weakHashMap){
        return weakHashMap.size() >= CAPACITY;
    }

    public Map<String, String> insertElementsToWeakHashMap(){
        Scanner scanner = new Scanner(System.in);
        Map<String, String> weakHashMap = createWeakHashMap();
        try{
            if(weakHashMap != null){
                while (!isFull(weakHashMap)){
                    System.out.print("Insert key(String): ");
                    String key = scanner.next();;
                    System.out.print("Insert value(String): ");
                    String value = scanner.next();
                    weakHashMap.put(key,value);
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return weakHashMap;
    }

    public Map<String,String> insertElementsToOriginWeakHashMap(){
        Map<String, String> weakHashMap = createWeakHashMap();
        weakHashMap.put("Java","SpringBoot");
        weakHashMap.put("Javascript","NodeJS");
        weakHashMap.put("Go","GRPC");
        weakHashMap.put("Php","Laravel");
        weakHashMap.put("C#","WPF");
        return weakHashMap;
    }

    public <T> Collection<T> getAllKeys(Map<T, T> weakHashMap){
        return weakHashMap.keySet();
    }

    public <T> Collection<T> getAllValues(Map<T,T> weakHashMap){
        return weakHashMap.values();
    }

    public <T> Collection<Entry<T,T>> getAllEntries(Map<T,T> weakHashMap){
        return weakHashMap.entrySet();
    }

    public <T> void printWeakHashMapUsingFor(Map<T,T> weakHashMap){
        System.out.println("Weak Hash Map: ");
        for (Map.Entry entry : weakHashMap.entrySet()){
            System.out.print(entry);
            System.out.print(", ");
        }
        System.out.println();
    }

    public <T> void printWeakHashMapUsingForEach(Map<T,T> weakHashMap){
       weakHashMap.forEach((k , v) -> System.out.print(k + ":" + v + ", "));
        System.out.println();
    }

    public <T> void printWeakHashMapUsingIterator(Map<T,T> weakHashMap){
        System.out.print("Weak Hash Map: ");
        Iterator<Map.Entry<T, T>> iterator = weakHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<T, T> entry = iterator.next();
            System.out.print(entry.getKey() + ":" + entry.getValue() + ", ");
        }
        System.out.println();
    }

    public String getElement(){
        Scanner scanner = new Scanner(System.in);
        Map<String, String> weakHashMap = insertElementsToOriginWeakHashMap();
        String value = "";
        try{
            if (weakHashMap != null && !weakHashMap.isEmpty()){
                printWeakHashMapUsingFor(weakHashMap);
                System.out.print("Input key to get value: ");
                String key = scanner.next();;
                if (weakHashMap.containsKey(key)){
                    value = weakHashMap.get(key);
                }else {
                    return "Not Found";
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return value;
    }

    public Map<String, String> removeAnElement(){
        Scanner scanner = new Scanner(System.in);
        Map<String, String> weakHashMap = insertElementsToOriginWeakHashMap();
        try{
            if (weakHashMap != null && !weakHashMap.isEmpty()){
                printWeakHashMapUsingIterator(weakHashMap);
                System.out.print("Input key to remove value: ");
                String key = scanner.next();
                if (weakHashMap.containsKey(key)){
                    weakHashMap.remove(key);
                }else {
                    return null;
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return weakHashMap;
    }

    public <T> Map<T,T> removeAllWeakHashMap(Map<T,T> weakHashMap){
        weakHashMap.clear();
        return weakHashMap;
    }

    public void load(){
        Map<String, String> weakHashMap = insertElementsToOriginWeakHashMap();
        System.out.println(insertElementsToWeakHashMap());
        System.out.println("Keys: " + getAllKeys(weakHashMap));
        System.out.println("Values: " + getAllValues(weakHashMap));
        System.out.println("Entries: " + getAllEntries(weakHashMap));
        System.out.println(getElement());
        printWeakHashMapUsingForEach(weakHashMap);
        System.out.println(removeAnElement());
        System.out.println(removeAllWeakHashMap(weakHashMap));
    }

    public static void main(String[] args) {
        WeakHashMap weakHashMap = new WeakHashMap();
        weakHashMap.load();
    }
}
