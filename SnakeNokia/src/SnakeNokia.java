import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SnakeNokia extends Application
{
	Circle c1;
	Circle c2;
	Circle c3;
	Circle c4;
	Text tt;
	Image img;
	Group root;
	Scene scene;
	int point=0;
	int c=150;
	int r=150;
	public static void main(String[] args) 
	{
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception 
	{
		c1=new Circle();
		c1.setLayoutX(900);
		c1.setLayoutY(40);
		c1.setRadius(30);
		c1.setFill(Color.BLUE);
		c2=new Circle(40,400,30);
		c2.setFill(Color.BLUE);
		c3=new Circle(650,550,30);
		c3.setFill(Color.BLUE);
		c4=new Circle(234,600,30);
		c4.setFill(Color.BLUE);
		img=new Image("images//snakes-and-ladders-reptile-clip-art-board-game-ladder.jpg");
		ImageView iv=new ImageView(img);
		iv.setX(c);
		iv.setY(r);
		iv.setFitWidth(150);
		iv.setFitHeight(50);
		root=new Group();
		root.getChildren().addAll(iv,c1,c2,c3,c4);
		Scene scene=new Scene(root,1000,700);
		stage.setScene(scene);
		stage.show();
		
		
		
		scene.setOnKeyPressed(new EventHandler<KeyEvent>()
		{

			@Override
			public void handle(KeyEvent kk) 
			{
				if(kk.getCode()==KeyCode.UP)
				{
					r-=3;
				}
				else if(kk.getCode()==KeyCode.DOWN)
				{
					r+=3;
				}
				else if(kk.getCode()==KeyCode.LEFT)
				{
					c-=3;
				}
				else if(kk.getCode()==KeyCode.RIGHT)
				{
					c+=3;
				}
				
				if(r>750)
				{
					r=-50;
				}
				else if(r<-300)
				{
					r=700;
				}
				else if(c>1100)
				{
					c=-100;
				}
				else if(c<-300)
				{
					c=1000;
				}
				if(c== 400 && r== 40)
				{
					point=point+10;
					System.out.println("Hello yash");
				}
				if(c== 40 && r== 400)
				{
					point+=10;
					System.out.println("Hello yash 2711");
				}
				if(c== 330 && r== 550)
				{
					point+=10;
					System.out.println("Hello yash 2000");
				}
				if(c== 234 && r== 600)
				{
					point+=10;
					System.out.println("Hello yash 2720");
				}
				iv.setLayoutX(c);
				iv.setLayoutY(r);
				System.out.println("Your point is "+point);
				//tt.setFill(Color.WHITE);
				tt=new Text("YOUR POINT IS "+point);
				tt.setFont(Font.font("verdana",FontWeight.BLACK,FontPosture.REGULAR,30));
				tt.setX(450);
				tt.setY(680);
				root.getChildren().add(tt);
				tt.setFill(Color.BLACK);
				
			}
			
		});
	}

}
