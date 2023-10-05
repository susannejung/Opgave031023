import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner in=new Scanner(System.in);
        int[] tabel=new int[10];
        /*System.out.println("Indtast 10 heltal: ");
        for(int i=0;i<10;i++)
            tabel[i]=in.nextInt();*/
       /* indFraFil(tabel,10);
        udskriv(tabel,10);
        laegTalTil(tabel,10,20);
        skrivTilFil(tabel,10);*/

        /*int antalPersoner=0;
        int[] nr=new int[10];
        String[] navne= new String[10];
        double[] kr=new double[10];
        antalPersoner=indPersonerFraFil(nr,navne,kr);
        udskrivPersoner(nr,navne,kr,antalPersoner);*/
        System.out.println("Indtast id, navn og beløb: ");
        int id=in.nextInt();
        String navn=in.next();
        double k=in.nextDouble();
        append(id,navn,k);
   }

    public static int indPersonerFraFil(int[] id,String[] n,double[] k) throws FileNotFoundException {
        int i=0;
        File inFil=new File("Persondata.txt");
        Scanner in=new Scanner(inFil);
        while(in.hasNext()){
            id[i]=in.nextInt();
            n[i]=in.next();
            k[i]=in.nextDouble();
            i++;
        }
        return i;
    }

    public static void append(int id,String navn,double k) throws IOException {
        FileWriter ud=new FileWriter("Persondata.txt",true);
        ud.write(" "+id+" "+navn+" "+k);
        ud.close();
    }

    public static void udskrivPersoner(int[] id,String[] n,double[] k,int antal){
        for(int i=0;i<3;i++)
            System.out.println(id[i]+" "+n[i]+" "+k[i]);
    }




    public static void udskriv(int [] a,int antal){
        for(int i=0;i<antal;i++)
            System.out.print(a[i]+" ");
    }

    public static void indFraFil(int [] a,int antal) throws FileNotFoundException {
        File inFil=new File("MinFil.txt");
        Scanner in=new Scanner(inFil);
        for(int i=0;i<antal;i++){
            a[i]=in.nextInt();
        }
    }

    public static void skrivTilFil(int[] a,int antal) throws FileNotFoundException {
        PrintWriter ud=new PrintWriter("MinFil2.txt");
        for(int i=0;i<antal;i++){
            ud.print(a[i]+" ");
        }
        ud.close();
    }

    public static void laegTalTil(int [] a,int antal,int tal){
        for(int i=0;i<antal;i++)
            a[i]+=tal;
    }


}