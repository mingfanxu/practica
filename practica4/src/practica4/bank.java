package practica4;

import java.util.Scanner;

import program01d.Alumno;
import program01d.CapturaEntrada; 

public class bank {

    private user[] users = new user[5];

    private int size;
    /*
    public String PIN;
    public String idetity;
    public String password;
    public String phone;
    public double balance;
    
    public void account(String PIN, String idetity, String password, String phone, double balance) {
    	this.PIN = PIN;
    	this.idetity = idetity;
    	this.password = password;
    	this.phone = phone;
    	this.balance = balance;
    }
    
    public void Display(){
	    System.out.println("PIN£º" + PIN);
	    System.out.println("idetity£º" + idetity);
	    System.out.println("password£º" + password);
	    System.out.println("phone£º" + phone);
	    System.out.println("balance£º" + balance);
	    
	}
	*/
    

    public void initial() {
        //user1
        user user1 = new user();
        user1.setPIN("666");
        user1.setIdetity("014607");
        user1.setUsername("ming");
        user1.setPassword("123456");
        user1.setPhone("10086");
        user1.setBalance(1000);

        //user2
        user user2 = new user("777", "9587", "liubei", "123456", "10011", 2000);
        //user3
        user user3 = new user("888", "007", "xianyu", "123456", "10020", 3000);

        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        size = 3;
        System.out.println("User initialization is complete!");
    	
    }

    //user
    public void login() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter PIN£º");
        String cardNo = input.next();
        System.out.println("Please enter the password£º");
        String password = input.next();


        user u = null;
        for (int i = 0; i < size; i++) {
            if (users[i].getPIN().equals(cardNo) && users[i].getPassword().equals(password)) {
                u = users[i];
                break;
            }
        }
        if (u != null) {
            
            showMenu(u);
        } else {
            System.out.println("PIN/password is worring...");
        }
    }


    public void showMenu(user u) {
        Scanner input = new Scanner(System.in);
        System.out.println("=========" + u.getUsername() + " welcome to the thanks-bank system =======");

        boolean flag = true;
        while (flag = true) {
            System.out.println("=== 1.Deposit 2.Withdrawal 3.Check balances 0.Quit ===");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    this.save(u);
                    break;
                    
                case 2:
                    this.withDraw(u);
                    break;

                case 3:
                    this.query(u);
                    break;

                case 0:
                    return;
                default:
                    System.out.println("Input error");
                    flag = false;
                    break;
            }
        }
    }

    //save
    public void save(user u) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the deposit amount");
        double m = input.nextDouble();
        if (m > 0) {
            u.setBalance(u.getBalance() + m);
            System.out.println("Successful deposit, balance£º" + u.getBalance());
        } else {
            System.out.println("Failed to save money! please enter again...");
        }
    }

    //withrawal
    public void withDraw(user u) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the withdrawal amount");
        double m = input.nextDouble();
        if (m > 0 && u.getBalance() >= m) {
            u.setBalance(u.getBalance() - m);
            System.out.println("Successful withdrawal, balance£º" + u.getBalance());
        } else {
            System.out.println("Failed to withdraw money! please enter again...");
        }
    }


    //Balnce
    public void query(user u) {
        System.out.println("PIN£º" + u.getPIN() + "Balance£º" + u.getBalance());
    }


}
