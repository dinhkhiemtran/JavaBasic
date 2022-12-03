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

    public java.util.TreeMap<String, Integer> createTreeMap() {
        java.util.TreeMap<String, Integer> treeMap = new java.util.TreeMap<>();
        return treeMap;
    }

    public java.util.TreeMap<String, Integer> putElements() {
        java.util.TreeMap<String, Integer> treeMap = createTreeMap();
        try {
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
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return treeMap;
    }

    public Set<String> getAllKeys(java.util.TreeMap<String, Integer> treeMap) {
        Set<String> keys = new HashSet<>();
        if (treeMap != null) {
            if (!treeMap.isEmpty()) {
                keys = treeMap.keySet();
                System.out.print("Keys: ");
            }
        }
        return keys;
    }

    public Collection<Integer> getAllValues(java.util.TreeMap<String, Integer> treeMap) {
        Collection<Integer> values = new ArrayList<>();
        if (treeMap != null) {
            if (!treeMap.isEmpty()) {
                values = treeMap.values();
                System.out.print("Values: ");
            }
        }
        return values;
    }

    public Set<Entry<String, Integer>> getAllEntries(java.util.TreeMap<String, Integer> treeMap) {
        Set<Entry<String, Integer>> entries = new HashSet<>();
        if (treeMap != null) {
            if (!treeMap.isEmpty()) {
                entries = treeMap.entrySet();
                System.out.print("Entries: ");
            }
        }
        return entries;
    }

    public Map<String, Integer> removeAnElementSpecified(java.util.TreeMap<String, Integer> treeMap) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (treeMap != null) {
                if (!treeMap.isEmpty()) {
                    System.out.print("Input key to remove: ");
                    String key = scanner.next();
                    if (treeMap.containsKey(key)) {
                        treeMap.remove(key);
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
        return treeMap;
    }

    public Map<String, Integer> replaceAnElement(java.util.TreeMap<String, Integer> treeMap) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (treeMap != null) {
                if (!treeMap.isEmpty()) {
                    System.out.print("Input a key to replace: ");
                    String key = scanner.next();
                    System.out.print("Input value to replace into: ");
                    Integer value = scanner.nextInt();
                    if (treeMap.containsKey(key)) {
                        treeMap.replace(key, value);
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return treeMap;
    }

    public <T> String getFirstKey(java.util.TreeMap<String, Integer> treeMap) {
        String firstKey = "";
        if (treeMap != null) {
            if (!treeMap.isEmpty()) {
                firstKey = treeMap.firstKey();
                System.out.print("First key: ");
            }
        }
        return firstKey;
    }

    public String getLastKey(java.util.TreeMap<String, Integer> treeMap) {
        String lastKey = "";
        if (treeMap != null) {
            if (!treeMap.isEmpty()) {
                lastKey = treeMap.lastKey();
                System.out.print("Last keys: ");
            }
        }
        return lastKey;
    }

    public Entry<String, Integer> getFirstEntry(java.util.TreeMap<String, Integer> treeMap) {
        Entry<String, Integer> firstEntry = null;
        if (treeMap != null) {
            if (!treeMap.isEmpty()) {
                firstEntry = treeMap.firstEntry();
                System.out.print("First entry: ");
            }
        }
        return firstEntry;
    }

    public Entry<String, Integer> getLastEntry(java.util.TreeMap<String, Integer> treeMap) {
        Entry<String, Integer> lastEntry = null;
        if (treeMap != null) {
            if (!treeMap.isEmpty()) {
                lastEntry = treeMap.lastEntry();
                System.out.print("Last entry: ");
            }
        }
        return lastEntry;
    }

    public String getHigherKey(java.util.TreeMap<String, Integer> treeMap) {
        Scanner scanner = new Scanner(System.in);
        String keysHigher = "";
        try {
            if (treeMap != null) {
                if (!treeMap.isEmpty()) {
                    System.out.print("Input a key(String) to a get higher: ");
                    String key = scanner.next();
                    if (treeMap.containsKey(key)) {
                        keysHigher = treeMap.higherKey(key);
                        System.out.print("Higher key: ");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return keysHigher;
    }

    public Entry<String, Integer> getHigherEntry(java.util.TreeMap<String, Integer> treeMap) {
        Scanner scanner = new Scanner(System.in);
        Entry<String, Integer> entryHigher = null;
        try {
            if (treeMap != null) {
                if (!treeMap.isEmpty()) {
                    System.out.print("Input a key(String) to get a higher entry: ");
                    String key = scanner.next();
                    if (treeMap.containsKey(key)) {
                        entryHigher = treeMap.higherEntry(key);
                        System.out.print("Entry higher: ");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return entryHigher;
    }


    public String getLowerKey(java.util.TreeMap<String, Integer> treeMap) {
        Scanner scanner = new Scanner(System.in);
        String keysLower = "";
        try {
            if (treeMap != null) {
                if (!treeMap.isEmpty()) {
                    System.out.print("Input a key(String) to a get lower key: ");
                    String key = scanner.next();
                    if (treeMap.containsKey(key)) {
                        keysLower = treeMap.lowerKey(key);
                        System.out.print("Lower key: ");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return keysLower;
    }

    public Entry<String, Integer> getLowerEntry(java.util.TreeMap<String, Integer> treeMap) {
        Scanner scanner = new Scanner(System.in);
        Entry<String, Integer> lowerEntry = null;
        try {
            if (treeMap != null) {
                if (!treeMap.isEmpty()) {
                    System.out.print("Input a key(String) to get a lower key: ");
                    String key = scanner.next();
                    if (treeMap.containsKey(key)) {
                        lowerEntry = treeMap.lowerEntry(key);
                        System.out.print("Lower entry: ");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type. ");
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return lowerEntry;
    }

    public String getCeilingKey(java.util.TreeMap<String, Integer> treeMap) {
        Scanner scanner = new Scanner(System.in);
        String ceilingKey = null;
        try {
            if (treeMap != null) {
                if (!treeMap.isEmpty()) {
                    System.out.print("Input key to get a ceiling key: ");
                    String key = scanner.next();
                    if (treeMap.containsKey(key)) {
                        ceilingKey = treeMap.ceilingKey(key);
                        System.out.print("Ceiling key: ");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return ceilingKey;
    }

    public Entry<String, Integer> getCeilingEntry(java.util.TreeMap<String, Integer> treeMap) {
        Scanner scanner = new Scanner(System.in);
        Entry<String, Integer> ceilingEntry = null;
        try {
            if (treeMap != null) {
                if (!treeMap.isEmpty()) {
                    System.out.print("Input a key(String) to get a ceiling entry: ");
                    String key = scanner.next();
                    if (treeMap.containsKey(key)) {
                        ceilingEntry = treeMap.ceilingEntry(key);
                        System.out.print("Ceiling entry: ");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type");
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
        return ceilingEntry;
    }

    public String getFloorKey(java.util.TreeMap<String, Integer> treeMap) {
        Scanner scanner = new Scanner(System.in);
        String floorKey = " ";
        try {
            if (treeMap != null) {
                if (!treeMap.isEmpty()) {
                    System.out.print("Input a key(String) to get a floor key: ");
                    String key = scanner.next();
                    if (treeMap.containsKey(key)) {
                        floorKey = treeMap.floorKey(key);
                        System.out.print("Floor key: ");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return floorKey;
    }

    public Entry<String, Integer> getFloorEntry(java.util.TreeMap<String, Integer> treeMap) {
        Scanner scanner = new Scanner(System.in);
        Entry<String, Integer> floorEntry = null;
        try {
            if (treeMap != null) {
                if (!treeMap.isEmpty()) {
                    System.out.print("Input a key(String) to get floor entry: ");
                    String key = scanner.next();
                    if (treeMap.containsKey(key)) {
                        floorEntry = treeMap.floorEntry(key);
                        System.out.print("Floor Entry: ");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return floorEntry;
    }

    public java.util.TreeMap<String, Integer> getHeadMap(java.util.TreeMap<String, Integer> treeMap) {
        Scanner scanner = new Scanner(System.in);
        java.util.TreeMap<String, Integer> results = new java.util.TreeMap<>();
        try {
            if (treeMap != null) {
                if (!treeMap.isEmpty()) {
                    System.out.print("Input a key(String) to get head map: ");
                    String key = scanner.next();
                    if (treeMap.containsKey(key)) {
                        results.putAll(treeMap.headMap(key));
                        System.out.print("Head map: ");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + inputMismatchException.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return results;
    }

    public Map<String, Integer> getTailMap(java.util.TreeMap<String, Integer> treeMap) {
        Scanner scanner = new Scanner(System.in);
        java.util.TreeMap<String, Integer> results = new java.util.TreeMap<>();
        try {
            if (treeMap != null) {
                if (!treeMap.isEmpty()) {
                    System.out.print("Input a key(String) to get tail map: ");
                    String key = scanner.next();
                    if (treeMap.containsKey(key)) {
                        results.putAll(treeMap.tailMap(key));
                        System.out.print("Tail map: ");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return treeMap;
    }

    public Map<String, Integer> getSubMap(java.util.TreeMap<String, Integer> treeMap) {
        Scanner scanner = new Scanner(System.in);
        java.util.TreeMap<String, Integer> results = new java.util.TreeMap<>();
        try {
            if (treeMap != null) {
                if (!treeMap.isEmpty()) {
                    System.out.print("Input a key(String) start: ");
                    String keyStart = scanner.next();
                    System.out.print("Input a key(String) end: ");
                    String keyEnd = scanner.next();
                    if (treeMap.containsKey(keyStart) && treeMap.containsKey(keyEnd)) {
                        results.putAll(treeMap.subMap(keyStart, true, keyEnd, true));
                        System.out.print("Sub map: ");
                    }
                }
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception: " + "Input wrong type.");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return results;
    }

    //Reverse Map Customized Comparator
    public java.util.TreeMap<String,Integer> createATreeMapWithACustomizedComparator(){
        java.util.TreeMap<String, Integer> treeMapReverse = new java.util.TreeMap<>(new CustomComparator());
        return treeMapReverse;
    }

    public java.util.TreeMap<String, Integer> getATreeMapReverse(java.util.TreeMap<String, Integer> treeMap){
        java.util.TreeMap<String, Integer> treemapReverse = createATreeMapWithACustomizedComparator();
        if (treeMap != null){
            if (!treeMap.isEmpty()){
                treemapReverse.putAll(treeMap);
                System.out.print("Reverse: ");
            }
        }
        return treemapReverse;
    }

    public void print(java.util.TreeMap<String, Integer> treeMap){
        if (treeMap != null){
            System.out.print("Tree Map: ");
            treeMap.forEach((keys, values) -> System.out.print(keys + ":" + values + ", "));
        }
        System.out.println();
    }

    public java.util.TreeMap<String, Integer> removeAllElements(java.util.TreeMap<String,Integer> treeMap){
        if (treeMap != null){
            if (!treeMap.isEmpty()){
                treeMap.clear();
            }
        }
        return treeMap;
    }

    public void load() {
        java.util.TreeMap<String, Integer> treeMap = putElements();
        print(treeMap);
        System.out.println(getAllKeys(treeMap));
        System.out.println(getAllValues(treeMap));
        System.out.println(getAllEntries(treeMap));
        System.out.println(getFirstKey(treeMap));
        System.out.println(getFirstEntry(treeMap));
        System.out.println(getLastKey(treeMap));
        System.out.println(getLastEntry(treeMap));
        System.out.println(getHigherKey(treeMap));
        System.out.println(getHigherEntry(treeMap));
        System.out.println(getLowerKey(treeMap));
        System.out.println(getLowerEntry(treeMap));
        System.out.println(getCeilingKey(treeMap));
        System.out.println(getCeilingEntry(treeMap));
        System.out.println(getFloorKey(treeMap));
        System.out.println(getFloorEntry(treeMap));
        System.out.println(getHeadMap(treeMap));
        System.out.println(getTailMap(treeMap));
        System.out.println(getSubMap(treeMap));
        System.out.println(replaceAnElement(treeMap));
        System.out.println(removeAnElementSpecified(treeMap));
        System.out.println(getATreeMapReverse(treeMap));
        System.out.println(removeAllElements(treeMap));
    }

    public static class CustomComparator implements Comparator<String> {

        @Override
        public int compare(String str1, String str2) {
            int value = str1.compareTo(str2);

            // elements are sorted in reverse order
            if (value > 0) {
                return -1;
            } else if (value < 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.load();
    }
}


