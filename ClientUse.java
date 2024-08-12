package Java;

public class ClientUse {
    public static void main(String[] args){
        Client[] clients=new Client[2];
        clients[0]=new Client(10,"Hira","123456789");
        clients[0].addAccount(new Account(101,30000,6.4));
        clients[0].addAccount(new Account(102,40000,2.5));

        clients[1]=new Client(11,"Aneesa","987654321");
        clients[1].addAccount(new Account(103,50000,5.2));
        clients[1].addAccount(new Account(104,60000,4.9));
        clients[1].addAccount(new Account(105,70000,3.5));

        System.out.println(clients[0].toString());
        System.out.println(clients[1].toString());
    }
}
