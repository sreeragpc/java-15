/*
 ============================================================================
 Name        : m.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int values[3][3],i,j;
	printf("enter values");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			scanf("%d",&values[i][j]);
		}

	}
	for(i=0;i<3;i++){
			for(j=0;j<3;j++){
	printf("\n\t%d",values[i][j]);
			}printf("\n");
	}
	return EXIT_SUCCESS;
}
