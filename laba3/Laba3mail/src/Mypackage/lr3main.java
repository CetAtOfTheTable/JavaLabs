package Mypackage;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class lr3main {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        if (args.length < 1) {
            System.out.println("ќшибка параметров( ”кажите путь )");
            return;
        }
        try {
            FileInputStream Myfile = new FileInputStream(args[0]);
            int res;
            do {
                res = Myfile.read();
                if (res != -1) {
                    num.add(res);
                }
            } while (res != -1);
            Myfile.close();
        } catch (FileNotFoundException ex) {
            System.out.println("‘айл не найден");
            return;
        } catch (IOException ex) {
            System.out.println("ќшибка файла");
            return;
        }
        Laba3lib Mysignal = new Laba3lib(num);
        System.out.println("ƒинамический диапазон сигнала : " + Mysignal.DynamicRangeOfSignal());
        System.out.println("Ёнерги€: " + Mysignal.EnergySignal());
        System.out.println("—редн€€ мощность сигнала: " + Mysignal.AverageSignalPower());
        System.out.println("—реднее значение отсчетов сигнала: " + Mysignal.AverageValueOfSignalReadings());
        System.out.println("ƒисперси€ значений отсчетов сигнала: " + Mysignal.Dispersion());
        System.out.println("»нтервал коррел€ции: " + Mysignal.IntervalCorrelation());
        System.out.println("јвтокоррел€ци€:");
        for(int r = -10; r <= 10; r++)
        {
            System.out.println("[" + r + "]: " +
            		Mysignal.Autocorrelation(r));
        }
       
    }
}
