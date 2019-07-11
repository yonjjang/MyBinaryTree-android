package com.example.mybinarytree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {

    Node[] nodeArray = new Node[32];
    String preOrder="";
    String inOrder="";
    String postOrder="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        Intent intent = getIntent();
        String[] inputArray = intent.getExtras().getStringArray("nodeArray");

        for (int j=1; j<32; j++)
            nodeArray[j] = new Node(inputArray[j]);

        for (int i=1; i<16; i++) {
            nodeArray[i].left=nodeArray[2*i];
            nodeArray[i].right=nodeArray[2*i+1];
        }

        TextView pre = (TextView) findViewById(R.id.preorder);
        TextView in =  (TextView) findViewById(R.id.inorder);
        TextView post =  (TextView) findViewById(R.id.postorder);

        preorder(nodeArray[1]);
        pre.setText(preOrder);

        inorder(nodeArray[1]);
        in.setText(inOrder);

        postorder(nodeArray[1]);
        post.setText(postOrder);

    }


    public void preorder(Node node) {
        if(node==null)
            return;

        if(node.data!=null) {
            if (preOrder.length() == 0)
                preOrder += node.data;
            else
                preOrder += " - " + node.data;
        }

        preorder(node.left);

        preorder(node.right);

    }

    public void inorder(Node node) {
        if(node == null)
            return;

        inorder(node.left);

        if(node.data!=null) {
            if (inOrder.length() == 0)
                inOrder += node.data;
            else
                inOrder += " - " + node.data;
        }

        inorder(node.right);
    }


    public void postorder(Node node) {
        if(node == null)
            return;

        postorder(node.left);

        postorder(node.right);

        if(node.data!=null) {
            if (postOrder.length() == 0)
                postOrder += node.data;
            else
                postOrder += " - " + node.data;
        }

    }
}


class Node{
    public String data;
    public Node left;
    public Node right;

    public Node(String data) {
        this.data = data;
    }
}


