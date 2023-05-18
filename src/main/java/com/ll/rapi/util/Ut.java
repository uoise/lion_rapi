package com.ll.rapi.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Ut {
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class json {
        public static String toStr(Object obj) {
            try {
                return new ObjectMapper().writeValueAsString(obj);
            } catch (JsonProcessingException e) {
                return null;
            }
        }

        public static Map<String, Object> toMap(String jsonStr) {
            try {
                return new ObjectMapper().readValue(jsonStr, LinkedHashMap.class);
            } catch (JsonProcessingException e) {
                return Collections.emptyMap();
            }
        }
    }
}