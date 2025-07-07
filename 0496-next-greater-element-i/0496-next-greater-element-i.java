class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;

        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++)
            {
                if (nums1[i] == nums2[j])
                {
                    int k;
                    for (k = j + 1; k < l2; k++)
                    {
                        if (nums2[k] > nums2[j])
                        {
                            nums1[i] = nums2[k];
                            break;
                        }
                    }
                    if (k == l2)
                    {
                        nums1[i] = -1;
                    }
                    break; 
                }
            }
        }

        return nums1;
    }
}
