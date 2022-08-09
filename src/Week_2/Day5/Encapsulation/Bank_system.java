//Q1)Consider "Bank System" and decide classes,variables,methods about this. And try to encapsulate it in
//the concept of Encapsulation.

public class Bank_system {
    private String name;
    private long Account_no;
    private int Balance;
    private String gender;
    private String Account_type;

    //Creating getters

    public String getName(){
        return name;
    }
    public long getAccount_no(){
        return Account_no;
    }
    public int getBalance(){
        return Balance;
    }

    public String getgender(){
        return gender;
    }

    public String getAccount_type(){
        return Account_type;
    }

    //Creating Setters
    public void setName(String name){
        this.name = name;
    }
    public void setAccount_no(long Account_no2){
        this.Account_no = Account_no2;
    }
    public void setBalance(int Balance2){
        this.Balance = Balance2;
    }
    public void setGender(String gender2){
        this.gender = gender2;
    }
    public void setAccount_type(String Account_type){
        this.Account_type = Account_type   ;
    }

}
class main{
    public static void main(String[] args) {
        Bank_system bank_system = new Bank_system();
        bank_system.setName("Devayush");
        bank_system.setAccount_no(213432424);
        bank_system.setBalance(20000);
        bank_system.setAccount_type("Savings");
        bank_system.setGender("Male");
        System.out.println(
                "Name :" + bank_system.getName() + "\n" +
                "Account Number :" + bank_system.getAccount_no() + "\n" +
                "Balance :" + bank_system.getBalance() + "\n" +
                "Account Type :" + bank_system.getAccount_type() + "\n" +
                "Name :" + bank_system.getgender() + "\n"
        );

    }
}

/*
OUTPUT
Name :Devayush
Account Number :213432424
Balance :20000
Account Type :Savings
Name :Male

 */