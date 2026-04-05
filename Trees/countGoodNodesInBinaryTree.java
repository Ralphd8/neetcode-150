class Solution {
    public int goodNodes(TreeNode root) {
        if(root == null){return 0;}
        return inter(root,root.val);
    }
    public int inter(TreeNode root, int max){
        if(root == null){return 0;}
        int count = 0;
        if(root.val >= max){
            count++;
            max = root.val;
        }
        count = count + inter(root.left,max);
        count = count + inter(root.right,max);

        return count;
    }
}