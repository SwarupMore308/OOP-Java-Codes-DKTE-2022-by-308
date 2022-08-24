import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}




public class BinaryTreePractice {
    static Scanner sc= null;

    public static Node BuildTree(){
        Node root=null;
        System.out.print("Enter Data: ");
        int data = sc.nextInt();

        if(data == -1){
            return null;
        }

        root = new Node(data);
        System.out.print("Enter Left of "+data+": ");
        root.left = BuildTree();
        System.out.print("Enter Right of "+data+": ");
        root.right = BuildTree();

        return root;
    }

    static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curNode = q.remove();
            if(curNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curNode.data+" ");
                if(curNode.left!=null){
                    q.add(curNode.left);
                }
                if(curNode.right!=null){
                    q.add(curNode.right);
                }
            }
        }
    }


    
    
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = BuildTree();
        System.out.println(root.data);
        levelOrder(root);
    }
}
