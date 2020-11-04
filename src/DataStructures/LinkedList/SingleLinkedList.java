package DataStructures.LinkedList;

import java.util.Stack;

public class SingleLinkedList {
    public static void main(String[] args) {
        //进行测试
        //先创建几个节点
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");
        //创建要给单链表
        /*
        SingleLinkedList1 singleLinkedList1 = new SingleLinkedList1();
        singleLinkedList1.add(hero1);
        singleLinkedList1.add(hero2);
        singleLinkedList1.add(hero3);
        singleLinkedList1.add(hero4);
        singleLinkedList1.list();

         */
        SingleLinkedList1 singleLinkedList1 = new SingleLinkedList1();
        singleLinkedList1.addByOrder(hero1);
        singleLinkedList1.addByOrder(hero4);
        singleLinkedList1.addByOrder(hero3);
        singleLinkedList1.addByOrder(hero2);
        singleLinkedList1.list();
        //测试修改节点的代码
        HeroNode newHeroNode = new HeroNode(2, "小卢", "玉麒麟-");
        singleLinkedList1.update(newHeroNode);
        singleLinkedList1.list();
        System.out.println();
        singleLinkedList1.delete(1);
        singleLinkedList1.list();
        //测试求单链表结点个数
        System.out.println(getLength(singleLinkedList1.getHead()));
        //测试看是否得到了倒数第k个节点
        HeroNode res = findLastNode(singleLinkedList1.getHead(), 2);
        System.out.println("res="+res);
        System.out.println("输出反转单链表");
        reverseList(singleLinkedList1.getHead());
        singleLinkedList1.list();
        System.out.println("逆序打印链表");
        reversePrint(singleLinkedList1.getHead());

    }

    //方法求单链表节点个数
    public static int getLength(HeroNode head) {
        if (head.next == null) {
            return 0;
        }
        int length = 0;
        HeroNode cur = head.next;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        return length;

    }

    //查找单链表中倒数第k个节点
    public static HeroNode findLastNode(HeroNode head, int index) {
        if (head.next == null) {
            return null;
        }
        int size = getLength(head);
        if (index <= 0 || index > size) {
            return null;
        }
        HeroNode cur = head.next;
        for (int i = 0; i < size - index; i++) {
            cur = cur.next;
        }
        return cur;
    }
    //实现单链表的反转
    public static void reverseList(HeroNode head){
        //如果当前链表为空，或者只有一个节点，无需反转，直接返回
        if (head == null||head.next.next ==null){
            return;
        }
        HeroNode cur = head.next;
        HeroNode next = null;//指向当前节点的下一个节点
        HeroNode reverseHead = new HeroNode(0,"","");
        //遍历原来链表，每遍历一个节点，就将它取出，并放在新链表的最前端
        while (cur!=null){
            next = cur.next;//保存当前节点的下一个节点
            cur.next = reverseHead.next;//将cur的下一个节点指向新的链表的最前端
            reverseHead.next = cur;
            cur = next;
        }
        head.next = reverseHead.next;
    }
    //使用栈逆序打印链表
    public static void reversePrint(HeroNode head){
        if (head == null){
            return;
        }
        Stack<HeroNode> stack = new Stack<HeroNode>();
        HeroNode cur = head.next;
        //将链表的所有节点压入栈中
        while (cur!=null){
            stack.push(cur);
            cur = cur.next;
        }
        while (stack.size()>0){
            System.out.println(stack.pop());
        }
    }
}

//定义一个SingleLinkedList管理我们的英雄
class SingleLinkedList1{
    //先初始化一个头结点,头结点不动，不存放具体数据
    private HeroNode head = new HeroNode(0,"","");

    public HeroNode getHead() {
        return head;
    }

    //添加节点到单链表
    public void add(HeroNode heroNode){
        HeroNode cur = head;
        while (true){
            if (cur.next == null){
                break;
            }else {
                cur = cur.next;
            }
        }
        cur.next = heroNode;
    }
    public void list(){
        //判断链表是否为空
        if (head == null){
            System.out.println("链表为空");
            return;
        }
        //因为头结点不能动，因此我们需要一个辅助指针来遍历
        HeroNode cur = head.next;
        while (true){
            if(cur == null){
                break;
            }
            //输出节点
            System.out.println(cur);
            //将cur后移
            cur  = cur.next;
        }

    }
    public void addByOrder(HeroNode heroNode){
        HeroNode cur = head;
        boolean flag = false;//标志添加的编号是否存在，默认为false
        while (true){
            if (cur.next == null){//说明cur已经到达了链表的最后
                break;
            }
            if(cur.next.serialNumber>heroNode.serialNumber){
                break;
            }else if (cur.next.serialNumber == heroNode.serialNumber){
                flag = true;//说明编号存在
                break;
            }
            cur = cur.next;

        }
        if (flag){//说明编号存在不能添加
            System.out.printf("准备插入的英雄编码号%d以经存在,不能加入\n",heroNode.serialNumber);
        }else {
            heroNode.next = cur.next;
            cur.next = heroNode;
        }
    }
    //修改节点信息，根据编号修改
    public void update(HeroNode heroNode){
        if (head.next == null){
            System.out.println("链表为空");
            return;
        }
        //找到搜需要修改的节点
        HeroNode cur = head.next;
        boolean flag = false;
        while (true){
            if (cur == null){
                break;//已经遍历完链表
            }
            if (cur.serialNumber == heroNode.serialNumber){
                //找到
                flag = true;
                break;
            }
            cur = cur.next;
        }
        if (flag){
            cur.name = heroNode.name;
            cur.nickname = heroNode.nickname;
        }else {
            System.out.printf("没有找到英雄编码号%d的节点",heroNode.serialNumber);
        }
    }
    //删除节点的代码
    public void delete(int serialNumber){
        HeroNode cur = head;
        boolean flag = false;//标志是否找到删除节点
        while (true){
            if (cur.next == null){
                break;
            }
            if (cur.next.serialNumber  == serialNumber){
                flag = true;
                break;
            }
            cur = cur.next;
        }
        if (flag){
            cur.next = cur.next.next;
        }else {
            System.out.printf("要删除的%d节点不存在\n",serialNumber);
        }

    }

}
//定义HeroNode,每个HeroNode对象就是一个节点
class HeroNode{
    public int serialNumber;//编号
    public String name;//名字
    public  String nickname;//昵称
    public HeroNode next;//指向下一个节点
    //构造器
    public HeroNode(int serialNumber, String name, String nickname) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.nickname = nickname;
    }
    //为了显示方法，我们重写toString


    @Override
    public String toString() {
        return "HeroNode{" +
                "serialNumber=" + serialNumber +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
