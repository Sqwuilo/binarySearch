import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] mass = new int[256];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i;
        }

        System.out.println(BinaryMass(mass, 2));
    }

    public  static int BinaryMass(int[] mass, int numFind){
        int startInd = 0;
        int endInd = mass.length - 1;
        int middle;
        int count = 0;
        while (startInd <= endInd){
            count++;
            middle = startInd + (endInd - startInd) / 2;
            if (mass[middle] == numFind) return count;
            if (mass[middle] > numFind) endInd = middle - 1;
            else startInd = middle + 1;

        }
        return  -1;
    }

}