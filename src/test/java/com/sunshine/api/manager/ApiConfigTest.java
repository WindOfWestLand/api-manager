package com.sunshine.api.manager;

import com.google.gson.Gson;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ApiConfigTest {

    @Test
    public void smokeTest() throws IOException {
        ApiConfig apiConfig = ApiConfig.instance();
        List<XmlField> configs = apiConfig.getConfigs();
        System.out.println(new Gson().toJson(configs));
    }
}
