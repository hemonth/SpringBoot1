package com.hemonth.test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hemonth.domain.ExecuteOffer;

import java.io.File;
import java.io.IOException;

public class MyJsonDeserializer {
    public static void main(String[] args) throws IOException {

        ExecuteOffer executeOffer = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .readValue(new File("C:\\Users\\JCNT219\\Desktop\\executeOffer.json"), ExecuteOffer.class);
        System.out.println("ExecuteOffer::::::::::"+"\n"+executeOffer);
    }
}
