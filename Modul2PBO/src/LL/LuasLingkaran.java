package LL;
import java.util.Scanner;
/**
 *
 * @author Niko Silabest
 */
public class LuasLingkaran 
{
    public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);
     int menu;
     double phi = 3.14;
     double r, luas,keliling;
     restart:while(true)
 {       
     System.out.println("Program Luas Lingkaran\n");
     System.out.println("Menu:\n1. Keliling\n2. Luas");
     System.out.print("Pilih Menu:");
     menu = input.nextInt();
        if (menu==1) 
        {
            System.out.print("Masukkan Panjang Jari-jari : ");
            r = input.nextDouble();
            keliling = 2 * phi * r;
            System.out.print("Keliling lingkaran = "+ (int)keliling+"\n");
        }
        if (menu ==2) 
        {
             System.out.print("Masukkan Panjang Jari-jari : ");
             r = input.nextDouble();
             luas = 0.5 * phi * r * r;
             System.out.print("Luas Lingkaran = "+ (int)luas +"\n" );
        }
        else
        {
            System.out.println("GAADA PILIHANNYA EA BOSQ JAN BIKIN EMOSI EA DAHLAH TJOEKOEP TAOE EA BOSQ");
            continue;
        }
        System.out.println("");
    }
    }
}
