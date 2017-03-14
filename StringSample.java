package Javabasic4;

/**
 * Created by 8440p on 13/03/2017.
 */

public class StringSample {
    public static void main(String[] args) {
        String str = "HEDSPI";
        System.out.println(str);
        // 1.length
        System.out.format("length %d \n", str.length());
        // 2.charAt: in tai vi tri
        System.out.format("chartAt 3: %c \n", str.charAt(3));
        // 3.concat: ko lam thay doi gia tri chuoi ban dau
        System.out.format("concat %s \n", str.concat(" K59"));
        System.out.format(str);
        str = str.concat(" K59");
        System.out.format(str);
        // 4. compareTo
        System.out.format("compareTo %d", str.compareTo(" K59"));
        // 5. indexOf
        System.out.println("indexOf " + str.indexOf(""));
        // 6. lastIndexOf
        str += "E";
        System.out.println("lastIndexOf " + str.lastIndexOf("E"));
        // Kiem tra E K59 co nam trong xau str
        if (str.indexOf("K59") != -1) {
            System.out.println(true);
        } else System.out.println(false);
        // Replace(oldValue, newValue) trong chuoi hien tai, ko lam thay doi gia tri ban dau
        System.out.println("replace :" + str.replace("K59", "K60"));
        // 7. subString(start, end) or subString(start)
        System.out.println("substring " + str.substring(7));
        // 8. toString
        System.out.println("toString " + str.toString());
        // 9. trim: cat space o dau va cuoi xau
        str = "       HEDSPI K59    ";
        System.out.println("trim " + str.trim());
        // 10. split(s) cat chuoi hien tai bang s
        str = "HEDSPI ; K59; Android; 2017";
        String[] arrayStr = str.split(";");
        System.out.println("lenght: " + arrayStr.length);
    }
}
