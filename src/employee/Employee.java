package employee;

public class Employee {
    private String name;
    private int type;//1 or 2
    private double rate,hours;
    
    public Employee(){
        name = "";
        type =0;
        rate = 0;
        hours = 0;
    }
    
    public boolean setName(String nm){
        boolean blank = (nm.equals(""));
        if (blank){
            return true;
        }
        else{
            name = nm;
            return false;
        }
    }
    public boolean setType(int t){
        boolean oneortwo= (t==1 ||t==2);
        if (oneortwo){
            type = t;
            return true;
        }
        else{
            
            return false;
        }
    }
    public boolean setRate(double rt){
        boolean rtok= (rt>=6.75 &&rt<=30.50);
        if (rtok){
            rate = rt;
            return true;
            
        }
        else{
            
            return false;
        }
    }
    
    public boolean setHours(double hrs){
        boolean ok= (hrs >=1 && hrs <=60);
        if (ok){
            hours =hrs;
            return true;
        }
        else{
            
            return false;
        }
    }
    
    public String getNameRules(){
        return "(nonblank statment)";
    } 
    public String getTypeRules(){
        return "(1 or 2)";
    }
    public String getRateRules(){
        return "(between 6.75 and 30.50,inclusive)";
    }
    public String getHourRules(){
        return "(between 1 and 60, inclusive)";
    }
    public String getName(){
        return name;
    }
    public double getPay(){
        double pay;
        boolean noOvertime=(hours <=40 || type ==2);
        if (noOvertime){
            pay=rate*hours;
        }
        else{
            pay=(hours-40)*rate*2+rate*40;
        }
        
        return pay;
    }
}
