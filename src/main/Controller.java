package main;

import java.net.URL;
import java.util.ResourceBundle;

import A_yujin.LoginService;
import main.DBClass;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class Controller implements Initializable{
	Parent root;
	public static DBClass db;
	private LoginService ls;
	public void setRoot(Parent root) {
		this.root = root;
		}

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			db = new DBClass();
		}
		public void membership() {}
		
		public void login() {
			ls.loginChk(root);
			
			}
			
		}

	
