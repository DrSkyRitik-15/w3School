public class Avg {

    public static void main(String[] args) {
        int arr[]={10,20,30,50,80,40,60};
        int len=arr.length;
        float sum=0;
        for (int i : arr) {
            sum=sum+i;
        }
        float avg=sum/len;
        System.out.println("The average is "+avg);
}
}