// public class Conversion{
//     /**
//      * Deyerminse the precendence of an operator
//      * @param op The opertaor character
//      * @return An integer representing the precedence
//      */
//     private static int getPrecedence(char op){
//         switch (op){
//             case '+':
//             case '-':
//                return  1; // lowest precendence:Addition and Subtraction

//             case '*':
//             case '/':
//                 return 2; // medium precedence: Multiplication and Divison

//             case '^':
//              case '$':
//                 return 3; // Highest precedence: Exponentitation and Dollar sign
//              default:
//                  return 0; // Everything else like paranthesis
//         }
//     }
//     public static String convertToPostfix(String infixExpression){
//         // 1. create a StringBulider to build the final postfix expression
//         StringBuilder PostfixResult =new StringBuilder();

//         // 2. create a stack to hold the operators and paranthesisis
//         java.util.Stack<Character> operatorStack = new java.util.Stack<>();

//         // 3. Loop through  every character in the infix expression
//         for(int i=0; i< infixExpression.length(); i++){
//             char token = infixExpression.charAt(i);

//         // Ignore any blank spaces
//         if(Character.isWhitespace(token)){
//             continue;
//         }

//         // CASE 1: The yoken is an operand (letter or Digit)
//         if(Character.isLetterOrDigit(token)){
//             // if it is a number or a varaiable, jusdt add it directly to the postfix result
//             PostfixResult.append(token);
//         }

//         // CASE 2: The token is opening paramethesis '('
//         else if(token =='('){
//             // push '(' on to the stack. 
//             operatorStack.push(token);
//         }

//         // CASE 3: The token is closing paranthesisi ')'
//         else if (token ==')'){
//             //  pop operators fromt the stack and append to the postfix result
//             // until the matchinh '(' is found.

//             while (!operatorStack.isEmpty()&& operatorStack.peek()!='('){
//                 PostfixResult.append(operatorStack.pop());
//             }

//             //if the srtack is empty,discard/remove'('
            
//             }if (!operatorStack.isEmpty()&& operatorStack.peek()=='('){
//                 operatorStack.pop();
//             }

//             //case4: the token is an operator(+,-,*,/)
//             else{
//                 //while the stack is not empty and the precedence of the top operator has
//                 //greater than or equal to the precedence than the current token:

//                 while(!operatorStack.isEmpty()&& getPrecedence(operatorStack.peek())>= getPrecedence(token)){
//                     //crucial check:donot push the opening paranthesis '('
//                     //it belongs to case 3
//                     if (operatorStack.peek()=='('){
//                         break;
//                     }
//                     // pop the higher presedence opertaor and push it to teh result
//                     PostfixResult.append(operatorStack);

//             }

//             //now, push the current  operator on to the stack
//             operatorStack.push(token);


//             }


//         }


//         //4. after scannining the expression , pop all the operators from the stack
//         while (!operatorStack.isEmpty()){
//             PostfixResult.append(operatorStack.pop());
//         }
//         return PostfixResult.toString();
//         }

//    }

//     public static void main(String[] args){
//             String infixExpression=" A + B * C - D / E ";
//             String postfixExpression= convertToPostfix(infixExpression);
//     }

