package observer;

public class Test {
    public static void main(String[] args) {
        Server server = new Server("lol");
        Client o1= new Client("hey");
        server.registerObserver(o1);
        System.out.println(o1.getInfomation());
        server.setInfomation("man");
        System.out.println(o1.getInfomation());

    }
}
