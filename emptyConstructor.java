package Constructor;

public class emptyConstructor {


    int a;
    double d;
    char c;
    String str;

    //This is the Empty Constructor
    public emptyConstructor() {

    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


        emptyConstructor ob = new emptyConstructor();
        ob.display();

    }


}
