/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainthread.enity;

/**
 *
 * @author Administrator
 */
public class Customer {

    private String ID;
    private String name;
    private String email;
    private String birthday;
    private int balance;
    private String avatar;
    private int status;

    public Customer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Customer(String ID, String name, String email, String birthday, int balance, String avatar, int status) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.balance = balance;
        this.avatar = avatar;
        this.status = status;
    }

    public void selectProduct(String ProductName) {
        System.out.println("Khách hàng đã chọn sản phẩm" + ProductName + ".");
    }

    public void checkOut() {
        System.out.println("Khách hàng đã thực hiện thanh toán hóa đơn.");
    }

    @Override
    public String toString() {
        return "Customer: "
                + "\n - ID : " + ID
                + "\n - Name : " + name
                + "\n - Birthday : " + birthday
                + "\n - Balance : " + balance
                + "\n - Avartar : " + avatar
                + "\n - Status : " + status;

    }
}
