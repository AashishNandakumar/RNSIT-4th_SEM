#include<lpc21xx.h>
unsigned int delay;
unsigned char arr[] = "Hello world", *ptr;

int main(){
	PINSEL0 = 0x00000005;
	U0LCR = 0x00000083;
	U0DLM = 0x0;
	U0DLL = 0x13;
	U0CLR = 0x00000000;
	
	while(1){
		ptr = arr;
		while(*ptr != '\0'){
			U0THR = *(ptr++);
			while(!(U0LSR & 0x20) == 0x20)
				;
			for(delay = 0;delay<5000;delay++)
				;
		}
		for(delay = 0;delay<50000;delay++)
			;
	}
}
