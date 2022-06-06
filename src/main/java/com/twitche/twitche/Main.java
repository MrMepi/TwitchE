package com.twitche.twitche;

import com.twitche.twitche.Controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main.fxml"));
        Scene scene = fxmlLoader.load();

        stage.setTitle("TwitchE - MrMepi & Doootka");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        MainController.setInstance((MainController) fxmlLoader.getController());
    }

    public static void main(String[] args) {
        launch();
    }
}