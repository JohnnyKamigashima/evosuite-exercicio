package example;

public class calc {
    public static int add(int x, int y)
    {
        return x + y;
    }
    public static int sub(int x, int y)
    {
        return x-y;
    }
    public static int mult(int x, int y)
    {
        return x*y;
    }
    public static int div(int x, int y)
    {
        int result =0;
        if (y !=0) {
            result = x / y;
        }

        return result;
    }
    public static int  addAndSub(int x, int y) {return (x +y)-(y+x);  }
}
