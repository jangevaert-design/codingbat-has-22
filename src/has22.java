public class has22 {
  public boolean has22(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 2 && i > 0 && nums[i - 1] == 2) {
        return true;
      }
    }
    return false;
  }
}
