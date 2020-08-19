package com.connexta.util;

import java.util.HashMap;
import java.util.Map;

public class MapFactory {

  public static <K, V> Map<K, V> mapOf() {
    return new HashMap<>();
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1) {
    Map<K, V> map = new HashMap<>(1);
    map.put(k1, v1);
    return map;
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2) {
    Map<K, V> map = new HashMap<>(2);
    map.put(k1, v1);
    map.put(k2, v2);
    return map;
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3) {
    Map<K, V> map = new HashMap<>(2);
    map.put(k1, v1);
    map.put(k2, v2);
    map.put(k3, v3);
    return map;
  }

  public static <K, V> Map<K, V> mapOf(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
    Map<K, V> map = new HashMap<>(2);
    map.put(k1, v1);
    map.put(k2, v2);
    map.put(k3, v3);
    map.put(k4, v4);
    return map;
  }
}
