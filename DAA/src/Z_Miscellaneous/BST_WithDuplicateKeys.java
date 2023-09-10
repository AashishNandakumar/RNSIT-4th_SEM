package Z_Miscellaneous;

public class BST_WithDuplicateKeys {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root;

    public BST_WithDuplicateKeys(){
        root = null;
    }

    public void insert(int data){
        Node newNode = new Node(data);

        if(root == null){
            root = newNode;
            return;
        }
        else{
            Node current = root, parent = null;

            while(true){

                parent = current;

                if(data < current.data){
                    current = current.left;
                    if(current == null){
                        parent.left = newNode;
                        return;
                    }
                }else{
                    current = current.right;
                    if(current == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    public void inorderTraversal(Node node){
        if(root == null){
            System.out.print("Empty tree");
            return;
        }else{

            if(node.left!=null)
                inorderTraversal(node.left);
            System.out.println(node.data);

            if(node.right!=null)
                inorderTraversal(node.right);
        }
    }

    public void search(int key){


        long start = System.nanoTime();
        Node temp = root;

        if(temp == null){
            System.out.print("Empty tree");
            return;
        }

        while(temp != null){
            if(key < temp.data)
                temp = temp.left;
            else if(key > temp.data)
                temp = temp.right;
            else{
                long stop = System.nanoTime();
                long time = stop - start;
                System.out.print("match found in : "+time+" ns");
                return;
            }
        }
    }
    public static void main(String[] args) {
        BST_WithDuplicateKeys obj = new BST_WithDuplicateKeys();

        obj.insert(10);
        obj.insert(5);
        obj.insert(15);
        obj.insert(2);
        obj.insert(7);
        obj.insert(12);
        obj.insert(17);
        obj.insert(1);
        obj.insert(3);
        obj.insert(6);
        obj.insert(8);
        obj.insert(11);
        obj.insert(13);
        obj.insert(18);

        obj.inorderTraversal(obj.root);
        obj.search(10);

    }
}
