package com.example.javabasic.collections.map;

import java.security.Key;
import java.util.*;

public class HashMap implements Map {

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

    public java.util.HashMap<String, Integer> createAHashMap() {
        java.util.HashMap<String, Integer> hashMap = new java.util.HashMap<>(CAPACITY, loadFactor);
        return hashMap;
    }

    public boolean isFull(java.util.HashMap<String, Integer> hashMap) {
        return hashMap.size() >= CAPACITY;
    }

    public java.util.HashMap<String, Integer> putElements() {
        Scanner scanner = new Scanner(System.in);
        java.util.HashMap<String, Integer> hashMap = createAHashMap();
        try {
            if (hashMap != null) {
                while (!isFull(hashMap)) {
                    System.out.print("Put keys(String): ");
                    String key = scanner.next();
                    System.out.print("Put values(Integer): ");
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


    public Integer getAnElement(java.util.HashMap<String, Integer> hashMap) {
        Scanner scanner = new Scanner(System.in);
        Integer value = null;
        try {
            if (hashMap != null) {
                if (!hashMap.isEmpty()) {
                    System.out.print("Input key of hash to get value: ");
                    String key = scanner.next();
                    if (hashMap.containsKey(key)) {
                        value = hashMap.get(key);
                        System.out.print("Value: ");
                    }
                }
            }
        } catch (InputMismatchException in) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return value;
    }

    public Set<String> getAllKeys(java.util.HashMap<String, Integer> hashMap) {
        Set<String> results = new HashSet<>();
        if (hashMap != null) {
            if (!hashMap.isEmpty()) {
                results = hashMap.keySet();
                System.out.print("Key Set: ");
            }
        }
        return results;
    }

    public Collection<Integer> getAllValues(java.util.HashMap<String, Integer> hashMap) {
        Collection<Integer> results = new ArrayList<>();
        if (hashMap != null) {
            if (!hashMap.isEmpty()) {
                results = hashMap.values();
                System.out.print("Values: ");
            }
        }
        return results;
    }

    public Set<Entry<String, Integer>> getAllEntries(java.util.HashMap<String, Integer> hashMap) {
        Set<Entry<String, Integer>> results = new HashSet<>();
        if (hashMap != null) {
            if (!hashMap.isEmpty()) {
                results = hashMap.entrySet();
                System.out.print("Entry set: ");
            }
        }
        return results;
    }

    public Map<String, Integer> replaceAnElement(java.util.HashMap<String, Integer> hashMap) {
        Scanner scanner = new Scanner(System.in);
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

    public Map<String, Integer> removeAnElement(Map<String, Integer> hashMap) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (hashMap != null) {
                if (!hashMap.isEmpty()) {
                    System.out.print("Input a key to remove: ");
                    String key = scanner.next();
                    if (hashMap.containsKey(key)) {
                        hashMap.remove(key);
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

    public void print(Map<String, Integer> hashMap) {
        if (hashMap != null) {
            System.out.print("Hash map: ");
            hashMap.forEach((k, v) -> System.out.print(k + ":" + v + ", "));
            System.out.println();
        }
    }

    public java.util.HashMap removeAllElements(java.util.HashMap<String, Integer> hashMap) {
        if (hashMap != null) {
            if (!hashMap.isEmpty()) {
                hashMap.clear();
            }
        }
        return hashMap;
    }

    public void load() {
        java.util.HashMap<String, Integer> hashMap = putElements();
        print(hashMap);
        System.out.println(getAnElement(hashMap));
        System.out.println(getAllKeys(hashMap));
        System.out.println(getAllValues(hashMap));
        System.out.println(getAllEntries(hashMap));
        System.out.println(replaceAnElement(hashMap));
        System.out.println(removeAnElement(hashMap));
        System.out.println(removeAllElements(hashMap));
    }

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.load();
    }
}
