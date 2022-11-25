package com.example.javabasic.collections.map.sortedmap.navigablemap;

import java.util.*;

public class TreeMap implements NavigableMap {
    @Override
    public Entry lowerEntry(Object key) {
        return null;
    }

    @Override
    public Object lowerKey(Object key) {
        return null;
    }

    @Override
    public Entry floorEntry(Object key) {
        return null;
    }

    @Override
    public Object floorKey(Object key) {
        return null;
    }

    @Override
    public Entry ceilingEntry(Object key) {
        return null;
    }

    @Override
    public Object ceilingKey(Object key) {
        return null;
    }

    @Override
    public Entry higherEntry(Object key) {
        return null;
    }

    @Override
    public Object higherKey(Object key) {
        return null;
    }

    @Override
    public Entry firstEntry() {
        return null;
    }

    @Override
    public Entry lastEntry() {
        return null;
    }

    @Override
    public Entry pollFirstEntry() {
        return null;
    }

    @Override
    public Entry pollLastEntry() {
        return null;
    }

    @Override
    public NavigableMap descendingMap() {
        return null;
    }

    @Override
    public NavigableSet navigableKeySet() {
        return null;
    }

    @Override
    public NavigableSet descendingKeySet() {
        return null;
    }

    @Override
    public NavigableMap subMap(Object fromKey, boolean fromInclusive, Object toKey, boolean toInclusive) {
        return null;
    }

    @Override
    public NavigableMap headMap(Object toKey, boolean inclusive) {
        return null;
    }

    @Override
    public NavigableMap tailMap(Object fromKey, boolean inclusive) {
        return null;
    }

    @Override
    public Comparator comparator() {
        return null;
    }

    @Override
    public SortedMap subMap(Object fromKey, Object toKey) {
        return null;
    }

    @Override
    public SortedMap headMap(Object toKey) {
        return null;
    }

    @Override
    public SortedMap tailMap(Object fromKey) {
        return null;
    }

    @Override
    public Object firstKey() {
        return null;
    }

    @Override
    public Object lastKey() {
        return null;
    }

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

    public java.util.TreeMap<String, Integer> createTreeMap(){
        java.util.TreeMap<String, Integer> treeMap = new java.util.TreeMap<>();
        return treeMap;
    }

    public java.util.TreeMap<String, Integer> insertElementsToTreeMap(){
        java.util.TreeMap<String, Integer> treeMap = createTreeMap();
        try{
            treeMap.put("Ten", 10);
            treeMap.put("Nine", 9);
            treeMap.put("Eight", 8);
            treeMap.put("Seven", 7);
            treeMap.put("Six", 6);
            treeMap.put("Five", 5);
            treeMap.put("Four", 4);
            treeMap.put("Three", 3);
            treeMap.put("Two", 2);
            treeMap.put("One", 1);
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return treeMap;
    }

    public Collection<String> getAllKeys(Map<String,Integer> treeMap){
        return treeMap.keySet();
    }

    public  Collection<Integer> getAllValues(Map<String,Integer> treeMap){
        return treeMap.values();
    }

    public Collection<Entry<String, Integer>> getAllEntries(Map<String, Integer> treeMap){
        return treeMap.entrySet();
    }

    public Map<String, Integer> removeAnElementSpecified(){
        Scanner scanner = new Scanner(System.in);
        java.util.TreeMap<String, Integer> treeMap = insertElementsToTreeMap();
        try{
            if (treeMap != null && !treeMap.isEmpty()){
                printTreeMap(treeMap);
                System.out.print("Input key to remove from Tree Map: ");
                String key = scanner.next();
                if (treeMap.containsKey(key)){
                    treeMap.remove(key);
                    System.out.println("Element is removed successfully.");
                }else {
                    System.out.println("Not Found.");
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return treeMap;
    }

    public Map<String, Integer> replaceAnElementOfTreeMap(){
        Scanner scanner = new Scanner(System.in);
        java.util.TreeMap<String, Integer> treeMap = insertElementsToTreeMap();
        try {
            if (treeMap != null && !treeMap.isEmpty()){
                printTreeMap(treeMap);
                System.out.print("Input a key to replace: ");
                String key = scanner.next();
                if (treeMap.containsKey(key)){
                    System.out.print("Input value to replace into: ");
                    Integer value = scanner.nextInt();
                    treeMap.replace(key, value);
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return treeMap;
    }

    public String getFirstKey(java.util.TreeMap<String,Integer> treeMap){
        return treeMap.firstKey();
    }

    public String getLastKey(java.util.TreeMap<String, Integer> treeMap){
        return treeMap.lastKey();
    }

    public Entry<String, Integer> getFirstEntry(java.util.TreeMap<String,Integer> treeMap){
        return treeMap.firstEntry();
    }

    public  Entry<String, Integer> getLastEntry(java.util.TreeMap<String, Integer> treeMap){
        return treeMap.lastEntry();
    }

    public String getHigherKey(){
        java.util.TreeMap<String, Integer> treeMap = insertElementsToTreeMap();
        return treeMap.higherKey("Five");
    }

    public Entry<String, Integer> getHigherEntry(){
        java.util.TreeMap<String, Integer> treeMap = insertElementsToTreeMap();
        return treeMap.higherEntry("Five");
    }

    public String getLowerKey(){
        java.util.TreeMap<String, Integer> treeMap = insertElementsToTreeMap();
        return treeMap.lowerKey("Five");
    }

    public Entry<String, Integer> getLowerEntry(){
        java.util.TreeMap<String, Integer> treeMap = insertElementsToTreeMap();
        return treeMap.lowerEntry("Five");
    }

    public String getCeilingKey(){
        java.util.TreeMap<String, Integer> treeMap = insertElementsToTreeMap();
        return treeMap.ceilingKey("Five");
    }

    public Entry<String, Integer> getCeilingEntry(){
        java.util.TreeMap<String, Integer> treeMap = insertElementsToTreeMap();
        return treeMap.ceilingEntry("Five");
    }

    public String getFloorKey(){
        java.util.TreeMap<String, Integer> treeMap = insertElementsToTreeMap();
        return treeMap.floorKey("Five");
    }

    public Entry<String, Integer> getFloorEntry(){
        java.util.TreeMap<String, Integer> treeMap = insertElementsToTreeMap();
        return treeMap.floorEntry("Five");
    }

    public <T> void printTreeMap(java.util.TreeMap<String, Integer> treeMap){
        System.out.print("Tree Map: ");
        treeMap.forEach((key,value) -> System.out.print(key + ":" + value + ", "));
        System.out.println();
    }

    public Map<String, Integer> getHeadMap(){
        Scanner scanner = new Scanner(System.in);
        java.util.TreeMap<String, Integer> treeMap = insertElementsToTreeMap();
        java.util.TreeMap<String, Integer> results = new java.util.TreeMap<>();
        try{
            if(treeMap != null && !treeMap.isEmpty()){
                printTreeMap(treeMap);
                System.out.print("Input a key to get head map: ");
                String key = scanner.next();
                if (treeMap.containsKey(key)){
                    results.putAll(treeMap.headMap(key));
                }else {
                    System.out.println("Not Found.");
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + inputMismatchException.getMessage());
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return results;
    }

    public Map<String, Integer> getTailMap(){
        Scanner scanner = new Scanner(System.in);
        java.util.TreeMap<String, Integer> treeMap = insertElementsToTreeMap();
        java.util.TreeMap<String, Integer> results = new java.util.TreeMap<>();
        try{
            if (treeMap != null && !treeMap.isEmpty()){
                System.out.print("Input key to get tail: ");
                String key = scanner.next();
                if (treeMap.containsKey(key)){
                    results.putAll(treeMap.tailMap(key));
                }else {
                    System.out.println("Not Found.");
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return treeMap;
    }

    public Map<String, Integer> getSubMap(){
        Scanner scanner = new Scanner(System.in);
        java.util.TreeMap<String, Integer> treeMap = insertElementsToTreeMap();
        java.util.TreeMap<String, Integer> results = new java.util.TreeMap<>();
        try{
            if (treeMap != null){
                if (!treeMap.isEmpty()){
                    printTreeMap(treeMap);
                    System.out.print("Input key start: ");
                    String keyStart = scanner.next();
                    System.out.print("Input key end: ");
                    String keyEnd = scanner.next();
                    if (treeMap.containsKey(keyStart) && treeMap.containsKey(keyEnd)){
                        results.putAll(treeMap.subMap(keyStart,true, keyEnd, true));
                    }else {
                        System.out.println("Not Found.");
                    }
                }
            }
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Exception: " + "Input wrong type.");
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return results;
    }

    public Map<Integer,String> createATreeMapWithACustomizedComparator(){
        java.util.TreeMap<Integer, String> treeMap = new java.util.TreeMap<>(new CustomComparator());
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");
        treeMap.put(6, "Six");
        treeMap.put(7, "Seven");
        treeMap.put(8, "Eight");
        treeMap.put(9, "Nine");
        treeMap.put(10, "Ten");
        return treeMap;
    }

    public void load(){
        java.util.TreeMap<String, Integer> treeMap = insertElementsToTreeMap();
        System.out.println("Keys: " + getAllKeys(treeMap));
        System.out.println("Value: " + getAllValues(treeMap));
        System.out.println("Entries: " + getAllEntries(treeMap));
        System.out.println(removeAnElementSpecified());
        System.out.println(replaceAnElementOfTreeMap());
        printTreeMap(treeMap);
        System.out.println("First Key: " + getFirstKey(treeMap));
        System.out.println("First Entry: " + getFirstEntry(treeMap));
        System.out.println("Last Key: " + getLastKey(treeMap));
        System.out.println("Last Entry: " + getLastEntry(treeMap));
        System.out.println("Higher Key: " + getHigherKey());
        System.out.println("Higher Entry: " + getHigherEntry());
        System.out.println("Lower Key: " + getLowerKey());
        System.out.println("Lower Entry: " + getLowerEntry());
        System.out.println("Ceiling Key: " + getCeilingKey());
        System.out.println("Ceiling Entry: " + getCeilingEntry());
        System.out.println("Floor Key: " + getFloorKey());
        System.out.println("Floor Entry: " + getFloorEntry());
        System.out.println(getHeadMap());
        System.out.println(getTailMap());
        System.out.println(getSubMap());
        System.out.println(createATreeMapWithACustomizedComparator());
    }

    public static class CustomComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer number1, Integer number2) {
            int value =  number1.compareTo(number2);

            // elements are sorted in reverse order
            if (value > 0) {
                return -1;
            }
            else if (value < 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.load();
    }
}


