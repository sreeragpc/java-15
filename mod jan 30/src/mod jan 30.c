/*
 ============================================================================
 Name        : mod.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,n,j;
	printf("entr a value");
	scanf("%d",&n);
	for(i=1;i<n;i++){
		for(j=0;j<=i;j++){
			printf("\n");
		}
		printf("*");
	}
	return EXIT_SUCCESS;
}
