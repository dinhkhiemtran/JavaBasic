package com.example.javabasic.collections.map;

import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;

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

    public <T> java.util.WeakHashMap<T, T> createWeakHashMap() {
        java.util.WeakHashMap<T, T> weakHashMap = new java.util.WeakHashMap<>(CAPACITY, loadFactor);
        return weakHashMap;
    }

    public <T> boolean isFull(Map<T, T> weakHashMap) {
        return weakHashMap.size() >= CAPACITY;
    }

    public java.util.WeakHashMap<String, String> putElements() {
        Scanner scanner = new Scanner(System.in);
        java.util.WeakHashMap<String, String> weakHashMap = createWeakHashMap();
        try {
            if (weakHashMap != null) {
                while (!isFull(weakHashMap)) {
                    System.out.print("Insert key(String): ");
                    String key = scanner.next();
                    ;
                    System.out.print("Insert value(String): ");
                    String value = scanner.next();
                    weakHashMap.put(key, value);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return weakHashMap;
    }

    public Map<String, String> insertElementsToOriginWeakHashMap() {
        Map<String, String> weakHashMap = createWeakHashMap();
        weakHashMap.put("Java", "SpringBoot");
        weakHashMap.put("Javascript", "NodeJS");
        weakHashMap.put("Go", "GRPC");
        weakHashMap.put("Php", "Laravel");
        weakHashMap.put("C#", "WPF");
        return weakHashMap;
    }

    public <T> Set<T> getAllKeys(Map<T, T> weakHashMap) {
        Set<T> results = new HashSet<>();
        if (weakHashMap != null) {
            if (!weakHashMap.isEmpty()) {
                results = weakHashMap.keySet();
                System.out.print("Keys: ");
            }
        }
        return results;
    }

    public <T> Collection<T> getAllValues(Map<T, T> weakHashMap) {
        Collection<T> results = new ArrayList<>();
        if (weakHashMap != null) {
            if (!weakHashMap.isEmpty()) {
                results = weakHashMap.values();
                System.out.print("Values: ");
            }
        }
        return results;
    }

    public <T> Set<Entry<T, T>> getAllEntries(Map<T, T> weakHashMap) {
        Set<Entry<T, T>> results = new HashSet<>();
        if (weakHashMap != null) {
            if (!weakHashMap.isEmpty()) {
                results = weakHashMap.entrySet();
                System.out.print("Entries: ");
            }
        }
        return results;
    }

    public <T> void printUsingFor(Map<T, T> weakHashMap) {
        System.out.println("Weak Hash Map: ");
        for (Map.Entry entry : weakHashMap.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }
        System.out.println();
    }

    public <T> void printUsingForEach(Map<T, T> weakHashMap) {
        weakHashMap.forEach((k, v) -> System.out.print(k + ":" + v + ", "));
        System.out.println();
    }

    public <T> void printUsingIterator(Map<T, T> weakHashMap) {
        System.out.print("Weak Hash Map: ");
        Iterator<Map.Entry<T, T>> iterator = weakHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<T, T> entry = iterator.next();
            System.out.print(entry.getKey() + " : " + entry.getValue() + ", ");
        }
        System.out.println();
    }

    public String getAnElementSpecified(java.util.WeakHashMap<String, String> weakHashMap) {
        Scanner scanner = new Scanner(System.in);
        String value = "";
        try {
            if (weakHashMap != null) {
                if (!weakHashMap.isEmpty()) {
                    System.out.print("Input key to get value: ");
                    String key = scanner.next();
                    if (weakHashMap.containsKey(key)) {
                        value = weakHashMap.get(key);
                        System.out.print("Value: ");
                    } else {
                        return "Not Found";
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return value;
    }

    public java.util.WeakHashMap<String, String> removeAnElementSpecified(java.util.WeakHashMap<String, String> weakHashMap) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (weakHashMap != null && !weakHashMap.isEmpty()) {
                if (!weakHashMap.isEmpty()) {
                    System.out.print("Input key to remove value: ");
                    String key = scanner.next();
                    if (weakHashMap.containsKey(key)) {
                        weakHashMap.remove(key);
                    } else {
                        System.out.println("Not Found.");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return weakHashMap;
    }

    public <T> Map<T, T> removeAllElements(Map<T, T> weakHashMap) {
        if (weakHashMap != null) {
            if (!weakHashMap.isEmpty()) {
                weakHashMap.clear();
            }
        }
        return weakHashMap;
    }

    public void load() {
        java.util.WeakHashMap<String, String> weakHashMap = putElements();
        printUsingFor(weakHashMap);
        System.out.println(getAllKeys(weakHashMap));
        printUsingIterator(weakHashMap);
        System.out.println(getAllValues(weakHashMap));
        printUsingForEach(weakHashMap);
        System.out.println(getAllEntries(weakHashMap));
        System.out.println(getAnElementSpecified(weakHashMap));
        System.out.println(removeAnElementSpecified(weakHashMap));
        System.out.println(removeAllElements(weakHashMap));
    }

    public static void main(String[] args) {
        WeakHashMap weakHashMap = new WeakHashMap();
        weakHashMap.load();
    }
}
