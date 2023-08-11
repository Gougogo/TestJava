package com.goumi.collection_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @version 1.0
 * @auther GouMi
 */
public class List_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add(true);
        arrayList.add("asd");
        arrayList.add(18);
        arrayList.add(15);
        System.out.println(arrayList);

        arrayList.add(1, "goumi");
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("a");
        arrayList1.add("b");


        arrayList.addAll(2, arrayList1);

        System.out.println(arrayList);

        //System.out.println(arrayList[9]);

        String[] arrayList3 = {
        "a"
        ,"b"
        ,"c"
        ,"d"
        };

        String[] arrayList2 = {"1"
        ,"2"
        ,"3"
        ,"4"
        ,"5"
        ,""
        ,""
        ,""
        ,""};


        int index = 2;
        //System.arraycopy(arrayList2, 1, arrayList3, 1, 3);

        System.arraycopy(arrayList2, index, arrayList2,
                index + 4, 5 - index);

        System.arraycopy(arrayList3, 0, arrayList2, index, 4);

        System.out.println(Arrays.toString(arrayList2));


        /*1 2 3 4 5
        1 2 3 4 5 x x x x
        1 2 3 4 5 x 3 4 5
        a b c d
        1 2 a b c d 3 4 5*/

    }
}
