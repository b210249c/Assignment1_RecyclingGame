package com.jamieleen.assignment1;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;

public class RecyclingGame extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Background image
        Image image = new Image(RecyclingGame.class.getResource("background.png").toString(), 1000,700,false,true);
        BackgroundImage bI = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);

        //BorderPane
        BorderPane borderPane = new BorderPane();

        //Setting the background of the borderpane
        borderPane.setBackground(new Background(bI));

        //Setting the position and calling the specific method
        borderPane.setTop(TopBar());
        borderPane.setCenter(CenterText());

        //Scene
        Scene scene = new Scene(borderPane, 1000, 700);

        //Title of the stage
        stage.setTitle("Greenify");

        stage.setScene(scene);

        //Setting the resizability of the window
        stage.setResizable(false);

        //Show stage
        stage.show();
    }

    public FlowPane TopBar(){
        //Left
        //Game Title
        Text gameTitle = new Text("GREENIFY");
        //Setting the font of the game title
        gameTitle.setFont(Font.font("Eras Demi ITC", 21));
        //Adding the text on the HBox layout
        HBox leftHBox = new HBox(gameTitle);
        leftHBox.setPadding(new Insets(10,0,0,0));

        //Center
        //Menu
        Menu menu = new Menu("Menu");
        Menu about = new Menu("About");
        Menu option = new Menu("Options");
        //Adding all the menu on the MenuBar control
        MenuBar middleMenuBar = new MenuBar(menu, about, option);
        middleMenuBar.setStyle("-fx-background-color: transparent; -fx-font-weight: bold; -fx-font-size: 15;");
        middleMenuBar.setPadding(new Insets(10,0,10,0));

        //Right
        //Facebook Icon
        Image imageFB = new Image(RecyclingGame.class.getResource("facebook.png").toString());
        ImageView imageViewFB = new ImageView(imageFB);
        //Setting the height and the width of the Facebook Icon
        imageViewFB.setFitHeight(30);
        imageViewFB.setFitWidth(30);

        //Instagram Icon
        Image imageInsta = new Image(RecyclingGame.class.getResource("instagram.png").toString());
        ImageView imageViewInsta = new ImageView(imageInsta);
        //Setting the height and the width of the Instagram Icon
        imageViewInsta.setFitHeight(30);
        imageViewInsta.setFitWidth(30);

        //Twitter Icon
        Image imageTwitter = new Image(RecyclingGame.class.getResource("twitter.png").toString());
        ImageView imageViewTwitter = new ImageView(imageTwitter);
        //Setting the height and the width of the Instagram Icon
        imageViewTwitter.setFitHeight(30);
        imageViewTwitter.setFitWidth(30);

        //Adding all the Image View on the HBox Layout
        HBox rightHBox = new HBox(imageViewFB, imageViewInsta, imageViewTwitter);
        rightHBox.setSpacing(5);
        rightHBox.setPadding(new Insets(10,0,0,0));

        //Adding all the controls and layouts on the FlowPane Layout
        FlowPane flowPane = new FlowPane(leftHBox, middleMenuBar, rightHBox);
        flowPane.setAlignment(Pos.TOP_CENTER);
        flowPane.setHgap(270);
        flowPane.setStyle("-fx-background-color: transparent");

        return flowPane;
    }

    public StackPane CenterText(){
        //Setting the font using Font Instance
        Font font = Font.font("Comic Sans MS", FontWeight.BOLD, 15);

        //Main Text
        Text mainText = new Text("Recycle | Earn Points | Redeem Rewards");
        //Setting the font of the main text
        mainText.setFont(Font.font("Eras Demi ITC", 50));
        //Setting the margin of the Main Text
        VBox.setMargin(mainText, new Insets(30,0,0,0));

        //Description
        Text description = new Text("\"Welcome to Greenify, the garbage classification game and recycling service! Learn to sort garbage by playing the game. Locate nearby recycling centres and drop off recyclables to earn points and redeem rewards. You can play your part in the future of our planet whilst earning rewards!\"");
        //Setting the wrapping width of the description
        description.setWrappingWidth(600);
        //Setting the Font Instance on a Text Control
        description.setFont(font);
        //Setting the alignment of the description
        description.setTextAlignment(TextAlignment.JUSTIFY);
        description.setLineSpacing(10);

        //Button
        Button plyBtn = new Button("Play");
        //Setting the padding, size, font, color, style of the button
        plyBtn.setPadding(new Insets(5,20,5,20));
        plyBtn.setPrefSize(150, 70);
        plyBtn.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 18));
        plyBtn.setTextFill(Color.WHITE);
        plyBtn.setStyle("-fx-background-radius: 50; -fx-background-color: #27994c; -fx-border-color: black; -fx-border-radius: 50; -fx-border-width: 2");
        //Setting the margin of the Button
        VBox.setMargin(plyBtn, new Insets(10,0,40,0));

        //Image
        Image image = new Image(RecyclingGame.class.getResource("recycleBin.png").toString(), 897, 200, false, true);
        ImageView imageView1 = new ImageView(image);

        //Adding all the controls on the VBox layout
        VBox vBox= new VBox(mainText, description, plyBtn, imageView1);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(30);

        //Adding the VBox layout on the Stack Pane layout
        StackPane stackPane = new StackPane(vBox);

        return stackPane;
    }

    public static void main(String[] args) {
        launch();
    }
}