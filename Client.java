package Java;

import java.util.ArrayList;

public class Client {
    private int ID;
    private String name;
    private String phone;
    private ArrayList<Account> accounts;

    public Client(int ID, String name, String phone) {
        this.ID = ID;
        this.name = name;
        this.phone = phone;
        accounts = new ArrayList<>();
    }

    public boolean addAccount(Account account) {
        accounts.add(account);
        return true;
    }

//    public boolean removeAccount(Account accountId) {
//        for(Account account: accounts) {
//            if (account.getId()==accountId) {
//                accounts.remove(accountId);
//                return true;
//            }
//        }
//        return false;
//    }

    public String toString(){
        String s=this.ID + " " + this.name + " " + this.phone + "\n";
            s += accounts;
        return s;
    }

    public int getId() {
        return ID;
    }

    public void setId(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
