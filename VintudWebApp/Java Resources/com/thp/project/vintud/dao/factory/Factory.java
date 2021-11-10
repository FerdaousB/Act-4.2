package com.thp.project.vintud.dao.factory;

import java.sql.Connection;
import java.sql.SQLException;

import com.thp.project.vintud.dao.AnnonceDAO;
import com.thp.project.vintud.dao.FavorisDao;
import com.thp.project.vintud.dao.RechercheDao;
import com.thp.project.vintud.dao.UtilisateurDAO;
import com.thp.project.vintud.dao.impl.AnnonceDAOImpl;
import com.thp.project.vintud.dao.impl.FavorisDaoImpl;
import com.thp.project.vintud.dao.impl.RechercheDaoImpl;
import com.thp.project.vintud.dao.impl.UtilisateurDAOImpl;
import com.thp.project.vintud.db.ConnectionUtil;

public class Factory {
	
	
	public static AnnonceDAO getAnnoucementDAO(){
        return new AnnonceDAOImpl();
    }
		
	public static FavorisDao getFavorisDAO(){
        return new FavorisDaoImpl();
    }	
	public static RechercheDao getRechercheDAO(){
        return new RechercheDaoImpl();
    }	
	
	public static UtilisateurDAO getUserDAO(){
        return new UtilisateurDAOImpl();
    }
	
  
	public static Connection connect () throws SQLException {
		return ConnectionUtil.getInstance().getConnection() ;
	}


}
