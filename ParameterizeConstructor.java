package Constructor;

public class ParameterizeConstructor {


    int a;
    double d;
    char c;
    String str;

    //This is the parameterize Constructor
    public ParameterizeConstructor(int a1,double d1,char c1,String str1) {

        a=a1;
        d=d1;
        c=c1;
        str=str1;
    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


        ParameterizeConstructor ob = new ParameterizeConstructor(2,2.0,'B',"bcde");
        ob.display();

        ParameterizeConstructor ob1 = new ParameterizeConstructor(3,3.0,'C',"xyz");
        ob1.display();

    }


}
