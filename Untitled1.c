#include <iostream>
using namespace std;
void drawline (int length)
{
	for (int i=0;i<length;i++) {
		cout <<"-";
		
	}
	cout <<endl;
}
int main ()
{
	int lineLength=30; //adjust line as needed
	// drawing three lines
	drawline(lineLength);
    drawline(lineLength);
	drawline(lineLength);
	return 0;
}
