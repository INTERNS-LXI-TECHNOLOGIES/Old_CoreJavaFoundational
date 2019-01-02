package com.lxisoft.view.controller;

import java.io.*;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;

public class ViewController {

    public Pane loadMenu() throws IOException{

        FXMLLoader a = new FXMLLoader();

        a.setLocation(getClass().getResource("/model/menu.fxml"));

        return (Pane) a.load();

    }

}