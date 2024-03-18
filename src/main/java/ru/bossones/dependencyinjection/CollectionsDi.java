package ru.bossones.dependencyinjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public record CollectionsDi(List<String> stringList, Set<Integer> integerSet, Map<Integer, String> stringMap) {
}
