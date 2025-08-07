import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class buildingDynamicStack {
    public static class customStack{
        int[] data;
        int tos;
        public customStack(int cap){
            //cap = capacity 
            //tos = top of stack
            data=new int[cap];
            tos =-1;
        }
        int size(){
            return tos+1;
        }
        void display(){
            for (int i=tos; i>=0; i--){
                System.out.print(data[i]+" ");
            }    
            System.out.println();
        }
        void push(int val){
            if (tos==data.length-1){
                int[] ndata= new int[2*data.length];//ndata is new data
                for (int i =0; i<data.length; i++){
                    ndata[i]=data[i];
                }
                data= ndata;
                tos++;
                data[tos]=val;
            }else{
                tos++;
                data[tos]=val;
            }
        }
        int pop(){
            if(tos==-1){
                System.out.println("stack underflow ");
                return -1;
            }else{
                int val = data[tos];
                tos--;
                return val;
            }
        }
        int top() {
            if(tos==-1){
                System.out.println("stack underflow ");
                return -1;
            }else{
                return data[tos];
            }
        }
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        customStack st= new customStack(n);

        String str =br.readLine();
        while (str.equals("quit")==false){
            if (str.startsWith("push")){
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            }else if(str.startsWith("pop")){
                int val = st.pop();
                if(val!=-1){
                    System.out.println(val);
                }
            }else if (str.startsWith("top")){
                int val =st.top();
                if(val!=-1){
                    System.out.println(val);
                }
            }else if (str.startsWith("display")){
                st.display();
            }else if (str.equals("size")){
                System.out.println(st.size());
            }

            str=br.readLine();
        }            
        
    }
}
