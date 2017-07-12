package com.example.tamir.myappafterreinstalling;

/**
 * Created by tamir on 11/07/17.
 */

public class CalculatorLogic {
    final static int _ARR_LENGTH = 10;
    private static int _numCnt = 0;
    private static int _operatorCnt = 0;
    private static boolean _isNumber = true;
    private static double _currentNumber = 0;
    private static double[] _numArr = new double[_ARR_LENGTH];
    private static char[] _operatorArr = new char[_ARR_LENGTH];

    public static void scanDigit(int num) {
        if (_isNumber) {
            _currentNumber = _currentNumber * 10 + num;
        } else {
            _numArr[_numCnt++] = _currentNumber;//Saving current number into array.
            _currentNumber = num;             // Creating new current number.
            _isNumber = true;
        }


    }
    /*
     *This method
     */
    public static void sendOperator(char operator) {
        _isNumber = false;// Change value end of number
        _operatorArr[_operatorCnt++] = operator;
    }

    /*
     *This method read arrays and calculate total number.
     *@return double
     */
    public static double calculateTotal() {
        _isNumber = false;// need for completing last
        scanDigit(0);     // number and saving it into array

        double total = _numArr[0];
        // i - pointer to numbers in array, j - pointer to operators in array.
        for (int i = 1, j = 0; i < _numCnt; i++, j++) {
            if (_operatorArr[j] == '+')
                total += _numArr[i];
            else if (_operatorArr[j] == '-')
                total -= _numArr[i];
            else if (_operatorArr[j] == 'X')
                total *= _numArr[i];
            else if (_operatorArr[j] == '/')
                total /= _numArr[i];
        }
        cleanMemory();
        _numArr[0] = total;//If user wont continue calculating we save lust value for him in array.
        _numCnt = 1;       //due to value in  _numArr[0].
        return total;
    }

    /*
     *This method delete all data from arrays and set zero in all parameters.
     */
    public static void cleanMemory() {
        _numCnt = 0;
        _operatorCnt = 0;
        _isNumber = true;
        _currentNumber = 0;
        for (int i = 0; i < _numArr.length; i++) {
            _numArr[i] = 0;
            _operatorArr[i] = '#';
        }
    }
}

