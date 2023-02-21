import java.awt.*;
public class prog7 extends Frame{
    prog7(int length){
        int top=0,bottom=length-1,left=0,right=length-1,index=0,maxlen = length*length,Array[][] = new int[length][length],element[] = new int[maxlen+1];
        setLayout(new GridLayout(length,length));
        setVisible(true);
        setSize(length*length,length*length);
        for(int i=1;i<=maxlen;i++)
            element[i-1] = i;
        for(int j=0;j<=maxlen;j++){
            if(left>right)
                break;
            for(int i = left; i <= right; i++)
                Array[top][i]=element[index++];
            top++;
            if(top>bottom)
                break;
            for(int i=top;i <= bottom;i++)
                Array[i][right]=element[index++];
            right--;
            if(left>right)
                break;
            for(int i=right;i >= left; i--)
                Array[bottom][i]=element[index++];
            bottom--;
            if(top>bottom)
                break;
            for(int i=bottom;i >= top; i--)
                Array[i][left]=element[index++];
            left++;
        }
        for(int i=0;i<length;i++)
            for(int j=0;j<length;j++)
                add(new Button(Integer.toString(Array[i][j])));
    }
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        prog7 p = new prog7(a);
    }
}