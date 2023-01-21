class mamima {
    public static void main(String args[])
    {
        int [] array1 = {2,54,65,34,56,54,73,34,2};
        int max = 0;
        for(int i = 0;i < array1.length;i++)
        {
            if(array1[i] >max){
                max = array1[i];
            }
        }
        System.out.println("Maximum Number Of Array1:"+max);
    }
}
