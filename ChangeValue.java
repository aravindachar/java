package intermediate;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        change(arr);
        System.out.println(arr.toString());
    }
    static void change(int[] nums){
        nums[1]=23;

    }
}
