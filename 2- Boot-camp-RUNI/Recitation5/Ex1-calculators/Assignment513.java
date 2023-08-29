public class Assignment513 {
    public static int calcArgs(String[] arr) {      //  ["5", "+" ,"5"]
        int num1=Integer.parseInt(arr[0]);         // num1=5
        int res=0;
        String opr = "null";
        for(int i=1; i<arr.length; i++){           //1<3?   || 2<3?
            if(i%2 != 0){
                opr = arr[i];                     // op= "+"   ||
            }else{
                int num2 = Integer.parseInt(arr[i]);   //   || num2=5
                res = (doOperation (num1, opr, num2));      //  res= 10
                num1 = res;
            }    
        }
        return res;
    }
    public static int doOperation(int num, String op, int res){
        int x=1;
        if(op == "+"){
            x=(num+res);
        }else if(op == "-"){
            x=(num-res);
        }else if(op == "*"){
            x=(num*res);
        }else if(op == "/"){
            x=(num/res);
        }
        return x;
    }
    public static void main(String[] args) {
        String[] arr = {"5","+","5","*","3"};
        System.out.println(calcArgs(arr));
    }
}

// >> java Calculator 5 + 5 * 3
// 30
// Notice: The return value from above will return 30 as the result and not 20 since we ignore
// operator precedence.