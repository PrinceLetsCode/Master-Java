package leetCode;

import java.util.ArrayList;
import java.util.List;

class NaryNode {
    public int val;
    public List<NaryNode> children;

    public NaryNode() {}

    public NaryNode(int _val) {
        val = _val;
    }

    public NaryNode(int _val, List<NaryNode> _children) {
        val = _val;
        children = _children;
    }
}

public class N_aryNodePreorderTraversal {

    public static void main(String[] args) {
        NaryNode root = new NaryNode(1);
        root.children = new ArrayList<NaryNode>();
        root.children.add(new NaryNode(3));
        root.children.add(new NaryNode(2));
        root.children.add(new NaryNode(4));
        root.children.get(0).children = new ArrayList<>();
        root.children.get(0).children.add(new NaryNode(5));
        root.children.get(0).children.add(new NaryNode(6));
        preorder(root);
    }

    private static List<Integer> preorder(NaryNode root) {
           List<Integer> list = new ArrayList<>();
            if(root == null) return list;
            list.add(root.val);
            for(NaryNode node : root.children){
                list.addAll(preorder(node));
            }
            return list;
    }
}
