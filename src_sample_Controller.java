package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;


public class Controller
{
	
	
	int scoreOR=0;
	int scoreUs=0;
	@FXML
	private TextField Ordi;
	@FXML
	private TextField user;
	@FXML
	private TextField scoreOrd;
	@FXML
	private Button Pierre;
	@FXML
	private Button Feuille;
	@FXML
	private Button Ciseau;
	@FXML
	private ImageView ciseau;
	@FXML
	private ImageView pierre;
	@FXML
	private ImageView feuille;
	@FXML
	private TextField scoreUS;
	
	public void clik(ActionEvent event)
	{
		if (event.getSource()==Pierre)
		{
			user.setText("pierre");
		}
		else if (event.getSource()==Ciseau)
		{
			user.setText("ciseau");
		}
		else if (event.getSource()==Feuille)
		{
			user.setText("papier");
		}
		choix();
	}
	
	
	public void choix()
	{
		int M=(int)(Math.random()*3+1);
		switch (M)
		{
			case 1:
				Ordi.setText("pierre");
				break;
			case 2:
				Ordi.setText("ciseau");
				break;
			case 3:
				Ordi.setText("papier");
				break;
		}
		calculeScore();
	}
	
	public void calculeScore()
	{
		if (user.getText().equals("pierre")&Ordi.getText().equals("ciseau"))
		{

			scoreUs++;
			System.out.print(scoreUs);
			scoreUS.setText(String.valueOf(scoreUs));
		}
		else if (user.getText().equals("ciseau")&Ordi.getText().equals("papier"))
		{

			scoreUs++;
			System.out.print(scoreUs);
			scoreUS.setText(String.valueOf(scoreUs));
		}
		else if (user.getText().equals("papier")&Ordi.getText().equals("pierre"))
		{
			scoreUs++;
			System.out.print(scoreUs);
			scoreUS.setText(String.valueOf(scoreUs));
		}
		
		if (Ordi.getText().equals("pierre")&user.getText().equals("ciseau"))
		{
			scoreOR++;
			System.out.print(scoreOR);
			scoreOrd.setText(String.valueOf(scoreOR));
		}
		else if (Ordi.getText().equals("ciseau")&user.getText().equals("papier"))
		{
			scoreOR++;
			System.out.print(scoreOR);
			scoreOrd.setText(String.valueOf(scoreOR));
		}
		else if (Ordi.getText().equals("papier")&user.getText().equals("pierre"))
		{
			scoreOR++;
			System.out.print(scoreOR);
			scoreOrd.setText(String.valueOf(scoreOR));
		}
		
		
	}
}