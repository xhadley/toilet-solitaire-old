
/**
 * Runs multiple games of toilet solitaire
 * 
 * @Alex Hadley
 * @beta
 */
public class MultiTrial
{
    public MultiTrial()
    {
    }
    
    public int[] run(int trials)
    {
        int sum[]=new int[27];
        for(int i=0; i<trials; i++)
        {
            Game thisTrial = new Game();
            int numberLeft = thisTrial.numberLeft();
            if(numberLeft==0)
                sum[0]++;
            if(numberLeft==2)
                sum[1]++;
            if(numberLeft==4)
                sum[2]++;
            if(numberLeft==6)
                sum[3]++;
            if(numberLeft==8)
                sum[4]++;
            if(numberLeft==10)
                sum[5]++;
            if(numberLeft==12)
                sum[6]++;
            if(numberLeft==14)
                sum[7]++;
            if(numberLeft==16)
                sum[8]++;
            if(numberLeft==18)
                sum[9]++;
            if(numberLeft==20)
                sum[10]++;
            if(numberLeft==22)
                sum[11]++;
            if(numberLeft==24)
                sum[12]++;
            if(numberLeft==26)
                sum[13]++;
            if(numberLeft==28)
                sum[14]++;
            if(numberLeft==30)
                sum[15]++;
            if(numberLeft==32)
                sum[16]++;
            if(numberLeft==34)
                sum[17]++;
            if(numberLeft==36)
                sum[18]++;
            if(numberLeft==38)
                sum[19]++;
            if(numberLeft==40)
                sum[20]++;
            if(numberLeft==42)
                sum[21]++;
            if(numberLeft==44)
                sum[22]++;
            if(numberLeft==46)
                sum[23]++;
            if(numberLeft==48)
                sum[24]++;
            if(numberLeft==50)
                sum[25]++;
            if(numberLeft==52)
                sum[26]++;
        }
        return sum;
    }
}
