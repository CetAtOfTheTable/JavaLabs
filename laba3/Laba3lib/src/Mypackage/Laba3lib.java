package Mypackage;
import java.util.ArrayList;
public class Laba3lib {
    private ArrayList<Integer> list=null;
    public Laba3lib(ArrayList<Integer> _list) {
        this.list = _list;
    }
    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }
    public int DynamicRangeOfSignal() {
        int max = list.get(0);
        int min = list.get(0);
        for(int num : list){
            if(max<num)
                max=num;
            if(min>num)
                min=num;
        }
        return max-min;
    }  
    public int EnergySignal() {
        int result =0;
        for (int num : list)
            result+=num*num;
        return result;
    }  
    public double AverageSignalPower() {
        double result =0;
        for (int num : list)
            result+=num*num;
        result/=(double)list.size();
        return result;
    }
    public double AverageValueOfSignalReadings(){
        double result =0;
        for (int num : list)
            result+=num;
        result/=(double)list.size();
        return result;
    } 
    public double Dispersion() {
        double result = 0;
        double m = AverageValueOfSignalReadings();
        for (Integer i : list)
            result += ((i - m) * (i - m));
        result/=(double)list.size();
        return result;
    }
    public double Autocorrelation(int r) {
        double result = 0;
        double m = AverageValueOfSignalReadings();
        r = (r > 0) ? r : -r;
        for (int i = 0; i < list.size() - r; i++)
            result += (list.get(i + r) - m) * (list.get(i) - m);
        result/=(double)(list.size() - r);
        return result;
    }  
    public double IntervalCorrelation() {
        double result = 0;
        for (int i = 0; i < list.size(); i++)
            result += Autocorrelation(i);
        result/=(double)Autocorrelation(0);
        return result;
    }
}
