package fpgamegithubredux;

import java.util.ArrayList;


public class StringCalc2 {
    // instance variables


    public StringCalc2()
    {
        //derp
    }
        // methods

    
    public double calculate(ArrayList<Object> in) {
        double ret = 0;
        System.out.println("Calculation starting! in is: "+ in);
        while( in.contains("(") && in.contains(")")){//Strip out P
            in = parenSplit(in);
        }
        System.out.println("final calculation is: "+in);
        ret = nonParenCalc(in);

        return ret;
    }
    public ArrayList<Object> parenSplit(ArrayList<Object> in){
        int rParenIDX = in.indexOf(")");
        int lParenIDX = rParenIDX;
        while(!in.get(lParenIDX).equals("(")){
            lParenIDX--;
        }
        ArrayList<Object> inner = new ArrayList<>(in.subList(lParenIDX+1,rParenIDX));
        System.out.println("inner calculation is: "+inner);
        ArrayList<Object> prior = new ArrayList<>(in.subList(0,lParenIDX));
        ArrayList<Object> remainder = new ArrayList<>(in.subList(rParenIDX+1,in.size()));
        in = new ArrayList<>();
        in.addAll(prior);
        in.add(nonParenCalc(inner));//no E, just MDAS
        in.addAll(remainder);
        return in;

    }
    public double nonParenCalc(ArrayList<Object> in){
        while(in.contains("*")||in.contains("/")){//M and D first
            Number num1;
            Number num2;
            if(in.indexOf("*")>-1 && in.indexOf("/")>-1){
                if(in.indexOf("*")<in.indexOf("/")){
                    int oploc = in.indexOf("*");
                    num1 = (Number)in.get(oploc-1);
                    num2 = (Number)in.get(oploc+1);
                    double result = num1.doubleValue() * num2.doubleValue(); 
                    in.remove(oploc-1);
                    in.remove(oploc-1);
                    in.remove(oploc-1);//removes num1 and op and num2
                    in.add(oploc-1, result);//replaces all three with the result
                }else{
                    int oploc = in.indexOf("/");
                    num1 = (Number)in.get(oploc-1);
                    num2 = (Number)in.get(oploc+1);
                    double result = num1.doubleValue() / num2.doubleValue(); 
                    in.remove(oploc-1);
                    in.remove(oploc-1);
                    in.remove(oploc-1);//removes num1 and op and num2
                    in.add(oploc-1, result);//replaces all three with the result

                }
            }else if(in.indexOf("*")>-1){//only multiplication left
                System.out.println("Only multiply remains.");
                int oploc = in.indexOf("*");
                num1 = (Number)in.get(oploc-1);
                num2 = (Number)in.get(oploc+1);
                double result = num1.doubleValue() * num2.doubleValue(); 
                in.remove(oploc-1);
                in.remove(oploc-1);
                in.remove(oploc-1);//removes num1 and op and num2
                in.add(oploc-1, result);//replaces all three with the result

            }else{
                int oploc = in.indexOf("/");
                num1 = (Number)in.get(oploc-1);
                num2 = (Number)in.get(oploc+1);
                double result = num1.doubleValue() / num2.doubleValue(); 
                in.remove(oploc-1);
                in.remove(oploc-1);
                in.remove(oploc-1);//removes num1 and op and num2
                in.add(oploc-1, result);//replaces all three with the result
            }
        }//all multiply and divide done!
        while(in.contains("+")||in.contains("-")){//M and D first
            Number num1;
            Number num2;
            if(in.indexOf("+")>-1 && in.indexOf("-")>-1){
                if(in.indexOf("+")<in.indexOf("-")){//+ comes first
                    int oploc = in.indexOf("+");
                    num1 = (Number)in.get(oploc-1);
                    num2 = (Number)in.get(oploc+1);
                    double result = num1.doubleValue() + num2.doubleValue(); 
                    in.remove(oploc-1);
                    in.remove(oploc-1);
                    in.remove(oploc-1);//removes num1 and op and num2
                    in.add(oploc-1, result);//replaces all three with the result
                }else{
                    int oploc = in.indexOf("-");
                    num1 = (Number)in.get(oploc-1);
                    num2 = (Number)in.get(oploc+1);
                    double result = num1.doubleValue() - num2.doubleValue(); 
                    in.remove(oploc-1);
                    in.remove(oploc-1);
                    in.remove(oploc-1);//removes num1 and op and num2
                    in.add(oploc-1, result);//replaces all three with the result

                }
            }else if(in.indexOf("+")>-1){//only multiplication left
                int oploc = in.indexOf("+");
                num1 = (Number)in.get(oploc-1);
                num2 = (Number)in.get(oploc+1);
                double result = num1.doubleValue() + num2.doubleValue(); 
                in.remove(oploc-1);
                in.remove(oploc-1);
                in.remove(oploc-1);//removes num1 and op and num2
                in.add(oploc-1, result);//replaces all three with the result

            }else{
                int oploc = in.indexOf("-");
                num1 = (Number)in.get(oploc-1);
                num2 = (Number)in.get(oploc+1);
                double result = num1.doubleValue() - num2.doubleValue(); 
                in.remove(oploc-1);
                in.remove(oploc-1);
                in.remove(oploc-1);//removes num1 and op and num2
                in.add(oploc-1, result);//replaces all three with the result
            }
        }//all add and subtract done!
        if(in.size() == 1){
            System.out.println("calc success! Output is: " + in.get(0));
            return (double)in.get(0);
        }else{
            System.out.println("calc failure!");
            return 0;
        }

    }

}
