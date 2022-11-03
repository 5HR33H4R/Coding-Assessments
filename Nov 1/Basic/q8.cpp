// Write a program that converts Centigrade to Fahrenheit. (4)

#include <iostream>
using namespace std;

int main() {
    float centigrade, fahrenheit;
    
    cout << "Enter the Temperature in centigrade" << endl;
    cin >> centigrade; 

    fahrenheit = centigrade * (9/5.0) + 32.0;

    cout << "Temperature in fahrenheit: " << fahrenheit << endl;

    return 0;
}