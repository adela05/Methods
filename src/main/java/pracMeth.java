public class pracMeth {
    public static void main (String[] args){
        System.out.println(subtract(7, 3));
        System.out.println(subtractOrZero(3, 2));
        System.out.println(max(5,13,0));
        System.out.println(min(10, 4, 33));
        System.out.println(isLarger(10, 5));
    }
    public static int subtract(int a, int b){
        int sum = a-b;
        return sum;
    }
    public static int subtractOrZero(int a, int b){
        int sum = a-b;


        if (sum <= 0 ){
            return 0;
        } else {
            return sum;
        }
    }
    public static int max(int a, int b, int c){
        int max=0;
        if (a > b && a > c){
            max = a;
        }
        else if (b > c && b > a){
            max = b;
        }
        else if (c>a && c>b){
            max=c;
        }
        return max;
    }
    public static int min(int a, int b, int c){
        int min=0;
        if (a < b && a < c){
            min = a;
        }
        else if (b < c && b < a){
            min = b;
        }
        else if (c < a && c < b){
            min = c;
        }
        return min;
    }
    public static boolean isLarger(int first, int second){
        boolean larger = false;
        if(first > second){

            larger = true;
        }
        return larger;
    }
}
