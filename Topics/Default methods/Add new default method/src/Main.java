import java.util.Scanner;

interface Flying {
    // returns height of flying in meters
    int getHeight();

    // implements a default method getHeightInKm that returns height of flying in km as int type
    default int getHeightInKm() {
        return getHeight() / 1000;
    }
}

/*
class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int met = scanner.nextInt();
        Flying test = new Ziggy(met);
        System.out.println(test.getHeightInKm());
    }

}
 class Ziggy implements  Flying {
    private int meters;
    public  Ziggy(int meters){
        this.meters = meters;
    }
    @Override
     public int getHeight() {
         return meters;
     }
 }*/
