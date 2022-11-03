// Write a program that takes minutes as input, and display the total number of hours and minutes. (4)

#include <iostream>
using namespace std;

int main() {
    int minutes, hours;

    cout << "Enter the minutes: " << endl;
    cin >> minutes;

    hours = minutes / 60;
    minutes = minutes % 60;

    cout << hours << " Hours ";
    if (minutes !=0) {
            cout << minutes << " Minutes";
    }
    cout << endl;

    return 0;
}