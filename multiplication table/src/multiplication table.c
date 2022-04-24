/*
 ============================================================================
 Name        : multiplication.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int i,n,ans;
	setbuf(stdout,NULL);
	printf("enter a number to get its multiplication table");
	scanf("%d",&n);
	for(i=1;i<=10;i++){
		ans=n*i;
		printf("\n%dX%d=%d",i,n,ans);
	}
	return EXIT_SUCCESS;
}
