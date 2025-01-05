package OOPs_conecpt.Encapsulation.Bank;

public class Account {
    public String name;
    protected String email;
    private String password;

    public String getpassword() {
     return this.password;
    }
    
    public void setpassword(String pass2) {
        this.password = pass2;
    }
    
    
    public static void main(String[] args) {
        Account a2= new Account();
        a2.email="newjavacode@gmail.com";
        a2.password="Abc@123";
    }
}
