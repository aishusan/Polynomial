1.Changes a to positive if negative.

2.int largest(int a, int b, int c){
	return ( a > b ) ? ((a > c) ? a : c) : ((b > c) ? b :  c);
}

3. bool checkTwoTrue(bool a, bool b, bool c){
    return ((a + b + c) == 2);
}

4. bool integerPalindromeChecker(int number) {
	
    int copy = (number > 0) ? number : -number;
    int reverse = 0;
    while(copy > 0) {
        reverse *= 10;
        reverse += copy % 10;
        copy /= 10;
    }
    return (number==reverse || number==-reverse);
}

int nextPalindromeGenerator(int number) {
    int currentIteration = number + 1;
    while(!integerPalindromeChecker(currentIteration))
        currentIteration++;
    return currentIteration;
}

5. void swapIntegers(int &a, int &b){
    int temp = a;
    a=b;
    b=temp;
}

int sumOfArray(int a[], int size) {
    int sum = 0;
    for (int i = 0; i< size; i++) {
        sum += a[i];
    }
    return sum;
}

int getUniqueArray(int a[], int size) {
    for(int i = 0; i< size; i++) {
        for(int j = i+1; j < size; j++) {
            if(a[i] == a[j]) {
                swapIntegers(a[j],a[size-1]);
                size--;
            }
        }
    }
    return size;
}

int sumOfUnique(int a[], int size) {
    int newSize = getUniqueArray(a,5);
    return sumOfArray(a, newSize);
}
