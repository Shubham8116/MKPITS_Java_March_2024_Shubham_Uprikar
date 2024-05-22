//program to print the size of the structure.
//Time complexity: O(1)
//Space complexity: O(1)
#include<stdio.h>
struct person 
{
struct person *next;
int age;
};
int main() {
printf("The size of struct person is %d\n", sizeof(struct person));
}