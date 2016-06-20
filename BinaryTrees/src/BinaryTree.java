
public class BinaryTree {

	private TreeNode root;
	
	public BinaryTree(){
		
	}
	
	public BinaryTree(TreeNode root){
		this.root = root;
	}
	
	public boolean isEmpty(){
		return this.root == null;
	}
	
	public void addNode(int data){
		
		if(this.root == null){
			this.root = new TreeNode(data);
		}
		else{
			
			TreeNode loopNode = this.root;
			
			while(true){
				
				if(loopNode.getData() > data){
					
					if(loopNode.getLeft() != null){
						loopNode = loopNode.getLeft();
					}
					else{
						loopNode.setLeft(new TreeNode(data));
						return;
					}
				}
				else{
					
					if(loopNode.getRight() != null){
						loopNode = loopNode.getRight();
					}
					else{
						loopNode.setRight(new TreeNode(data));
						return;
					}
				}
			}
		}
	}
	
	public TreeNode getRoot(){
		return this.root;
	}
	
	public void inOrderTraversal(TreeNode loopNode){
		
		if(loopNode != null){
			
			inOrderTraversal(loopNode.getLeft());
			
			System.out.println(loopNode.getData());
			
			inOrderTraversal(loopNode.getRight());
			
		}
	}
	
	public void preOrderTraversal(TreeNode loopNode){
		
		if(loopNode != null){
			
			System.out.println(loopNode.getData());
			
			inOrderTraversal(loopNode.getLeft());
			
			inOrderTraversal(loopNode.getRight());
			
		}
	}
	
	public void postOrderTraversal(TreeNode loopNode){
		
		if(loopNode != null){
			
			inOrderTraversal(loopNode.getLeft());
			
			inOrderTraversal(loopNode.getRight());
			
			System.out.println(loopNode.getData());
			
		}
	}
	
	public TreeNode findNode(TreeNode node){
		
		TreeNode focus = this.root;
		
		while(focus.data != node.data){
			
			if(focus == null){
				return null;
			}
			
			if(node.data < focus.data){
				focus = focus.getLeft();
			}
			else{
				focus = focus.getRight();
			}
			
		}
		
		return focus;
	}
	
	public boolean isBST(TreeNode node){
		return this.isBSTUtil(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public boolean isBSTUtil(TreeNode node, int min, int max){
		
		if(node == null){
			return true;
		}
		
		if(node.getData() < min || node.getData() > max){
			return false;
		}
		
		return(this.isBSTUtil(node.getLeft(), min, node.getData() - 1) && this.isBSTUtil(node.getRight(), node.getData() + 1, max));
	}
	
	public TreeNode deleteNode(TreeNode loopNode, int value){
		
		if(loopNode == null){
			return loopNode;
		}
		else if(value > loopNode.getData()){
			loopNode.setRight(this.deleteNode(loopNode.getRight(), value));
		}
		else if(value < loopNode.getData()){
			loopNode.setLeft(this.deleteNode(loopNode.getLeft(), value));
		}
		else{
			
			// Leaf Node
			if(loopNode.getLeft() == null && loopNode.getRight() == null){
				loopNode = null;
			}
			else if(loopNode.getLeft() == null){
				loopNode = loopNode.getRight();
			}
			else if(loopNode.getRight() == null){
				loopNode = loopNode.getLeft();
			}
			else{
				
				TreeNode temp = this.findMin(loopNode.getRight());
				loopNode.setData(temp.getData());
				loopNode.setRight(this.deleteNode(loopNode.getRight(), temp.getData()));
			}
		}
		
		return loopNode;
	}
	
	public TreeNode findMin(TreeNode loopNode){
		
		while(loopNode.getLeft() != null){
			loopNode = loopNode.getLeft();
		}
		
		return loopNode;
	}
	
	public static BinaryTree sortedArrayToBST(int[] numbers){
		
		if(numbers.length == 0){
			return null;
		}
		
		BinaryTree tree = new BinaryTree(sortedArrayToBSTHelper(numbers, 0, numbers.length - 1));
		
		return tree;
	}
	
	public static TreeNode sortedArrayToBSTHelper(int[] numbers, int start, int end){
		 if(start > end){
			 return null;
		 }
		 
		 
		 int mid = (start + end) / 2;
		 TreeNode root = new TreeNode(numbers[mid]);
		 root.setLeft(sortedArrayToBSTHelper(numbers, start, mid - 1));
		 root.setRight(sortedArrayToBSTHelper(numbers, mid + 1, end));
		 
		 return root;
	}
	
	public TreeNode invertTree(TreeNode root){
		if(root != null){
			this.invertTreeHelper(root);
		}
		
		return root;
	}
	
	public void invertTreeHelper(TreeNode root){
		
		TreeNode temp = root.getLeft();
		root.setLeft(root.getRight());
		root.setRight(temp);
		
		if(root.getLeft() != null){
			this.invertTreeHelper(root.getLeft());
		}
		if(root.getRight() != null){
			this.invertTreeHelper(root.getRight());
		}
	}
}
