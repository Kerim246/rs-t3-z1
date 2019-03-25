package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static int sumaCifara(int n) {
        int i, suma = 0, c;

        while (n != 0) {
            c = n % 10;
            n = n / 10;
            suma = suma + c;
        }
        return suma;
    }


    public static void main(String[] args) {
        int n, i;

        /* System.out.println("Unesite broj ");

        Scanner ulaz = new Scanner(System.in);

        n = ulaz.nextInt();

        System.out.println("Brojevi djeljivi sa sumom svojih cifara su: ");

        for (i = 1; i < n; i++) {
            if(i%sumaCifara(i)==0)
                System.out.println(i);
        }
        */
        launch(args);
    }



}
