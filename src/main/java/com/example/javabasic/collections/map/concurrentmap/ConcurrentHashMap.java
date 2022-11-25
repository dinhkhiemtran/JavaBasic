package com.example.javabasic.collections.map.concurrentmap;

import java.util.*;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMap implements ConcurrentMap {

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

    @Override
    public Object putIfAbsent(Object key, Object value) {
        return null;
    }

    @Override
    public boolean remove(Object key, Object value) {
        return false;
    }

    @Override
    public boolean replace(Object key, Object oldValue, Object newValue) {
        return false;
    }

    @Override
    public Object replace(Object key, Object value) {
        return null;
    }

    public ConcurrentMap<String, Integer> createConcurrentHashMap() {
        ConcurrentMap<String, Integer> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<>(CAPACITY, loadFactor);
        return concurrentHashMap;
    }

    public boolean isFull(ConcurrentMap<String, Integer> concurrentHashMap) {
        return concurrentHashMap.size() >= CAPACITY;
    }

    public java.util.concurrent.ConcurrentHashMap<String, Integer> insertElementsToConcurrentHashMapDefault() {
        java.util.concurrent.ConcurrentHashMap<String, Integer> concurrentMap = new java.util.concurrent.ConcurrentHashMap<>();
        concurrentMap.put("One", 1);
        concurrentMap.put("Two", 2);
        concurrentMap.put("Three", 3);
        concurrentMap.put("Four", 4);
        concurrentMap.put("Five", 5);
        concurrentMap.put("Six", 6);
        concurrentMap.put("Seven", 7);
        concurrentMap.put("Eight", 8);
        concurrentMap.put("Nine", 9);
        concurrentMap.put("Ten", 10);
        return concurrentMap;
    }

    public ConcurrentMap<String, Integer> insertElementsToConcurrentHashMap() {
        Scanner scanner = new Scanner(System.in);
        ConcurrentMap<String, Integer> concurrentHashMap = createConcurrentHashMap();
        try {
            if (concurrentHashMap != null) {
                while (!isFull(concurrentHashMap)) {
                    System.out.print("Input key(String): ");
                    String key = scanner.next();
                    System.out.print("Input value(Integer): ");
                    Integer value = scanner.nextInt();
                    if (key != null && value != null) {
                        concurrentHashMap.put(key, value);
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return concurrentHashMap;
    }

    public Integer getAnElement(java.util.concurrent.ConcurrentHashMap<String, Integer> concurrentMap) {
        Scanner scanner = new Scanner(System.in);
        Integer value = 0;
        try {
            if (concurrentMap != null) {
                if (!concurrentMap.isEmpty()) {
                    System.out.print("Input a key to get value: ");
                    String key = scanner.next();
                    if (concurrentMap.containsKey(key)) {
                        value = concurrentMap.get(key);
                    } else {
                        System.out.println("Not Found.");
                    }
                } else {
                    System.out.println("Empty.");
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return value;
    }

    public Collection<String> getAllKeys(java.util.concurrent.ConcurrentHashMap<String, Integer> concurrentHashMap) {
        return concurrentHashMap.keySet();
    }

    public Collection<Integer> getAllValues(java.util.concurrent.ConcurrentHashMap<String, Integer> concurrentHashMap) {
        return concurrentHashMap.values();
    }

    public Collection<Entry<String, Integer>> getAllEntries(java.util.concurrent.ConcurrentHashMap<String, Integer> concurrentHashMap) {
        return concurrentHashMap.entrySet();
    }

    public java.util.concurrent.ConcurrentHashMap<String, Integer> removeAnElementSpecified(java.util.concurrent.ConcurrentHashMap<String, Integer> concurrentHashMap) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (concurrentHashMap != null) {
                if (!concurrentHashMap.isEmpty()) {
                    printConcurrentHashMap(concurrentHashMap);
                    System.out.print("Input a key to remove from concurrent hash map: ");
                    String key = scanner.next();
                    if (concurrentHashMap.containsKey(key)) {
                        concurrentHashMap.remove(key);
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return concurrentHashMap;
    }

    public void searchValueElementConcurrentHashMap(java.util.concurrent.ConcurrentHashMap<String, Integer> concurrentHashMap) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (concurrentHashMap != null) {
                if (!concurrentHashMap.isEmpty()) {
                    System.out.print("Search value: ");
                    Integer value = scanner.nextInt();
                    if (concurrentHashMap.containsValue(value)){
                        String key = concurrentHashMap.search(4 , (k, v) -> {
                            return v == value ? k : null;
                        });
                        System.out.println("Key: " + key);
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    public void reduceConcurrentHashMap(java.util.concurrent.ConcurrentHashMap<String, Integer> concurrentHashMap){
        int sum = concurrentHashMap.reduce(4 ,(k,v) -> v,(v1,v2) -> v1 + v2);
        System.out.println("Sum: " + sum);
    }

    public void printConcurrentHashMap(java.util.concurrent.ConcurrentHashMap<String, Integer> concurrentHashMap) {
        System.out.print("Concurrent Hash Map: ");
        concurrentHashMap.forEach((k, v) -> System.out.print(k + ":" + v + ", "));
        System.out.println();
    }

    public void load() {
        java.util.concurrent.ConcurrentHashMap<String, Integer> concurrentMap = insertElementsToConcurrentHashMapDefault();
        printConcurrentHashMap(concurrentMap);
        System.out.println("Keys: " + getAllKeys(concurrentMap));
        System.out.println("Values: " + getAllValues(concurrentMap));
        System.out.println("Entries: " + getAllEntries(concurrentMap));
        System.out.println(getAnElement(concurrentMap));
        System.out.println(removeAnElementSpecified(concurrentMap));
        searchValueElementConcurrentHashMap(concurrentMap);
        reduceConcurrentHashMap(concurrentMap);
    }

    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.load();
    }
}
