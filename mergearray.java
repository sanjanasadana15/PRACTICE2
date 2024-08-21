class mergearray{
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5};

        int m=a.length;
        int n=b.length;
        int[] arr =new int[m+n];

        for(int i=0;i<m;i++){
            arr[i]=a[i];
        }

        for(int i=0;i<n;i++){
            arr[i+m]=b[i];
        }


        for(int i=0;i<m+n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}