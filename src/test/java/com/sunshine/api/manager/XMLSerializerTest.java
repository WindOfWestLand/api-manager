package com.sunshine.api.manager;

import org.json.JSONObject;
import org.json.XML;
import org.junit.Test;

public class XMLSerializerTest {

    @Test
    public void smokeTest() {
        String json_data = "{\"student\":{\"name\":\"Neeraj Mishra\", \"age_test\":\"22\"}}";
        JSONObject obj = new JSONObject(json_data);

        //converting json to xml
        String xml_data = XML.toString(obj);

        System.out.println(xml_data);
    }
}
