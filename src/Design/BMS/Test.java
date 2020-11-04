package Design.BMS;

import java.util.Scanner;

public class Test {
    public Test() {
        System.out.println("-----------图书类------------------------");
        System.out.println("----------show: 显示全部图书信息-----------");
        System.out.println("----------show2:显示查询的图书信息----------");
        System.out.println("----------borrow:借书--------------------");
        System.out.println("----------return：还书-------------------");
        System.out.println("----------quit:退出----------------------");
        System.out.println("----------------------------------------");
        Book book1 = new Book(0,"海底两万里","海明威",30.9);
        Book book2 = new Book(1,"红楼梦","曹雪芹",50.8);
        Book book3 = new Book(2,"金瓶梅","兰陵笑笑生",80.9);
        Book book4 = new Book(3,"水浒传","施耐庵",88.8);
        SingleLinkedList1 singleLinkedList = new SingleLinkedList1();
        singleLinkedList.append(book1);
        singleLinkedList.append(book2);
        singleLinkedList.append(book3);
        singleLinkedList.append(book4);
        Scanner scanner = new Scanner(System.in);
        String key="";
        while (key!="quit"){
            System.out.println("请输入你想进行的操作");
            key = scanner.next();
            switch (key){
                case "show":
                    System.out.println("请输入你要查询书籍名字");
                    String str = scanner.next();
                    boolean flag = singleLinkedList.isExist(str);
                    System.out.println(flag);
                    break;
                case "show2":
                    singleLinkedList.list();
                    break;
                case "borrow":
                    System.out.println("请输入要借的书籍名");
                    String BookName1 = scanner.next();
                    singleLinkedList.BorrowBook(BookName1);
                    break;
                case "return":
                    Book book = singleLinkedList.ReturnBook();
                    singleLinkedList.append(book);
                    if(singleLinkedList.isExist(book.BookName)){
                        System.out.println("还书成功");
                    }else {
                        System.out.println("还书失败");
                    }
                    break;
                case "quit":
                    scanner.close();
                    break;
            }
        }
    }
}

class SingleLinkedList1 {
    private Book head = new Book(0,"","",0);
    public void append(Book book){//添加图书
        Book cur = head;
        while(true){
            if (cur.next==null){
                break;
            }else {
                cur = cur.next;
            }
        }
        cur.next = book;
    }
    public void list(){//显示图书
        Book cur = head.next;
        while(cur!=null){
            System.out.println(cur);
            cur = cur.next;
        }
    }
    public void show(String BookName){//显示要查找书的信息
        if(head==null){
            System.out.println("图书系统书籍为空");
        }
        Book cur = head;
        while(true){
            if(cur.BookName==BookName){
                System.out.println(cur);
                break;
            }else if (cur.next==null){
                System.out.println("图书馆中无此书");
                break;
            }else {
                cur = cur.next;
            }
        }

    }
    public boolean isExist(String name){
        if (head==null){
            return false;
        }
        Book cur = head;
        boolean flag = false;
        while(true){
            if (cur.BookName==name){
                flag = true;
                break;
            }
            if (cur.next==null){
                break;
            }
            cur = cur.next;
        }
        return flag;
    }
    public void delete(String BookName){
        if (head==null){
            System.out.println("图书系统为空,无法借书");
        }
        Book cur = head;
        Book pre =null;
        while (cur.next!=null){
            if (cur.BookName==BookName){
                break;
            }
            pre = cur;
            cur = cur.next;
        }
        pre.next = pre.next.next;
    }
    public void BorrowBook(String BookName) {//根据书名借书
        Scanner scanner = new Scanner(System.in);
        if (isExist(BookName)){
            System.out.println("该书存在，是否需要借此书:y/n");
            String key = scanner.next();
            switch (key){
                case "y":
                    delete(BookName);
                    System.out.println("成功借出");
                    list();
                    break;
                case "n":
                    break;
            }
        }else {
            System.out.println("借书失败");
        }
    }
    public Book ReturnBook(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要还书的信息");
        int id = scanner.nextInt();
        String BookName = scanner.next();
        String author = scanner.next();
        double price = scanner.nextDouble();
        Book newBook = new Book(id,BookName,author,price);
        return  newBook;
    }
}

