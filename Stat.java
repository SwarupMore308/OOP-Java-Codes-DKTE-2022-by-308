package MyMath;

<<<<<<< HEAD
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
=======

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
>>>>>>> d408a206c6066c970f1752d13455e6d3cb8607fa
        }
    }

    void calculateMax(){
<<<<<<< HEAD
        max=data[0];
        for(int i=0;i<size;i++){
            if(data[i]>max){max = data[i];}
=======
        max = data[0];
        for(int i = 1;i<size;i++){
            if(max<data[i]){
                max = data[i];
            }
>>>>>>> d408a206c6066c970f1752d13455e6d3cb8607fa
        }
    }

    void calculateCount(){
        count = 0;
<<<<<<< HEAD
        for(int i=0;i<size;i++){
=======
        for(int i=0; i<size;i++){
>>>>>>> d408a206c6066c970f1752d13455e6d3cb8607fa
            count++;
        }
    }

    void calculateSum(){
        sum = 0;
<<<<<<< HEAD
        for(int i=0; i<size;i++){
=======
        for(int i=0;i<size;i++){
>>>>>>> d408a206c6066c970f1752d13455e6d3cb8607fa
            sum = sum+data[i];
        }
    }

    void calculateAvarage(){
        calculateSum();
        avarage = sum/size;
    }
<<<<<<< HEAD
}
=======

}
>>>>>>> d408a206c6066c970f1752d13455e6d3cb8607fa
