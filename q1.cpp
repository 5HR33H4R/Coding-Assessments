//Write a program to read marks of three subjects and calculate the total and percentage. (3)

#include <iostream>
using namespace std;

int main() {
    float m1, m2, m3, total, percent;
    
    cout << "Enter the marks of three subjects:" << endl;
    cin >> m1 >> m2 >> m3;
    
    total = m1 + m2 + m3;
    percent = (total/300) * 100;
    
    cout << "Total: " << total <<"\nPercent: " << percent << endl;
    
    return 0;
}