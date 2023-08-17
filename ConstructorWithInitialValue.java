package Constructor;

public class ConstructorWithInitialValue {


    int a;
    double d;
    char c;
    String str;

    //This is the Constructor with initial value
    public ConstructorWithInitialValue() {

        a=1;
        d=1.0;
        c='A';
        str="Abcd";
    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


        ConstructorWithInitialValue ob = new ConstructorWithInitialValue();
        ob.display();


    }


}
