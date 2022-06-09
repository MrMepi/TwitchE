package com.twitche.twitche.Controller;

import com.twitche.twitche.SettingsDefault;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class SettingsController implements Initializable {

    @FXML
    private TextField BadgePer;

    @FXML
    private TextField BadgePricePer;

    @FXML
    private TextField animatedPrice;

    @FXML
    private TextField badgePrice;

    @FXML
    private TextField emorePerSpecial;

    @FXML
    private TextField emotePer;

    @FXML
    private TextField emotePrice;

    @FXML
    private TextField emotePricePer;

    @FXML
    private TextField emoteSpecialOffer;

    @FXML
    private BorderPane mainWindows;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String data = "";
        try {
            File file = new File("settings.txt");
            if(file.exists()) {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    data += scanner.nextLine() + "\n";
                }
                scanner.close();
                String[] split = data.split("\n");
                emotePrice.setText(split[0]);
                badgePrice.setText(split[1]);
                animatedPrice.setText(split[2]);
                emotePer.setText(split[3]);
                emotePricePer.setText(split[4]);
                BadgePer.setText(split[5]);
                BadgePricePer.setText(split[6]);
                emorePerSpecial.setText(split[7]);
                emoteSpecialOffer.setText(split[8]);
            } else {
                emotePrice.setText(String.valueOf(SettingsDefault.getCostEmotes()));
                badgePrice.setText(String.valueOf(SettingsDefault.getCostBadge()));
                animatedPrice.setText(String.valueOf(SettingsDefault.getCostAnimated()));
                emotePer.setText(String.valueOf(SettingsDefault.getEmotesPer()));
                emotePricePer.setText(String.valueOf(SettingsDefault.getCostEmotesProm()));
                BadgePer.setText(String.valueOf(SettingsDefault.getBadgesPer()));
                BadgePricePer.setText(String.valueOf(SettingsDefault.getCostBadgeProm()));
                emorePerSpecial.setText(String.valueOf(SettingsDefault.getHowMuchToPromotion()));
                emoteSpecialOffer.setText(String.valueOf(SettingsDefault.getPromo()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    @FXML
    void saveSettings() throws IOException {

        PrintWriter writer = new PrintWriter("settings.txt");
        writer.print("");
        writer.close();

        try (FileWriter fileWriter = new FileWriter("settings.txt", true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            printWriter.println(emotePrice.getText());
            printWriter.println(badgePrice.getText());
            printWriter.println(animatedPrice.getText());

            printWriter.println(emotePer.getText());
            printWriter.println(emotePricePer.getText());

            printWriter.println(BadgePer.getText());
            printWriter.println(BadgePricePer.getText());

            printWriter.println(emorePerSpecial.getText());
            printWriter.println(emoteSpecialOffer.getText());
        } catch (IOException e) {

        }
        contexChange = false;
    }
    boolean contexChange = false;
    @FXML
    void anyChange(KeyEvent event) {
        contexChange = true;
    }
    @FXML
    public void exitApplication(ActionEvent event) {
        System.out.println("test");
    }
}
