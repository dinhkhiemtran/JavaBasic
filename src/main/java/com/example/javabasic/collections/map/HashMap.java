package com.example.javabasic.collections.map;

import java.security.Key;
import java.util.*;

public class HashMap implements Map {

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

    public Map<String, Integer> createAHashMap() {
        Map<String, Integer> hashMap = new java.util.HashMap<>(CAPACITY, loadFactor);
        return hashMap;
    }

    public boolean isFull(Map<String, Integer> hashMap) {
        return hashMap.size() >= CAPACITY;
    }

    public Map<String, Integer> putElementsToHashMap() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> hashMap = createAHashMap();
        try {
            if (hashMap != null) {
                while (!isFull(hashMap)) {
                    System.out.print("Input a key(String) of hash map: ");
                    String key = scanner.next();
                    System.out.print("Input a value(Integer) of hash map: ");
                    Integer value = scanner.nextInt();
                    hashMap.put(key, value);
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return hashMap;
    }

    public Map<String, Integer> putElementsOriginToHashMap() {
        Map<String, Integer> hashMap = new java.util.HashMap<>();
        hashMap.put("Java", 1);
        hashMap.put("Javascript", 2);
        hashMap.put("Python", 3);
        hashMap.put("Go", 4);
        hashMap.put("C#", 5);
        return hashMap;
    }

    public Integer accessAnElementOfHashMap() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> hashMap = putElementsToHashMap();
        Integer value = null;
        try {
            if (hashMap != null) {
                System.out.print("Input key of hash to get value: ");
                String key = scanner.next();
                if (hashMap.containsKey(key)) {
                    value = hashMap.get(key);
                }
            }
        } catch (InputMismatchException in) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return value;
    }

    public Set<String> getAllKeysOfHashMap() {
        Map<String, Integer> hashMap = putElementsOriginToHashMap();
        printElementsHashMap(hashMap);
        return hashMap.keySet();
    }

    public Collection<Integer> getAllValuesOfHashMap() {
        Map<String, Integer> hashMap = putElementsOriginToHashMap();
        printElementsHashMap(hashMap);
        return hashMap.values();
    }

    public Set<Entry<String, Integer>> getAllEntriesOfHashMap() {
        Map<String, Integer> hashMap = putElementsOriginToHashMap();
        printElementsHashMap(hashMap);
        return hashMap.entrySet();
    }

    public Map<String, Integer> replaceAnElementHashMap() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> hashMap = putElementsOriginToHashMap();
        try {
            System.out.println(hashMap);
            if (hashMap != null) {
                if (!hashMap.isEmpty()) {
                    System.out.print("Input a key to replace: ");
                    String key = scanner.next();
                    System.out.print("Input a value to changed: ");
                    Integer value = scanner.nextInt();
                    if (hashMap.containsKey(key)) {
                        hashMap.replace(key, value);
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
        return hashMap;
    }

    public Map<String, Integer> removeAnElementFromHashMap() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> hashMap = putElementsOriginToHashMap();
        try {
            if (hashMap != null) {
                printElementsHashMap(hashMap);
                if (!hashMap.isEmpty()) {
                    System.out.print("Input a key to remove an entries: ");
                    String key = scanner.next();
                    if (hashMap.containsKey(key)) {
                        hashMap.remove(key);
                    }else {
                        System.out.println("Not Found.");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return hashMap;
    }

    public void printElementsHashMap(Map<String, Integer> hashMap) {
        System.out.print("Hash map: ");
        for (Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }
        System.out.println();
    }

    public Map<String, Integer> removeAllElements() {
        Map<String, Integer> hashMap = putElementsOriginToHashMap();
        if (hashMap != null && !hashMap.isEmpty()){
            hashMap.clear();
        }
        return hashMap;
    }

    public void load() {
        System.out.println(putElementsToHashMap());
        System.out.println("Value: " + accessAnElementOfHashMap());
        System.out.println("Keys: " + getAllKeysOfHashMap());
        System.out.println("Values: " + getAllValuesOfHashMap());
        System.out.println("Entries: " + getAllEntriesOfHashMap());
        System.out.println(replaceAnElementHashMap());
        System.out.println(removeAnElementFromHashMap());
        System.out.println(removeAllElements());
    }

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.load();
    }
}
