// Write a program to find the largest of three numbers. (3)

#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    //while (true) {
    
    cout << "Enter three numbers:" << endl;
    cin >> a >> b >> c;
    
    if (a == b && a == c) {
            cout << "a, b, c are equal" << endl;
        }
        else if ( a == b ) {
            if (a > c) {
                cout << "a & b are the largest" << endl;
            }
            else {
                cout << "c is the largest" << endl;
            }
        }
        else if ( b == c ) {
            if (a > c) {
                cout << "a is the largest" << endl;
            }
            else {
                cout << "b & c are the largest" << endl;
            }
        }
        else if ( a == c ) {
            if (b > c) {
                cout << "b is the largest" << endl;
            }
            else {
                cout << "a & c are the largest" << endl;
            }
        }
        else if ( a > b && a > c) {
            cout << "a is the largest" << endl;
        }
        else if ( b > a && b > c) {
            cout << "b is the largest" << endl;
        }
        else {
            cout << "c is the largest" << endl;
        }

        return 0;
}