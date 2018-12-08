package observer;

public class Client implements Observer {
    private String infomation;


    public Client() {

    }

    public Client(String infomation) {
        this.infomation = infomation;
    }

    public String getInfomation() {
        return infomation;
    }

    public void setInfomation(String infomation) {
        this.infomation = infomation;
    }

    @Override
    public void update(String info) {
        this.infomation = info;
    }


}
