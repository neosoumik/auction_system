package application;

import java.sql.*;
import java.util.*;

public class GetDataFromDB{
	class GetItems{
		int n = 200;
		int item_id[] = new int[n];
		String item_name[] = new String[n];
		int seller_id[] = new int[n];
		int start_bid[] = new int[n];
		String category[] = new String[n];
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		void getItems() {
			try {
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from items");
				while(rs.next()) {
					item_id[i] = rs.getInt(1);
					item_name[i] = rs.getString(2);
					seller_id[i] = rs.getInt(3);
					start_bid[i] = rs.getInt(4);
					category[i] = rs.getString(5);
					i++;
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		void getItemById(int id) {
			try {
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from items where item_id ="+id);
				while(rs.next()) {
					item_id[0] = rs.getInt(1);
					item_name[0] = rs.getString(2);
					seller_id[0] = rs.getInt(3);
					start_bid[0] = rs.getInt(4);
					category[0] = rs.getString(5);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		void getItemByName(String name) {
			try {
				int i =0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from items where item_name ="+name);
				while(rs.next()) {
					item_id[i] = rs.getInt(1);
					item_name[i] = rs.getString(2);
					seller_id[i] = rs.getInt(3);
					start_bid[i] = rs.getInt(4);
					category[i] = rs.getString(5);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		void getItemBySellerId(int seller) {
			try {
				int i =0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from items where seller_id ="+seller);
				while(rs.next()) {
					item_id[i] = rs.getInt(1);
					item_name[i] = rs.getString(2);
					seller_id[i] = rs.getInt(3);
					start_bid[i] = rs.getInt(4);
					category[i] = rs.getString(5);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		void getItemByStartBid(int bid) {
			try {
				int i =0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from items where start_bid ="+bid);
				while(rs.next()) {
					item_id[i] = rs.getInt(1);
					item_name[i] = rs.getString(2);
					seller_id[i] = rs.getInt(3);
					start_bid[i] = rs.getInt(4);
					category[i] = rs.getString(5);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		void getItemByCategory(int cat) {
			try {
				int i =0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from items where category ="+cat);
				while(rs.next()) {
					item_id[i] = rs.getInt(1);
					item_name[i] = rs.getString(2);
					seller_id[i] = rs.getInt(3);
					start_bid[i] = rs.getInt(4);
					category[i] = rs.getString(5);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	//TODO GetResearchComplete after Dheemanth updates it.
	/*class GetResearch{
		String original_owner;
		int age;
		String find_loc;
		int item_id;
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		void getResearch() {
			try {
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from research");
				while(rs.next()) {
					System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getInt(4));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		void getResearchByOwner(String owner) {
			try {
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from research where original_owner="+owner);
				while(rs.next()) {
					original_owner = rs.getString(1);
					
					System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getInt(4));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}*/
	class GetSeller{
		int n =200;
		int seller_id[] = new int[n];
		String email[] = new String[n];
		String fname[] = new String[n];
		String lname[]= new String[n];
		String contact_no[]= new String[n];
		ConnectingMysql co = new ConnectingMysql();
		Connection c = co.getConnection();
		void getSeller() {
			try {
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from seller");
				while(rs.next()) {
					seller_id[i]=rs.getInt(1);
					email[i]=rs.getString(2);
					fname[i]=rs.getString(3);
					lname[i]=rs.getString(4);
					contact_no[i]=rs.getString(5);
					i++;
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		void getSellerByID(int id) {
			try {
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from seller where seller_id = "+id);
				while(rs.next()) {
					seller_id[i]=rs.getInt(1);
					email[i]=rs.getString(2);
					fname[i]=rs.getString(3);
					lname[i]=rs.getString(4);
					contact_no[i]=rs.getString(5);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		void getSellerByEmail(String email_id) {
			try {
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from seller where email = "+email_id);
				while(rs.next()) {
					seller_id[i]=rs.getInt(1);
					email[i]=rs.getString(2);
					fname[i]=rs.getString(3);
					lname[i]=rs.getString(4);
					contact_no[i]=rs.getString(5);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		void getSellerByContact(String contact) {
			try {
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from seller where contact_no = "+contact);
				while(rs.next()) {
					seller_id[i]=rs.getInt(1);
					email[i]=rs.getString(2);
					fname[i]=rs.getString(3);
					lname[i]=rs.getString(4);
					contact_no[i]=rs.getString(5);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		void getSellerByFName(String name) {
			try {
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from seller where fname = "+name);
				while(rs.next()) {
					seller_id[i]=rs.getInt(1);
					email[i]=rs.getString(2);
					fname[i]=rs.getString(3);
					lname[i]=rs.getString(4);
					contact_no[i]=rs.getString(5);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		void getSellerByLName(String name) {
			try {
				int i = 0;
				Statement st = c.createStatement();
				ResultSet rs = st.executeQuery("select * from seller where lname = "+name);
				while(rs.next()) {
					seller_id[i]=rs.getInt(1);
					email[i]=rs.getString(2);
					fname[i]=rs.getString(3);
					lname[i]=rs.getString(4);
					contact_no[i]=rs.getString(5);
					i++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
}
/*
items
research
shipping
seller
bidder
 _admin
bid_history 
*/
 