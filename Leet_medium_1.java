import java.util.*;
import java.io.*;
class Leet_medium_1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int c=1;
        int [] a=new int[n];
        System.out.println("Enter the heights of the water column");
        for (int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int l,r;
        l=0;
        r=n-1;
        while(l<r)
        {
            int s=Math.min(a[l],a[r]);
            c=Math.max(c,s*(r-l));
            if(a[l]>a[r])
            r--;
            else
            l++;
        }
        System.out.println(c);
    }
}
        