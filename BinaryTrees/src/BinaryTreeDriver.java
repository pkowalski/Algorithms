
public class BinaryTreeDriver {

	
	public static void main(String[] args){
		
		BinaryTree tree = new BinaryTree();
		tree.addNode(10);
		tree.addNode(3);
		tree.addNode(15);
		tree.addNode(4);
		tree.addNode(8);
		tree.addNode(9);
		tree.addNode(11);
		tree.addNode(16);
		
		tree.deleteNode(tree.getRoot(), 15);
		
		tree.inOrderTraversal(tree.getRoot());
		System.out.println(tree.isBST(tree.getRoot()));
		
		System.out.println("Creating tree from sorted array");
		int[] numbers =  {0,1,2,3,4,5,6,7,8,9,10};
		BinaryTree newTree = BinaryTree.sortedArrayToBST(numbers);
		newTree.inOrderTraversal(newTree.getRoot());
		
		System.out.println("Inverting tree");
		BinaryTree inverted = new BinaryTree(newTree.invertTree(newTree.getRoot()));
		newTree.inOrderTraversal(newTree.getRoot());
	}
}
