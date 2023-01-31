Class Math
{
    public void Addition(int x,int y)
    {
        return x+y;
    }


    public void Subtract(int x,int y)
    {
        return x-y;
    }


    public void multiply(int x,int y)
    {
        return x*y;
    }

    public void Divide(int x,int y)
    {
        return x/y;
    }


    public void Reminder(int x,int y)
    {
        return x%y;
    }


    public static void main(String args[])
    {
        System.out.println(Addition(5,7));
        System.out.println(Subtract(5,7));
          System.out.println(Reminder(10,7));
        System.out.println(multiply(5,7));
        System.out.println(Divide(14,7));
      

    }
}