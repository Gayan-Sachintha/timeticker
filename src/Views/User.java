/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

/**
 *
 * @author rockr
 */
class User {
        private String WID;
        private String CName,WName,Date,Category,Wprice;

    public User(String WID, String CName, String WName, String Date, String Category, String Wprice) {
        this.WID = WID;
        this.CName = CName;
        this.WName = WName;
        this.Date = Date;
        this.Category = Category;
        this.Wprice = Wprice;
    }

    User(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    User(String string, String string0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getWID() {
        return WID;
    }

    public String getCName() {
        return CName;
    }

    public String getWName() {
        return WName;
    }

    public String getDate() {
        return Date;
    }

    public String getCategory() {
        return Category;
    }

    public String getWprice() {
        return Wprice;
    }
        
        
    
}
