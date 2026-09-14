import java.util.*;

public class BinaryTreess {
  static class Node{
    int data;
    Node left=null;
    Node right=null;
    Node(int data){
      this.data=data;
      this.left=null;
      this.right=null;
    }
  }
  static class binaryTree{
     static int idx=-1;
     public Node buildTree(int nodes[]){
      idx++;
      if(nodes[idx]==-1){
        return null;
      }
      Node newNode= new Node(nodes[idx]);
      newNode.left=buildTree(nodes);
      newNode.right=buildTree(nodes);
      return newNode;
    }
    public void preOrder(Node root){
      if(root==null){
        return ;
      }
      System.out.print(root.data+" ");
      preOrder(root.left);
      preOrder(root.right);
    }
    public void InOrder(Node root){
      if(root==null){
        return;
      }
      InOrder(root.left);
      System.out.print(root.data +" ");
      InOrder(root.right);
    }
    public void postOrder(Node root){
       if(root==null){
        return;
      }
      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.data+" ");
    }
    public void levelOrder(Node root){
      Queue<Node> q=new LinkedList<>();
      q.add(root);
      q.add(null);
      while(!q.isEmpty()){
        Node currNode=q.remove();
        if(currNode==null){
          System.out.println();
          if(q.isEmpty()){
            break;
          }
          else{
            q.add(null);
          }
        }
        else{
          System.out.print(currNode.data+" ");
          if(currNode.left!=null){
            q.add(currNode.left);
          }
          if(currNode.right!=null){
            q.add(currNode.right);
          }
        }
      }
    }
    public int sumOfNodesAtKthLevel(Node root,int k){
      Queue<Node> q=new LinkedList<>();
      if(root==null){
        return 0;
      }
      q.add(root);
      q.add(null);
      int level=0;
      int sum=0;
      while(!q.isEmpty()){
        Node currNode=q.remove();
        if(currNode==null){
          System.out.println();
          level++;
          if(q.isEmpty()){
            break;
          }
          else{
            q.add(null);
          }
        }
        else{
          if(level==k){
            sum+=currNode.data;
          }
          if(currNode.left!=null){
            q.add(currNode.left);
          }
          if(currNode.right!=null){
            q.add(currNode.right);
          }
        }
      }
      return sum;
    }
    public int countOfNodes(Node root){
    if(root==null){
      return 0;
    }
    int leftNodes=countOfNodes(root.left);
    int rightNodes=countOfNodes(root.right);
    return leftNodes+rightNodes+1;
  }
  public int sumOfNodes(Node root){
    if(root==null){
      return 0;
    }
    int leftSum=sumOfNodes(root.left);
    int rightSum=sumOfNodes(root.right);
    return leftSum+rightSum+root.data;
  }
  public int height(Node root){
    if(root==null){
      return 0;
    }
    int leftHeight=height(root.left);
    int rightHeight=height(root.right);
    int myHeight=Math.max(leftHeight,rightHeight)+1;
    return myHeight;
  }
  public int diameter(Node root){
    if(root==null){
      return 0;
    }
    int diam1=diameter(root.left);
    int diam2=diameter(root.right);
    int diam3=height(root.left)+height(root.right)+1;
    int myDiam = Math.max(diam3,Math.max(diam1,diam2));
    return myDiam;
  }
  }
  //o(n)approach for diam
  static class treeInfo{
    int ht;
     int diam;
    treeInfo(int ht,int diam){
      this.ht=ht;
      this.diam=diam;
    }
  }
  public static treeInfo diameter2(Node root){
    if(root==null){
      return new treeInfo(0,0);
    }
    treeInfo left= diameter2(root.left);
    treeInfo right=diameter2(root.right);
    int myHeight=Math.max(left.ht,right.ht)+1;
    int diam1=left.diam;
    int diam2=right.diam;
    int diam3=left.ht+right.ht+1;
    int myDiam= Math.max(diam3,Math.max(diam1,diam2));
    treeInfo myInfo=new treeInfo(myHeight, myDiam);
    return myInfo;
  }
  
  public static void main(String[] args) {
    int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    binaryTree b= new binaryTree();
    Node root=b.buildTree(nodes);
    // System.out.println(root.data);
    // b.preOrder(root);
    // System.out.println();
    // b.InOrder(root);
    // System.out.println();
    // b.postOrder(root);
    // System.out.println();
    // b.levelOrder(root);
    // System.out.println(b.countOfNodes(root));
    // System.out.println(b.sumOfNodes(root));
    // System.out.println(b.height(root));
    // System.out.println(b.diameter(root));
    // System.out.println(diameter2(root).diam);
    System.out.println(b.sumOfNodesAtKthLevel(root, 1));
  }
}
