package binarySearchTree;

import junit.framework.TestCase;

public class BinarySearchTreeTest extends TestCase {

	BinarySearchTree<String> binarySearchTree = new Lab14BinarySearchTree<String>();
	
	public void testIsEmpty() {
		assertEquals(true, binarySearchTree.isEmpty());
		binarySearchTree.insert("Anish");
		assertEquals(false, binarySearchTree.isEmpty());
	}
	
	public void testIsInsertThrowsException() {
		Exception exception = null;
		
		binarySearchTree = new Lab14BinarySearchTree<String>();
		
		binarySearchTree.insert("Anish");
		try {
			binarySearchTree.insert("Anish");
			fail();
		} catch (Exception ex) {
			exception = ex;
		}
		
		assertTrue(exception instanceof DuplicateItemException);
	}
	
	public void testRemove() {
		binarySearchTree = new Lab14BinarySearchTree<String>();
		
		binarySearchTree.insert("Brock");
		binarySearchTree.insert("Anish");
		binarySearchTree.remove("Anish");
		assertEquals(false, binarySearchTree.isEmpty());
		
		binarySearchTree.insert("Manikonda");
		binarySearchTree.remove("Manikonda");
		assertEquals(false, binarySearchTree.isEmpty());
		
		binarySearchTree.insert("Anish");
		binarySearchTree.remove("Brock");
		
		binarySearchTree = new Lab14BinarySearchTree<String>();
		binarySearchTree.insert("Brock");
		binarySearchTree.remove("Brock");
		assertEquals(true, binarySearchTree.isEmpty());
		
		binarySearchTree = new Lab14BinarySearchTree<String>();
		binarySearchTree.insert("Brock");
		binarySearchTree.insert("Anish");
		binarySearchTree.insert("Manikonda");
		binarySearchTree.remove("Brock");
		assertEquals(false, binarySearchTree.isEmpty());
		
	}
	
	public void testRemoveThrowsException() {
		Exception exception = null;
		binarySearchTree = new Lab14BinarySearchTree<String>();
		try {
			binarySearchTree.remove("Manikonda");
		} catch (Exception ex) {
			exception = ex;
		}
		assertTrue(exception instanceof ItemNotFoundException);
		
		exception = null;
		binarySearchTree = new Lab14BinarySearchTree<String>();
		binarySearchTree.insert("Anish");
		binarySearchTree.insert("Anish1");
		binarySearchTree.insert("Anish2");
		binarySearchTree.insert("Anish3");
		
		try {
			binarySearchTree.remove("Manikonda");
		} catch (Exception ex) {
			exception = ex;
		}
		
		assertTrue(exception instanceof ItemNotFoundException);
	}
	
	public void testFindMin() {
		binarySearchTree = new Lab14BinarySearchTree<String>();
		assertEquals(null, binarySearchTree.findMin());
		binarySearchTree.insert("Brock");
		binarySearchTree.insert("Manikonda");
		assertEquals("Brock", binarySearchTree.findMin());
		binarySearchTree.insert("Anish");
		assertEquals("Anish", binarySearchTree.findMin());
	}
	
	public void testFindMax() {
		binarySearchTree = new Lab14BinarySearchTree<String>();
		assertEquals(null, binarySearchTree.findMax());
		binarySearchTree.insert("Brock");
		binarySearchTree.insert("Manikonda");
		binarySearchTree.insert("Anish");
		assertEquals("Manikonda", binarySearchTree.findMax());
	}
	
	public void testFind() {
		binarySearchTree = new Lab14BinarySearchTree<String>();
		binarySearchTree.insert("Brock");
		binarySearchTree.insert("Manikonda");
		binarySearchTree.insert("Anish");
		assertEquals("Manikonda", binarySearchTree.find("Manikonda"));
		assertEquals(null, binarySearchTree.find("Ashley"));
	}
	
	public void testMakeEmpty() {
		binarySearchTree = new Lab14BinarySearchTree<String>();
		binarySearchTree.insert("Brock");
		binarySearchTree.insert("Manikonda");
		binarySearchTree.insert("Anish");
		assertEquals(false, binarySearchTree.isEmpty());
		binarySearchTree.makeEmpty();
		assertEquals(true, binarySearchTree.isEmpty());
	}
	
	public void testToString() {
		binarySearchTree = new Lab14BinarySearchTree<String>();
		assertEquals("()", binarySearchTree.toString());
		binarySearchTree.insert("Anish");
		binarySearchTree.insert("Student");
		binarySearchTree.insert("Manikonda");
		assertEquals("(Anish, Manikonda, Student)", binarySearchTree.toString());
	}
}
