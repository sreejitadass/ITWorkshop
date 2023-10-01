class XYZ {
    private int data;

    public void setData() {
        data = 40;
    }

    public void display() {
        System.out.println("Data value= " + data);
    }
}

public class accessPrivate {
    public static void main(String[] args) {
        XYZ obj = new XYZ();
        // obj.data = 40; //cannot access private data directly
        obj.setData(); // accessed by function
        obj.display();
    }

}
