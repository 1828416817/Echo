package Design.BMS;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book(0,"海底两万里","海明威",30.9);
        Book book2 = new Book(1,"红楼梦","曹雪芹",50.8);
        Book book3 = new Book(2,"金瓶梅","兰陵笑笑生",80.9);
        Book book4 = new Book(3,"水浒传","施耐庵",88.8);
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.append(book1);
        singleLinkedList.append(book2);
        singleLinkedList.append(book3);
        singleLinkedList.append(book4);
        singleLinkedList.list();
        System.out.println("*********************************");
        singleLinkedList.show("红楼梦");
        singleLinkedList.show("红楼");
        System.out.println(singleLinkedList.isExist("红楼梦"));
        System.out.println(singleLinkedList.isExist("红楼"));
        singleLinkedList.BorrowBook("红楼梦");
        Book book = singleLinkedList.ReturnBook();
        singleLinkedList.append(book);
        if(singleLinkedList.isExist(book.BookName)){
            System.out.println("还书成功");
        }else {
            System.out.println("还书失败");
        }



    }
}
