class MaxDepth{
    public static void main(String[] args){
        Node n7 = null;
        Node n2 = new Node(3,null,null);
        Node n8 = new Node(8,null,null);
        Node n5 = new Node(5,null,n7);
        Node n4 = new Node(4,n5,null);
        Node n3 = new Node(3,n4,n8);
        Node n1 = new Node(1,n2,n3);

        System.out.println(getDepth(n1));
    }

    static int getDepth(Node root){
        if(root == null)return 0;

        return (1+Math.max(getDepth(root.left), getDepth(root.right)));
    }
}

class Node{
    int val;
    Node left;
    Node right;
    Node(){}
    Node(int val,Node left,Node right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}