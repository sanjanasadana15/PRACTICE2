class interview{
    public static void main(String[] args){

        int[] a={4,1,-4,6,5};

        int n=a.length;
        int min=a[0];
        for(int i=1;i<n;i++){
            if(min > a[i])
                min =a[i];
        }
        System.out.println(min);

        while(a[0] != min){
            int temp=a[0];
            for(int i=0;i<n-1;i++){
                a[i]=a[i+1];
                System.out.print(a[i]+ " ");
            }
                
            System.out.println();
            a[n-1]=temp;
            
        }
        int sum=0;
        for(int i=1;i<n;i++){
            System.out.print(a[i]+ " ");
            sum+=a[i];
        }
        System.out.println();
        System.out.println(sum);

    }
}