import java.util.Scanner;

public class bitmanupulation {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
//Get Bit
    int n=5;//0101
    int pos=2;
    int bitmask=1<<pos;
    if((bitmask & n)==0){
        System.out.println("bit was 0");
    }
    else{
        System.out.println("bit was 1");
    }


//set a bit
    int m=5;
    int newpos=1;
    int newbitmask=1<<newpos;

    int newnum=newbitmask|m;
    System.out.println(newnum);


//clear a bit  //operation:AND with NOT Bitmask
    int o=5;
    int posnew=2;
    int bitmask1=1<<posnew;
    int notbitmask1=~bitmask1;
    int newnum1=(notbitmask1 & o );
    System.out.println(newnum1);

//Update Bit(oper: 0,Clear)(oper:1,SET)
    int oper=sc.nextInt();
        int p=5;//0101;
        int pos2=1;
        int BitMask2=1<<pos2 ;
    
    if(oper==1){
        //set oper
    
        int newNumber=BitMask2|p;
        System.out.println(newNumber);
    }
    else{
        //clear
        int newBitMask2= ~(BitMask2);
        int NewNum=newBitMask2 & p;
        System.out.println(NewNum);
    }

}
}
