package hu.webler.konyvtar.beans;

import java.io.Serializable;
import java.sql.Connection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import hu.webler.konyvtar.utils.DataBaseConnect;

@ManagedBean
@SessionScoped
public class User implements Serializable {

	private static final long serialVersionUID = 1094801825228386363L;
	
	public void validateLogin() {
		
		Connection con = null;
		con = DataBaseConnect.getConnection();
		System.out.println(con);

	}

}