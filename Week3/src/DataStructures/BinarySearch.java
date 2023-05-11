package DataStructures;

public class BinarySearch {
    public static int binarysearch(int a[],int l,int r,int key)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            if(a[mid]==key)
                return mid;
            else if(key<a[mid])
            {
                return binarysearch(a,l,mid,key);
            }
            else
                return binarysearch(a,mid+1,r,key);

        }
        return -1;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[]= {1,2,4,5,7};
        int key=-1;
        int index=binarysearch(a,0,a.length-1,key);
        if(index!=-1)
            System.out.print("Found at "+index);
        else
            System.out.print("Not found");

    }

}
