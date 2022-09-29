package MyMath;


public class Stat{
    int[] data;
    int min,max,count,sum;
    double avarage;
    int size;

    Stat(int[] data,int size){
        this.data = data;   
        this.size = size;
    }

    int[] getData(){
        return data;
    }

    int getMin(){
       
        return min;
    }

    int getMax(){
        
        return max;
    }

    int getCount(){
        return count;
    }

    int getSum(){
        return sum;
    }

    double getAvarage(){
        return avarage;
    }

    void calculateMin(){
        min = data[0];
        for(int i = 1; i<size;i++){
            if(min>data[i]){
                min = data[i];
            }
        }
    }

    void calculateMax(){
        max = data[0];
        for(int i = 1;i<size;i++){
            if(max<data[i]){
                max = data[i];
            }
        }
    }

    void calculateCount(){
        count = 0;
        for(int i=0; i<size;i++){
            count++;
        }
    }

    void calculateSum(){
        sum = 0;
        for(int i=0;i<size;i++){
            sum = sum+data[i];
        }
    }

    void calculateAvarage(){
        calculateSum();
        avarage = sum/size;
    }

}