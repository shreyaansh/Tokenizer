import java.util.*;

public class Tokenizer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter BSS:");
        String s;
        s = scan.nextLine();
        System.out.printf("You entered the line %s\n", s);
        int flag = 0;
        int flagD = 0;
        String yy = "";
        //Line split
        for (int i = 0; i < s.length(); i++) {
            //System.out.println("Character " + i + " is :" + s.charAt(i));
            char token = s.charAt(i);
            int vtp;
            
            try {
                
                String ss = "" + token;
                int temp;
                temp = Integer.parseInt(ss);
                
                if (flag == 1) {
                    yy += token;
                    System.out.println(yy);
                    continue;
                } else {
                    yy = "" + token;
                    flag = 1;
                    continue;
                }
                
            } catch (NumberFormatException e) {
                //System.out.println("Yolo it went here " + i);
                switch (token) {
                    case '?': vtp = 20; System.out.printf("(%d, 0)", vtp); yy = ""; flag = 0; break;
                    
                    case '(': vtp = 21; System.out.printf("(%d, 0)", vtp); yy = ""; flag = 0; break;
                    
                    case ')': vtp = 22; System.out.printf("(%d, 0)", vtp); yy = ""; flag = 0; break;
                    
                    case '+': vtp = 23; System.out.printf("(%d, 0)", vtp); yy = ""; flag = 0; break;
                    
                    case '-': vtp = 24; System.out.printf("(%d, 0)", vtp); yy = ""; flag = 0; break;
                    
                    case '*': vtp = 25; System.out.printf("(%d, 0)", vtp); yy = ""; flag = 0; break;
                    
                    case '/': vtp = 26; System.out.printf("(%d, 0)", vtp); yy = ""; flag = 0; break;
                    
                    case '.': vtp = 27; if (flag == 1 && flagD == 0) { yy += '.'; flagD = 1; continue; } else { System.out.printf("(%d, 0) ", vtp); flagD = 0; } yy = ""; break;
                    
                    case ';': vtp = 28; System.out.printf("(%d, 0)", vtp); yy = ""; flag = 0; break;
                    
                    case '=': vtp = 29; System.out.printf("(%d, 0)", vtp); yy = ""; flag = 0; break;

                    default: yy = ""; break;
                }
                //flag = 0;
            }
        }
        //System.out.printf("Line is %s\n", yy);
    }
}