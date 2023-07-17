public class Main {
    public static void main(String[] args) {
        int [] numbers= new int[]{1,2,5,7,9,0};
        int search=1;
        boolean state=false;
        for (int number:numbers){
            if (number==search){
                state= true;
            }
            }
        if (state){
            System.out.println("The number sought is available:)");
        }
        else {
            System.out.println("The number sought is not available.!!!");
        }
        }
    }
