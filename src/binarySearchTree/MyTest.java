package binarySearchTree;

public class MyTest {

	public static void main(String[] args) {
		BinarySearchTree<String> binarySearchTree = new Lab14BinarySearchTree<String>();
		System.out.println(binarySearchTree.toString());
		binarySearchTree.insert("Anish");
		binarySearchTree.insert("Student");
		binarySearchTree.insert("Manikonda");
		System.out.println(binarySearchTree.toString());
	}
}
