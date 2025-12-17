public class InfixToPostfixConversion{
    private static int getPrecedence(char op){
        /**
         * determines the precedence of an operator
         * @praam op the operator character
         * @return an integer representing the precedence
         */
        switch(op){
            case '+':
            case '-':
                return 1;//lowest precedence: addition and subtracton
            case '*':
            case '/':
                return 2;//medium precedence multiplication and division
            case '^':
                return 3;//higest precedence:exponenenation and dollar sign
            default:
                return 0;//every thing else like parenthesis
        }
    }
    public static sting convertToPostfix(String infixExpression){

//create a stringbuilder to build the final postfix expression
StringBuilder postfixResult=new StringBuilder();


    }
}