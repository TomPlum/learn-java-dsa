# Learning Data Structures & Algorithms in Java

# Data Structures
* Enumeration
* BitSet
* Vector
* Stack
* Dictionary
* Hashtable
* Properties

# Collection Interfaces
* Collections Interface
* List Interface 
* Set
* SortedSet
* Map
* Map.Entry
* SortedMap
* Enumeration

# Collection Classes
* AbstractCollection
* AbstractList
* AbstractSequentialList
* [LinkedList](###LinkedList)
* ArrayList
* AbstractSet
* HashSet
* LinkedHashSet
* TreeSet
* AbstractMap
* [HashMap](###HashMap)
* TreeMap
* WeakHashMap
* LinkedHashMap
* IdentityHashMap

## Collection Interfaces

### Set
Interface Set\<E\> [JavaDoc](https://docs.oracle.com/javase/8/docs/api/java/util/Set.html)

#### Key Info
* A collection that contains no duplicate elements.

## Collection Classes

### LinkedList

### HashMap
HashMap<K, V> extends AbstractMap<K, V> implements Map<K, V>
Default Initial Capacity: 16, Load Factor: 0.75.
[JavaDoc](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)

#### Key Info
* To access a value, you must know its key.
* [Hashing](quiz.geeksforgeeks.org/hashing-set-1-introduction/) is the technique of converting a large String to a small String that represents the same String. The shorter value helps in indexing and faster searches.
* It internally uses a LinkedList to store Key:Value pairs. It contains an array of Node, a class with four fields (`int` hash, `K` key, `V` value, `Node` next). 
* They don't allow duplicate keys, but do allow duplicate values. They allow null values, but only a single null key. Likewise, multiple null values.
* This class makes no guarantee that it's order will be maintained over time. It is 'unsynchronised', also meaning that multiple threads can access it simultaneously.

#### Algorithmic Complexity
* Time Complexity: O(1) (Constant Time) for basic operations like `get()` and `put()`. Iteration over a HashMap is directly proportional to the `capacity + size` where the capacity is the number of buckets.
* Performance of a HashMap is dependent on it's *Initial Capacity* and it's *Load Factor*.
    * **Initial Capacity:** The number of buckets in the HashMap upon instantiation.
    * **Load Factor:** A measure of how full the hash table is allowed to get before it's capacity is automatically rehashed. [Good Explanation](https://stackoverflow.com/questions/10901752/what-is-the-significance-of-load-factor-in-hashmap).