package com.twitche.twitche.Controller;

import com.twitche.twitche.Size;
import com.twitche.twitche.Type;
import com.twitche.twitche.Utils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.stage.FileChooser;
import javafx.embed.swing.SwingFXUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.List;

public class MainController {

    //region
    @FXML
    private VBox Box1x1;

    @FXML
    private VBox Box1x2;

    @FXML
    private VBox Box1x3;

    @FXML
    private VBox Box1x4;

    @FXML
    private VBox Box1x5;

    @FXML
    private VBox Box1x6;

    @FXML
    private VBox Box2x1;

    @FXML
    private VBox Box2x2;

    @FXML
    private VBox Box2x3;

    @FXML
    private VBox Box2x4;

    @FXML
    private VBox Box2x5;

    @FXML
    private VBox Box2x6;

    @FXML
    private VBox Box3x1;

    @FXML
    private VBox Box3x2;

    @FXML
    private VBox Box3x3;

    @FXML
    private VBox Box3x4;

    @FXML
    private VBox Box3x5;

    @FXML
    private VBox Box3x6;

    @FXML
    private Button Button1x1;

    @FXML
    private Button Button1x2;

    @FXML
    private Button Button1x3;

    @FXML
    private Button Button1x4;

    @FXML
    private Button Button1x5;

    @FXML
    private Button Button1x6;

    @FXML
    private Button Button2x1;

    @FXML
    private Button Button2x2;

    @FXML
    private Button Button2x3;

    @FXML
    private Button Button2x4;

    @FXML
    private Button Button2x5;

    @FXML
    private Button Button2x6;

    @FXML
    private Button Button3x1;

    @FXML
    private Button Button3x2;

    @FXML
    private Button Button3x3;

    @FXML
    private Button Button3x4;

    @FXML
    private Button Button3x5;

    @FXML
    private Button Button3x6;

    @FXML
    private TextField TF1x1;

    @FXML
    private TextField TF1x2;

    @FXML
    private TextField TF1x3;

    @FXML
    private TextField TF1x4;

    @FXML
    private TextField TF1x5;

    @FXML
    private TextField TF1x6;

    @FXML
    private TextField TF2x1;

    @FXML
    private TextField TF2x2;

    @FXML
    private TextField TF2x3;

    @FXML
    private TextField TF2x4;

    @FXML
    private TextField TF2x5;

    @FXML
    private TextField TF2x6;

    @FXML
    private TextField TF3x1;

    @FXML
    private TextField TF3x2;

    @FXML
    private TextField TF3x3;

    @FXML
    private TextField TF3x4;

    @FXML
    private TextField TF3x5;

    @FXML
    private TextField TF3x6;

    @FXML
    private ImageView img1x1;

    @FXML
    private ImageView img1x2;

    @FXML
    private ImageView img1x3;

    @FXML
    private ImageView img1x4;

    @FXML
    private ImageView img1x5;

    @FXML
    private ImageView img1x6;

    @FXML
    private ImageView img2x1;

    @FXML
    private ImageView img2x2;

    @FXML
    private ImageView img2x3;

    @FXML
    private ImageView img2x4;

    @FXML
    private ImageView img2x5;

    @FXML
    private ImageView img2x6;

    @FXML
    private AnchorPane Emote;

    @FXML
    private AnchorPane mainWindows;
    //endregion

    Map<Button, TextField> buttonList = new HashMap<>();
    List<VBox> vBoxs = new ArrayList<>();
    int x = 156, y = 228, w = 448, h = 448;
    String filename = "";
    Image img2 = null;

    public void initialize(){

        vBoxs.add(Box1x1);
        vBoxs.add(Box1x2);
        vBoxs.add(Box1x3);
        vBoxs.add(Box1x4);
        vBoxs.add(Box1x5);
        vBoxs.add(Box1x6);
        vBoxs.add(Box2x1);
        vBoxs.add(Box2x2);
        vBoxs.add(Box2x3);
        vBoxs.add(Box2x4);
        vBoxs.add(Box2x5);
        vBoxs.add(Box2x6);
        vBoxs.add(Box3x1);
        vBoxs.add(Box3x2);
        vBoxs.add(Box3x3);
        vBoxs.add(Box3x4);
        vBoxs.add(Box3x5);
        vBoxs.add(Box3x6);

        buttonList.put(Button1x1, TF1x1);
        buttonList.put(Button1x2, TF1x2);
        buttonList.put(Button1x3, TF1x3);
        buttonList.put(Button1x4, TF1x4);
        buttonList.put(Button1x5, TF1x5);
        buttonList.put(Button1x6, TF1x6);
        buttonList.put(Button2x1, TF2x1);
        buttonList.put(Button2x2, TF2x2);
        buttonList.put(Button2x3, TF2x3);
        buttonList.put(Button2x4, TF2x4);
        buttonList.put(Button2x5, TF2x5);
        buttonList.put(Button2x6, TF2x6);
        buttonList.put(Button3x1, TF3x1);
        buttonList.put(Button3x2, TF3x2);
        buttonList.put(Button3x3, TF3x3);
        buttonList.put(Button3x4, TF3x4);
        buttonList.put(Button3x5, TF3x5);
        buttonList.put(Button3x6, TF3x6);
        vBoxSetVisible(false);
    }

    @FXML
    void changeTo(ActionEvent event)
    {
        changeButton((Button)event.getTarget());
    }

    @FXML
    void openFile(ActionEvent event) throws Exception {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("png", "*.png"));
        fileChooser.setTitle("Open Resource File");
        File selectedFile = fileChooser.showOpenDialog(mainWindows.getScene().getWindow());

        if (selectedFile != null) {
            setImgToMainWindow(mainWindows, selectedFile);
        }
    }

    @FXML
    void ExportTo(ActionEvent event) throws IOException {

        TextInputDialog dialog = new TextInputDialog("150x150");

        dialog.setTitle("Size");
        dialog.setHeaderText("Size:");
        dialog.setContentText("Size:");
        Optional<String> result = dialog.showAndWait();

        if(!result.isEmpty()) {
            String size[] = result.get().split("x");

            List<Button> emote = new ArrayList<>();
            List<Button> badge = new ArrayList<>();

            new File(filename).mkdirs();

            for (Button button : buttonList.keySet()) {
                if (button.getText().equals(Type.Emote.name())) emote.add(button);
                if (button.getText().equals(Type.Badge.name())) badge.add(button);
            }

            exportAllImg(emote, Integer.parseInt(size[0]), Integer.parseInt(size[1]));
            exportAllImg(badge, Integer.parseInt(size[0]), Integer.parseInt(size[1]));
        }
    }
    @FXML
    void Export(ActionEvent event) throws IOException {
        List<Button> emote = new ArrayList<>();
        List<Button> badge = new ArrayList<>();
        mainWindows.setCursor(Cursor.WAIT);
        for (Button button: buttonList.keySet()) {
            if(button.getText().equals(Type.Emote.name())) emote.add(button);
            if(button.getText().equals(Type.Badge.name())) badge.add(button);
        }
        new File(filename).mkdirs();

        List<Size> emoteSize = new ArrayList<Size>();
        emoteSize.add(new Size(448,448));
        emoteSize.add(new Size(112,112));
        emoteSize.add(new Size(56,56));
        emoteSize.add(new Size(28,28));
        export(emote,emoteSize);

        List<Size> badgesSize = new ArrayList<Size>();
        badgesSize.add(new Size(72,72));
        badgesSize.add(new Size(36,36));
        badgesSize.add(new Size(18,18));
        export(badge,badgesSize);

        mainWindows.setCursor(Cursor.DEFAULT);
    }
    @FXML
    void mouseClicked(MouseEvent event) throws IOException {
        List<Button> emote = new ArrayList<>();
        if (event.getButton() == MouseButton.SECONDARY) {

            if (!Emote.isVisible()) Emote.setVisible(true);

            for (Button button : buttonList.keySet()) {
                if (button.getId().equals(((Button) event.getTarget()).getId()))
                    emote.add(button);
            }

            for (Button b : emote) {
                String text = b.getId().substring(b.getId().length() - 3, b.getId().length());

                int t = Integer.parseInt(text.substring(0, 1));
                int r = Integer.parseInt(text.substring(2, 3));

                Image i112x112,i72x72,i56x56,i36x36,i28x28,i18x18;

                i112x112 = Utils.cropImage(SwingFXUtils.fromFXImage(img2, null),
                        w, h, x + ((448 * (r - 1)) + (100 * (r - 1))), y + ((448 * (t - 1)) + (100 * (t - 1))),
                        112, 112);
                i72x72 = Utils.cropImage(SwingFXUtils.fromFXImage(img2, null),
                        w, h, x + ((448 * (r - 1)) + (100 * (r - 1))), y + ((448 * (t - 1)) + (100 * (t - 1))),
                        72, 72);
                i56x56 = Utils.cropImage(SwingFXUtils.fromFXImage(img2, null),
                        w, h, x + ((448 * (r - 1)) + (100 * (r - 1))), y + ((448 * (t - 1)) + (100 * (t - 1))),
                        56, 56);
                i36x36 = Utils.cropImage(SwingFXUtils.fromFXImage(img2, null),
                        w, h, x + ((448 * (r - 1)) + (100 * (r - 1))), y + ((448 * (t - 1)) + (100 * (t - 1))),
                        36, 36);
                i28x28 = Utils.cropImage(SwingFXUtils.fromFXImage(img2, null),
                        w, h, x + ((448 * (r - 1)) + (100 * (r - 1))), y + ((448 * (t - 1)) + (100 * (t - 1))),
                        28, 28);
                i18x18 = Utils.cropImage(SwingFXUtils.fromFXImage(img2, null),
                        w, h, x + ((448 * (r - 1)) + (100 * (r - 1))), y + ((448 * (t - 1)) + (100 * (t - 1))),
                        18, 18);

                img1x1.setImage(i112x112);
                img1x2.setImage(i72x72);
                img1x3.setImage(i56x56);
                img1x4.setImage(i36x36);
                img1x5.setImage(i28x28);
                img1x6.setImage(i18x18);

                img2x1.setImage(i112x112);
                img2x2.setImage(i72x72);
                img2x3.setImage(i56x56);
                img2x4.setImage(i36x36);
                img2x5.setImage(i28x28);
                img2x6.setImage(i18x18);
            }
        }
    }
    @FXML
    void readFile(DragEvent event) {
        Dragboard db = event.getDragboard();
        File file = new File(db.getFiles().get(0).getPath());

        setImgToMainWindow(mainWindows,file);
    }


    @FXML
    void dragOver(DragEvent event) {
        if (event.getDragboard().hasFiles()) {
            event.acceptTransferModes(TransferMode.LINK);
        }
    }

    public void setImgToMainWindow(AnchorPane mainWindows, File file){
        Image img =  SwingFXUtils.toFXImage(Utils.resizeImage(SwingFXUtils.fromFXImage(new Image(file.getPath()),null), (int)mainWindows.getWidth(), (int)mainWindows.getHeight()),null);
        img2 = new Image(file.getPath());
        filename = file.getPath().replace(".png","");

        BackgroundImage bImg = new BackgroundImage(img,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background bGround = new Background(bImg);

        mainWindows.setBackground(bGround);
        vBoxSetVisible(true);
    }

    public void vBoxSetVisible(Boolean visible){
        for (VBox box: vBoxs) {
            box.setVisible(visible);
            box.setManaged(visible);
        }
    }

    public void changeButton(Button button){
        if(Type.None.name().equals(button.getText())) {
            button.setStyle("-fx-background-color: rgba(0,255,0,0.1)");
            button.setText(Type.Emote.name());
        } else if(Type.Emote.name().equals(button.getText())){
            button.setStyle("-fx-background-color: rgba(255,128,0,0.1)");
            button.setText(Type.Badge.name());
        } else if(Type.Badge.name().equals(button.getText())){
            button.setStyle("-fx-background-color: rgba(255,255,255,0.1)");
            button.setText(Type.None.name());
        }
    }

    public void exportAllImg(List<Button> listButton, int wight, int hight) {
        for (Button b : listButton){
            String text = b.getId().substring(b.getId().length()-3, b.getId().length());

            int t = Integer.parseInt(text.substring(0,1));
            int r = Integer.parseInt(text.substring(2,3));

            Utils.cropImageAndSaveToFile(SwingFXUtils.fromFXImage(img2, null),
                    w, h, x + ((448 * (r-1)) + (100 * (r-1))), y +  ((448 * (t-1)) + (100 * (t-1))),
                    filename + "/" + buttonList.get(b).getText(),
                    wight ,hight);
        }
    }

    public void export(List<Button> buttons, List<Size> sizes)
    {
        for (Button b : buttons){
            String text = b.getId().substring(b.getId().length()-3, b.getId().length());

            int t = Integer.parseInt(text.substring(0,1));
            int r = Integer.parseInt(text.substring(2,3));
            for(Size size: sizes) {
                Utils.cropImageAndSaveToFile(SwingFXUtils.fromFXImage(img2, null),
                        w, h, x + ((448 * (r - 1)) + (100 * (r - 1))), y + ((448 * (t - 1)) + (100 * (t - 1))),
                        filename + "/" + buttonList.get(b).getText(),
                        size.getWidth(), size.getHeight());
            }
        }
    }
}