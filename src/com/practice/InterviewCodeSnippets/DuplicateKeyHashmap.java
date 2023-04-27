package com.practice.InterviewCodeSnippets;

import java.util.HashMap;
import java.util.Map;

public class DuplicateKeyHashmap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("key1","value");
        map.put("key1","value");// will do nothing, overwrite happens if change in value
        for (Map.Entry<String,String> entry : map.entrySet())
            System.out.println(entry);
    }
}
