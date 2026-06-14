public class BinaryTreeImpl {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        Node insert(Node root, int data) {
            if (root == null) return new Node(data);
            if (data < root.data) root.left = insert(root.left, data);
            else if (data > root.data) root.right = insert(root.right, data);
            return root;
        }

        void insert(int data) {
            root = insert(root, data);
        }

        void inorder(Node node) {
            if (node == null) return;
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }

        void preorder(Node node) {
            if (node == null) return;
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }

        // postorder - left right root
        void postorder(Node node) {
            if (node == null) return;
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }

        boolean search(Node node, int data) {
            if (node == null) return false;
            if (node.data == data) return true;
            if (data < node.data) return search(node.left, data);
            return search(node.right, data);
        }

        int height(Node node) {
            if (node == null) return 0;
            return 1 + Math.max(height(node.left), height(node.right));
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.print("\nPreorder: ");
        tree.preorder(tree.root);

        System.out.print("\nPostorder: ");
        tree.postorder(tree.root);

        System.out.println("\nSearch 40: " + tree.search(tree.root, 40));
        System.out.println("Search 99: " + tree.search(tree.root, 99));
        System.out.println("Height: " + tree.height(tree.root));
    }
}
