import java.util.*;
public class rep {
    
    /**
     * Updates the character array as per requirements
     * @param arr given character array
     * @param index at which character is to be replaced
     * @param c character that should be replaced with
     * @return updated character array
     */
    public static char[] replace(char[] arr, int index, char c) {

        try {
            if(index < 0){
                throw new StringIndexOutOfBoundsException("Index is less than zero");
            }
            else if (index < arr.length) {
                arr[index] = c;
            }
            else {
                arr[arr.length] = c;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            arr[arr.length -1] = c;
        }

        catch (StringIndexOutOfBoundsException e){
            throw e;
        }

        return arr;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        int i = sc.nextInt();
        char c = sc.next().charAt(0);

        try {
            String s2 = new String(replace(s1.toCharArray(), i, c));
            System.out.println(s2);
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
