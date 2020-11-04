package Design.BMS;

import java.util.Scanner;

class SingleLinkedList {
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
