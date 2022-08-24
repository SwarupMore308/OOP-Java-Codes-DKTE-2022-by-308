import java.util.*;

class BinaryTree{
    static class Node{
        int data; 
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left=null;
            this.right= null;
        }
    }

    static class BinaryTrees{
        static int index=-1;
        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index] == -1){
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.err.print(root.data+" ");
    }

    public static void levelOrder(Node root){
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
                }else{
                    q.add(null);
                }
            }else{
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

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = countNode(root.left);
        int rightNodes = countNode(root.right);

        return leftNodes+rightNodes+1;
    }

    public static int sumNode(Node root){
        if(root == null){
            return 0;
        }

        int leftSum = sumNode(root.left);
        int rightSum = sumNode(root.right);

        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTrees trees = new BinaryTrees();
        Node root = trees.buildTree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println();
        inorder(root);
        System.err.println();
        postorder(root);
        System.out.println();
        levelOrder(root);
        System.out.println(countNode(root));
        System.out.println(sumNode(root));
    }
}