#include "stdafx.h"
int main() {

	int m, min, max, hap, avg, i;
	int a[7];

	m = -1;
	do
	{
		m++;
		scanf("%d", &a[m]);
	} while (m < 6);

	min = max = hap = a[0];
	i = 0;
	while (i < 6) {
		i++;
		hap += a[i];
		if (a[i] < min)
			min = a[i];
		if (a[i] > max)
			max = a[i];
	}
	hap = hap - min - max;
	avg = hap / 5;
	printf("min:%d max:%d hap:%d avg:%d \n", min, max, hap, avg);
	return 0;
}