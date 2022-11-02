// Write a program to check whether a triangle can be formed by the given value for the angles.

#include <iostream>
using namespace std;

int main() {
    float angle1, angle2, angle3, sum;

    cout << "Enter the angles: " << endl;
    cin >> angle1 >> angle2 >> angle3;

    sum = angle1 + angle2 + angle3;

    if(sum == 180.0) {
        cout << "Triangle can be formed" << endl;
    }
    else {
        cout << "Triangle can't be formed" << endl;
    }

    return 0;
}