package fpgamegithubredux;

import java.util.ArrayList;
import java.util.logging.Logger;


public class StringCalc {
    private static final Logger LOGGER = Logger.getLogger(Stat.class.getName());
    public StringCalc(){
        //placeholder
    }
    public double calculate(double init, ArrayList<Object> calculation){
        double ret = init;
        ArrayList<String> char_stack = new ArrayList<>();
        ArrayList<Number> num_stack = new ArrayList<>();

        System.out.println("calculation is: " + calculation);
        for(int count=0; count < calculation.size(); count ++){
            System.out.println("Loop started, count is: " + count);

            if(calculation.get(count) instanceof String || calculation.get(count) == null){//was is
                String temp_char = "";
                Number num1;
                Number num2;
                System.out.println("it is a string or null, which is: " + calculation.get(count));
                if(((String)calculation.get(count)).equals("(")){//recursively compute inside the parentheses
                    StringCalc innerCalc = new StringCalc();
                    int offset = 0;
                    //how many deep
                    
                    ArrayList<Object> prior = new ArrayList<>(calculation.subList(0,count));
                    /*
                    ArrayList<Object> checkMulti = new ArrayList<>(calculation.subList(count,calculation.size()));
                    System.out.println("checkMulti before while loop is: "+ checkMulti);
                    while(checkMulti.indexOf("(")==0 && checkMulti.get(1).equals("(") && checkMulti.indexOf("(")<checkMulti.indexOf(")")){
                        System.out.println("CheckMulti, calculation is: "+ calculation);
                        System.out.println("checkMulti before is: "+ checkMulti);
                        double inside = innerCalc.calculate(ret, new ArrayList<>(checkMulti.subList(1, checkMulti.indexOf(")")+1)));
                        
                        ArrayList<Object> remainder = new ArrayList<>(calculation.subList(calculation.indexOf(")")+1, calculation.size()));
                        checkMulti = new ArrayList();
                        checkMulti.add(inside);
                        checkMulti.addAll(remainder);
                        checkMulti.remove(checkMulti.indexOf(")"));
                        System.out.println("checkMulti after is: "+ checkMulti);
                        calculation = new ArrayList<>();
                        calculation.addAll(prior);
                        calculation.addAll(checkMulti);
                        System.out.println("calculation after checkMulti is: "+ calculation);
                        //calculation.remove(calculation.indexOf(")"));
                        
                    }
                    */
                    //we know how deep
                    System.out.println("paren found, calculation is: "+ calculation);
                    double inside = innerCalc.calculate(ret, new ArrayList<>(calculation.subList(count+1, (calculation).indexOf(")"))));
                    //prior = new ArrayList<>(calculation.subList(0,count));
                    ArrayList<Object> remainder = new ArrayList<>(calculation.subList((calculation).indexOf(")")+1,calculation.size()));
                    System.out.println("Remainder of arraylist is: " + remainder);
                    calculation = new ArrayList<>();
                    calculation.addAll(prior);
                    calculation.add(inside);
                    calculation.addAll(remainder);
                    System.out.println("calculation after recursion is: " + calculation);
                    num_stack.add(inside);
                }else if(((String)calculation.get(count)).equals(")")){
                    calculation.remove(count);
                    System.out.println("Finished calculating after one last dance.");
                    double placeHolder = simpleCalc(char_stack,num_stack);
                    num_stack = new ArrayList<>();
                    num_stack.add(placeHolder);
                    char_stack = new ArrayList<>();
                }else if(((String)calculation.get(count)).equals("+")||((String)calculation.get(count)).equals("-")||((String)calculation.get(count)).equals("*")
                ||((String)calculation.get(count)).equals("/")){
                    char_stack.add(((String)calculation.get(count)));
                }else if(char_stack.size()>0){//TODO this a good check to add?
                    temp_char = char_stack.remove(0);//pop
                    System.out.println("otherwise case, temp_char removed from char_stack is: " + temp_char);
                    if(temp_char.equals("(")){
                        char_stack.add(temp_char);//push
                        char_stack.add((String)calculation.get(count));//push
                    }else{
                        char_stack.add((String)(calculation.get(count)));//push
                        num1 = num_stack.remove(0);//pop
                        num2 = num_stack.remove(0);//pop
                        if(temp_char.equals("*")){
                            num_stack.add(0,num1.doubleValue()*num2.doubleValue());//push
                        }else if(temp_char.equals("/")){
                            num_stack.add(0,num1.doubleValue()/num2.doubleValue());//push
                        }else if(temp_char.equals("+")){
                            num_stack.add(0,num1.doubleValue()+num2.doubleValue());//push
                        }else if(temp_char.equals("-")){
                            num_stack.add(0,num1.doubleValue()-num2.doubleValue());//push
                        }else{
                            if(temp_char != null)num_stack.add(num1);//push
                            num_stack.add(0,num2);//push
                        }
                    }
                }
                
            }else{//TODO if stat_calculatio/calculation are arraylist<object>
                System.out.println("Number added: " + (Number)calculation.get(count));
                num_stack.add((Number)calculation.get(count));//num_stack.push(calculation.get(count));
                if(count == calculation.size()-1){
                    System.out.println("Finished calculating after one last dance.");
                    double placeHolder = simpleCalc(char_stack,num_stack);
                    num_stack = new ArrayList<>();
                    num_stack.add(placeHolder);
                    char_stack = new ArrayList<>();

                }
            }
            System.out.println(" num_stack is: " + num_stack + ",\n char_stack is: " + char_stack);
            
        }
        
        if(char_stack.size() == 0 && num_stack.size() == 1){
            System.out.println("returning: "+ (ret + num_stack.get(0).doubleValue()));
            ret += num_stack.get(0).doubleValue();
        }else{
            //LOGGER.info("(Stat)We got a stat calculation gone wrong here....\n calc array:" + stat_calculation + "\n calculation:" + calculation + "\n char_stack:" + char_stack + "\n num_stack:" + num_stack);
        }
        
        return ret;
    }
    private double simpleCalc(ArrayList<String> char_stack, ArrayList<Number> num_stack){
        System.out.println("SimpleCalc");
        System.out.println(" num_stack is: " + num_stack + ",\n char_stack is: " + char_stack);
        if(char_stack.size()>0){//TODO this a good check to add?
            String temp_char = "";
            Number num1;
            Number num2;
            temp_char = char_stack.remove(0);//pop
            System.out.println("otherwise case, temp_char removed from char_stack is: " + temp_char);
                //char_stack.add((String)(calculation.get(count)));//push
                num1 = num_stack.remove(0);//pop
                num2 = num_stack.remove(0);//pop
                if(temp_char.equals("*")){
                    num_stack.add(0,num1.doubleValue()*num2.doubleValue());//push
                }else if(temp_char.equals("/")){
                    num_stack.add(0,num1.doubleValue()/num2.doubleValue());//push
                }else if(temp_char.equals("+")){
                    num_stack.add(0,num1.doubleValue()+num2.doubleValue());//push
                }else if(temp_char.equals("-")){
                    num_stack.add(0,num1.doubleValue()-num2.doubleValue());//push
                }else{
                    if(temp_char != null)num_stack.add(num1);//push
                    num_stack.add(0,num2);//push
                }
            if(num_stack.size()>1){
                double placeHolder = simpleCalc(char_stack,num_stack);
                num_stack = new ArrayList<>();
                num_stack.add(placeHolder);
            }

            
        }
        System.out.println("SimpleCalc returning: " + num_stack.get(0).doubleValue());
        return num_stack.get(0).doubleValue();
    }
    
}
