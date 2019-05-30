package main;

public class testingstuff {
    public static void main(String[] args) {
        String input = "The";
        String out = "";
        int length = input.length();
        int x = 0;
        int y = 1;
        for (int i = 0; i < length; i++) {
            input.substring(x, y);
            out = input.substring(x, y) + input.substring(x, y) + input.substring(x, y);
            x++;
            y++;
            System.out.println(out);

//        String arg1 = "Am I in Amsterdam";
//        String[] split = arg1.split(" ");
//
//        int counter = 0;
//
//        for (int i = 0; i < arg1.length()-4; i++) {
//            String sub = arg1.substring(i, i+4).toLowerCase();
//            if (sub.equals(" am ") || (sub.equals(" am") ||(sub.equals("am "))))
//            {
//                counter++;
//                System.out.println(counter);
//            }
//        }
//                for (i = 0; i < arg1.length()-3; i++) {
//                     sub = arg1.substring(i, i+3);
//            if (sub.equals("am ")) {
//                        counter++;
//                        System.out.println(counter);
//                    }
//                }


//        int counter = 0;
//        for (String words : split) {
//            String equalTo = "am";
//
//            System.out.println(words);
//        }
        }

    }
}