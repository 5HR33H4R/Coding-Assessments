// Write a program to accept a coordinate point in a XY coordinate system and determine in which quadrant the coordinate point lies. 

#include <iostream>
using namespace std;

int main() {
    int x, y;
    
    cout << "Enter X:" << endl;
    cin >> x;
    cout << "Enter Y:" << endl;
    cin >> y;

    if (x > 0) {
            if ( y > 0 ) {
                cout << "The point lies in the 1st Quadrant" << endl;
            }
            else if ( y < 0) {
                cout << "The point lies in the 4th Quadrant" << endl;
            }
            else {
                cout << "The point lies on X-axis" << endl;
            }
        }
        else if (x < 0) {
            if ( y > 0 ) {
                cout << "The point lies in the 2nd Quadrant" << endl;
            }
            else if ( y < 0) {
                cout << "The point lies in the 3rd Quadrant" << endl;
            }
            else {
                cout << "The point lies on X-axis" << endl;
            }
        }
        else {
            if (y != 0) {
                cout << "The point lies on Y-axis" << endl;
            }
            else {
                cout << "The point lies in the origin" << endl;
            }
        }
    return 0;
}