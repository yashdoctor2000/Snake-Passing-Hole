import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Form1 extends Application 
{ 
	Button blog,bcan;
	Label lab,lbus,lbpa,label;
	TextField tsufer;
	PasswordField pass;
	
	public static void main(String[] args) 
	{
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception
	{
		lab =new Label("LOGIN FORM");
		lab.setFont(Font.font("Verdana", FontWeight.BOLD, 25));
		
		lbus=new Label("USER");
		lbpa=new Label("PASSWORD");
		
		tsufer =new TextField();
		pass=new PasswordField();
		
		label=new Label("AUTHENTICATION RESULT");
		
		GridPane gp=new GridPane();
		
		gp.setAlignment(Pos.TOP_CENTER);
		gp.setPadding(new Insets(25,25,25,25));
		gp.setVgap(15);
		gp.setHgap(15);
		
		gp.add(lab, 0, 0);
		gp.add(lbus, 0, 1);
		gp.add(tsufer, 1, 1);
		gp.add(lbpa, 0, 1);
		gp.add(pass, 1, 2);
		gp.add(blog, 0, 3);
		gp.add(bcan, 1, 3);
		gp.add(label, 0, 4);
		
		
		Scene scene=new Scene(gp,400,400);
		stage.setScene(scene);
		stage.show();
		
		bcan.setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent arg0) 
			{
				tsufer.setText("");
				pass.setText("");
			}
		});
		
		blog.setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent arg0) 
			{
				String user=tsufer.getText();
				String pass1=pass.getText();
				
				if(user.equals("YASH") && pass1.equals("DOCTOR"))
				{
					System.out.println("Authorised User");
					label.setText("WELCOME AUTHORISED USER");
					
					Alert alert=new Alert(Alert.AlertType.INFORMATION);
					alert.setTitle("AUTHENTICATION WINDOW");
					alert.setContentText("Mr. "+user+" Welcome To window");
					alert.initOwner(gp.getScene().getWindow());
					alert.show();
				}
				
				else
				{
					System.out.println("UNAAUTHORISED USER");
					label.setText("UNAUTHORISED USER !!! TRY AGAIN");
					Alert alert=new Alert(Alert.AlertType.ERROR);
					alert.setTitle("AUTHENTICATION WINDOW");
					alert.setContentText("Mr. "+user+" PLEASE TRY AGAIN!!!");
					alert.initOwner(gp.getScene().getWindow());
					alert.show();
				}
			}
			
		});
		
	}

}
