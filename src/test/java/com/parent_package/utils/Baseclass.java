package com.parent_package.utils;

import io.cucumber.core.internal.com.fasterxml.jackson.core.type.TypeReference;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.JsonNode;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Baseclass {
    ObjectMapper objectMapper;
    HashMap<String,String> map;
    public HashMap<String, String> getTestData(String jsonName) throws IOException {
        String basePath=System.getProperty("user.dir");
        File file=new File(basePath+"/src/test/resources/test-input.json");
        objectMapper=new ObjectMapper();
        JsonNode jsonNode= objectMapper.readValue(new String(Files.readAllBytes(file.toPath())), JsonNode.class);
        Iterator<Map.Entry<String,JsonNode>> iterator=jsonNode.fields();
        while (iterator.hasNext()){
            Map.Entry<String, JsonNode> entry = iterator.next();
            if(entry.getKey().equalsIgnoreCase(jsonName)){
              map= objectMapper.convertValue(entry.getValue(), new TypeReference<HashMap<String, String>>() {});
            }

        }
       // String jsonString=new String(Files.readAllBytes(file.toPath()));
       return map;
    }

}
