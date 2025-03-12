public int fib(int n) {

        int nThNumber = 0;
        int firstNumber = 0;
        int secondNumber = 1;

        for(int i = 2; i <= n; i++){

            nThNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nThNumber;

        }
         
        if(n==1)
            nThNumber = 1;

        return nThNumber;

    }
