public class HelloWorld{

     public static void main(String []args){
       int arr[]={10,20,9,80,60,678};
       int i,j;
       for(j=0;j<5;j++)
       {
       for(i=0;i<5;i++)
       {
           if(arr[j]<arr[i+1])
           {
               int temp=arr[i];
               arr[i]=arr[i+1];
               arr[i+1]=temp;
           }
       }
       }
       for(i=0; i<5; i++)
		{
			System.out.println(arr[i]);
		}
     }
}