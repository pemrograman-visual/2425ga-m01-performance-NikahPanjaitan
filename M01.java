// 12S24011- Pedro Simangunsong
// 12S24041 - Nikah Suchia Panjaitan
import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double performa, indekssementara, performaakhir, skor, a, aB, b, bC, c, d, e;
        double kredit1;
        String skor1, kredit;

        kredit1 = 0;
        a = 4.0;
        aB = 3.5;
        b = 3.0;
        bC = 2.5;
        c = 2.0;
        d = 1.0;
        e = 0.0;
        kredit = input.nextLine();
        if (kredit.equals("---")) {
            kredit = kredit;
        } else {
            kredit1 = Integer.parseDouble(kredit);
        }
        skor1 = input.nextLine();
        while (!skor1.equals("---")) {
            if (skor1.equals("A")) {
                skor = 4.0;
            } else {
                if (skor1.equals("AB")) {
                    skor = 3.5;
                } else {
                    if (skor1.equals("B")) {
                        skor = 3.0;
                    } else {
                        if (skor1.equals("BC")) {
                            skor = 2.5;
                        } else {
                            if (skor1.equals("C")) {
                                skor = 2.0;
                            } else {
                                if (skor1.equals("D")) {
                                    skor = 1.0;
                                } else {
                                    if (skor1.equals("E")) {
                                        skor = 0.0;
                                    } else {
                                        skor = 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            performa = kredit1 * skor;
            System.out.println(toFixed(performa,1));
            kredit = input.nextLine();
            if (kredit.equals("---")) {
                kredit = kredit;
            } else {
                kredit1 = Integer.parseDouble(kredit);
            }
            skor1 = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

