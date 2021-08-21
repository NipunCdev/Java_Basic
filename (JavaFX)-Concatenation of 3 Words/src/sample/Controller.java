package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private  TextField txt3;

    @FXML
    private TextField lb1;

    public void merge_botton()
    {
        lb1.setText(txt1.getText()+""+txt2.getText()+""+txt3.getText());
    }
}
