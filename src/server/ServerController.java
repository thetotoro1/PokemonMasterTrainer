package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class ServerController implements Initializable{

	@FXML
	private TextArea serverText;
	
	ServerSocket serverSocket;
	
	public ServerController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		serverText.setText("Server started\n");		
		
		
		
		
		
		
		
		
		
		
	}
	
	@FXML
	public void exitApplication(ActionEvent event){
		System.out.println("exitApplication ran");
		try {
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		Platform.exit();
	}

	public void sayHi() {
		System.out.println("hello");

	}
	
	public void appendText(Double someDouble){
		
		serverText.appendText("Double sent: " + someDouble + "\n");
		
	}
	
	public void move(Double spotNumber){
		
	}
	
}
