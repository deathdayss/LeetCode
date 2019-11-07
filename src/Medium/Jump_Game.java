package Medium;

public class Jump_Game {

    boolean canJump(int index, int[] nums) {
        System.out.println("index is " + index);
        for (int i = 0; i < index; i++) {
            for (int j = 1; j <= nums[i]; j++) {
                if (i + j == index) {
                    if (i == 0) {
                        return true;
                    } else if (canJump(i, nums)) {
                        return true;
                    }
                } else if (i + j > index) {
                    break;
                }
            }
        }
        return false;
    }


    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        if (nums.length <= 1) {
            return true;
        }

        return canJump(nums.length - 1, nums);
    }

    public static void main(String[] args) {
        Jump_Game a = new Jump_Game();
        System.out.println(a.canJump(new int[] {3,2,1,0,4}));
    }
}
