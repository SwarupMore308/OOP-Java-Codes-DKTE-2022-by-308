import java.util.*;

class Date{
    public static void main(String[] args) {
        int day,month,year;
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();

        String days[] = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};

        if (month == 1)
        {
            month = 13;
            year--;
        }
        if (month == 2)
        {
            month = 14;
            year--;
        }
        int q = day;
        int m = month;
        int k = year % 100;
        int j = year / 100;
        int h = q + 13*(m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
        h = h % 7;

        System.out.println("Week Day on "+str(day)+"/"+args[1]+"/"+args[2]+" is "+days[h]);
        sc.close();
    }
}
