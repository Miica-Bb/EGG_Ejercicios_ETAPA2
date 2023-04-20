public class G05Ej01 {

    public static void main(String[] args) {
        
        int[] nums = new int[100];
        
        for (int i = 0; i < 100; i++) {
            nums[i] = i + 1;
        }
        
        String mostrarVector = "";
        for (int i: nums) {
            mostrarVector += " " + i;
        }
        System.out.println(mostrarVector);
    }
    
}
