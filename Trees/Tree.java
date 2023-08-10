import java.util.ArrayList;

public class Tree {

    static class TreeNode {
        String data;
        ArrayList<TreeNode> children;

        public TreeNode(String data) {
            this.data = data;
            this.children = new ArrayList<TreeNode>();
        }

        public void addChild(TreeNode node) {
            this.children.add(node);
        }

        public String print(int level) {
            String ret = " ".repeat(level) + data + "\n";
            for (TreeNode node : this.children) {
                ret += node.print(level + 1);
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode("drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        root.addChild(hot);
        root.addChild(cold);
        System.out.println(root.print(0));
    }
}
