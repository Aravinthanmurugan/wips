package com.example.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.project.model.Product;
import com.example.project.connection.*;

public class ProductImpl implements ProductDao {

	@Override
	public Product insertProduct(Product product) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = DBconnection.getDbConnection();
		String query = "insert into product values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, product.getProid());
		pst.setString(2, product.getProname());
		pst.setDouble(3, product.getProprice());

		int k = pst.executeUpdate();

		return product;
	}

	@Override
	public List<Product> displayProduct() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		List<Product> product= new ArrayList<>();
		Connection con = DBconnection.getDbConnection();

		Statement st = con.createStatement();

		
		String query = "select * from product";
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			
			Product products =new Product(rs.getInt(1), rs.getString(2),rs.getDouble(3));
			product.add(products);
			
		}

		rs.close();
		st.close();
		con.close();
		return product;
	}

	@Override
	public boolean deleteProduct(int proid) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = DBconnection.getDbConnection();
		// 3. Create the PreparedStatement Object
		String query = "delete product where pid=?";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, proid);

		// 6. Execute the query
		int k = pst.executeUpdate();
		if(k==0)
			return false;
		else
			return true;
	}

}
