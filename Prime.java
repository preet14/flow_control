class Prime{

    public static void main(String[] args)
    {
        int num=3,i=2,flag=0;

        while(i<(num/2))
        {
            if(num%i==0){
                flag=1;
                break;
            }
            else{
                flag=0;
            }
            i++;
        }

        if(flag==0)
            System.out.println("Prime Number");
        else
            System.out.println("Composite Number");
    }
}