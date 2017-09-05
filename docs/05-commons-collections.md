<!-- .slide: data-background="img/background-violet-orig.jpg" data-state="intro" class="center" -->
## Components <!-- .element: class="heading" style="text-align: center;"-->
### Apache Commons Collections <!-- .element: class="heading" style="text-align: center;"-->

---

### Introduction

<!-- .slide: class="center" -->

Your Swiss Army Knife for Java Collections

![](img/swiss-army-knife.jpeg)

---

### Utils, Utils, Utils!

ListUtils:

```java
List<List<Integer>> partitions = ListUtils.partition(numbers, 2);
```

SetUtils:

```java
Set<String> intersection = SetUtils.intersection(someSet, anotherSet);
```

MapUtils

```java
String value = MapUtils.getString(map, "key", "fallback");
```

More: `ComperatorUtils`, `IterableUtils`, `QueueUtils`,...

---

### Additional Collection Implementations

For example BidiMap: Bidirectional Mapping between key and value

```java
BidiMap<String, Integer> map = new DualHashBidiMap<>();
map.put("one", 1);
map.put("two", 2);
map.put("three", 3);

Integer twoValue = map.get("two");
String twoKey = map.getKey(2);
```

More: `Bag`, `MultiValuedMap`, `Trie`,...

---

### FluentIterables

Get the first three even numbers as String

```java
List<String> result =
  FluentIterable
      .of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
      .filter(i -> i % 2 == 0)
      .transform(stringValueTransformer())
      .limit(3)
      .toList();
```

---

### Considerations & Limitations

- Commons Collections had functional concepts since ever
- Java 7 compatibility prevents usage of Java 8 functional interfaces
- Duplication of functionality between Java 8 Stream API and Commons Collections
