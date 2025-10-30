package Bai2.Bai3;

public class main {
    static void main(String[] args) {
       User user1 = new User(12.2, "Bao" );
       User user2 = new User();
       user2.setName("Haha");
       user2.setBalance(200);
       System.out.println(user1);
       System.out.println(" "+user2.getName()+" "+user2.getBalance());

    }
}
