package com.sunshine.api.manager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ApiConfig {
    private List<XmlField> configs;

    public static ApiConfig instance() throws IOException {
        InputStream is = ApiConfig.class.getResourceAsStream("/config.json");
        List<String> lines = IOUtils.readLines(is, "utf-8");
        StringBuffer sb = new StringBuffer();
        for(String line : lines) {
            sb.append(line);
        }
        String content = sb.toString();
        List<XmlField> configs = new Gson().fromJson(content, new TypeToken<List<XmlField>>(){}.getType());
        ApiConfig apiConfig = new ApiConfig(configs);
        return apiConfig;
    }

    public ApiConfig(List<XmlField> configs) {
        this.configs = configs;
    }

    public List<XmlField> getConfigs() {
        List<XmlField> tmp = new ArrayList<XmlField>(configs);
        return tmp;
    }
}
