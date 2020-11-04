package DataStructures.Tree;

public class demoTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        HeroNode root = new HeroNode(1,"宋江");
        HeroNode hero2 = new HeroNode(2,"无用");
        HeroNode hero3 = new HeroNode(3,"卢俊义");
        HeroNode hero4 = new HeroNode(4,"林冲");
        HeroNode hero5 = new HeroNode(5, "关胜");
        //手动创建二叉树
        binaryTree.setRoot(root);
        root.setLeft(hero2);
        root.setRight(hero3);
        hero3.setRight(hero4);
        hero3.setLeft(hero5);
        System.out.println("前序遍历");
        binaryTree.preOrder();//1,2,3,4
        System.out.println("中序遍历");
        binaryTree.infixOrder();//2,1,3,4
        System.out.println("后序遍历");//2,4,3,1
        binaryTree.postOrder();
        System.out.println("前序遍历方式");
       HeroNode resNode = binaryTree.preOrderSearch(5);
       if (resNode!=null){
           System.out.printf("找到了，信息为:编号:%d 姓名：%s",resNode.getSerialNum(),resNode.getName());
       }else {
           System.out.println("没有找到");
       }
    }
}
//定义二叉树
class BinaryTree{
    private HeroNode root;

    public void setRoot(HeroNode root) {
        this.root = root;
    }
    public void preOrder(){
        if (this.root!=null){
            this.root.preOrder();
        }else {
            System.out.println("二叉树为空，无法遍历");
        }
    }
    public void infixOrder(){
        if (this.root!=null){
            this.root.infixOrder();
        }else {
            System.out.println("二叉树为空，无法遍历");
        }
    }
    public void postOrder(){
        if (this.root!=null){
            this.root.postOrder();
        }else {
            System.out.println("二叉树为空，无法遍历");
        }
    }
    public HeroNode preOrderSearch(int no){
        if (root!=null){
           return this.root.preOrderSearch(no);
        }else {
            return null;
        }
    }
    public HeroNode infixOrderSearch(int no){
        if (root!=null){
           return this.root.infixOrderSearch(no);
        }else {
            return null;
        }
    }
    public HeroNode postOrderSearch(int no){
        if (this.root!=null){
            return this.root.preOrderSearch(no);
        }else{
            return null;
        }
    }
}
class HeroNode{
    private int serialNum;
    private String name;
    private HeroNode left;
    private HeroNode right;

    public HeroNode(int serialNum, String name) {
        this.serialNum = serialNum;
        this.name = name;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "serialNum=" + serialNum +
                ", name='" + name + '\'' +
                '}';
    }
    //前序遍历
    public void preOrder(){
        System.out.println(this);
        if (this.left != null){
            this.left.preOrder();
        }
        if (this.right!=null){
            this.right.preOrder();
        }
    }
    //中序遍历
    public void infixOrder(){
        if (this.left!=null){
            this.left.infixOrder();
        }
        System.out.println(this);
        if (this.right!=null){
            this.right.infixOrder();
        }
    }
    //后序遍历
    public void postOrder(){
        if (this.left!=null){
            this.left.postOrder();
        }
        if (this.right!=null){
            this.right.postOrder();
        }
        System.out.println(this);
    }
    public HeroNode preOrderSearch(int no){
        if (this.serialNum == no){
            return this;
        }
        HeroNode resNode = null;
        if (this.left!=null){
          resNode = this.left.preOrderSearch(no);
        }
        if (resNode!=null){
            return resNode;
        }
        if (this.right!=null){
           resNode = this.right.preOrderSearch(no);
        }
        return resNode;
    }
    public HeroNode infixOrderSearch(int no){
        HeroNode resNode = null;
        if (this.left!=null){
            resNode = this.left.infixOrderSearch(no);
        }
        if (resNode!=null){
            return resNode;
        }
        if (this.serialNum == no){
            return this;
        }
        if (this.right!=null){
            resNode = this.right.infixOrderSearch(no);
        }
        return resNode;
    }
    public HeroNode postOrderSearch(int no){
        HeroNode resNode = null;
        if (this.left!=null){
            resNode = this.left.postOrderSearch(no);
        }
        if (resNode!=null){
            return resNode;
        }
        if (this.right!=null){
            resNode = this.right.postOrderSearch(no);
        }
        if (resNode!=null){
            return resNode;
        }
        if (this.serialNum == no){
            return this;
        }
        return resNode;
    }
}
