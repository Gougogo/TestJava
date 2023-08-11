package com.goumi.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @version 1.0
 * @auther GouMi
 */
@SuppressWarnings({"all"})
public class ListExercise02 {

    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add(new Book("红楼梦", "曹雪芹", 100));
        arrayList.add(new Book("西游记", "吴承恩", 10));
        arrayList.add(new Book("水浒传", "施耐庵", 9));
        arrayList.add(new Book("三国演义", "罗贯中", 100));
        arrayList.add(new Book("西游记", "吴承恩", 10));

        sort(arrayList);


        /*for (int i = arrayList.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (((Book) arrayList.get(j)).getPrice() > ((Book) arrayList.get(j+1)).getPrice()){
                    Book o = (Book)arrayList.get(j);
                    arrayList.set(j, arrayList.get(j+1));
                    arrayList.set(j+1, o);
                }
            }
        }*/

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Book next = ((Book)iterator.next());
            System.out.println(next.getPrice());
        }

        int[] a = {1, 2, 30, 4, 5};
        for (int i = a.length-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public static void sort(List list){
        int length = list.size();

        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                Book o1 = (Book)(list.get(j));
                Book o2 = (Book)(list.get(j+1));
                if (o1.getPrice() > o2.getPrice()){
                    list.set(j, o2);
                    list.set(j + 1, o1);
                }
            }
        }
    }
}
