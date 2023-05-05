import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.text.Text; 
import javafx.scene.control.TextField;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label label;
        VBox vbox; 
        Scene scene;

        label = new Label("");

        vbox = new VBox(label);
        vbox.setSpacing(20);
        vbox.setAlignment(Pos.CENTER);

        // load the image
        Image image = new Image("logo.png");
        ImageView imageView = new ImageView(image);
        // scale the image 220 120 | 155 43
        imageView.setFitWidth(225);
        imageView.setFitHeight(120);

        // load the image
        Image image2 = new Image("playbutton.png");
        ImageView imageView2 = new ImageView(image2);
        // scale the image 90 50|70 30
        imageView2.setFitWidth(90);
        imageView2.setFitHeight(50);
        imageView2.setStyle("-fx-opacity: 1;");

        // load the image
        Image leaderboard = new Image("leaderboard.png");
        ImageView imageView_leaderboard = new ImageView(leaderboard);
        // scale the image 90 50|70 30
        imageView_leaderboard.setFitWidth(120);
        imageView_leaderboard.setFitHeight(30);
        imageView_leaderboard.setStyle("-fx-opacity: 0.2;");

        imageView_leaderboard.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                imageView_leaderboard.setStyle("-fx-opacity: 0.5;");
                imageView2.setStyle("-fx-opacity: 0.2;");
            }
        });
        
        imageView_leaderboard.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                imageView_leaderboard.setStyle("-fx-opacity: 0.2;");
                imageView2.setStyle("-fx-opacity: 1;");
            }
        });

        imageView_leaderboard.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                // create a new scene

                Text space = new Text("");
                Text space1 = new Text("");
                Text position1 = new Text("1.");
                Text position2 = new Text("2.");
                Text position3 = new Text("3.");
                Text position = new Text("- - -");
                Text position4 = new Text("4.");
                Text position5 = new Text("5.");

                // load the image
                Image leaderboard = new Image("leaderboard.png");
                ImageView imageView_leaderboard = new ImageView(leaderboard);
                // scale the image
                imageView_leaderboard.setFitWidth(220);
                imageView_leaderboard.setFitHeight(60);
                imageView_leaderboard.setStyle("-fx-opacity: 1;");

                // load the image
                Image return1 = new Image("return.png");
                ImageView imageView_return1 = new ImageView(return1);
                // scale the image
                imageView_return1.setFitWidth(80);
                imageView_return1.setFitHeight(25);
                imageView_return1.setStyle("-fx-opacity: 0;");
                // load the image
                Image return2 = new Image("return.png");
                ImageView imageView_return2 = new ImageView(return2);
                // scale the image
                imageView_return2.setFitWidth(80);
                imageView_return2.setFitHeight(25);
                imageView_return2.setStyle("-fx-opacity: 0.2;");
        
                GridPane gridPane = new GridPane();
                 
                //Setting the padding  
                gridPane.setPadding(new Insets(10, 10, 10, 10)); 
                        
                //Setting the vertical and horizontal gaps between the columns 
                gridPane.setVgap(5); 
                gridPane.setHgap(5);
                
                //Setting the Grid alignment 
                gridPane.setAlignment(Pos.CENTER);
    
                //Setting size for the pane  
                gridPane.setMinSize(600, 350); 
                
                //Arranging all the nodes in the grid 
                gridPane.add(imageView_leaderboard, 1, 0);
                gridPane.add(space, 1, 1);
                gridPane.add(position1, 1, 2);
                gridPane.add(position2, 1, 3);
                gridPane.add(position3, 1, 4);
                gridPane.add(position, 1, 5);
                gridPane.add(position4, 1, 6);
                gridPane.add(position5, 1, 7);
                gridPane.add(space1, 1, 8);
                gridPane.add(imageView_return1, 0, 9);
                gridPane.add(imageView_return2, 3, 9);
              
                        
                Scene scene_leaderboard = new Scene(gridPane, 600, 350);
                
                String css = this.getClass().getResource("start.css").toExternalForm();
                        scene_leaderboard.getStylesheets().add(css);
                
                // set the new scene
                primaryStage.setScene(scene_leaderboard);
              
            }
        });
      
        imageView2.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                // set a new image when the mouse enters the image
                Image newImage = new Image("playbutton_hover.png");
                imageView2.setImage(newImage);
            }
        });
        
        imageView2.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                // set the original image when the mouse exits the image
                imageView2.setImage(image2);
            }
        });
      
        imageView2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                // create a new scene
                
                //creating Grid content
                Image image3 = new Image("logo_small.png");
                ImageView imageView3 = new ImageView(image3);
                imageView3.setFitWidth(105);
                imageView3.setFitHeight(45);
                imageView3.setStyle("-fx-opacity: 0.5;");
              
                Image image4 = new Image("player1.png");
                ImageView imageView4 = new ImageView(image4);
                imageView4.setFitWidth(150);
                imageView4.setFitHeight(70);
                imageView4.setStyle("-fx-opacity: 0.5;");
              
                Image image5 = new Image("player2.png");
                ImageView imageView5 = new ImageView(image5);
                imageView5.setFitWidth(150);
                imageView5.setFitHeight(70);
                imageView5.setStyle("-fx-opacity: 0.5;");
              
                Image image6 = new Image("playbutton.png");
                ImageView imageView6 = new ImageView(image6);
                imageView6.setFitWidth(105);
                imageView6.setFitHeight(40);
                imageView6.setStyle("-fx-opacity: 0.5;");

                TextField textField1 = new TextField();
                textField1.setPrefWidth(150);
                textField1.setPrefWidth(60);
                textField1.setStyle("-fx-background-color: #F3E99F; -fx-border-color: #dd7166; -fx-border-radius: 5px; -fx-border-width: 3px; -fx-opacity: 1;");
                TextField textField2 = new TextField();
                textField2.setPrefWidth(100);
                textField2.setPrefWidth(60);
                textField2.setStyle("-fx-background-color: #F3E99F; -fx-border-color: #dd7166; -fx-border-radius: 5px; -fx-border-width: 3px; -fx-opacity: 1;");
              
                // placeholder
                Text text1 = new Text(" ");
                Text text2 = new Text(" ");
                Text text3 = new Text(" ");
              
                //Creating a Grid Pane 
                GridPane gridPane = new GridPane();
                 
                //Setting the padding  
                gridPane.setPadding(new Insets(10, 10, 10, 10)); 
                
                //Setting the vertical and horizontal gaps between the columns 
                gridPane.setVgap(5); 
                gridPane.setHgap(5);
        
                //Setting the Grid alignment 
                gridPane.setAlignment(Pos.CENTER);

                //Setting size for the pane  
                gridPane.setMinSize(600, 350); 
        
                //Arranging all the nodes in the grid 
                gridPane.add(imageView3, 3, 0);
                gridPane.add(imageView4, 0, 3);
                gridPane.add(text1, 0, 4);
                gridPane.add(textField1, 0, 5);
                gridPane.add(imageView5, 6, 3);
                gridPane.add(text2, 6, 4);
                gridPane.add(textField2, 6, 5);
                gridPane.add(text3, 3, 6);
                gridPane.add(imageView6, 3, 7);
                
                Scene scene2 = new Scene(gridPane, 600, 350);
        
                String css = this.getClass().getResource("start.css").toExternalForm();
                scene2.getStylesheets().add(css);
        
                // set the new scene
                primaryStage.setScene(scene2);

                imageView6.setOnMouseEntered(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        // set a new image when the mouse enters the image
                        Image newImage = new Image("playbutton_hover.png");
                        imageView6.setImage(newImage);
                        imageView6.setStyle("-fx-opacity: 1;");
                        //imageView4.setStyle("-fx-opacity: 1;");
                        //imageView5.setStyle("-fx-opacity: 1;");
                        textField1.setStyle("-fx-background-color: #F3E99F; -fx-border-color: #dd7166; -fx-border-radius: 5px; -fx-border-width: 3px; -fx-opacity: 0.5;");;
                        textField2.setStyle("-fx-background-color: #F3E99F; -fx-border-color: #dd7166; -fx-border-radius: 5px; -fx-border-width: 3px; -fx-opacity: 0.5;");;
                    }
                });
                
                imageView6.setOnMouseExited(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        // set the original image when the mouse exits the image
                        imageView6.setImage(image2);
                        imageView6.setStyle("-fx-opacity: 0.5;");
                        //imageView4.setStyle("-fx-opacity: 0.5;");
                        //imageView5.setStyle("-fx-opacity: 0.5;");
                        textField1.setStyle("-fx-background-color: #F3E99F; -fx-border-color: #dd7166; -fx-border-radius: 5px; -fx-border-width: 3px; -fx-opacity: 1;");;
                        textField2.setStyle("-fx-background-color: #F3E99F; -fx-border-color: #dd7166; -fx-border-radius: 5px; -fx-border-width: 3px; -fx-opacity: 1;");;
                    }
                });

                imageView6.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        // create a new scene
                        Text placholder1 = new Text("      ");
                        Text placholder2 = new Text("      ");
                        Text placholder3 = new Text("      ");
                        Text placholder4 = new Text("      ");
                        Text placholder5 = new Text("      ");
                        Text placholder6 = new Text("      ");
                        Text placholder7 = new Text("      ");
                        Text placholder8 = new Text("      ");
                        Text placholder11 = new Text("      ");
                      
                        Text space2 = new Text("4");
                        Text space3 = new Text("      ");
                        Text space4 = new Text("      ");
                        Text space5 = new Text("      ");
                        Text space6 = new Text("      ");
                        Text space7 = new Text("      ");
                        Text space8 = new Text("      ");
                        Text space9 = new Text("      ");
                        Text space10 = new Text("2");

                        //creating Grid content
                        Image image7 = new Image("score_player1.png");
                        ImageView imageView7 = new ImageView(image7);
                        imageView7.setFitWidth(80);
                        imageView7.setFitHeight(40);
                        imageView7.setStyle("-fx-opacity: 1;");

                        //creating Grid content
                        Image image8 = new Image("score_player2.png");
                        ImageView imageView8 = new ImageView(image8);
                        imageView8.setFitWidth(80);
                        imageView8.setFitHeight(40);
                        imageView8.setStyle("-fx-opacity: 1;");

                        //creating Grid content
                        Image image9 = new Image("basket_orange.png");
                        ImageView imageView9 = new ImageView(image9);
                        imageView9.setFitWidth(80);
                        imageView9.setFitHeight(70);
                        imageView9.setStyle("-fx-opacity: 1;");

                        //creating Grid content
                        Image image10 = new Image("basket_green.png");
                        ImageView imageView10 = new ImageView(image10);
                        imageView10.setFitWidth(80);
                        imageView10.setFitHeight(70);
                        imageView10.setStyle("-fx-opacity: 1;");

                        //creating Grid content
                        Image image11 = new Image("basket_green.png");
                        ImageView imageView11 = new ImageView(image11);
                        imageView11.setFitWidth(80);
                        imageView11.setFitHeight(70);
                        imageView11.setStyle("-fx-opacity: 1;");

                        //creating Grid content
                        Image image12 = new Image("basket_green.png");
                        ImageView imageView12 = new ImageView(image12);
                        imageView12.setFitWidth(80);
                        imageView12.setFitHeight(70);
                        imageView12.setStyle("-fx-opacity: 1;");

                        //creating Grid content
                        Image image13 = new Image("basket_green.png");
                        ImageView imageView13 = new ImageView(image13);
                        imageView13.setFitWidth(80);
                        imageView13.setFitHeight(70);
                        imageView13.setStyle("-fx-opacity: 1;");

                        //creating Grid content
                        Image image14 = new Image("exit.png");
                        ImageView imageView14 = new ImageView(image14);
                        imageView14.setFitWidth(80);
                        imageView14.setFitHeight(30);
                        imageView14.setStyle("-fx-opacity: 0.2;");

                        //creating Grid content
                        Image image15 = new Image("melone.png");
                        ImageView imageView15 = new ImageView(image15);
                        imageView15.setFitWidth(40);
                        imageView15.setFitHeight(40);
                        imageView15.setStyle("-fx-opacity: 1;");

                        //creating Grid content
                        Image image16 = new Image("banane.png");
                        ImageView imageView16 = new ImageView(image16);
                        imageView16.setFitWidth(40);
                        imageView16.setFitHeight(40);
                        imageView16.setStyle("-fx-opacity: 1;");


                      

                        GridPane gridPane = new GridPane();
                 
                        //Setting the padding  
                        gridPane.setPadding(new Insets(10, 10, 10, 10)); 
                        
                        //Setting the vertical and horizontal gaps between the columns 
                        gridPane.setVgap(5); 
                        gridPane.setHgap(5);
                
                        //Setting the Grid alignment 
                        gridPane.setAlignment(Pos.CENTER);
        
                        //Setting size for the pane  
                        gridPane.setMinSize(600, 350); 
                
                        //Arranging all the nodes in the grid 
                        gridPane.add(imageView7, 0, 0);
                        gridPane.add(placholder1, 0, 1);
                        gridPane.add(placholder2, 0, 2);
                        //gridPane.add(placholder3, 0, 3);
                        //gridPane.add(placholder4, 0, 4);
                        gridPane.add(placholder5, 0, 5);
                        //gridPane.add(placholder6, 0, 6);
                        gridPane.add(placholder7, 0, 7);
                        gridPane.add(placholder8, 0, 8);
                      
                        gridPane.add(space2, 1, 0);
                      
                        gridPane.add(imageView16, 2, 5);
                      
                        //gridPane.add(space4, 3, 0);
                      
                        gridPane.add(space5, 4, 0);
                        gridPane.add(imageView9, 4, 12);
                      
                        gridPane.add(imageView14, 5, 0);
                      
                        //gridPane.add(space6, 6, 0);
                      
                        gridPane.add(imageView15, 7, 8);
                      
                        gridPane.add(space9, 8, 0);
                        gridPane.add(imageView10, 8, 12);
                      
                        gridPane.add(space10, 9, 0);
                      
                        gridPane.add(imageView8, 10, 0);


                      
                        
                        Scene scene3 = new Scene(gridPane, 600, 350);
                
                        String css = this.getClass().getResource("start.css").toExternalForm();
                        scene3.getStylesheets().add(css);
                
                        // set the new scene
                        primaryStage.setScene(scene3);
                    }
                });
              
            }
        });
      
        // add the image to the center of the scene
        VBox root = new VBox(imageView, imageView2, vbox, imageView_leaderboard);
        root.setAlignment(Pos.CENTER);
        scene = new Scene(root, 600, 350);

        String css = this.getClass().getResource("start.css").toExternalForm();
        scene.getStylesheets().add(css);

        primaryStage.setTitle("FruityFall");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}