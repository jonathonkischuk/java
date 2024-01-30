public class MegaBytesConverter {
    // write code here
    public static void printMegaBytesAndKiloBytes(int kilobytes){
        if (kilobytes < 0){
            System.out.println("Invalid Value");
        }
        else{
            long mega = kilobytes / 1024;
            long remainder = kilobytes % 1024;
            System.out.println(kilobytes + " KB = " + mega + " MB and " + remainder + " KB");
        }
    }
}


