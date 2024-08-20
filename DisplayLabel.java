import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class DisplayLabel extends JLabel
{
    private String text = "";
    private ArrayList<Character> input = new ArrayList<>();
    private boolean operator = false;
    private boolean clear = false;
    private boolean equals = false;
    private double num1=0;
    private double num2=0;
    private double answer=0;
    //private String ans = "";
    public DisplayLabel(){
        this.setFont(new Font("Calculator", Font.PLAIN, 30));
        this.setLayout(new FlowLayout());
    }
    public void add(Character c){  
        if((c=='+'||c=='-'||c=='*'||c=='/')){ 
            if((input.size()!=0)&&operator==false&&equals==false){
                /*if(equals==true){
                    this.clear();
                    input.add('A');
                    addText('A');
                    input.add('n');
                    addText('n');
                    input.add('s');
                    addText('s');
                }*/
                input.add(c);  
                addText(c);
                operator=true;
                this.setText(text);
            }
        }
        else if(equals==false){
            input.add(c);  
            addText(c);
            this.setText(text);
        }
        
    }
    public void clear(){
        for(int i = input.size()-1; i >= 0; i--){
            input.remove(i);
        }
        text = "";
        this.setText(text);
        num1=0;
        num2=0;
        //if(equals==false){answer=0;}
        answer=0;
        operator = false;
        equals = false;
        //ans="";
    }
    public void display(){
        System.out.println(input);
    }
    public void answer(){
        if(input.size()>1){
            /*if(text.substring(0,3).equals("Ans")){
                text = text.substring(0,3);
                input.remove(0);
                input.remove(1);
                input.remove(2);
                ans = "Ans";
            }*/
            for(int i = 0; i < input.size(); i++){
                if((input.get(i)=='+'||input.get(i)=='-'||input.get(i)=='*'
                   ||input.get(i)=='/')&&!text.substring(i+1).equals("")){
                    /*if(ans=="Ans"){ 
                       num1 = answer;
                    }*/
                    //else{
                        num1 = Double.parseDouble(text.substring(0,i));
                    //}
                    num2 = Double.parseDouble(text.substring(i+1));
                       switch(input.get(i)){
                        case '+':
                            answer = num1+num2;
                            break;
                        case '-':
                            answer = num1-num2;
                            break;
                        case '*':
                            answer = num1*num2;
                            break;
                        case '/':
                            answer = num1/num2;
                            break;
                    }
                    this.setText(Double.toString(answer));
                    equals = true;
                    operator = false;
                }
            }
        }
        else if(input.size()==1){
            answer = Double.parseDouble(String.valueOf(input.get(0)));
            this.setText(Double.toString(answer));
            equals = true;
            operator = false;
        }
        
    }
    public void addText(Character c){
        text += String.valueOf(c);
    }
    public boolean search(Character c){
        for(int i = 0; i < input.size(); i++){
            if(input.get(i)=='c'){
                return true;
            }
        }
        return false;
    }
}