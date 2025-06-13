package encapsulation1;

public class Person {
    private int l; 
    private int b; 


    Person(int l, int b)
    {
        this.l = l;
        this.b = b;
    }

    // method to calculate area
    public void getPerson()
    {
        int area = l * b;
        System.out.println("Area: " + area);
    }
}


    

