package Mypackage;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class lr3main {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        if (args.length < 1) {
            System.out.println("������ ����������( ������� ���� )");
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
            System.out.println("���� �� ������");
            return;
        } catch (IOException ex) {
            System.out.println("������ �����");
            return;
        }
        Laba3lib Mysignal = new Laba3lib(num);
        System.out.println("������������ �������� ������� : " + Mysignal.DynamicRangeOfSignal());
        System.out.println("�������: " + Mysignal.EnergySignal());
        System.out.println("������� �������� �������: " + Mysignal.AverageSignalPower());
        System.out.println("������� �������� �������� �������: " + Mysignal.AverageValueOfSignalReadings());
        System.out.println("��������� �������� �������� �������: " + Mysignal.Dispersion());
        System.out.println("�������� ����������: " + Mysignal.IntervalCorrelation());
        System.out.println("��������������:");
        for(int r = -10; r <= 10; r++)
        {
            System.out.println("[" + r + "]: " +
            		Mysignal.Autocorrelation(r));
        }
       
    }
}
