package com.goumi.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Pattern;

public class DirList3 {

    public static void testString(String[] strs){
        strs[1] = "111";

        HashMap map =new HashMap();
        map.put("load", "test");

        System.out.print(strs[0]);
    }

    public static void main(String[] args) {

        String[] strs = new String[]{"asd", "asw"};

        testString(strs);

        File path = new File(".");
        args = new String[] {"w.*\\.out"};
        String[] list;
        if(args.length == 0)
            list = path.list();
        else {
            final String[] finalArgs = args;
            list = path.list(
                    new FilenameFilter() {
                        private Pattern pattern = Pattern.compile(finalArgs[0]);

                        @Override
                        public boolean accept(File dir, String name) {
                            return pattern.matcher(name).matches();
                        }
                    }
            );
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem:list)
            System.out.println(dirItem);
    }
}
