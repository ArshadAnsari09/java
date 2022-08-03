package oops.polynomial;

public class Polynomial {
    
    private int degCoeff[];

    public Polynomial(){
        degCoeff=new int[10];
    } 

    public void setCoefficient(int degree,int coeff){
        if(degree > degCoeff.length-1){
          //create a new array with size = degree+1
          int temp[]=degCoeff;
          degCoeff=new int[degree+1];

          //copy values from temmp to degCoeff
         for(int i=0;i < temp.length;i++){
            degCoeff[i]=temp[i];
         }

        }
        degCoeff[degree]=coeff;
    }

    //print function
    public void print(){
        for(int i=0;i<degCoeff.length;i++){
            if(degCoeff[i] != 0){
                System.out.println(degCoeff[i]+"x"+i+" ");
            }
        }
    }

    //Add Two functions
    public  void add(Polynomial p){
        Polynomial ans=new Polynomial();
        int plen1=this.degCoeff.length;
        int plen2=p.degCoeff.length;
        int len=Math.min(plen1,plen2);
        int i;
        for(i=0;i<len;i++){
            ans.setCoefficient(i, this.degCoeff[i] + p.degCoeff[i]);
        }
        while(i<plen1){
            ans.setCoefficient(i,this.degCoeff[i]);
            i++;
        }
        while(i<plen2){
            ans.setCoefficient(i,p.degCoeff[i]);
            i++;
        }
        // return ans;
    }

    //subtract function
    public  Polynomial subtract(Polynomial p){
        int plen1=this.degCoeff.length;
        int plen2=p.degCoeff.length;
        int len=Math.min(plen1,plen2);
        Polynomial ans=new Polynomial();
        int i;
        for(i=0;i<len;i++){
            ans.setCoefficient(i, this.degCoeff[i]-p.degCoeff[i]);
        }
        while(i<plen1){
            ans.setCoefficient(i,this.degCoeff[i]);
            i++;
        }
        while(i<plen2){
            ans.setCoefficient(i, -p.degCoeff[i]);
            i++;
        }
        return ans;
    }

    //getCoefficient function
    public int getCoeff(int degree){
        if(degree < this.degCoeff.length){
            return degCoeff[degree];
        }else{
            return 0;
        }
    }

    //Multiplication Function
    public Polynomial multiply(Polynomial p){
        Polynomial ans=new Polynomial();

        for(int i=0;i<this.degCoeff.length;i++){
            for(int j=0;j<p.degCoeff.length;j+=1){
                int termdeg=i+j;
                int termCoeff=this.degCoeff[i] * p.degCoeff[j];
                int oldCoeff=ans.getCoeff(termdeg);
                ans.setCoefficient(termdeg, termCoeff + oldCoeff);
            }
        }
        return ans;
    }
}
