import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class SortCommon {

    static void bucketSort(int arr[], int n, int k) {

        int max_val=arr[0];
        for(int i=1;i<n;i++)
            max_val=Math.max(max_val,arr[i]);
        max_val++;

        @SuppressWarnings("unchecked")
        Vector<Integer>[] buckets = new Vector[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Integer>();
        }

        for (int i = 0; i < n; i++) {
            int idx = (arr[i] * k)/max_val;
            buckets[(int)idx].add(arr[i]);
        }

        for (int i = 0; i < k; i++) {
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    static void countSort(int arr[], int n, int k)
    {
        int[] count=new int[k];
        for(int i=0;i<k;i++)
            count[i]=0;
        for(int i=0;i<n;i++)
            count[arr[i]]++;

        for(int i=1;i<k;i++)
            count[i]=count[i-1]+count[i];

        int[] output=new int[n];
        for(int i=n-1;i>=0;i--){
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<n;i++)
            arr[i]=output[i];
    }

    static void cycleSortDistinct(int arr[], int n)
    {
        for(int cs=0;cs<n-1;cs++){
            int item=arr[cs];
            int pos=cs;
            for(int i=cs+1;i<n;i++)
                if(arr[i]<item)
                    pos++;
            //swap(item,arr[pos])

            int temp=item;
            item=arr[pos];
            arr[pos]=temp;
            while(pos!=cs){
                pos=cs;
                for(int i=cs+1;i<n;i++)
                    if(arr[i]<item)
                        pos++;

                //swap(item,arr[pos])
                temp=item;
                item=arr[pos];
                arr[pos]=temp;
            }
        }
    }


    static int maxGuest()
    {

        int arr[] = { 900, 600, 700};
        int dep[] = { 1000, 800, 730};
        int n = arr.length;

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i=1,j=0,res=1,curr=1;
        while(i<n && j<n){
            if(arr[i]<dep[j]){
                curr++;i++;
            }
            else{
                curr--;j++;
            }
            res=Math.max(curr,res);
        }
        return res;
    }

    public static void mergeIntervals()
    {
        Interval arr[] = { new Interval(5,10),new Interval(3,15),new Interval(18,30),
                new Interval(2,7) };

        int n = arr.length;

        Arrays.sort(arr);

        int res = 0;

        for (int i=1; i<n; i++)
        {
            if (arr[res].e >=  arr[i].s)
            {
                arr[res].e = Math.max(arr[res].e, arr[i].e);
                arr[res].s = Math.min(arr[res].s, arr[i].s);
            }
            else {
                res++;
                arr[res] = arr[i];
            }
        }

        for (int i = 0; i <= res; i++)
            System.out.print(  "[" + arr[i].s + ", " + arr[i].e + "] ");
    }

    int getMinDiff(int arr[], int n){
        Arrays.sort(arr);

        int res = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            res = Math.min(res, arr[i] - arr[i-1]);
        }
        return res;
    }

    static void sortthree(int arr[],int n){
        int l=0,h=n-1,mid=0;
        while(mid<=h){
            switch(arr[mid]){
                case 0:
                    //swapping arr[l] & arr[mid])
                    int temp=arr[l];
                    arr[l]=arr[mid];
                    arr[mid]=temp;

                    l++;mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    //swapping arr[h] & arr[mid])
                    temp=arr[h];
                    arr[h]=arr[mid];
                    arr[mid]=temp;

                    h--;
                    break;
            }
        }

    }

    static void sort(int arr[],int n){
        int i=-1,j=n;
        while(true)
        {
            do{i++;}while(arr[i]<0);
            do{j--;}while(arr[j]>=0);
            if(i>=j)return;

            //swapping arr[i] & arr[j]
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }
    }

    static int minDiff(int arr[],int n,int m){
        if(m>n)
            return -1;
        Arrays.sort(arr);
        int res=arr[m-1]-arr[0];
        for(int i=0;(i+m-1)<n;i++)
            res=Math.min(res,arr[i+m-1]-arr[i]);
        return res;
    }


    static  int kthSmallest(int arr[], int n , int k) {
        int l = 0; int r = n -1;
        while(l <= r) {
            int p = iPartition(arr, l, r);
            if(p == k - 1) {
                return p;
            }
            else if(p > k -1) {
                r = p -1;
            }
            else {
                r = p + 1;
            }
        }
        return -1;
    }

    static void qSortusingHoare(int arr[],int l,int h){
        if(l<h){
            int p=HoareMergePartition(arr,l,h);
            qSort(arr,l,p);
            qSort(arr,p+1,h);
        }
    }

    static void qSort(int arr[],int l,int h){
        if(l<h){
            int p=iPartition(arr,l,h);
            qSort(arr,l,p-1);
            qSort(arr,p+1,h);
        }
    }

    static int HoareMergePartition(int arr[], int l, int h) {

            int pivot=arr[l];
            int i=l-1,j=h+1;
            while(true){
                do{
                    i++;
                }while(arr[i]<pivot);
                do{
                    j--;
                }while(arr[j]>pivot);
                if(i>=j)return j;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

    }

    static int iPartition(int arr[], int l, int h)
    {
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }

    static void partition(int arr[], int l, int h, int p)
    {
        int[] temp=new int[h-l+1];int index=0;
        for(int i=l;i<=h;i++)
            if(arr[i]<=arr[p])
            {
                temp[index]=arr[i];index++;
            }
        for(int i=l;i<=h;i++)
            if(arr[i]>arr[p])
            {
                temp[index]=arr[i];index++;
            }
        for(int i=l;i<=h;i++)
            arr[i]=temp[i-l];
    }

    static int countInv(int arr[], int l, int r)
    {
        int res = 0;
        if (l<r) {

            int m = (r + l) / 2;

            res += countInv(arr, l, m);
            res += countInv(arr, m + 1, r);
            res += countAndMerge(arr, l, m , r);
        }
        return res;
    }

    static int countAndMerge(int arr[], int l, int m, int r)
    {
        int n1=m-l+1, n2=r-m;
        int[] left=new int[n1];int[] right=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[i+l];
        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];
        int res=0,i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
            {arr[k++]=left[i++];}
            else{
                arr[k++]=right[j++];
                res=res+(n1-i);
            }
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];
        return res;
    }



    public static void UniunUsingMergeSort(int a[], int b[], int m, int n) {

        int i=0,j=0;
        while(i<m && j<n){
            if(i>0 && a[i-1]==a[i]){i++;continue;}
            if(j>0 && b[j-1]==b[j]){j++;continue;}
            if(a[i]<b[j]){System.out.print(a[i]+" ");i++;}
            else if(a[i]>b[j]){System.out.print(b[j]+" ");j++;}
            else{System.out.print(a[i]+" ");i++;j++;}
        }
        while(i<m){if(i==0||a[i]!=a[i-1])System.out.print(a[i]+" ");i++;}
        while(j<n){if(j==0||b[j]!=b[j-1])System.out.print(b[j]+" ");j++;}
    }


    public static void IntersectionOfArray(int arr1[], int arr2[], int m, int n) {
        int i = 0; int j = 0;
        while(i < m && j < n) {
            if(i>0 && arr1[i-1]==arr1[i]){
                i++;
                continue;
            }

            if(arr1[i] < arr2[j]) {
                i ++;
            }
            else if(arr1[i] > arr2[j]) {
                j++;
            }
            else {
                System.out.println(arr1[i]);
                i++; j++;
            }
        }
    }

    public static void MergeSort(int arr[], int low, int r) {
        if(r > low) {
            int middle = (low + r) / 2;
            MergeSort(arr, low, middle);
            MergeSort(arr, middle + 1, r);
            MergeFucntion(arr, low, middle, r);
        }
    }


    public static void MergeFucntion(int arr[], int low, int mid, int high) {
        int n1 = mid - low + 1; // n1 and n2 are lengths
        int n2 = high - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for(int i = 0; i < n1; i++) {
            leftArray[i] = arr[low + i];
        }
        for(int i = 0; i < n2; i++) {
            rightArray[i] = arr[mid + 1 + i]; // or n1 + 1
        }

        int i = 0; int j = 0; // indexes for traversing the leftarr and rightarr
        int k = low; // index for filling the k array

        // merging two arrays
        while(i < n1 && j < n2) {
            if(leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++; k++;
            }
            else {
                arr[k] = rightArray[j];
                j++; k++;
            }
        }

        while(i < n1) {
            arr[k] = leftArray[i];
            i++; k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++; k++;
        }

        //MergeTwoArrays(leftArray, rightArray, n1, n2);
    }

    public static void MergeTwoArrays(int a[], int b[], int m, int n) {
        int i = 0; int j = 0;

        while (i < m && j < n) {
            if(a[i] <= b[j]) {
                System.out.println(a[i]);
                i++;
            }
            else  {
                System.out.println(b[j]);
                j++;
            }
        }

        while (i < m) {
            System.out.println(a[i]);
            i++;
        }

        while (j < n) {
            System.out.println(b[j]);
            j++;
        }
    }


    public static int[] InsertionSort(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
                int key = arr[i];
                int j = i -1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
        }

        return arr;
    }

    public static int[] SelectionSort(int[] arr) {

        int min_index = 0;
        for(int i =  0; i < arr.length; i++) {
            min_index = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            // swapping
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        return arr;
    }

    public static int[] BubbleSort(int[] arr) {
        boolean swapped = false;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i -1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }

        return  arr;
    }

    public static void Swap(int current, int next) {

    }

    public static Integer[] SortEvenAndOdd(Integer[] arr) {
        Arrays.sort(arr, new MyComparable());
        return arr;
    }

    public static int[] SortSubArray(int[] arr) {
        Arrays.sort(arr, 1, 3 );// start is included but end is not included
        return arr;
    }

    public static int[] InitialSort(int[] arr) {
        Arrays.sort(arr);
       return arr;
    }
}


class Interval implements Comparable<Interval>
{
    int s, e;

    Interval(int s, int e)
    {
        this.s = s;
        this.e = e;
    }

    public int compareTo(Interval a)
    { return this.s - a.s; }
};


class MyComparable implements Comparator<Integer> {
    public int Compare(Integer a, Integer b) {
        return a%2 - b%2;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1%2 - o2%2;
    }
}
