package MyMath;

public class Stat {
    int[] data;
    int min, max, count, sum, size;
    double avarage;

    Stat(int[] data, int size){
        this.data = data;
        this.size = size;
    }

    void setData(int[] data){
        this.data = data;
    }

    void setSize(int size){
        this.size = size;
    }

    int[] getData(){return data;}

    int getMin(){return min;}

    int getMax(){return max;}

    int getCount(){return count;}

    int getSum(){return sum;}

    double getAvarage(){return avarage;}

    int getSize(){return size;}

    void calculateMin(){
        min = data[0];
        for(int i=0;i<size;i++){
            if(data[i]<min){min=data[i];}
        }
    }

    void calculateMax(){
        max=data[0];
        for(int i=0;i<size;i++){
            if(data[i]>max){max = data[i];}
        }
    }

    void calculateCount(){
        count = 0;
        for(int i=0;i<size;i++){
            count++;
        }
    }

    void calculateSum(){
        sum = 0;
        for(int i=0; i<size;i++){
            sum = sum+data[i];
        }
    }

    void calculateAvarage(){
        calculateSum();
        avarage = sum/size;
    }
}
