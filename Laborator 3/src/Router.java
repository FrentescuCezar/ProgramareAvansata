public class Router extends Node implements Identifiable {

    private String address;

    public Router(String name, String address) {
        super(name);
        this.address = address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Router :" + " address = '" + address + '\'' + " " + super.toString();
    }
}