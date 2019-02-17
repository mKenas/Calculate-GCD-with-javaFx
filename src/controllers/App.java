package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import model.InvalidInputException;

public class App {

    @FXML
    private VBox feedbackContainer;

    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;
    @FXML
    private Label feedback;
    @FXML
    private Label result;

        public  Integer gcd(Integer a, Integer b) throws InvalidInputException, NumberFormatException {

        if (a < 0 || b < 0){
            throw  new InvalidInputException("The entered numbers must be greater than or equal to 0");
        }

        while( a != b ) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public void addFeedbackStyle(String style) {

      feedback.getStyleClass().removeAll("error","succeed");
      feedback.getStyleClass().add(style);

    }

  public void calc(ActionEvent actionEvent) {
        Integer a;
        Integer b;
        feedbackContainer.setVisible(true);
        try{
            a = Integer.parseInt(textField1.getText());
            b = Integer.parseInt(textField2.getText());

            addFeedbackStyle("succeed");
            result.setVisible(true);
            feedback.setText("The greater common divider for " + a + " and " + b + " is:");
            result.setText(gcd(a,b).toString());
        }

        catch (InvalidInputException iie){
            addFeedbackStyle("error");
            result.setVisible(false);
            feedback.setText(iie.getMessage());

        }
        catch (NumberFormatException e){
            addFeedbackStyle("error");
            result.setVisible(false);
            feedback.setText("Please make sure you enter only numbers!");
        }
    }

}
