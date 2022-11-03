//Write a program to print the integral quotient and remainder of a division.

#include <iostream>
using namespace std;

int main() {
    int dividend, divisor, quotient, remainder;

    cout << "Enter the dividend: " << endl;
    cin >> dividend;
    cout << "Enter the divisor: " << endl;
    cin >> divisor;

    if (divisor != 0) {
        quotient = dividend / divisor;
        remainder = dividend % divisor;
        
        cout << "Quotient: " << quotient << endl;
        cout << "Remainder: " << remainder << endl;
    }
    else {
        cout << "Divisor is Zero" << endl;
    }

    return 0;
}