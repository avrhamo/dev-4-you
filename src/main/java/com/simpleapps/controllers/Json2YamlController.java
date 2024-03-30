package com.simpleapps.controllers;

import com.simpleapps.dev4you.tabs.json2yaml.Json2YamlConvertor;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

//   fx:controller="com.simpleapps.controllers.Json2YamlController"
public class Json2YamlController {
    @FXML
    private Tab json2yamlTab;
    @FXML
    private TextArea jsonTextArea;
    @FXML
    private RadioButton json2YamlRadioButton;
    @FXML
    private RadioButton yaml2JsonRadioButton;
    @FXML
    private TextArea yamlTextArea;

    @FXML
    public void initialize() {
        ToggleGroup toggleGroup = new ToggleGroup();
        json2YamlRadioButton.setToggleGroup(toggleGroup);
        yaml2JsonRadioButton.setToggleGroup(toggleGroup);
        json2YamlRadioButton.setSelected(true);

        json2YamlRadioButton.setOnAction(event -> convertJson2Yaml());
        yaml2JsonRadioButton.setOnAction(event -> convertYaml2Json());
    }

    private void convertYaml2Json() {
//        jsonTextArea.setText("");
    }

    private void convertJson2Yaml() {
        yamlTextArea.clear();
        yamlTextArea.setText(new Json2YamlConvertor().convertJson2Yaml(jsonTextArea.getText()));
    }


}
