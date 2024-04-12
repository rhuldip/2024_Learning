package com.rhuldip.javalang;

class CollectionSyntaxTutorial{
  public static void main(String args[]){
    Map<String, List<String>> mapOfStringToList = new HashMap<>();
    
    // method computeIfAbsent
    String key = "key";
    mapOfStringToList.computeIfAbsent(key, key -> new ArrayList<>()).add("Hello");

    // cast to List<List<String>> from mapOfStringToList values
    List<List<String>> listOfListOfStr = new ArrayList<>(mapOfStringToList.values());
  }
}
