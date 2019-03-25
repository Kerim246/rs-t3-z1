package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import static sample.Main.sumaCifara;

public class Controller {
    public TextField Text2;
    public TextField Text3;


    public void Submit(ActionEvent actionEvent) {
        int n = Integer.parseInt(Text2.getText());
        String result = "";

        for(int i=1;i<=n;i++) {
            if (i % sumaCifara(i) == 0) {
                if(i==1)
                    result = result +i;
                if (i == n - 1)
                    result = result + i;
                else if(i!=1 && i!=n-1) result = result + "," + i;

            }
        }

        Text3.setText(result);
    }
}
