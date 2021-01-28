package com.company;
import java.util.Scanner;
import java.util.Random;
//5.Sorunun class yapısı
 class Cember
{
    public String renk;
    public  double ycap;
    public double alan;

    public Cember()
    {
        this.renk="Renk belirtilmedi";
        this.ycap=0;
        this.alan=0;
    }
    public double getYcap()
    {
        return this.ycap;
    }
    public void setYcap(int newycap)
    {
        this.ycap=newycap;
    }
    public double getAlan()
    {
        return this.alan;
    }
    public void setAlan(double newalan)
    {
        this.alan=newalan;
    }
    public String getRenk()
    {
        return this.renk;
    }
    public void setRenk(String newrenk)
    {
        this.renk=newrenk;
    }
    public double Alan()
    {
        return 2*Math.PI*ycap;
    }

    public double ycap()
    {
        return (alan/(2*Math.PI));
    }
}

public class Main {
    //4.Sorunun metodu
    public static void Dizideger(int[] sayilar)
    {
        int ks = sayilar[0];
        int bs = sayilar[0];
        for (int i = 0; i < sayilar.length; i++)
        {
            if (ks > sayilar[i])
            { ks = sayilar[i]; }
            if (bs < sayilar[i])
            { bs = sayilar[i]; }
        }
        System.out.print("Dizinin en büyük Değeri:"+bs+"\n"+"Dizinin en küçük Değeri:"+ks);

    }
    public static void main(String[] args) {
        //1.Sorunun cevabı
        int x,z,toplam=0,sayi;
        Scanner sayigir = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        x = sayigir.nextInt();

        sayi=x;
        while(x>0)
        {
            z=x%10;
            toplam=(toplam*10)+z;
            x=x/10;
        }
        if(sayi==toplam)
            System.out.print("Girdiğiniz sayı palindrom bir sayıdır:"+sayi);
        else
            System.out.print("Girdiğiniz sayı palindrom bir sayı değildir:"+sayi);
//----------------------------------------------------------------------------------------
        //2.Sorunun cevabı
        int havadurumu;
        Scanner scan = new Scanner(System.in);
        System.out.print("Hava Sıcaklığını girin:");
        havadurumu= scan.nextInt();
        if (havadurumu<20)
        {
            System.out.print("Hava Soğuk");
        }
        else if (havadurumu>=20 && havadurumu<=30)
        {
            System.out.print("Hava Ilık");
        }
        else
        {
            System.out.print("Hava Sıcak");
        }
        //-------------------------------------------------------------------------
        //3.Sorunun cevabı
        Scanner scann=new Scanner(System.in);
        String metin;

        System.out.print("Tersten Yazılacak Metni Giriniz = ");
        metin= scann.nextLine();
        for (int i = metin.length()-1; i>=0; i--)
        {
            System.out.println(metin.charAt(i));
        }
        //------------------------------------------------------------------------
        //4.Sorunun cevabı metodun kullanılışı

        Random rnd = new Random();

        int []sayi1=new int[3];
        int []sayi2=new int[5];
        int []sayi3=new int[6];
        int []sayi4=new int[8];
        //dizideki elemanları sıralayan ve fonksiyonun doğrulunu gösteren döngü
        for (int i=0;i<sayi2.length;i++){
            sayi2[i]=rnd.nextInt(100);
            System.out.println(sayi2[i]);
        }
        Dizideger(sayi1);
        Dizideger(sayi2);
        Dizideger(sayi3);
        Dizideger(sayi4);
        //------------------------------------------------------------------------
	//5.sorunun mainde Cevabı
        Cember c =new Cember();
        //c.getRenk();
        //c.setRenk("mavi");
        //c.getAlan();
        //c.getYcap();
        c.setYcap(5);
        System.out.println(c.Alan());
        c.setAlan(15);
        System.out.println(c.ycap());
    }
}
