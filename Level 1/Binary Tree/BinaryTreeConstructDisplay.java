import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;
  }

  public static class Pair {
    Node node;
    int state;
  }

  public static Node construct(Integer[]arr){
    Stack<Pair> stack=new Stack<>();
    Node root=new Node();
    root.data=arr[0];
    Pair rootp=new Pair();
    rootp.node=root;
    rootp.state=1;
    int index=1;
    stack.push(rootp);
    while(stack.size()>0){
        Pair peekp=stack.peek();
        if(peekp.state==1){
            if(arr[index]!=null){
            Node lc=new Node();
            lc.data=arr[index];
            peekp.node.left=lc;
            Pair Lp=new Pair();
            Lp.node=lc;
            Lp.state=1;
            stack.push(Lp);
            }
        }else if(peekp.state==2){
            if(arr[index]!=null){
            Node rc=new Node();
            rc.data=arr[index];
            peekp.node.right=rc;
            Pair Rp=new Pair();
            Rp.node=rc;
            Rp.state=1;
            stack.push(Rp);
            }
        }else if(peekp.state==3){
            stack.pop();
        }
        peekp.state++;
        index++;
    }
    return root;
  }
  public static void display(Node node){
      if(node==null){
          return;
      }
      String str="<-"+node.data+"->";
      String lcStr=node.left==null?".":node.left.data+"";
      String rcStr=node.right==null?".":node.right.data+"";
      System.out.println(lcStr+str+rcStr);
      display(node.left);
      display(node.right);
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);
    display(root);
}
}