package com.kolge;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BigDecimal bakiye = new BigDecimal(0);
        paraYatırma(bakiye);
    }

    public static BigDecimal urunSec(BigDecimal bakiye){
//        int i = 0;
        System.out.println("ÜRÜNLER: ");
        System.out.println("1-) KOLA...........15TL");
        System.out.println("2-) FANTA..........20TL");
        System.out.println("3-) GAZOZ..........30TL");
        System.out.println("\n Ürün seçme işlemini tamamlamak için q tuşuna basınız.");

        Scanner urun = new Scanner(System.in);

        BigDecimal sepet = new BigDecimal("0");

        while (urun.hasNext()){
            String deger = urun.nextLine();
            //if (i<3) {
                switch (deger) {
                    case "1": {
                        if (bakiye.compareTo(new BigDecimal("15")) == 1){
                            bakiye = bakiye.subtract(new BigDecimal("15"));
                            System.out.println("Ürün sepetinize eklendi. \n" + bakiye + " bakiyeniz kaldı.");
                        }else if(bakiye.compareTo(new BigDecimal("15")) == 0){
                            System.out.println("Bakiyeniz bittiği için alışverişiniz sonlandırılmıştır.");
                        }
                        else {
                            System.out.println("Bakiyeniz yetersiz.");
                            paraYatırma(bakiye);
                        }
                        break;
                    }
                    case "2": {
                        if (bakiye.compareTo(new BigDecimal("20")) == 1){
                            bakiye = bakiye.subtract(new BigDecimal("20"));
                            System.out.println("Ürün sepetinize eklendi. \n" + bakiye + " bakiyeniz kaldı.");
                        }else if(bakiye.compareTo(new BigDecimal("20")) == 0){
                            System.out.println("Bakiyeniz bittiği için alışverişiniz sonlandırılmıştır.");
                        }else {
                            System.out.println("Bakiyeniz yetersiz.");
                            paraYatırma(bakiye);
                        }
                        break;
                    }
                    case "3": {
                        if (bakiye.compareTo(new BigDecimal("30")) == 1){
                            bakiye = bakiye.subtract(new BigDecimal("30"));
                            System.out.println("Ürün sepetinize eklendi. \n" + bakiye + " bakiyeniz kaldı.");
                        }else if(bakiye.compareTo(new BigDecimal("30")) == 0){
                            System.out.println("Bakiyeniz bittiği için alışverişiniz sonlandırılmıştır.");
                        }else {
                            System.out.println("Bakiyeniz yetersiz.");
                            paraYatırma(bakiye);
                        }
                        break;
                    }
                    default:
                        System.out.println("Geçersiz değer girdiniz.");
//                        i--;
                        break;
                }
//            }else {
//                System.out.println("Sepete en fazla üç ürün ekleyebilirsiniz.");
//                break;
//            }
//            i++;
        }
    return sepet;
    }

    public static void paraYatırma(BigDecimal bakiye){
        int artanPara=0;
        if (bakiye.compareTo(new BigDecimal(0)) != 0){
            artanPara = 1;
        }

        System.out.println("Lütfen para girişi yapınız:");
        System.out.println("İşleminizi tamamladıktan sonra q tuşu ile ödeme işlemini sonlandırabilirsiniz.");
        System.out.println("Para iadesi için i tuşuna basınız.");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String deger = scanner.nextLine();
            switch (deger){
                case "0.5" :
                case "1" :
                case "5" :
                case "10": {
                    bakiye = bakiye.add(new BigDecimal(deger));
                    System.out.println("Toplam bakiyeniz : " + bakiye + " TL");
                    break;
                }
                case "i" :{
                    if (artanPara == 1 ){
                        System.out.println("Alışveriş işlemi gerçekleştikdten sonra para iadesi yapılamaz.");
                    }else {
                        bakiye = new BigDecimal(0);
                        System.out.println("Para iadesi gerçekleştirildi.");
                    }
                    break;
                }
                case "q" :{
                    urunSec(bakiye);
                    break;
                }
                default:
                    System.out.println("Geçersiz değer girdiniz.");
                    System.out.println("Toplam bakiyeniz : " + bakiye + " TL");
                    break;
            }

        }

    }

}
