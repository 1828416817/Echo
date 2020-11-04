package DataStructures.hashtable;

import java.util.Scanner;

public class HashTableDemo {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(7);
        String key = "";
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("add: 添加雇员");
            System.out.println("list: 显示雇员");
            System.out.println("exit: 退出系统");
            key = scanner.next();
            switch (key){
                case "add":
                    System.out.println("请输入雇员id");
                    int id = scanner.nextInt();
                    System.out.println("请输入雇员名字");
                    String name = scanner.next();
                    Emp emp = new Emp(id, name);
                    hashTable.add(emp);
                    break;
                case "list":
                    hashTable.list();
                    break;
                case "find":
                    System.out.println("请输入要查找的id");
                    id = scanner.nextInt();
                    hashTable.findEmpById(id);
                    break;
                case "exit":
                    scanner.close();
                    System.exit(0);
            }
        }

    }
}
//创建哈希表，管理多条链表
class HashTable{
    private EmpLinkList [] empLinkListArray;
    private int size;
    public HashTable(int size){
        empLinkListArray = new EmpLinkList[size];
        for (int i = 0; i < size; i++) {
            empLinkListArray[i] = new EmpLinkList();
        }
        this.size = size;
    }
    //添加雇员
    public void add(Emp emp){
        //根据员工id，得到该员工应该加入到哪一条链表中
        int empLinkListNum = hashFun(emp.id);
        empLinkListArray[empLinkListNum].add(emp);
    }
    public void findEmpById(int id){
        int empLinkListNum = hashFun(id);
        Emp emp = empLinkListArray[empLinkListNum].findEmpById(id);
        if (emp!=null){
            System.out.printf("在第%d条链表中找到雇员id=%d\n", (empLinkListNum+1), id);
        }else {
            System.out.println("在哈希表中，没有找到雇员");
        }
    }
    //编写散列函数，使用简单的取模法
    public int hashFun(int id){
        return id % size;
    }
    public void list(){
        for (int i = 0; i < size; i++) {
            empLinkListArray[i].list(i);
        }
    }
}

class Emp{
    public int id;
    public String name;
    public  Emp next;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
//创建一个EmpLinkList,表示链表
class EmpLinkList {
    //头指针，执行第一个Emp，
    private Emp head;

    public void add(Emp emp) {
        if (head == null) {
            head = emp;
            return;
        } else {
            Emp cur = head;
            while (true) {
                if (cur.next == null) {
                    break;
                } else {
                    cur = cur.next;
                }
            }
            cur.next = emp;
        }
    }

    public void list(int num) {
        if (head == null) {
            System.out.println("第" + (num + 1) + "条链表为空");
            return;
        }
        System.out.print("第" + (num + 1) + "链表信息为:");
        Emp cur = head;
        while (true) {
            System.out.printf("id=%d name=%s\t", cur.id, cur.name);
            if (cur.next == null) {
                break;
            } else {
                cur = cur.next;
            }
        }
        System.out.println();
    }

    //根据id查找雇员
    public Emp findEmpById(int id) {
        if (head == null) {
            System.out.println("链表为空");
            return null;
        }
        Emp cur = head;
        while (true){
            if (cur.id == id){
                break;
            }
            if (cur.next == null){
                cur = null;
                break;
            }
            cur = cur.next;
        }
        return  cur.next;
    }
}
