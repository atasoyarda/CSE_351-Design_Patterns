public class User implements Observer {
    String userName;
    public User(String name) {
        this.userName = name;
    }

    @Override
    public void update(String kind,String name) {
        System.out.println(userName + ": new "+kind +" is added!--> "+name);
    }
}