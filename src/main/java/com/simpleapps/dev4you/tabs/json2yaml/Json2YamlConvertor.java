package com.simpleapps.dev4you.tabs.json2yaml;

import java.io.IOException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class Json2YamlConvertor {


    public String convertJson2Yaml(String json2Convert) {
        String yaml = "";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(json2Convert);
            yaml = convertJsonToYaml(jsonNode);

        } catch (IOException e) {
            System.out.println("Error converting JSON to YAML: " + e.getMessage());
        }
        return yaml;
    }

    private String convertJsonToYaml(JsonNode jsonNode) throws IOException {
        ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());

        return yamlMapper.writeValueAsString(jsonNode);
    }


}
