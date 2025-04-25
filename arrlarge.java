public class arrlarge {
    public static void main(String []args){
        int [] numbers ={20,30,90,7};
        int largest=numbers[0];
        for (int i=1;i<numbers.length;i++){
            if (numbers[i]>largest){
                largest=numbers[i];
            }
        }
        System.out.println("largest number is "+largest);
    }
    
}
