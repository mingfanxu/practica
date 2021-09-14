package practica4;

public class user {
	private String PIN;

    private String idetity;

    private String username;

    private String password;

    private String phone;

    private double balance;


    public user(){
    }

    public user(String cardNo, String idetity, String username, String password, String phone, double balance) {
        this.PIN = cardNo;
        this.idetity = idetity;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.balance = balance;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public String getIdetity() {
        return idetity;
    }

    public void setIdetity(String idetity) {
        this.idetity = idetity;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public String toString() {
        return "user{" +
                "cardNo='" + PIN + '\'' +
                ", idetity='" + idetity + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", balance=" + balance +
                '}';
    }

}
