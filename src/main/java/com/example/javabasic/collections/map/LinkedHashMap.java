package com.example.javabasic.collections.map;

import java.util.*;
import java.util.HashMap;

public class LinkedHashMap implements Map {

    private static final int CAPACITY = 8;

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

    public <T> java.util.LinkedHashMap<T, T> createALinkedHashMap() {
        java.util.LinkedHashMap<T, T> linkedHashMap = new java.util.LinkedHashMap<>(CAPACITY, loadFactor);
        return linkedHashMap;
    }

    public Map<String, String> insertElementsToLinkedHashMap() {
        Map<String, String> linkedHashMap = new java.util.LinkedHashMap<>();
        linkedHashMap.put("Java", "SpringBoot");
        linkedHashMap.put("Javascript", "Nodejs");
        linkedHashMap.put("Go", "GRPC");
        linkedHashMap.put("C#", "WPF");
        linkedHashMap.put("Ruby", "Rails");
        return linkedHashMap;
    }

    public <T> boolean isFull(Map<T, T> linkedHashMap) {
        return linkedHashMap.size() >= CAPACITY;
    }

    public java.util.LinkedHashMap<String, String> putElements() {
        Scanner scanner = new Scanner(System.in);
        java.util.LinkedHashMap<String, String> linkedHashMap = createALinkedHashMap();
        try {
            if (linkedHashMap != null) {
                while (!isFull(linkedHashMap)) {
                    System.out.print("Input a key(String): ");
                    String key = scanner.next();
                    System.out.print("Input a value(String): ");
                    String value = scanner.next();
                    linkedHashMap.put(key, value);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return linkedHashMap;
    }

    public <T> T getAnElement(java.util.LinkedHashMap<T,T> linkedHashMap) {
        Scanner scanner = new Scanner(System.in);
        T value = (T) "";
        try {
            if (linkedHashMap != null) {
                if (!linkedHashMap.isEmpty()) {
                    System.out.print("Input key to get value: ");
                    String key = scanner.next();
                    if (linkedHashMap.containsKey(key)) {
                        value = linkedHashMap.get(key);
                        System.out.print("Value: ");
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

    public <T> Set<T> getAllKeys(Map<T, T> linkedHashMap) {
        Set<T> results = new HashSet<>();
        if (linkedHashMap != null){
            if (!linkedHashMap.isEmpty()){
                results = linkedHashMap.keySet();
                System.out.print("Key Set: ");
            }
        }
        return results;
    }

    public <T> Collection<T> getAllValues(Map<T, T> linkedHashmap) {
        Collection<T> results = new ArrayList<>();
        if (linkedHashmap != null){
            if (!linkedHashmap.isEmpty()){
                results = linkedHashmap.values();
                System.out.print("Values: ");
            }
        }
        return results;
    }

    public <T> Collection<Entry<T, T>> getAllEntries(Map<T, T> linkedHashMap) {
        Collection<Entry<T, T>> results = new ArrayList<>();
        if (linkedHashMap != null){
            if (!linkedHashMap.isEmpty()){
                results = linkedHashMap.entrySet();
                System.out.print("Entry Set: ");
            }
        }
        return results;
    }

    public <T> void print(Map<T, T> linkedHashMap) {
        if (linkedHashMap != null){
            Iterator<Map.Entry<T, T>> iterator = linkedHashMap.entrySet().iterator();
            System.out.print("Linked Hash Map: ");
            while (iterator.hasNext()) {
                Map.Entry<T, T> entry = iterator.next();
                System.out.print(entry.getKey() + ":" + entry.getValue() + ", ");
            }
            System.out.println();
        }
    }


    public Map<String, String> removeAnElementSpecified(java.util.LinkedHashMap<String, String> linkedHashMap) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (linkedHashMap != null) {
                if (!linkedHashMap.isEmpty()) {
                    System.out.print("Input a key to remove: ");
                    String key = scanner.next();
                    if (linkedHashMap.containsKey(key)) {
                        linkedHashMap.remove(key);
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
        return linkedHashMap;
    }

    public <T> java.util.LinkedHashMap<T, T> removeAllElements(java.util.LinkedHashMap<T, T> linkedHashMap){
        if (linkedHashMap != null){
            if (!linkedHashMap.isEmpty()){
                linkedHashMap.clear();
                System.out.print("All elements are removed successfully. ");
            }
        }
        return linkedHashMap;
    }

    private void load() {
        java.util.LinkedHashMap<String, String> linkedHashMap = putElements();
        print(linkedHashMap);
        System.out.println(getAnElement(linkedHashMap));
        System.out.println(getAllValues(linkedHashMap));
        System.out.println(getAllKeys(linkedHashMap));
        System.out.println(getAllEntries(linkedHashMap));
        System.out.println(removeAnElementSpecified(linkedHashMap));
        System.out.println(removeAllElements(linkedHashMap));
    }

    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.load();
    }

}
