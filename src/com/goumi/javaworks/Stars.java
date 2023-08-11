package com.goumi.javaworks;

public class Stars {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; ++i){
            System.out.println("*****");
        }
        System.out.println("======================");
        for (int i = 1; i <= 5; ++i){
            for (int j = 1; j <= 5; ++j)
                System.out.print("*");
            System.out.println("");
        }
        System.out.println("======================");
        //你要知道System.out.print("*");这行代码只是往控制台打印出一个*这个符号，而是否换行，是否加其他符号，都是
        //你自己决定。不要看整体是什么形状，化繁为简，你但看一行数据怎么打印出来，再看这多条单行语句，怎么组合在一起。

        //半个金字塔只需要关注每行怎么打印出来，比如第一行只需要执行1句System.out.print("*");而第二行需要执行2句输出，
        //第三行需要执行3句输出。从这个分析得知，既然有相同的代码需要执行，那么就可以用循环语句简化这个过程。
        //第一行
//        for (int j = 0; j < 1; ++j)
//            System.out.print("*");
//        //第二行
//        for (int j = 0; j < 2; ++j)
//            System.out.print("*");
//        //第三行
//        for (int j = 0; j < 3; ++j)
//            System.out.print("*");
//        //现在新的问题是怎么将这三部分代码合并在一起，因为这三部分代码都有相同的部分，代码出现了冗余。同理，相同的代码可以用循环解决。
//        //循环几次呢，从分析可知，有几层就应该循环几次。所以代码框架应该是这样的：
//        for (int layers = 0; layers < 5; ++layers){
//            //xxxxxxxxxxxxx
//        }
        //唯一的不同是j<1,j<2,j<3，这个怎么解决呢？可以发现这些数字是有规律的，这些值刚好对应外层循环中的layers的值，所以代码应该这样处理
        for (int layers = 1; layers <= 5; ++layers){
            for (int stars = 1; stars <= layers; ++stars)
                System.out.print("*");
            System.out.println("");
        }
        System.out.println("======================");

        //金字塔不过是比半个金字塔额外打印了空格，所以现在要研究的是在哪里打空格，打印多少空格，在哪里打印星，打印多少星
        //从打印语句可分析出，这个图形还是得一行行打印，从左到右，从上到下。并且是先打印空格，再打印星。
        //从上到下，说明之前的外层循环还是可以用的。
        // 接下来是打印每行里面的空格和星，因为输出语句只有一颗星或一个空格，所以还是需要通过循环打印多个星和空格
        //所以代码架构应该是这样
//        for (int layers = 1; layers < 5; ++layers){
//            //打印空格
//            for (int space = xxxx; space < xxxx; ++space)
//                xxxxxxxxx;
//
//            //打印星
//            for (int stars = xxxx; stars < xxxx; ++stars)
//                xxxxxxxx;
//            //每打印完一层后要换行
//            System.out.println("");
//        }
        //现在分析打印多少个空格，打印多少个星星
        //看图形可知，第一行需要打印4个空格，打印1个星
        //        ，第二行需要打印3个空格，打印3个星
        //        ，第三行需要打印2个空格，打印5个星
        //        ，第四行需要打印1个空格，打印7个星
        //        ，第四行需要打印0个空格，打印9个星
        //现在唯一确定的参数是layers，所以内层的2个循环中的space和stars就需要跟layers挂上钩
        //layers和空格的对应关系：
        // layers 1 ----4
        // layers 2 ----3
        // layers 3 ----2
        // layers 4 ----1
        // layers 5 ----0
        //可以看出规律空格数 = 总层数5 - layers
        //layers和星的对应关系：
        // layers 1 ----1
        // layers 2 ----3
        // layers 3 ----5
        // layers 4 ----7
        // layers 5 ----9
        //可以看出规律星数 = 2*layers - 1
        //所以现在的代码应该是：
        for (int layers = 1; layers <= 5; ++layers){
            //打印空格
            for (int space = 1; space <= 5 - layers; ++space)
                System.out.print(" ");

            //打印星
            for (int stars = 1; stars <= 2*layers - 1; ++stars)
                System.out.print("*");
            //每打印完一层后要换行
            System.out.println("");
        }


        //打印空心金字塔
        //从空心金字塔的图形知道，和金字塔一样，都需要打印空格和星。
        //不同的是在打印星的时候，星的内部，还镶嵌了空格。
        //从上面的分析，我们可将整个程序分为2部分。
        // 1.打印每行最前面的空格，这个跟金字塔是一样的
        // 2.打印星星和中间的空格，注意因为是顺序打印，星星和空格镶嵌在一起，所以这部分应该放在一起考虑，不能单独打星星，再打里面的空格
        // 现在分析星星和空格之间的关系
        // 第一行，0空格，1个星
        // 第二行，1空格，首尾各1个星
        // 第三行，3空格，首尾各1个星
        // 第四行，5空格，首尾各1个星
        // 第五行，0空格，全部星
        // 可以发现一个规律：
        // 当前行的第一个位置和最后一个位置，以及最后一行都应该打星星，其他都打空格。
        // 而位置这个东西，刚好对应金字塔中的第几行layers和第几颗星。
        for (int layers = 1; layers <= 5; ++layers){
            //打印空格
            for (int space = 1; space <= 5 - layers; ++space)
                System.out.print(" ");

            //打印星
            for (int stars = 1; stars <= 2*layers - 1; ++stars)
                if (stars == 1 || stars == 2*layers - 1 || layers == 5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            //每打印完一层后要换行
            System.out.println("");
        }
    }
}
