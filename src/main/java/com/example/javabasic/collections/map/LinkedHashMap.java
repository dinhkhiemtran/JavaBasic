package com.example.javabasic.collections.map;

import java.util.*;

public class LinkedHashMap implements Map {

    private static final int CAPACITY = 1;

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

    public Map<String,String> createALinkedHashMap(){
        Map<String, String> linkedHashMap = new java.util.LinkedHashMap<>(CAPACITY, loadFactor);
        return linkedHashMap;
    }

    public Map<String,String> insertElementsToLinkedHashMap(){
        Map<String,String> linkedHashMap = new java.util.LinkedHashMap<>();
        linkedHashMap.put("Java","SpringBoot");
        linkedHashMap.put("Javascript", "Nodejs");
        linkedHashMap.put("Go", "GRPC");
        linkedHashMap.put("C#", "WPF");
        linkedHashMap.put("Ruby","Rails");
        return linkedHashMap;
    }

    public boolean isFull(Map<String, String> linkedHashMap){
        return linkedHashMap.size() >= CAPACITY;
    }

    public Map<String, String> inputElementsToLinkedHashMap(){
        Scanner scanner = new Scanner(System.in);
        Map<String,String> linkedHashMap = createALinkedHashMap();
        try{
            if (linkedHashMap != null){
                while (!isFull(linkedHashMap)){
                    System.out.print("Input a key: ");
                    String key = scanner.next();
                    System.out.print("Input a value: ");
                    String value = scanner.next();
                    linkedHashMap.put(key,value);
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return linkedHashMap;
    }

    public String getAnElement(){
        Scanner scanner = new Scanner(System.in);
        Map<String, String> linkedHashMap = insertElementsToLinkedHashMap();
        String value = "";
        try{
            if (linkedHashMap != null){
                iterateUsingLambda(linkedHashMap);
                if (!linkedHashMap.isEmpty()){
                    System.out.print("Input key to get value: ");
                    String key = scanner.next();
                    value = linkedHashMap.get(key);
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return value;
    }

   public <T> Collection<T> getAllKeys(Map<T,T> linkedHashMap){
        return linkedHashMap.keySet();
   }

    public <T> Collection<T> getAllValues(Map<T,T> linkedHashmap){
        return linkedHashmap.values();
    }

    public <T> Collection<Entry<T,T>> getAllEntries(Map<T,T> linkedHashMap){
        return linkedHashMap.entrySet();
    }

    public <T> void printElementsUsingIterator(Map<T,T> linkedHashMap){
        System.out.print("Linked Hash Map: ");
        Iterator<Map.Entry<T, T>> iterator = linkedHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<T, T> entry = iterator.next();
            System.out.print(entry.getKey() + ":" + entry.getValue() + ", ");
        }
        System.out.println();
    }

    public <T> void iterateUsingLambda(Map<T, T> map) {
        map.forEach((k, v) -> System.out.print((k + ":" + v + ", ")));
        System.out.println();
    }

    public Map<String, String> removeAnElementFromLinkedHashMapSpecified(){
        Scanner scanner = new Scanner(System.in);
        Map<String, String> linkedHashMap = insertElementsToLinkedHashMap();
        try{
            if (linkedHashMap != null){
                printElementsUsingIterator(linkedHashMap);
                if (!linkedHashMap.isEmpty()){
                    System.out.print("Input a key to remove from linked hash map: ");
                    String key = scanner.next();
                    linkedHashMap.remove(key);
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return linkedHashMap;
    }

    private void load(){
        Map<String, String> linkedHashMap = insertElementsToLinkedHashMap();
        System.out.println(inputElementsToLinkedHashMap());
        System.out.println("Value is accessed: " + getAnElement());
        System.out.println("Keys: " + getAllKeys(linkedHashMap));
        System.out.println("Values: " + getAllValues(linkedHashMap));
        System.out.println("Entries: " + getAllEntries(linkedHashMap));
        System.out.println(removeAnElementFromLinkedHashMapSpecified());
    }

    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.load();
    }

}
