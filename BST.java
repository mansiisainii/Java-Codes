import  java .util.*;
public class BST {
  static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data=data;
      left=right=null;
    }
  }
  public static Node insert(Node root,int val){
    if(root==null){
      root=new Node(val);
      return root;
    }
    if(root.data>val){
      root.left=insert(root.left, val);
    }
   else{
    root.right=insert(root.right, val);
   }
   return root;
  }
  public static void inOrder(Node root){
    if(root==null){
      return;
    }
    inOrder(root.left);
    System.out.print(root.data+" ");
    inOrder(root.right);
  }
  public static boolean search(Node root,int key){
    if(root==null){
      return false;
    }
    if(root.data>key){
      return search(root.left, key);
    }
    else if(root.data==key){
      return true;
    }
    else{
      return search(root.right, key);
    }
  }
  public static Node delete(Node root,int val){
    if(root.data>val){
      root.left=delete(root.left, val);
    }
    else if(root.data<val){
      root.right=delete(root.right, val);
    }
    else{   //root.data==val
      //case 1
      if(root.left==null && root.right==null){
        return null;
      }
      //case 2
      if(root.left==null){
        return root.right;
      }
      else if(root.right==null){
        return root.left;
      }
      ///case 3
      Node IS= inOrderSuccessor(root.right);
      root.data=IS.data;
      root.right=delete(root.right, IS.data);
    }
    return root;
  }
    public static Node inOrderSuccessor(Node root){
      while(root.left!=null){
        root=root.left;
      }
      return root;
    }
    public static void printInRange(Node root,int x,int y){
      if(root==null){
        return;
      }
      if(root.data>=x && root.data<=y){
        printInRange(root.left, x, y);
        System.out.print(root.data+" ");
        printInRange(root.right, x, y);
      }
      else if(root.data>=y){
        printInRange(root.left, x, y);
      }
      else{
        printInRange(root.right, x, y);
      }
    }
    public static void printPath(ArrayList<Integer>path){
      for(int i=0;i<path.size();i++){
        System.out.print(path.get(i)+"->");
      }
    }
    public static void rootToLeaf(Node root,ArrayList<Integer>path){
      if(root==null){
        return ;
      }
      path.add(root.data);
      if(root.left==null&& root.right==null){
        printPath(path);
      }
      else{
        rootToLeaf(root.left, path);
        rootToLeaf(root.right, path);
      }
      path.remove(path.size()-1);
    }
  public static void main(String[] args) {
    int values[]={5,1,3,4,2,7};
    Node root=null;
    for(int i=0;i<values.length;i++){
      root=insert(root, values[i]);
    }
    inOrder(root);
    System.out.println();
    // if(search(root, 1)){
    //   System.out.println("found");
    // }
    // else{
    //   System.out.println("not found");
    // }
    // delete(root, 4);
    // inOrder(root);
    // printInRange(root, 2, 5);
    rootToLeaf(root, new ArrayList<>());
 
  }
}
