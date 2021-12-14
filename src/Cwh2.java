public class Cwh2 {
    public static void main(String[] args) {
        int [] marks={90,80,95,100,80};
        int sum=0;
        for (int element:marks){
            sum=sum+element;
        }
        System.out.println(sum/ marks.length);

    }
}
