package Baitap_Arraylist;

import java.util.ArrayList;

public class BT_Arraylist {
    public static void main(String[] args) {
      //Chinh sua BT 4
        ArrayList<Integer> arrayList1 =new ArrayList<Integer>(50);
        arrayList1.add(0);
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(5);
        arrayList1.add(6);
        arrayList1.add(7);
        arrayList1.add(8);
        arrayList1.add(9);
        arrayList1.add(10);
        for (int i = 0; i< arrayList1.size(); i++){
            if (i%2==0)
            System.out.println(arrayList1.get(i));
        };








       //Khai báo arraylist
        ArrayList<String> arrayList = new ArrayList<>();
        //Thêm phần tử vào arraylist
        arrayList.add("tên sinh viên: Nguyễn Hà Anh");
        arrayList.add("tuổi: 18");
        arrayList.add("Khóa: QT43A");
                //Duyệt arraylist
        for (int i = 0; i < arrayList.size();i++){
            System.out.println(arrayList.get(i));
        };
    }
}
