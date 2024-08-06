import java.util.LinkedList;
import java.util.Stack;

class Node{
    int val;
    Node left;
    Node right;
    Node(){}
    Node(Node left,Node right, int val){
        this.left = left;
        this.right = right;
        this.val = val;
    }

}
class DFS{
    public static void main(String[] args){
        Node r7 = new Node(null,null,7);
        Node r6 = new Node(null,null,6);
        Node r4 = new Node(null,null,4);
        Node r8 = new Node(null,null,8);

        Node r5 = new Node(r6,r7,5);
        Node r2 = new Node(r4,r5,2);
        Node r3 = new Node(r8,null,3);
        Node r1 = new Node(r2,r3,1);

        inorderIterative(r1);
        System.out.println();
        inorderT(r1);
        
    }

    static void inorderT(Node root){
        if(root == null)return;
        inorderT(root.left);
        System.out.print(root.val+ ",");
        inorderT(root.right);
    }

    static void inorderIterative(Node root){
        if(root == null)return;
        Stack<Node> stc = new Stack<>();

        stc.push(root);
        Node top = root;
        while(!stc.isEmpty()){

            if(top.left != null){
                 stc.push(top.left);
                 top = top.left;
            }
            else{
                System.out.print(top.val+ " ,");
                stc.pop();
                System.out.print(stc.peek().val+ " ,");
                top = stc.peek();
                if(top.right != null){
                    stc.pop();
                    stc.push(top.right);
                    top = top.right;
                }
                else stc.pop();
            }
           
        }

    }
}